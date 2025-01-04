package pilha;

import java.util.*;

public class StackPalindramo{
    public static void main(String[] args) {


        
        Conta conta = new Conta("ddd", 50.0);
        Conta conta1 = new Conta("asdasdas", 15.0);
        Conta conta2 = new Conta("fff", 35.0);

        List<Conta> account = new ArrayList<>();

        account.add(conta);
        account.add(conta1);
        account.add(conta2);

        Conta cc = conta2;

        System.out.println(account.contains(conta.equals(50.0)));

        Collections.sort(account);
        System.out.println(Collections.binarySearch(account, cc));

        for (Conta x: account){
            System.out.println(x);
        }



    }


}
