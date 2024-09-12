//package com.supera.tecnologia.model;
//
//
//import jakarta.persistence.*;
//
//@Entity
//public class Itens {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String descricao;
//    private String estado;
//    private String prioridade;
//
//    @ManyToOne
//    @JoinColumn(name = "lista_id")
//    private Listas lista;
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
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
//
//    public String getPrioridade() {
//        return prioridade;
//    }
//
//    public void setPrioridade(String prioridade) {
//        this.prioridade = prioridade;
//    }
//
//    public Listas getLista() {
//        return lista;
//    }
//
//    public void setLista(Listas lista) {
//        this.lista = lista;
//    }
//}
package com.supera.tecnologia.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Itens {

    @Id
    @GeneratedValue
    private UUID id;

    private String descricao;
    private String estado;
    private String prioridade;

    @ManyToOne
    @JoinColumn(name = "lista_id")
    private Listas lista;

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Listas getLista() {
        return lista;
    }

    public void setLista(Listas lista) {
        this.lista = lista;
    }
}
