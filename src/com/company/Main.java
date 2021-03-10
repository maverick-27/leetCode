package com.company;


public class Main {

    public static void main(String[] args) {
//        boolean a = hasRain("monday");
//        System.out.println(a);
//        String b = isDayORNight("black");
//        System.out.println(b);
//        boolean c = isPaperOverOrNot(9);
//        System.out.println(c);
//        int cd = sumOfTwoNumbers(8, 7);
//        System.out.println(cd);
        int ccs = sumOfTwoNumbers(2);
        System.out.println(ccs);


    }

    public static boolean hasRain(String day) {
        if ((day == "monday") || (day == "tuesday") || (day == "wednesday")) {
            return true;
        } else {
            return false;
        }
    }

    public static String isDayORNight(String color) {
        if (color == "Blue") {
            return "Day";
        } else {
            return "Night";
        }

    }

    public static boolean isPaperOverOrNot(int date) {
        if (date >= 8) {
            return true;
        } else {
            return false;
        }

    }

    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int sumOfTwoNumbers(int a) {
        return a + 3;
    }

}
