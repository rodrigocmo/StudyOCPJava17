package questions;

import javax.swing.*;
import java.util.Comparator;

public class Rope implements Comparable<Rope> {
    public static int length = 0;
    private String test ;
    private String test2 ;
    private String test3 ;


    public Rope() {
    }

    public Rope(String test, String test2, String test3) {
        this.test = test;
        this.test2 = test2;
        this.test3 = test3;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }

    @Override
    public int compareTo(Rope o) {
       return this.test.compareTo(o.getTest2());
    }

    @Override
    public String toString() {
        return "Rope{" +
                "test='" + test + '\'' +
                ", test2='" + test2 + '\'' +
                '}';
    }
}
