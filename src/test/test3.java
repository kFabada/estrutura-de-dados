package test;

import modulo1.VetorEpUm;

public class test3 {
    public static void main(String[] args) {
        VetorEpUm vetorEp1 = new VetorEpUm(10);


        vetorEp1.adiciona("B");
        vetorEp1.adiciona("C");
        vetorEp1.adiciona("E");
        vetorEp1.adiciona("F");
        vetorEp1.adiciona("G");

        System.out.println(vetorEp1);


        vetorEp1.adiciona(0, "A");

        System.out.println(vetorEp1);

        vetorEp1.adiciona(3, "D");

        System.out.println(vetorEp1);

        vetorEp1.adiciona(1, "K");


        System.out.println(vetorEp1);
    }
}
