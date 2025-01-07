package aulaSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setAula {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>( );

        set.add("TV");
        set.add("Notebook");
        set.add("Aotebook");
        set.add("Tablete");
        set.add("Aotebook");
        set.add("Tablete");



        for (String x: set){
            System.out.println(x);
        }
    }
}
