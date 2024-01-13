import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AssessmentTest {
    public static void main(String[] args) {
        // Creating a stream of integers
        IntStream stream = IntStream.range(5, 12);

        IntStream test = IntStream.range(5, 12);

        System.out.println("The corresponding " +
                "parallel IntStream is :");
        stream.parallel().forEach(System.out::println);

System.out.println("------------");

        test.forEach(System.out::println);

        question2();
    }

    public static void question2(){

        List<Integer> data = new ArrayList<>();
        IntStream.range(0,100).forEachOrdered(s-> data.add(s));
        System.out.println(data.size());

    }
}