package theory;

 enum MyEnum {


     TESTE{

         void m() {

         }
     } ,
     TESTE2{void m(){
     }
     },

     TESTE3("TRUE"){void m(){
     }
     };


     private MyEnum(){

     }
     abstract void m();
     private String nome;

     private MyEnum(String t){
         System.out.println("quando?");
     }

}
