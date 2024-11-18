package com.geraforca.models;

public class Oferta {
    private int id;
    private String titulo;
    private String descricao;
    private double preco;

    public Oferta(int id, String titulo, String descricao, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }

    public void setId(int id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setPreco(double preco) { this.preco = preco; }
}