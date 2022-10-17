package in.namishkumar.namishjava;
import java.util.Scanner;
public class NamishInput {
     public static void main(String[] args) {
        
     }
     public static Object readLine(int InputType , String InputMessage) {
        Object x = null;
        if(InputType == 8080) {
            Scanner InputScanner = new Scanner(System.in);
         System.out.println(InputMessage);
         String InputResponce = InputScanner.nextLine();
         x = InputResponce;
        }else if(InputType == 8081) {
           Scanner InputScanner = new Scanner(System.in);
           System.out.println(InputMessage);
           int InputResponce = InputScanner.nextInt();
           x = InputResponce;
        }else{
            throw new RuntimeException("NamishJava: <undefined> TypeError: The provided type is of invalid type!");
        }
       return x; 
     }
     
}
