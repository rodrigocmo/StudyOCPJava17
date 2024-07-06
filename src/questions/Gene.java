package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gene {

    List<Integer> teste = new ArrayList<>();
    List<Object> oi;

    //{oi = teste  nao compila}

    public static void main(String[] args) {
        new Gene().teste();
    }

    public void teste() {

        List<?> oi = new ArrayList<>();//lista imutavel, so serve para atribuir outra lista

        List<String> teste = new ArrayList<>();
        List<? extends CharSequence> chars = new ArrayList<>(teste);
        //chars.add("string");nao compila pois voce poderia adicionar qualquer objeto q extende charsequence, logo a lista é imutavel

        List<? super CharSequence> strings = new ArrayList<>(teste);
        strings.add("string");//pode adicionar classes que sao charsequence ou subclasse, mas uma super de charsequence nao da pq ai poderia ser qualquer coisa

        //comentarios acima sao para definiçao de imutabilidade, para atribuir uma lista o comportamento funciona de acordo com a palavra extends ou super

        List<? super CharSequence> t = new ArrayList<>();




    }

    public <T>List<? extends Number> getNumbers(T t) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        return integers;
    }

}
