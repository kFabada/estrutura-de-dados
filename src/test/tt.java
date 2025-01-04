package test;

import modulo1.VetorEpUm;

public class tt {
    public static void main(String[] args) {
        VetorEpUm vetorEp1 = new VetorEpUm(10);


        try{
            vetorEp1.adicionaA("elemento");
            vetorEp1.adicionaA("elemento2");
            vetorEp1.adicionaA("elemento3");

            vetorEp1.adicionaA("Fabada");
        }catch (Exception e){

        }

    }
}
