package ru.geekbraines.lesson_22;

public class MainnApp {

    public static void main(String[] args) {
        Methodname(5, 7);
        positiveNegative(87);
        positiveNegativetwo(-6);
        printWordNumber("geekbraines", 5);
        visokosnyYear(2000);
    }

    public static boolean Methodname(int a, int b) {
        int sum = a + b;
        if (sum >= 10 || sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveNegative (int a) {
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

    }

    public static boolean positiveNegativetwo (int a) {
        return a < 0;
    }

    public static void printWordNumber (String word, int times) {
        for (int i = 0; i < times; i++)  {
            System.out.println(word);
        }
    }
    public static boolean visokosnyYear (int year) {
        if (year % 4 == 0) {
            System.out.println("visokosny");
            return true;
        } else if (year % 400 == 0) {
            System.out.println("visokosny");
            return true;
        }   else if (year % 100 != 0) {
            System.out.println("Nevisokosny");
            return false;
        }   else {
            System.out.println("Nevisokosny");
            return false;
        }

    }}







