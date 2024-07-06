package questions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Localization {


    public static void main(String[] args) {


    }
    void instances(){

        NumberFormat nb = NumberFormat.getNumberInstance();
        System.out.println(nb.format(1000L));
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(1000L));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(1000L));
        NumberFormat inte = NumberFormat.getIntegerInstance();
        System.out.println(inte.format(19.99));//format arredonda
        try {
            System.out.println(inte.parse("19.999"));
            System.out.println(inte.parse("19,999"));//parse corta decimal e devolve Number cuidado ao atribuir a classes numericas
        }catch (ParseException e){
            throw new IllegalArgumentException();
        }
    }
    void local(){
        Locale local = new Locale.Builder().setRegion("BR").setLanguage("pt").build();
        System.out.println(local.getDisplayLanguage());

        Locale.setDefault(Locale.Category.DISPLAY,new Locale("pt","BR"));
    }

}
