package in.namishkumar.namishjava;

import java.util.Scanner;

public class NamishInput {
     public static void main(String[] args) {
        
     }
     public static String readLine(String InputMessage) {
         Scanner InputScanner = new Scanner(System.in);
         System.out.println(InputMessage);
         String InputResponce = InputScanner.nextLine();
         return InputResponce;
     }
     
}
