package org.example.Models;

public class EstoquePecasModels {
    private int id;
    private String nome;
    private double valor;
    private String fabricante;
    private int quantidade;

    public EstoquePecasModels(int idC, String nomeC, double valorC, String fabricanteC, int quantidadeC) {
        this.id = idC;
        this.nome = nomeC;
        this.valor = valorC;
        this.fabricante = fabricanteC;
        this.quantidade = quantidadeC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "EstoquePecasModels " +
                " Id = " + id +
                " Nome = " + nome + '\'' +
                " Valor = " + valor +
                " Fabricante = " + fabricante + '\'' +
                " Quantidade = " + quantidade;
    }
}
