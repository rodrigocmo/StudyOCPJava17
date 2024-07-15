package questions;


import theory.Test;

import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.TreeSet;

import static java.util.Arrays.*;

public class Questions extends Test {
    public void quack() {
        System.out.println("quack!");
    }

    public static void main(String[] args) {

    }
    void inferenciaDeTipo(){
        //var points = new TreeSet<>();points.add(7);points.add(5);points.add(-4);points.forEach((Integer n)-> System.out.println(n));
        // Nao compila pois voce esta criando um treeset de object, por mais que possa add ints voce itera sobre Object
        }

}
