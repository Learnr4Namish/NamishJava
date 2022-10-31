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

    // The Square Unit
    final static String SqUnit = "²";

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
    public static double findAbs(double number) {
        return Math.abs(number);
    }

    // Finds the smallest number of the two numbers
    public static double findMin(double number1, double number2) {
        return Math.min(number1, number2);
    }

    // Finds the smallest number of the array of numbers
    public static double findMinAll(Array ArrayOfNumbers) {
        return 0;
    }

    // Finds the maximum/biggest number of the two numbers
    public static double findMax(double number1, double number2) {
        return Math.max(number1, number2);
    }

    // Finds the smallest number of the array of numbers
    public static double findMaxAll(Array ArrayOfNumbers) {
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
    public static double Increment(double n) {
        return n + 1;
    }

    // Adds two given numbers
    public static double AddTwoNumbers(double n1, double n2) {
        return n1 + n2;
    }

    // Adds three given numbers
    public static double AddThreeNumbers(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

    // Adds four given numbers
    public static double AddFourNumbers(double n1, double n2, double n3, double n4) {
        return n1 + n2 + n3 + n4;
    }

    // Adds five given numbers
    public static double AddFiveNumbers(double n1, double n2, double n3, double n4, double n5) {
        return n1 + n2 + n3 + n4 + n5;
    }

    // Adds six given numbers
    public static double AddSixNumbers(double n1, double n2, double n3, double n4, double n5, double n6) {
        return n1 + n2 + n3 + n4 + n5 + n6;
    }

    // Adds seven given numbers
    public static double AddSevenNumbers(double n1, double n2, double n3, double n4, double n5, double n6, double n7) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7;
    }

    // Adds Eight given numbers
    public static double AddEightNumbers(double n1, double n2, double n3, double n4, double n5, double n6, double n7,
            double n8) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;
    }

    // Adds Nine given numbers
    public static double AddNineNumbers(double n1, double n2, double n3, double n4, double n5, double n6, double n7,
            double n8, double n9) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
    }

    // Adds Ten given numbers
    public static double AddTenNumbers(double n1, double n2, double n3, double n4, double n5, double n6, double n7,
            double n8, double n9, double n10) {
        return n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
    }

    // Adds all the numbers of a given array
    public static double AddAllNumbers(double[] ArrayOfNumbers) {
        double x = 0;
        for (double i = 0; i < ArrayOfNumbers.length; i++) {
            x = 0;
        }
        return 0;
    }

    // Adds 1 to a given number
    public static double Add1(double n) {
        return n + 1;
    }

    // Adds 2 to a given number
    public static double Add2(double n) {
        return n + 2;
    }

    // Adds 3 to a given number
    public static double Add3(double n) {
        return n + 3;
    }

    // Adds 4 to a given number
    public static double Add4(double n) {
        return n + 4;
    }

    // Adds 5 to a given number
    public static double Add5(double n) {
        return n + 5;
    }

    // Adds 6 to a given number
    public static double Add6(double n) {
        return n + 6;
    }

    // Adds 7 to a given number
    public static double Add7(double n) {
        return n + 7;
    }

    // Adds 8 to a given number
    public static double Add8(double n) {
        return n + 8;
    }

    // Adds 9 to a given number
    public static double Add9(double n) {
        return n + 9;
    }

    // Adds 10 to a given number
    public static double Add10(double n) {
        return n + 10;
    }

    // Finds the predessor or subtracts 1 from a given number
    public static double Decrement(double n) {
        return n - 1;
    }

    // Subtracts two given numbers
    public static double SubTwoNumbers(double n1, double n2) {
        return n1 - n2;
    }

    // Subtracts three given numbers
    public static double SubThreeNumbers(double n1, double n2, double n3) {
        return n1 - n2 - n3;
    }

    // Subtracts four given numbers
    public static double SubFourNumbers(double n1, double n2, double n3, double n4) {
        return n1 - n2 - n3 - n4;
    }

    // Subtracts five given numbers
    public static double SubFiveNumbers(double n1, double n2, double n3, double n4, double n5) {
        return n1 - n2 - n3 - n4 - n5;
    }

    // Subtracts six given numbers
    public static double SubSixNumbers(double n1, double n2, double n3, double n4, double n5, double n6) {
        return n1 - n2 - n3 - n4 - n5 - n6;
    }

    // Subtracts seven given numbers
    public static double SubSevenNumbers(double n1, double n2, double n3, double n4, double n5, double n6, double n7) {
        return n1 - n2 - n3 - n4 - n5 - n6 - n7;
    }

    // Subtracts Eight given numbers
    public static double SubEightNumbers(double n1, double n2, double n3, double n4, double n5, double n6, double n7,
            double n8) {
        return n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8;
    }

    // Subtracts Nine given numbers
    public static double SubNineNumbers(double n1, double n2, double n3, double n4, double n5, double n6, double n7,
            double n8, double n9) {
        return n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8 - n9;
    }

    // Subtracts Ten given numbers
    public static double SubTenNumbers(double n1, double n2, double n3, double n4, double n5, double n6, double n7,
            double n8, double n9, double n10) {
        return n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8 - n9 - n10;
    }

    // Subtracts Two from a given number
    public static double Sub2(double n) {
        return n - 2;
    }

    // Subtracts Three from a given number
    public static double Sub3(double n) {
        return n - 3;
    }

    // Subtracts Four from a given number
    public static double Sub4(double n) {
        return n - 4;
    }

    // Subtracts Five from a given number
    public static double Sub5(double n) {
        return n - 5;
    }

    // Subtracts Six from a given number
    public static double Sub6(double n) {
        return n - 6;
    }

    // Subtracts Seven from a given number
    public static double Sub7(double n) {
        return n - 7;
    }

    // Subtracts Eight from a given number
    public static double Sub8(double n) {
        return n - 8;
    }

    // Subtracts Nine from a given number
    public static double Sub9(double n) {
        return n - 9;
    }

    // Subtracts Ten from a given number
    public static double Sub10(double n) {
        return n - 10;
    }

    // Multiplies two given numbers
    public static double MulTwo(double n1, double n2) {
        return n1 * n2;
    }

    // Doubles a given number
    public static double Double(double n) {
        return 2 * n;
    }

    // Multiplies three given numbers
    public static double MulThree(double n1, double n2, double n3) {
        return n1 * n2 * n3;
    }

    // Triples a given number
    public static double Triple(double n) {
        return 3 * n;
    }

    // Multiplies four given numbers
    public static double MulFour(double n1, double n2, double n3, double n4) {
        return n1 * n2 * n3 * n4;
    }

    // Multiplies five given numbers
    public static double MulFive(double n1, double n2, double n3, double n4, double n5) {
        return n1 * n2 * n3 * n4 * n5;
    }

    // Multiplies six given numbers
    public static double MulSix(double n1, double n2, double n3, double n4, double n5, double n6) {
        return n1 * n2 * n3 * n4 * n5 * n6;
    }

    // Multiplies seven given numbers
    public static double MulSeven(double n1, double n2, double n3, double n4, double n5, double n6, double n7) {
        return n1 * n2 * n3 * n4 * n5 * n6 * n7;
    }

    // Multiplies eight given numbers
    public static double MulEight(double n1, double n2, double n3, double n4, double n5, double n6, double n7,
            double n8) {
        return n1 * n2 * n3 * n4 * n5 * n6 * n7 * n8;
    }

    // Multiplies nine given numbers
    public static double MulNine(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8,
            double n9) {
        return n1 * n2 * n3 * n4 * n5 * n6 * n7 * n8 * n9;
    }

    // Multiplies ten given numbers
    public static double MulTen(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8,
            double n9, double n10) {
        return n1 * n2 * n3 * n4 * n5 * n6 * n7 * n8 * n9 * n10;
    }

    // Multiplies four to a given number
    public static double Mul4(double n) {
        return 4 * n;
    }

    // Multiplies five to a given number
    public static double Mul5(double n) {
        return 5 * n;
    }

    // Multiplies six to a given number
    public static double Mul6(double n) {
        return 6 * n;
    }

    // Multiplies seven to a given number
    public static double Mul7(double n) {
        return 7 * n;
    }

    // Multiplies eight to a given number
    public static double Mul8(double n) {
        return 8 * n;
    }

    // Multiplies nine to a given number
    public static double Mul9(double n) {
        return 9 * n;
    }

    // Multiplies ten to a given number
    public static double Mul10(double n) {
        return 10 * n;
    }

    // Divides two given numbers
    public static double Div2(double n1, double n2) {
        return n1 / n2;
    }

    // Halfs a given number
    public static double Half(double n) {
        return n / 2;
    }

    // Quaters a given number
    public static double Quater(double n) {
        return n / 4;
    }

    // Returns the reciprocal of a number
    public static double Reciprocal(double n) {
        double root = 0;
        try {
            root = 1 / n;
        } catch (ArithmeticException e) {
            System.out.println("NamishJava Fatal Error: Division by 0 is not-defined! 0 has no reciprocal.");
        }
        return root;
    }

    // Returns the value of a decade
    public static double Decade() {
        return 10;
    }

    // Returns the value of a half-decade
    public static double HalfDecade() {
        return Decade() / 2;
    }

    // Returns the value of a quater-decade
    public static double QuaterDecade() {
        return Decade() / 4;
    }

    // Divides the value of a decade with some other number
    public static double DivideDecade(double n) {
        return Decade() / n;
    }

    // Returns the value of a century
    public static double Century() {
        return 100;
    }

    // Returns the value of a half-century
    public static double HalfCentury() {
        return Century() / 2;
    }

    // Returns the value of quater-century
    public static double QuaterCentury() {
        return Century() / 4;
    }

    // Divides the value of a century with some other number
    public static double DivideCentury(double n) {
        return Century() / n;
    }

    // Returns the value of a Millennium
    public static double Millennium() {
        return 1000;
    }

    // Returns the value of a Half-Millenium
    public static double HalfMillennium() {
        return Millennium() / 2;
    }

    // Returns the value of Kilo
    public static double Kilo() {
        return 1000;
    }

    // Returns the value of Hecto
    public static double Hecto() {
        return 100;
    }

    // Returns the value of Deca
    public static double Deca() {
        return 10;
    }

    // Returns the value of a Deci
    public static double Deci() {
        return 1 / 10;
    }

    // Returns the value of a Centi
    public static double Centi() {
        return 1 / 100;
    }

    // Returns the value of a Milli
    public static double Milli() {
        return 1 / 1000;
    }

    // The Quantity class
    public class Quantity {
        // The length quantity
        public static double Length() {
            return 8080;
        }

        // The force quantity
        public static double Force() {
            return 8081;
        }

        // The Mass or Weight quantity
        public static double Mass() {
            return 8082;
        }
    }

    // Returns the Standard Unit of different physical quantities
    public static String StandardUnit(double MainQuantity) {
        String Madoubleext = "";
        if (MainQuantity == Quantity.Length()) {
            Madoubleext = "The Standard Unit of Length is Metre / Meter (M).";
        } else if (MainQuantity == Quantity.Force()) {
            Madoubleext = "The Standard Unit of Force is Newton (N)";
        }
        return Madoubleext;
    }

    // Returns the Percentage in double form. You must convert it back to percentage
    // using NamishMath.ParseCent(p) method
    public static double GetPerCent(double parts, double total) {
        double pbt = parts / total;
        double percent = pbt * 100;
        return percent;
    }

    // Returns the Percentage in String form.
    public static String ParseCent(double p) {
        return String.valueOf(p) + "%";
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

        // Triangle Zone
        /* || NOTICE || This is only applicable for Equilateral triangle. */
        public class Triangle {
            // Finds the area of the triangle
            public static String Area(double side, String Unit) {
                return "kick!";
            }
        }
    }

    // The Unit-Converter class

    // First doubleroduced in NamishJava 1.0.1 and NamishMath 1.0.1
    // Latest Update on 31 October 2022
    public class UnitConverter {

    }

    // Pythagorean Triplet class
    public class PythagoreanTriplet {
        /*
         * Find out all the numbers of a pythagorean triplet
         * || NOTICE || , The number to be entered must be a even number!
         */

        public static double[] FindAll(double n2) {
            double n = n2 / 2;
            double nsq1 = NamishMath.findSquare(n);
            double mainNsq1 = nsq1 + 1;
            double mainNsq2 = nsq1 - 1;
            double[] pyt = { n2, mainNsq1, mainNsq2 };
            return pyt;
        }
    }

    //

}
