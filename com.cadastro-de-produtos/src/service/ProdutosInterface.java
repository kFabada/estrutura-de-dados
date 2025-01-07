package service;

import model.Produtos;

public interface ProdutosInterface  {

    void adicionarProduto(Produtos produtos);
    void removerProduto(String nome);
    void listaProdutos();
}
