package queue;

import java.util.Queue;
import java.util.Stack;

public class PalinPilha {
    public static void main(String[] args) {

       boolean r =  palin(121);
        System.out.println(r);

    }
    public static boolean palin(int x){
        StringBuilder stt = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String ch = String.valueOf(x);
        String result = "";

        int i = 0;
        while (i < ch.length()){
            stack.add(ch.charAt(i));
            i++;
        }

        while (!stack.empty()){

            result += stt.append(stack.pop());
        }
        System.out.println(result);

        if (ch.equals(result)){
            return true;

        }
        return false;
    }
}
