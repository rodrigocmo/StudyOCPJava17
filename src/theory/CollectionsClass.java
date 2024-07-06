package theory;

import java.util.*;
import java.util.stream.Stream;

public class CollectionsClass {

    public static void main(String[] args) {
        Map<Long,String> teste = new HashMap<>();

        List<Double> oi = Stream.generate(Math::random).limit(10).toList();

        oi.forEach((dou)-> teste.put(Math.round(dou),"String"));

        teste.put(1000L, "Rodrigo");

        teste.values().forEach(System.out::println);

        teste.replaceAll((k,v)-> {
            if(k == 1000L)
                return "Testeok";
            else return v;
        });

        teste.values().forEach(System.out::println);


        new CollectionsClass().printMerge(teste);


    }

    public void printMerge(Map<Long,String> teste){

        teste.replace(1000L,null);

        teste.merge(1000L,"Rod",(old,newvalue)->newvalue);

        System.out.println(teste);


    }


   }




