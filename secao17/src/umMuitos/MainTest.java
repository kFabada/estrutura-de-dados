package umMuitos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        String test  = "ZBCDFEGFERFG";

        for (int i=0; i < test.length(); i++){
            if (test.charAt(i) == 'A'){

            }
        }

      
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Digite Nome Completo");
        String nome = sc.next();
        System.out.println("Digite Cpf");
        String cpf = sc.next();

        int quantidade = sc.nextInt();

        ArrayList<Contatos> contatoList = new ArrayList<>();

        while (quantidade > 0){
            System.out.println("Digite tipo do numero");
            String tipo = sc.next();
            System.out.println("Digite ddd");
            String ddd = sc.next();
            System.out.println("Digite numero");
            String numero = sc.next();
            System.out.println("----------------------------------------");

            Contatos contatos = new Contatos(tipo, ddd, numero);
            contatoList.add(contatos);
            quantidade--;
        }


        System.out.println("Digite endereco");
        String endereco = sc.next();
        System.out.println("Digite numero da casa");
        int numeroCasa = sc.nextInt();
        System.out.println("Digite o cep");
        String cep = sc.next();
        System.out.println("Digite o Complemento");
        String complemento = sc.next();
        System.out.println("----------------------------------------");
        Endereco endereco1 = new Endereco(endereco, numeroCasa, cep, complemento);
        System.out.println("Digite o username");
        String username = sc.next();
        System.out.println("Digite senha");
        String password = sc.next();

        Login login = new Login(username, password);


        Pessoa pessoa1 = new Pessoa(nome, cpf, contatoList, endereco1, login);


        sc.close();
    }
}
