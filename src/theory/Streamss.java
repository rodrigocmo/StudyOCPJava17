package theory;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamss {
    public static void main(String[] args) {
        IntSummaryStatistics oi = new IntSummaryStatistics();
        String teste = "Oi";

        Stream testes = Stream.of(1,2);

        IntStream t = IntStream.of(1);
        t.summaryStatistics();

        //Stream.iterate(1,a-> a+1).limit(5).forEach(System.out::println);// aplica o unary operator no resultado anterior

        List<Long> oiis= Stream.iterate(1, a-> a+1).limit(5).collect(Collectors.mapping(a-> (long)a,Collectors.toList()));



    }
}
