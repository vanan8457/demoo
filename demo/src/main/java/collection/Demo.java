package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> ds= Arrays.asList(5,1,1,2,3,4);
        Collections.sort(ds,Collections.reverseOrder());
        ds.forEach(v-> System.out.printf("%d\t",v));
        System.out.println("\nmax ="+Collections.max(ds));
        System.out.println("min ="+Collections.min(ds));
        Collections.shuffle(ds);
        ds.forEach(v-> System.out.printf("%d\t",v));
        System.out.printf("Fred="+ Collections.frequency(ds,1));
        Collections.nCopies(3,0).forEach(v-> System.out.printf("\n%d", v));








    }
}
