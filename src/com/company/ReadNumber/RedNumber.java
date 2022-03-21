package com.company.ReadNumber;

import java.util.Scanner;

public class RedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can dem");
        int number = scanner.nextInt();
        int unit = number%10;
        String dv = "";

//        hang don vi
        switch (unit) {
            case 1:
                dv = "one";
                break;
            case 2:
                dv = "two";
                break;
            case 3:
                dv = "three";
                break;
            case 4:
                dv = "four";
                break;
            case 5:
                dv = "five";
                break;
            case 6:
                dv = "six";
                break;
            case 7:
                dv = "seven";
                break;
            case 8:
                dv = "eight";
                break;
            case 9:
                dv = "night";
                break;
        }

        int conSt = number%100;
        String db = "";
        switch (conSt) {
            case 10:
                db = "ten";
                break;
            case 11:
                db = "eleven";
                break;
            case 12:
                db = "Twelve";
                break;
            case 13:
                db = "thirteen";
                break;
            case 14:
                db = "fourteen";
                break;
            case 15:
                db = "fifteen";
                break;
            case 16:
                db = "sixteen";
                break;
            case 17:
                db = "seventeen";
                break;
            case 18:
                db = "eighteen";
                break;
            case 19:
                db = "nineteen";
                break;
        }

//  hang chuc
        int dozens = (number % 100 - unit)/10 ;
        String hc = "";
        switch (dozens) {
            case 2:
                hc = "twenty";
                break;
            case 3:
                hc = "thirty";
                break;
            case 4:
                hc = "fourty";
                break;
            case 5:
                hc = "fifty";
                break;
            case 6:
                hc = "sixty";
                break;
            case 7:
                hc = "seventy";
                break;
            case 8:
                hc = "eighty";
                break;
            case 9:
                hc = "ninety";
                break;
        }
        // hang tram
        int hundreds = number - number % 100 ;
        String ht = "";
        switch (hundreds) {
            case 100:
                ht = "hundred";
                break;
            case 200:
                ht = "two hundred";
                break;
            case 300:
                ht = "three hundred";
                break;
            case 400:
                ht = "four hundred";
                break;
            case 500:
                ht = "five hundred";
                break;
            case 600:
                ht = "six hundred";
                break;
            case 700:
                ht = "seven hundred";
                break;
            case 800:
                ht = "eight hundred";
            case 900:
                ht = "nine hundred";
                break;
        }

        if (number < 10){
            System.out.println(" số bạn vừa nhập là: " + dv);
        }else if (number < 20){
            System.out.println("số bạn vừa nhập là: " + db);
        }else if (number < 100) {
            System.out.println("số bạn vừa nhập là: " + hc + " " + dv);
        }else if (number < 110){
            System.out.println("số bạn vừa nhập là: " + ht + " "+ dv);
        }else if (number < 120){
            System.out.println("số bạn vừa nhập là: " + ht + " " + db);
        }else if (number < 1000){
            System.out.println("số bạn vừa nhập là: " + ht + " " + hc + " " + dv);
        }
    }
}
