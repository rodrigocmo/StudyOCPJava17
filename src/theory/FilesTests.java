package theory;

import java.io.*;
import java.nio.file.*;


public class FilesTests {

    
    public static void main(String[] args) throws IOException {

       //new File("").delete();

      // Files.isDirectory(Path.of("")); // segue atalho por padrao
        //Files.isRegularFile(Path.of(""));// segue atalho por padrao
       // Files.createDirectory(Paths.get(""));// solta exceçao se ja existir
       // Files.lines(Path.of(""));// retorna stream de string, os outros retornam lists

        test();

       }

       public static void test() throws IOException, FileNotFoundException {
          // var oi = Path.of("/zoo/./food.txt/../oi.txt");
           //System.out.println(oi);
         //  System.out.println(oi.normalize());
           //var oi23 = new File("/");
           //var o = new BufferedWriter(new FileWriter("/oi.txt"));
          // var a = new FileReader("/oi.txt");

          var  oi = Path.of("easy\\teste\\..");
          System.out.println(oi.toAbsolutePath());
         //System.out.println("real path " + oi.toRealPath());
         // System.out.println("parent " + oi.getParent());
         //System.out.println("both" + oi.toRealPath().getParent());
          //Files.walk(oi.toRealPath().getParent()).map(p->p.toAbsolutePath().toString()).filter(p->p.endsWith(".txt")).forEach(System.out::println);

           var teste = new MyRecord("rodrigo",2);


       }


    }

