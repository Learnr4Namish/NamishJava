package in.namishkumar.namishjava;

public class Terminal {
    public static void writeLine(Object object) {
          if(object == null) {
               System.out.println("NamishJava Error: Expected object but got null!");
          }else{
               System.out.println(object);
          }
    }
    
    public static void write(Object object) {
       if(object == null) {
            System.out.println("NamishJava Error: Expected object but got null!");
       }else{
           System.out.print(object);
       }
    }
     public static void main(String[] args) {
         
    }
   
    
}
