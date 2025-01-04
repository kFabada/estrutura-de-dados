package modulo1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aula12ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(0, "I");

        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");

        if (existe){
            System.out.println("existe");
        }else {
            System.out.println("nao existe");
        }

        int pos = arrayList.indexOf("A");

        if (pos > -1){
            System.out.println("existe " + pos);
        }else {
            System.out.println("nao existe " + pos);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("B");
        System.out.println(arrayList);

        System.out.println(arrayList.size());

        arrayList.set(0, "PP");

        System.out.println(arrayList);

    }
}
