package test;

import modulo1.Contato;
import modulo1.VetorObjetos;

public class vetorObject {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(5);

        Contato c1 = new Contato("Contato 1","tes@hotmail.com","12345-345" );
        Contato c2 = new Contato("Contato 2","tesando@hotmail.com","52345-345" );
        Contato c3 = new Contato("Contato 3","teste@hotmail.com","92345-345" );
        Contato c4 = new Contato("Contato 4","teste@hotmail.com","92345-345" );


        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor);

        int pos = vetor.busca(c4);
        if(pos > -1){
            System.out.println("elemento existe");
        }else {
            System.out.println("não existe");
        }
    }
}
