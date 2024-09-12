//package com.supera.tecnologia.model;
//
//import jakarta.persistence.*;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Listas {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String nome;
//
//    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Itens> itens = new ArrayList<>();
//
//    // Getters e Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public List<Itens> getItens() {
//        return itens;
//    }
//
//    public void setItens(List<Itens> itens) {
//        this.itens = itens;
//    }
//
//    public void addItem(Itens item) {
//        itens.add(item);
//        item.setLista(this);
//    }
//
//    public void removeItem(Itens item) {
//        itens.remove(item);
//        item.setLista(null);
//    }
//}
package com.supera.tecnologia.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Listas {

    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Itens> itens = new ArrayList<>();

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    public void addItem(Itens item) {
        itens.add(item);
        item.setLista(this);
    }

    public void removeItem(Itens item) {
        itens.remove(item);
        item.setLista(null);
    }
}
