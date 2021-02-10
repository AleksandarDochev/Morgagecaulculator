package com.MorgagePackedge;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner UserInputPrincipal = new Scanner(System.in);
        //Creating the input it self named UserInputPrincipal
        //System.in is for the program to know that the input is
        // coming from the terminal
        System.out.print("Enter principal: ");
        int principal = UserInputPrincipal.nextInt();
        //principal input and memorisation /\/\

        Scanner UserInputAnnualInterestRate = new Scanner(System.in);
        System.out.print("Enter Annual Interest Rate: ");
        float AnnualInterestRate = UserInputAnnualInterestRate.nextFloat();
        //Annual Interest Rate input and memorisation /\/\

        System.out.print("Enter your Period in Years: ");
        Scanner UserInputPeriodYears = new Scanner(System.in);
        int PeriodYears = UserInputPeriodYears.nextInt();
        //Period in Years input and memorisation /\/\

        System.out.println("Your principal: "+ principal);
        System.out.println("Your Annual Interest Rate: "+ AnnualInterestRate);
        System.out.println("Your Period (Years): " + PeriodYears);
        //System print out memoraised values for testing and confirmation /\/\


    }
}
