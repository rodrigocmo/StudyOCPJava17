package theory;

public class Operators {
    public static void main(String[] args) {
        boolean test1 = true;
        boolean test2 = true;
        boolean test3 = (test1=true);
        boolean test4 = (test1=false);

        switch (7) {
            case 1,2,6:
                System.out.println("teste1");
            case 3,4,5:
                System.out.println("teste2");
            case 7:
                System.out.println("teste2");
            default:
                System.out.println("teste3");

        }
    }
}
