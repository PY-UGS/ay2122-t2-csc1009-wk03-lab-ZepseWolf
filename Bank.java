package week3;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25 : ");
        Double annualInterestRate= Double.parseDouble(input.nextLine());
        System.out.print("Enter number of years as an interger: ");
        int numberOfYears = Integer.parseInt(input.nextLine());
        System.out.print("Enter loan amount, for example, 120000.95: ");
        Double loanAmount= Double.parseDouble(input.nextLine());
        Loan carLoan = new Loan(annualInterestRate,numberOfYears,loanAmount);
        System.out.println("The loan was created on " + carLoan.getLoanDate());
        System.out.println("The monthly payment is " + carLoan.to2Dp(carLoan.getMonthlyPayment())); 
        System.out.println("The total payment is " +carLoan.to2Dp(carLoan.getTotalPayment())); 
    }
}
