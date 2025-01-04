package pilha;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class PilhaTestStack{

    public static void main(String[] args)  {


        Stack<Integer> stack = new Stack<>();
        Scanner sc =new Scanner(System.in);

        int j = 0;

        while (j < 5){

            System.out.println("Digite um numero: ");
            int i = sc.nextInt();

            if (i % 2 == 0){
                stack.push(i);
            }else {
                try{
                    verificarPilha(stack);
                    if (!stack.empty()){
                        stack.pop();
                    }
                }catch (EmptyStackException e){
                    System.out.println(e);
                }

            }
            j++;
        }

       while (!stack.empty()){
           System.out.println("numeror par da stack: " + stack.pop());

       }
        sc.close();


    }

    static void verificarPilha(Stack<Integer> stt){
        if (stt.isEmpty()){
            System.out.println("Stack esta vazia");
        }
    }
}
