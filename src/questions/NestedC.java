package questions;

import com.sun.tools.javac.Main;
import jdk.dynalink.beans.StaticClass;

import java.time.Period;

public class NestedC {

    private String nome = "Outer";
    public static void main(String[] args) {


        var Inner = new NestedC().new InnerC();
        var Nested = new NestedC();
        var StaticClass = new StaticC();
        System.out.println(StaticClass.StaticString);


    }

    public class InnerC{
        public String nome = "Inner";

        public void test(){
            System.out.println(NestedC.this.nome);
        }


    }
    static class StaticC{


        private String StaticString ="Static";

    }

    public void LocalMethod(){
         class Localc{


        }
    }

    public InnerC test(){
        return new InnerC();
    }

    public sealed class top permits top.top2 {
        public non-sealed class top2 extends top{

            public class t extends top2{

            }
        }

    }






}
