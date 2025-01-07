import model.Produtos;
import service.ProdutoService;
import enums.StatusProdutos;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        Scanner sc = new Scanner(System.in);


        Produtos p = new Produtos("Maça", 5.10, StatusProdutos.PROCESSANDO);
        Produtos p1 = new Produtos("Melancia", 10.50, StatusProdutos.PROCESSANDO);
        Produtos p2 = new Produtos("Goiaba", 4.10, StatusProdutos.PROCESSANDO);
        produtoService.adicionarProduto(p);
        produtoService.adicionarProduto(p1);
        produtoService.adicionarProduto(p2);
        produtoService.listaProdutos();
        produtoService.removerProduto("aaa");
        produtoService.listaProdutos();


       

    }
}