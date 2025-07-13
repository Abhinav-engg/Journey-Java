package com.a;

import java.util.Scanner;

public class Mortgage_Calc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        int principal1 = sc.nextInt();

        System.out.print("Enter the rate of interest (in %):");
        float annualRate = sc.nextFloat();

        System.out.print("Enter the time in years:");
        int time = sc.nextInt();
        sc.close();

        float monthlyInterest = annualRate / 12 / 100;
        int numberOfPayments = time * 12;

        float monthlyPayment = principal1 * (monthlyInterest * (float)Math.pow(1 + monthlyInterest, numberOfPayments)) / ((float)Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        System.out.println("Your monthly payment is:" + monthlyPayment);
    }
}



