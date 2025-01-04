package test;

import modulo1.Contato;
import modulo1.VetorGenericos;
import modulo1.VetorObjetos;

import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {

//        List<Contato> vet = new List<Contato>();

         VetorGenericos<Contato> vetor = new VetorGenericos<Contato>(5);


        vetor.adiciona(new Contato("C1", "EMAIL@GMAIL.COM", "87498498"));

        System.out.println(vetor);
    }
}
