package com.MorgagePackedge;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner UserPrincipalInput = new Scanner(System.in);
        //Creating the input it self named UserPrincipalInput
        //System.in is for the program to know that the input is
        // coming from the terminal
        System.out.print("Enter principal: ");
        int principal = UserPrincipalInput.nextInt();
        System.out.println(principal);
//
    }
}
