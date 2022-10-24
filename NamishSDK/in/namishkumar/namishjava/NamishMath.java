package in.namishkumar.namishjava;

// Welcome to NamishMath! Made by Namish Kumar in October 2022

/* NamishMath 1.0.0 built for NamishJava 1.0.0
Latest update on 24 October 2022 */
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;

// Main NamishMath class
public class NamishMath {
    public static void main(String[] args) {
    }

    // Returns the value of PI approximated to 8 decimal places
    public static double pi() {
        return 3.14159265;
    }

    // Returns the value of PI approximated to 2 decimal places
    public static double piApprox() {
        return 3.14;
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

    // Mensuration Zone

}
