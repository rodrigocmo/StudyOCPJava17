package theory;

import java.lang.reflect.Array;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Var {

    public void var() {
        var var = "string";

        // var is only allowed for local variables
        // you can't use var word for classes but remember java is case-sensitive
        // var can't be null with the type is primitive
        // var can't be used to multiple assign like var name =1, name2 =2;

    }

    public static void main(String[] args) {
            
        String test = "oi";
        test.translateEscapes();

    }

    public void substringAndIndex(){
        String name = "animals";
        String name2 = "ANIMALS";

        name2.length();


        System.out.println(name.indexOf('a',6));// throw -1 to show that the value doesnt exist
        System.out.println(name.substring(3,3));//empty string
        System.out.println(name.equalsIgnoreCase(name2));
    }

    public void stripAndTrim(){
        String name = "  animals  ";
        String name2 = "  animals  ";
        String name3 = "a b c";
        System.out.println(name.strip() + "test");
        System.out.println(name.stripLeading()+ "test");
        System.out.println(name.stripTrailing()+ "test");
        System.out.println(name.trim()+ "test");
        System.out.println(name2 + "test");
        System.out.println(name3.strip());
        name.stripIndent();

    }

    public void test(){

        String[] test = new String[1];
        String[] test2 = new String[1];

        Arrays.compare(test,test2);

        var date = LocalDate.now();
        var time = LocalTime.now();

        ChronoUnit.HOURS.between(date, time);

    }

    public void testes(){

        var monkey = 0;
        if(monkey ==0){
            String name ="test";
        }
        String name = "test";

    }

}
