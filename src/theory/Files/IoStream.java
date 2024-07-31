package theory.Files;

import theory.NestedC;


import java.io.*;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.List;
import java.util.stream.Stream;

public class IoStream {
    public static void main(String[] args)  {
        var file = new File("C:\\easy\\oi.txt");
        var fileout = new File("C:\\easy\\oi2.txt");

        try{
        Stream<Path> find = Files.find(file.toPath(),5,(path,basic)-> path.isAbsolute() && basic.isRegularFile(),FileVisitOption.FOLLOW_LINKS);
        Stream<Path> walk = Files.walk(file.toPath(),Integer.MAX_VALUE,FileVisitOption.FOLLOW_LINKS);//depth opcional
        }catch (IOException e){

        }

    }
    void basicFileAttribute(File file){
        try {
            BasicFileAttributeView view = Files.getFileAttributeView(file.toPath(), BasicFileAttributeView.class);
            BasicFileAttributes basic = view.readAttributes();
            basic.isRegularFile();
            basic.lastAccessTime();
            basic.size();
        }catch (IOException e){

        }
    }

    void mark() throws IOException{
       var mark = new FileReader("oi");
       boolean is = mark.markSupported();
       mark.mark(5);
       mark.reset();// se ja tiver lido mais que o readLimit do mark solta exceçao
       Long m = mark.skip(2);//pula , se chegar no fim da stream retorna quanto falta para chegar no fim em long;

    }
    void console(){

        Console console = System.console();

        if(console != null) {// tem que verificar se é diferente de null antes de chamar os metodos
            console.readLine();
            char[] senha = console.readPassword("digite sua senha");
            console.writer().println("Oi");
        }
    }

    void objects() throws ClassNotFoundException, IOException{
        var objectReader = new ObjectInputStream(new BufferedInputStream(new FileInputStream("")));

        var objectWriter =  new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("")));

        objectWriter.writeObject(objectReader.readObject());

    }
    void filesinputoutput(File file,File fileout){
        try {
            List<String> listString = Files.readAllLines(file.toPath());
            Stream<String> streamString = Files.lines(file.toPath());
            Files.write(fileout.toPath(),listString);
            streamString.forEach(string-> {
                try {
                    Files.writeString(fileout.toPath(),string);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        }catch (IOException e){

        }
    }

    void printExample(File fileout){
        try(var printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileout,true)))){// lembrar que fechar o printStream fecha o Sys.ou
            var printStream = new PrintStream("file");
            Integer oi = 2;
            String teste =  "testando %d";
            printWriter.printf(teste,oi);

        }catch (IOException e){


        }
    }

    void bufferedReaderExample(File file) {
        try (var bf = new BufferedReader(new FileReader(file))) {
            String out;
            while ((out = bf.readLine()) != null) {
                System.out.println(out);
            }
        } catch (IOException e) {

        }
    }

    void out(File file) {
        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            File file2 = new File("C:\\easy\\teste\\teste3\\nono.txt");
            if (file2.exists() && file2.isFile()) {
                var writer = new BufferedWriter(new FileWriter(file2));
                String c;
                while ((c = bf.readLine()) != null) {
                    System.out.println(c);
                    writer.write(c);
                    writer.newLine();
                }
                writer.flush();
            }
            //Files.newBufferedReader(file);
        } catch (IOException Io) {

        }
    }
}
