package theory;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Formats {
    public static void main(String[] args) {
        DateTimeFormatter dt =  DateTimeFormatter.ofPattern("d/MM/Y");
        LocalDateTime local = LocalDateTime.of(2024, Month.OCTOBER,1,1,1);
        System.out.println(dt.format(local));
        System.out.println(local.format(DateTimeFormatter.ISO_DATE_TIME));
    }

    void nbformat(){
        NumberFormat n = new DecimalFormat("##,000.00");
        Double numero = 110.11;
        System.out.println(n.format(numero));
    }
}
