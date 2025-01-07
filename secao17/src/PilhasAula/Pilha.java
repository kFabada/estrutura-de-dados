package PilhasAula;

import java.util.Scanner;

public class Pilha  {
    public static void main(String[] args) {

        String txt = "Text, sadasd, dasdas,dasdas, 200";

        Scanner sc = new Scanner(txt);

        int[] tt = new int[6];
        sc.useDelimiter(",");

        int j = 0;
        while (sc.hasNext()){
            int i = sc.nextInt();
            if (i == 200){
                tt[j] = i;
            }
            sc.next();
            j++;
        }
    }

}
