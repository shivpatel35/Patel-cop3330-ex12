package org.ex12;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        float principal = scanner.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float rate_of_interest = scanner.nextFloat();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        float real_rate_of_interest = rate_of_interest / 100;

        float si = principal * (1 + (real_rate_of_interest * years));
        double roundOff =  Math.round(si);

        System.out.println("After " + years + " years at " + rate_of_interest + "% , the investment will be worth $" + roundOff);


    }



}
