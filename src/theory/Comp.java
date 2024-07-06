package theory;

public class Comp {

    String nome;
    Integer id;

    public Comp(Integer nu){
        this.id = nu;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
