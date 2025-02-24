package Prelim;

import java.util.Scanner;

public class Lab_act2_Find_the_greatest_number {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter First number:");
        int Num1 = in.nextInt();

        System.out.println("Enter Second number:");
        int Num2 = in.nextInt();

        System.out.println("Enter Third number:");
        int Num3 = in.nextInt();

        int Greatest = Num1;

        if (Num2 > Greatest) {
            Greatest = Num2;
        }if (Num3 > Greatest) {
            Greatest = Num3;
        }
        System.out.println("The Greatest number out of all three is " + Greatest);

    }
}
