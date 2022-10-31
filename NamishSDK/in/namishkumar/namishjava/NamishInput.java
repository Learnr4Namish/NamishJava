package in.namishkumar.namishjava;

import java.lang.RuntimeException;
import java.util.Scanner;

// Welcome to NamishInput 1.0.0 built for NamishJava!
// Latest update on 31 October 2022

// NamishInput main class
public class NamishInput {
   // The main void
   public static void main(String[] args) {

   }

   // The read line void
   public static Object readLine(int InputType, String InputMessage) {
      Object x = null;
      if (InputType == 8080) {
         Scanner InputScanner = new Scanner(System.in);
         System.out.println(InputMessage);
         String InputResponce = InputScanner.nextLine();
         x = InputResponce;
      } else if (InputType == 8081) {
         Scanner InputScanner = new Scanner(System.in);
         System.out.println(InputMessage);
         int InputResponce = InputScanner.nextInt();
         x = InputResponce;
      } else {
         throw new RuntimeException("NamishJava: <undefined> TypeError: The provided type is of invalid type!");
      }
      return x;
   }

   // Accepts a double number and then squares the number and prints it
   public static void SquareInput(String InputMessage) {
      try {
         Scanner InputScanner = new Scanner(System.in);
         System.out.println(InputMessage);
         double InputResponce = InputScanner.nextDouble();
         System.out.println(InputResponce * InputResponce);
      } catch (RuntimeException except) {
         throw new RuntimeException(
               "NamishJava <unresolved> error TypeError: Expected double but got null or <Type.IsOther!>");
      }
   }

   // Acceepts a double number and then prints its cube
   public static void CubeInput(String InputMessage) {
      try {
         Scanner InputScanner = new Scanner(System.in);
         System.out.println(InputMessage);
         double InputResponce = InputScanner.nextDouble();
         System.out.println(InputResponce * InputResponce * InputResponce);
      } catch (RuntimeException except) {
         throw new RuntimeException(
               "NamishJava <unresolved> error TypeError: Expected double but got null or <Type.IsOther!>");
      }
   }

   // Accepts a double number and raises it to a power and then prints the result
   /*
    * || NOTICE || The power must be an int and not double! Doing so may return
    * TypeError!
    */
   public static void PowerInput(String InputMessage, int RaisedPower) {
      try {
         Scanner InputScanner = new Scanner(System.in);
         System.out.println(InputMessage);
         double InputResponce = InputScanner.nextDouble();
         System.out.println(Math.pow(InputResponce, RaisedPower));
      } catch (RuntimeException except) {
         throw new RuntimeException(
               "NamishJava <unresolved> error TypeError: Expected double but got null or <Type.IsOther!>");
      }
   }

   // Accepts a double number prints the result by adding a certain number to it
   public static void IncrementInput(String InputMessage, double ToAdd) {
      try {
         Scanner inputScanner = new Scanner(System.in);
         System.out.println(InputMessage);
         double InputResponce = inputScanner.nextDouble();
         double ResultBase = InputResponce + 1;
         String ResultToPrint = String.valueOf(ResultBase);
         System.out.println(ResultToPrint);
      } catch (RuntimeException exception) {
         throw new RuntimeException(
               "NamishJava <unexpected> error TypeError: Expected double but got null or <Type.IsOther!>");
      }
   }

}
