package service;


import model.Produtos;

import java.util.ArrayList;

public class ProdutoService  implements ProdutosInterface {

    private ArrayList<Produtos> list;

   public ProdutoService(){
        list = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(Produtos produtos) {
        list.add(produtos);
    }

    @Override
    public void removerProduto(String nome) {
         boolean mess =  list.removeIf(list -> list.getNome().equals(nome));
         if (mess){
             System.out.println("Item removido com base no nome");
         }
        System.out.println("Nenhum item removido da lista");
    }

    @Override
    public void listaProdutos() {
        for (Produtos p: list){
            System.out.println(p);
        }
    }
}
