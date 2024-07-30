package theory.Files;

import theory.MyRecord;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilesTests {

    
    public static void main(String[] args){
       Path teste = Path.of("/zoo/./food.txt/../oi.txt");
            Path absolut = Paths.get("C:\\easy\\absolut");
        Path relative = Paths.get("easy\\relative");
        Path relative2 = Paths.get("easy\\relative2");
        Path naonormalzizado = Paths.get("C:\\easy\\..\\nonormalized");

        absolut.resolve(relative);// se os dois forem absolut ou o 2 for absolut retorna o 2
        absolut.relativize(naonormalzizado);//os dois tem que ser ou relativos ou absolut, adiciona ../ para cada elemento do path1

            //System.out.println(absolut.getNameCount());nao conta root
            //System.out.println(absolut.getName(0));nao conta root
             throwsioexceptio(teste,absolut,relative,relative2,naonormalzizado);


       }
       static void throwsioexceptio(Path teste,Path absolut,Path terelativeste,Path relative2,Path naonormalzizado){
        //todos aqui soltam IOEXCEPTION
            try{
                absolut.toRealPath(LinkOption.NOFOLLOW_LINKS);// verifica se existe e retorna desde o root
                Stream<Path> streamdepath = Files.list(absolut);// tem que ser um DIRETORIO existente
                Files.size(absolut);
                //Files.createDirectory(absolut);// cria diretorio e solta excecao se ja existir
                var t = absolut.resolve(Path.of("arquivo.txt"));
                Path te = Paths.get("C:\\easy\\absolut\\teste");
               // Files.createDirectories(t);// nao da erro se o diretorio ja existir
                //Files.copy(absolut,Path.of("C:\\easy\\teste"),StandardCopyOption.REPLACE_EXISTING);// ver o contexto, nao tem como voce copiar algo para um path relativo
                //Files.move(absolut.resolve("oi.txt"),absolut.resolve("ois.txt"));Lembrar de copiar o nome completo de um diretorio para o outro
                Files.delete(Path.of("relativo"));//solta exceçao se n tiver vazio ou se n existir
                boolean existe = Files.deleteIfExists(Path.of("relativo"));//solta exceçao se n tiver vazio, false se n existir
                Files.isSameFile(absolut,relative2);//segue atalho sem opcao de nofollowlink
                Files.mismatch(absolut,relative2);// igual mismatch comum, nao precisa ta normalizado

                System.out.println("Ok");
            }catch (IOException e){
                System.out.println("IOException");
            }
       }


       static void fileSys(){
        Path path = FileSystems.getDefault().getPath("/root","root");
        FileSystem file = FileSystems.getDefault();
        System.out.println(FileSystems.getDefault());
       }


    }

