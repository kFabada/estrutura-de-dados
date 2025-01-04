package test;

import modulo1.VetorEpUm;

public class ep2 {
    public static void main(String[] args) {

        VetorEpUm vetorEp1 = new VetorEpUm(10);


            vetorEp1.adiciona("A");
            vetorEp1.adiciona("B");
            vetorEp1.adiciona("C");
            vetorEp1.adiciona("D");
            vetorEp1.adiciona("E");

        System.out.println("Posicao Normal");
        System.out.println(vetorEp1);

        vetorEp1.removerElemento(2);

        System.out.println("Posicao removida");
        System.out.println(vetorEp1);

        System.out.println("Busca Elemento");
        int posicaoElemento = vetorEp1.busca("E");

        if(posicaoElemento > -1){
            vetorEp1.removerElemento(posicaoElemento);
            System.out.println(posicaoElemento);
        }else{
            System.out.println("Elemento não existe ");
        }
        System.out.println("Removento elemento com a posicao");
        System.out.println(vetorEp1);

    }
}
