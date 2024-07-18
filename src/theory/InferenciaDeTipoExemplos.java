package theory;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class InferenciaDeTipoExemplos {
    public static void main(String[] args) {

    }

    void iterarSobreCollection(){
        var points = new TreeSet<Integer>();points.add(7);points.add(5);points.add(-4);points.forEach((Integer n)-> System.out.println(n));
        // Sem especificar<Integer> compila pois voce esta criando um treeset de object, por mais que possa add ints voce itera sobre Object
    }

    void invariancia_de_tipo(){
        //Invariância de tipos: Em Java, para tipos genéricos como List<T>, List<Integer> e List<Object>, a relação entre eles é de invariância.
        // Isso significa que List<Integer> não é considerada subtipo de List<Object>, mesmo que Integer seja subtipo de Object.
        //Motivo da invariância: Isso é uma medida de segurança para garantir a integridade do tipo em tempo de execução.
        // Se List<Integer> fosse tratada como subtipo de List<Object>, seria possível adicionar qualquer tipo de Object à lista List<Integer>,
        // o que quebraria a segurança de tipos em Java.

        Integer inteiro = 1;
        Object objeto = inteiro;

        List<Integer> inteiros = new ArrayList<>();
        //List<Object> objetos = inteiros; logo essa linha nao compila pois java entende que List<Integer> nao é subtipo de List<Object>
    }



}
