package theory;

import java.awt.*;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Localization {


    public static void main(String[] args) {



    }
    void resourceBundle(){

        //Zoo_pt_BR.properties exemplo de resourceBundle
        ResourceBundle rb = ResourceBundle.getBundle("arquivoaprocurar", new Locale("pt","br"));
        rb.getString("exemploDeKey");
        rb.keySet().stream().forEach(System.out::println);

        //Ordem -> Vai procurar pelo nome que voce passou, depois nome + linguagem , default, default + linguagem, so nome arquivo ou da MissingResourceException

        //Ordem se achar -> procura no que achou , depois nome + linguagem e por fim só nome

        Properties prop = new Properties();
        prop.setProperty("oi","teste");
        prop.setProperty("oi2","teste2");

        String testeString= "Hello,{0} and {1}";//exemplo de chave valor no resource

        System.out.println(MessageFormat.format(testeString,prop.getProperty("oi","notfound"),prop.get("oi2")));

    }

    void compact(){
        NumberFormat nb = NumberFormat.getCompactNumberInstance(new Locale("en"), NumberFormat.Style.LONG);
        System.out.println(nb.format(1000000.00));// 1 milhao

        NumberFormat n = NumberFormat.getCompactNumberInstance(new Locale("en"), NumberFormat.Style.SHORT);
        System.out.println(n.format(1000000.00));

        //mostra até 3 numeros e arredonda o ultimo
        System.out.println(n.format(357.99));
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
