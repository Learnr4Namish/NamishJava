// NamishMath Package
/* Use in.namishkumar.namishjava.NamishMath 
                   OR
                ________
/* Use in.namishkumar.namishjava.* to import */
package in.namishkumar.namishjava;

// Welcome to NamishMath! Made by Namish Kumar in October 2022

/* NamishMath 1.0.0 built for NamishJava 1.0.0
Latest update on 25 October 2022 */
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;

// Main NamishMath class
public class NamishMath {
    // NamishMath main void()
    public static void main(String[] args) {
    }

    // The PI value
    final static double PIval = 3.14159265;

    // The PI-Approx value
    final static double piApproxVal = 3.14;

    // Returns the value of PI approximated to 8 decimal places
    public static double pi() {
        return PIval;
    }

    // Returns the value of PI approximated to 2 decimal places
    public static double piApprox() {
        return piApproxVal;
    }

    // Finds the Cosine of any angle
    public static double findCos(double number) {
        double thisObj = Math.cos(number);
        return thisObj;
    }

    // Finds the Sine of any angle
    public static double findSin(double number) {
        double thisObj = Math.sin(number);
        return thisObj;
    }

    // Finds the absolute value of any angle
    public static int findAbs(int number) {
        return Math.abs(number);
    }

    // Finds the smallest number of the two numbers
    public static int findMin(int number1, int number2) {
        return Math.min(number1, number2);
    }

    // Finds the smallest number of the array of numbers
    public static int findMinAll(Array ArrayOfNumbers) {
        return 0;
    }

    // Finds the maximum/biggest number of the two numbers
    public static int findMax(int number1, int number2) {
        return Math.max(number1, number2);
    }

    // Finds the smallest number of the array of numbers
    public static int findMaxAll(Array ArrayOfNumbers) {
        return 0;
    }

    // Finds the Square of a number
    public static double findSquare(double n) {
        return n * n;
    }

    // Finds the Cube of a number
    public static double findCube(double n) {
        return n * n * n;
    }

    // Finds the Square-root of a number
    public static double sqrt(double n) {
        return Math.sqrt(n);
    }

    // Finds the Cube-Root of a number
    public static double cbrt(double n) {
        return Math.cbrt(n);
    }

    // Finds the successor or adds 1 to a given number
    public static int Increment(int n) {
        return n + 1;
    }

    // Adds two given numbers
    public static int AddTwoNumbers(int n1, int n2) {
        return n1 + n2;
    }

