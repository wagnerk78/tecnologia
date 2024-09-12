//package com.supera.tecnologia.controller;
//
//import com.supera.tecnologia.model.Itens;
//import com.supera.tecnologia.model.Listas;
//import com.supera.tecnologia.repository.ItensRepository;
//import com.supera.tecnologia.repository.ListasRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/listas")
//public class ListasController {
//
//    @Autowired
//    private ListasRepository listasRepository;
//
//    @Autowired
//    private ItensRepository itensRepository;
//
//    @GetMapping
//    public ModelAndView listar() {
//        ModelAndView modelAndView = new ModelAndView("listas");
//        List<Listas> listas = listasRepository.findAll();
//        modelAndView.addObject("listas", listas);
//        return modelAndView;
//    }
//
//    @GetMapping("/{id}")
//    public ModelAndView listarItens(@PathVariable Long id) {
//        ModelAndView modelAndView = new ModelAndView("itens");
//        Listas lista = listasRepository.findById(id).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
//        List<Itens> itens = itensRepository.findByLista(lista);
//        modelAndView.addObject("lista", lista);
//        modelAndView.addObject("itens", itens);
//        modelAndView.addObject("novoItem", new Itens()); // Para formulário de novo item
//        return modelAndView;
//    }
//
//    @PostMapping("/{id}/itens")
//    public String adicionarItem(@PathVariable Long id, @ModelAttribute Itens item) {
//        Listas lista = listasRepository.findById(id).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
//        item.setLista(lista); // Associa o item à lista
//        itensRepository.save(item); // Salva o novo item
////        lista.addItem(item); // Adiciona o item à lista
//        listasRepository.save(lista); // Atualiza a lista com o novo item
//        System.out.println("Item adicionado: " + item.getDescricao()); // Log para depuração
//        return "redirect:/listas/" + id;
//    }
//
//    @GetMapping("/{listaId}/itens/{itemId}/editar")
//    public ModelAndView editarItem(@PathVariable Long listaId, @PathVariable Long itemId) {
//        ModelAndView modelAndView = new ModelAndView("editar-item");
//        Listas lista = listasRepository.findById(listaId).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
//        Itens item = itensRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item não encontrado"));
//        modelAndView.addObject("lista", lista);
//        modelAndView.addObject("item", item);
//        return modelAndView;
//    }
//
//    @PostMapping("/{listaId}/itens/{itemId}")
//    public String atualizarItem(@PathVariable Long listaId, @PathVariable Long itemId, @ModelAttribute Itens item) {
//        Listas lista = listasRepository.findById(listaId).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
//        item.setId(itemId); // Define o ID do item a ser atualizado
//        item.setLista(lista); // Associa o item à lista
//        itensRepository.save(item); // Salva o item atualizado
//        return "redirect:/listas/" + listaId;
//    }
//
//    @PostMapping("/{listaId}/itens/{itemId}/remover")
//    public String removerItem(@PathVariable Long listaId, @PathVariable Long itemId) {
//        itensRepository.deleteById(itemId); // Remove o item
//        return "redirect:/listas/" + listaId;
//    }
//
//    @GetMapping("/{id}/editar")
//    public ModelAndView editar(@PathVariable Long id) {
//        ModelAndView modelAndView = new ModelAndView("formulario");
//        Listas lista = listasRepository.findById(id).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
//        modelAndView.addObject("lista", lista);
//        return modelAndView;
//    }
//
//    @PostMapping("/{id}")
//    public String atualizar(@PathVariable Long id, @ModelAttribute Listas lista) {
//        lista.setId(id); // Define o ID da lista a ser atualizado
//        listasRepository.save(lista); // Salva a lista atualizada
//        return "redirect:/listas";
//    }
//
//    @DeleteMapping("/{id}")
//    public String remover(@PathVariable Long id) {
//        listasRepository.deleteById(id); // Remove a lista
//        return "redirect:/listas";
//    }
//}
package com.supera.tecnologia.controller;

import com.supera.tecnologia.model.Itens;
import com.supera.tecnologia.model.Listas;
import com.supera.tecnologia.repository.ItensRepository;
import com.supera.tecnologia.repository.ListasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/listas")
public class ListasController {

    @Autowired
    private ListasRepository listasRepository;

    @Autowired
    private ItensRepository itensRepository;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("listas");
        List<Listas> listas = listasRepository.findAll();
        modelAndView.addObject("listas", listas);
        return modelAndView;
    }

    @PostMapping
    public String criar(@RequestParam String nome) {
        Listas novaLista = new Listas();
        novaLista.setNome(nome);
        listasRepository.save(novaLista);
        return "redirect:/listas";
    }



    @GetMapping("/{id}")
    public ModelAndView listarItens(@PathVariable UUID id) {
        ModelAndView modelAndView = new ModelAndView("itens");
        Listas lista = listasRepository.findById(id).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
        List<Itens> itens = itensRepository.findByLista(lista);
        modelAndView.addObject("lista", lista);
        modelAndView.addObject("itens", itens);
        modelAndView.addObject("novoItem", new Itens()); // Para formulário de novo item
        return modelAndView;
    }

    @PostMapping("/{id}/itens")
    public String adicionarItem(@PathVariable UUID id, @ModelAttribute Itens item) {
        Listas lista = listasRepository.findById(id).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
        item.setLista(lista); // Associa o item à lista
        itensRepository.save(item); // Salva o novo item
        listasRepository.save(lista); // Atualiza a lista com o novo item
        return "redirect:/listas/" + id;
    }

    @GetMapping("/{listaId}/itens/{itemId}/editar")
    public ModelAndView editarItem(@PathVariable UUID listaId, @PathVariable UUID itemId) {
        ModelAndView modelAndView = new ModelAndView("editar-item");
        Listas lista = listasRepository.findById(listaId).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
        Itens item = itensRepository.findById(itemId).orElseThrow(() -> new RuntimeException("Item não encontrado"));
        modelAndView.addObject("lista", lista);
        modelAndView.addObject("item", item);
        return modelAndView;
    }

    @PostMapping("/{listaId}/itens/{itemId}")
    public String atualizarItem(@PathVariable UUID listaId, @PathVariable UUID itemId, @ModelAttribute Itens item) {
        Listas lista = listasRepository.findById(listaId).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
        item.setId(itemId); // Define o ID do item a ser atualizado
        item.setLista(lista); // Associa o item à lista
        itensRepository.save(item); // Salva o item atualizado
        return "redirect:/listas/" + listaId;
    }

    @PostMapping("/{listaId}/itens/{itemId}/remover")
    public String removerItem(@PathVariable UUID listaId, @PathVariable UUID itemId) {
        itensRepository.deleteById(itemId); // Remove o item
        return "redirect:/listas/" + listaId;
    }

    @GetMapping("/{id}/editar")
    public ModelAndView editar(@PathVariable UUID id) {
        ModelAndView modelAndView = new ModelAndView("formulario");
        Listas lista = listasRepository.findById(id).orElseThrow(() -> new RuntimeException("Lista não encontrada"));
        modelAndView.addObject("lista", lista);
        return modelAndView;
    }

    @PostMapping("/{id}")
    public String atualizar(@PathVariable UUID id, @ModelAttribute Listas lista) {
        lista.setId(id); // Define o ID da lista a ser atualizado
        listasRepository.save(lista); // Salva a lista atualizada
        return "redirect:/listas";
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable UUID id) {
        listasRepository.deleteById(id); // Remove a lista
        return "redirect:/listas";
    }
}
