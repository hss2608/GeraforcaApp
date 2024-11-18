package com.geraforca.models;

public class Cotacao {
    private int id;
    private int idCliente;
    private int idOferta;
    private String detalhes;

    // Construtor
    public Cotacao(int id, int idCliente, int idOferta, String detalhes) {
        this.id = id;
        this.idCliente = idCliente;
        this.idOferta = idOferta;
        this.detalhes = detalhes;
    }

    // Getters e Setters
    public int getId() { return id; }
    public int getIdCliente() { return idCliente; }
    public int getIdOferta() { return idOferta; }
    public String getDetalhes() { return detalhes; }

    public void setId(int id) { this.id = id; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
    public void setIdOferta(int idOferta) { this.idOferta = idOferta; }
    public void setDetalhes(String detalhes) { this.detalhes = detalhes; }
}