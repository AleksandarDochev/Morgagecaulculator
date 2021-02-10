package com.MorgagePackedge;

import javax.management.monitor.StringMonitor;
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
        float PeriodYears = UserInputPeriodYears.nextInt();
        //Period in Years input and memorisation /\/\

        System.out.println("Your principal: "+ principal);
        System.out.println("Your Annual Interest Rate: "+ AnnualInterestRate);
        System.out.println("Your Period (Years): " + PeriodYears);
        //System print out memoraised values for testing and confirmation /\/\

        float MonthlyInterestRate = AnnualInterestRate/12/100;
        System.out.println("Monthly interest rate: %"+ MonthlyInterestRate);
        //Cauculating the Monthly interest rate dividing AnnualInterestRate
        // by 12 because thee are 12 mouths in a year and
        // by 100 to get it in percent
        // in formula "r"

        float NumberOfPayments = PeriodYears*12;
        System.out.println("The number of payments you will have to make: " + NumberOfPayments);
        //Cauculating the number of payments in formula "n"
        //by multiplaing the years by 12 so we get the number of mouths


        double Mortgage = principal
                         *( MonthlyInterestRate * Math.pow(1+MonthlyInterestRate , NumberOfPayments) )
                         /( Math.pow(1+MonthlyInterestRate , NumberOfPayments) -1 );

        //Mortgage formula from https://www.wikihow.com/Calculate-Mortgage-Payments /\/\

        String MortgageFormated = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Your Mortgage is : " +MortgageFormated);


    }
}