    // Adds three given numbers
    public static int AddThreeNumbers(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Adds four given numbers
    public static int AddFourNumbers(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    // Adds five given numbers
    public static int AddFiveNumbers(int n1, int n2, int n3, int n4, int n5) {
        return n1 + n2 + n3 + n4 + n5;
    }

    // Adds six given numbers
    public static int AddSixNumbers(int n1, int n2, int n3, int n4, int n5, int n6) {
        return n1 + n2 + n3 + n4 + n5 + n6;
    }

    // Adds seven given numbers
    public static int AddSevenNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7;
    }

    // Adds Eight given numbers
    public static int AddEightNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7,
            int n8) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;
    }

    // Adds Nine given numbers
    public static int AddNineNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7,
            int n8, int n9) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
    }

    // Adds Ten given numbers
    public static int AddTenNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7,
            int n8, int n9, int n10) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
    }

    // Adds all the numbers of a given array
    public static int AddAllNumbers(int[] ArrayOfNumbers) {
        int x = 0;
        for (int i = 0; i < ArrayOfNumbers.length; i++) {
            x = 0;
        }
        return 0;
    }

    // Adds 1 to a given number
    public static int Add1(int n) {
        return n + 1;
    }

    // Adds 2 to a given number
    public static int Add2(int n) {
        return n + 2;
    }

    // Adds 3 to a given number
    public static int Add3(int n) {
        return n + 3;
    }

    // Adds 4 to a given number
    public static int Add4(int n) {
        return n + 4;
    }

    // Adds 5 to a given number
    public static int Add5(int n) {
        return n + 5;
    }

    // Adds 6 to a given number
    public static int Add6(int n) {
        return n + 6;
    }

    // Adds 7 to a given number
    public static int Add7(int n) {
        return n + 7;
    }

    // Adds 8 to a given number
    public static int Add8(int n) {
        return n + 8;
    }

    // Adds 9 to a given number
    public static int Add9(int n) {
        return n + 9;
    }

    // Adds 10 to a given number
    public static int Add10(int n) {
        return n + 10;
    }

    // Finds the predessor or subtracts 1 from a given number
    public static int Decrement(int n) {
        return n - 1;
    }

    // Subtracts two given numbers
    public static int SubTwoNumbers(int n1, int n2) {
        return n1 - n2;
    }

    // Subtracts three given numbers
    public static int SubThreeNumbers(int n1, int n2, int n3) {
        return n1 - n2 - n3;
    }

    // Subtracts four given numbers
    public static int SubFourNumbers(int n1, int n2, int n3, int n4) {
        return n1 - n2 - n3 - n4;
    }

    // Subtracts five given numbers
    public static int SubFiveNumbers(int n1, int n2, int n3, int n4, int n5) {
        return n1 - n2 - n3 - n4 - n5;
    }

    // Subtracts six given numbers
    public static int SubSixNumbers(int n1, int n2, int n3, int n4, int n5, int n6) {
        return n1 - n2 - n3 - n4 - n5 - n6;
    }

    // Subtracts seven given numbers
    public static int SubSevenNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7) {
        return n1 - n2 - n3 - n4 - n5 - n6 - n7;
    }

    // Subtracts Eight given numbers
    public static int SubEightNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7,
            int n8) {
        return n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8;
    }

    // Subtracts Nine given numbers
    public static int SubNineNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7,
            int n8, int n9) {
        return n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8 - n9;
    }

    // Subtracts Ten given numbers
    public static int SubTenNumbers(int n1, int n2, int n3, int n4, int n5, int n6, int n7,
            int n8, int n9, int n10) {
        return n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8 - n9 - n10;
    }

    // Subtracts Two from a given number
    public static int Sub2(int n) {
        return n - 2;
    }

    // Subtracts Three from a given number
    public static int Sub3(int n) {
        return n - 3;
    }

    // Subtracts Four from a given number
    public static int Sub4(int n) {
        return n - 4;
    }

    // Subtracts Five from a given number
    public static int Sub5(int n) {
        return n - 5;
    }

    // Subtracts Six from a given number
    public static int Sub6(int n) {
        return n - 6;
    }

    // Subtracts Seven from a given number
    public static int Sub7(int n) {
        return n - 7;
    }

    // Subtracts Eight from a given number
    public static int Sub8(int n) {
        return n - 8;
    }

    // Subtracts Nine from a given number
    public static int Sub9(int n) {
        return n - 9;
    }

    // Subtracts Ten from a given number
    public static int Sub10(int n) {
        return n - 10;
    }

    // Returns the value of a decade
    public static int Decade() {
        return 10;
    }

    // Returns the value of a half-decade
    public static int HalfDecade() {
        return Decade() / 2;
    }

    // Returns the value of a quater-decade
    public static int QuaterDecade() {
        return Decade() / 4;
    }

    // Divides the value of a decade with some other number
    public static int DivideDecade(int n) {
        return Decade() / n;
    }

    // Returns the value of a century
    public static int Century() {
        return 100;
    }

    // Returns the value of a half-century
    public static int HalfCentury() {
        return Century() / 2;
    }

    // Returns the value of quater-century
    public static int QuaterCentury() {
        return Century() / 4;
    }

    // Divides the value of a century with some other number
    public static int DivideCentury(int n) {
        return Century() / n;
    }

    // Returns the value of a Millennium
    public static int Millennium() {
        return 1000;
    }

    // Returns the value of a Half-Millenium
    public static int HalfMillennium() {
        return Millennium() / 2;
    }

    // Mensuration Zone

    public class Mensuration {
        // Square Zone
        public class Square {
            // Finds the area of a square
            public static String Area(double sideLength, String Unit) {
                double area = NamishMath.findSquare(sideLength);
                return String.valueOf(area) + " " + Unit + "²";
            }

            // Finds the magnitude of the Area and returns as a double
            public static double AreaMagnitude(double sideLength, String Unit) {
                double area = NamishMath.findSquare(sideLength);
                return area;
            }

            // Finds the side-length of a square
            /*
             * ||NOTICE|| ! The Unit in Side() needs to be in non-square format. For
             * example, don't type M². Type M only! If done so, it will return the side in
             * M² too!
             */
            public static String Side(double area, String Unit) {
                // Find the Square-Root of the area
                double sideLength = NamishMath.sqrt(area);
                // Convert it to string
                String sideStr = String.valueOf(sideLength);
                // Temporary gap
                String tempGap = " ";
                // Return the side-length now
                return sideStr + tempGap + Unit;
            }

            // Finds the megnitude of the side Length and returns as a double
            public static double SideMagnitude(double area) {
                // Find the Square-Root of the area
                double sideLength = NamishMath.sqrt(area);
                return sideLength;
            }

            // Finds the length of the diagonal
            public static String Diagonal(double side, String Unit) {
                return String.valueOf(side) + "√2";
            }

            // Finds the Perimeter of the square
            public static String Perimeter(double side, String Unit) {
                double SideLength = side;
                double PeriLength = 4 * SideLength;
                return String.valueOf(PeriLength) + " " + Unit;
            }
        }

        // Rectangle zone
        public class Rectangle {
            // Finds the area of the Rectangle
            public static String Area(double length, double width, String Unit) {
                double area = length * width;
                return String.valueOf(area) + " " + Unit + "²";
            }

            /*
             * Finds the Length of the rectangle from its breadth and area
             * ||NOTICE|| ! The Unit in Length() needs to be in non-square format. For
             * example, don't type M². Type M only! If done so, it will return the length in
             * M² too!
             */

            public static String Length(double width, double area, String Unit) {
                double length = area / width;
                return String.valueOf(length) + Unit;
            }

            /*
             * Finds the Width of the rectangle from its length and area
             * ||NOTICE|| ! The Unit in Breadth() needs to be in non-square format. For
             * example, don't type M². Type M only! If done so, it will return the length in
             * M² too!
             */

            public static String Breadth(double Length, double area, String Unit) {
                double b = area / Length;
                return String.valueOf(b) + Unit;
            }

            // ! Same Void ! //
            public static String Width(double Length, double area, String Unit) {
                double b = area / Length;
                return String.valueOf(b) + Unit;
            }

            /*
             * Uses Pythagoras Theorem
             * A² + B² = C²
             * A is the Length, B is the breadth and C is the diagonal
             * So,
             * C = √(A² + B²)
             */
            // Finds the Diagonal using the above principle
            public static String Diagonal(double length, double breadth, String Unit) {
                double lengthSquare = NamishMath.findSquare(length);
                double breadthSquare = NamishMath.findSquare(breadth);
                double lbSum = lengthSquare + breadthSquare;
                double diagonalLength = NamishMath.sqrt(lbSum);
                return String.valueOf(diagonalLength) + " " + Unit;
            }
        }
    }

    // The Unit-Converter class

    // First Introduced in NamishJava 1.0.1 and NamishMath 1.0.1
    // Latest Update on 25 October 2022
    public class UnitConverter {

    }

    // Pythagoream Triplet class
    public class PythagoreamTriplet {
        /*
         * Find out all the numbers of a pythagoream triplet
         * || NOTICE || , The number to be entered must be a even number!
         */

        public static double[] FindAll(int n2) {
            double n = n2 / 2;
            double nsq1 = NamishMath.findSquare(n);
            double mainNsq1 = nsq1 + 1;
            double mainNsq2 = nsq1 - 1;
            double[] pyt = { n2, mainNsq1, mainNsq2 };
            return pyt;
        }
    }
}
