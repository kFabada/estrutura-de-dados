package lista;

public class Mainlist {
    public static void main(String[] args) {

        ListaTeste listaTeste = new ListaTeste<>(3);


            listaTeste.adicionarProduto(new Produto("Abobora", -2.70));
            listaTeste.adicionarProduto(new Produto("Maça", 5.70));
            listaTeste.adicionarProduto(new Produto("Melancia", 11.50));





        System.out.println(listaTeste);
    }
}
