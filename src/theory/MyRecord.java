package theory;

public record MyRecord(String name, Integer number) implements MyInterface{

public MyRecord{
  name = name.toLowerCase();

}

  public MyRecord(String name, String name2, Integer number){
  this(name,number,name2);

  }
  public MyRecord(String name, Integer number, String name2){
     this(name.concat(name2),number);
  }



  @Override public Integer my() {
    return null;
  }
}
