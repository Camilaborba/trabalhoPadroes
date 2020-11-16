package com.company;

import java.util.Objects;

public class Produto {

    private Integer id_produto;
    private String nome;;
    private int quantidade;



    public Produto(Integer id_produto, String nome, int quantidade) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.quantidade = quantidade;

    }

    public Integer getId() {
        return id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome;
    }
}

