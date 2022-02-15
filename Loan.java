package week3;

import java.lang.Math;
import java.util.Date;
import java.util.Scanner;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears; 
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(){
        //constructor
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        Date date = new Date();
        this.loanDate  = date;
    }

    public Loan(double annualInterestRate , int numberOfYears, double loanAmount){
        //constructor
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        Date date = new Date();
        this.loanDate  = date;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }
    
    public double getLoanAmount() {
        return this.loanAmount;
    }

    public java.util.Date getLoanDate() {
        Date date = new Date();
        return date;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = this.annualInterestRate/12/100 ;
        return ( (this.loanAmount*monthlyInterestRate)/(1- (1/ Math.pow((1+monthlyInterestRate),(this.numberOfYears*12))) ) );
    }

    public double getTotalPayment(){
        // double monthlyInterestRate = this.annualInterestRate/12 ;
        return this.getMonthlyPayment()*this.numberOfYears*12;
    }

    public double to2Dp(double value){
        return (double)Math.round(value * 100d) / 100d;
    }
}