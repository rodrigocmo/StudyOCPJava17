package theory;

import java.time.DayOfWeek;

public class Switchs {
    public static void main(String[] args) {

        var oi = switch (1) {
            case 1 -> {
                yield 1;
            }
            default -> 2;
        };// default obrigatorio se nao cobrir todas possibilidades
        // case so pode usar variavel final ou effect mas precisa de saber o tipo em tempo de compilacao, entao parametro de metodo nao compila
        //switch so aceita var object enum int e menores que int
        //enum tem que ser Enum.SeuEnum, passar o Enum direto nao compila
        // os tipos do case tem que ser iguais, passar um case string e um case int nao compila
    }

    void switchAntigo() {
        switch (1) {
            case 1: break;

        }// default opcional, se n passar o break vai cair em todos os casos abaixodo que der match
    }


}
