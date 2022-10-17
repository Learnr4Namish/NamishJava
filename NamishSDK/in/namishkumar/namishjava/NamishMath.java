package in.namishkumar.namishjava;
import java.lang.Math;
public class NamishMath {
     public static void main(String[] args) {
     }
     public static double pi() {
        return 3.14159265;
     }
     
     public static double piApprox() {
        return 3.14;
     }
     public static double findCos(double number) {
        double thisObj = Math.cos(number);
        return thisObj;
     }

     public static double findSin(double number) {
         double thisObj = Math.sin(number);
         return thisObj;
     }

     public static int findAbs(int number) {
         return Math.abs(number);
     }
    
     public static Object findMin(int number1, int number2) {
         return Math.min(number1, number2);
     }

     public static Object findMax(int number1, int number2) {
      return Math.max(number1, number2);
  }

}
