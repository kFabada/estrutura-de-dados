package test;

import modulo1.VetorEpUm;

public class test1 {
    public static void main(String[] args) {

        VetorEpUm vetorEp1 = new VetorEpUm(10);


        vetorEp1.adiciona("elemento");
        vetorEp1.adiciona("elemento2");
        vetorEp1.adiciona("elemento3");

        System.out.println(vetorEp1.busca(2));
    }
}
