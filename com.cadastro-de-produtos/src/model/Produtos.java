package model;

import enums.StatusProdutos;

import java.util.Objects;

public class Produtos {
    private String nome;
    private double valor;
    private StatusProdutos statusProdutos;

    public Produtos(String nome, double valor, StatusProdutos statusProdutos ){
        this.nome = nome;
        setValor(valor);
        this.statusProdutos = statusProdutos;
    }

    public Produtos(String nome, double valor){
        this.nome = nome;
        setValor(valor);
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
        if (valor <= 0){
            throw  new RuntimeException("Valor não pode ser negativo");
        }
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Double.compare(valor, produtos.valor) == 0 && Objects.equals(nome, produtos.nome) && statusProdutos == produtos.statusProdutos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor, statusProdutos);
    }


    @Override
    public String toString() {
        return
                '[' +
                    "Produto nome: " + nome  +
                    ", valor: " + valor +
                    ", status: " + statusProdutos +
                ']';
    }
}
