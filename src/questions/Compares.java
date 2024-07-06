package questions;

import java.util.*;

public class Compares {
    public static void main(String[] args){


       Rope r1 = new Rope();
       Rope r2 = new Rope();
       r1.setTest("oi");
       r2.setTest("Oi");

       List<Rope> list = new ArrayList<>();

       list.add(r1);
       list.add(r2);


       Comparator<Rope> c = Comparator.comparing(Rope::getTest).thenComparingLong(a->a.getTest2().length());

       Comparator<Rope> te = Comparator.comparing(Rope::getTest).reversed();

       Collections.sort(list,c);
        Collections.reverse(list);

       System.out.println(list);








    }

}
