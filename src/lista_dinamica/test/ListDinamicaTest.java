package lista_dinamica.test;

import lista_dinamica.ListaEncadeada;

public class ListDinamicaTest {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.adiciona(1);
        System.out.println(listaEncadeada);
        listaEncadeada.adiciona(2);
        System.out.println(listaEncadeada);
        listaEncadeada.adiciona(3);
        System.out.println(listaEncadeada);

        System.out.println(listaEncadeada.busca(1));

        System.out.println(listaEncadeada.buscaElemento(0));

    }
}
