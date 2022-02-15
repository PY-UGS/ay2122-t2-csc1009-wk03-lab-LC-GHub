package wk03_lab;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Loan {
    //variables
    private double annualInterestRate;
    private double loanAmount;
    private int numberOfYears;
    private java.util.Date loanDate;

    public Loan(){
        this.annualInterestRate = 2.50;
        this.loanAmount = 1000.00;
        this.numberOfYears = 1;
        this.loanDate = new java.util.Date();
    }

    public Loan(double annualInterestRate, int numberOfYears,
    double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.loanDate = new java.util.Date();
    }
    //getters
    public double getAnnualInterstRate(){
        return annualInterestRate;
    }

    public int getnumberOfYears(){
        return numberOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public java.util.Date getDate(){

        return this.loanDate;

    //    SimpleDateFormat EDTFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
    //    EDTFormat.setTimeZone(TimeZone.getTimeZone("EST2EDT"));
    //    String DateinEDT = EDTFormat.format(this.loanDate);
    //    return DateinEDT;

    }

    //setters
    public void setAnnualInterstRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setnumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    //Methods
    public double getMonthlyPayment(){
        double numerator = this.loanAmount*(this.annualInterestRate/1200);
        double denominator = (1-(1/Math.pow(1+(this.annualInterestRate/1200),numberOfYears*12)));
        return numerator/denominator;
    }

    public double getTotalPayment(){
        return this.getMonthlyPayment()*this.numberOfYears*12;
    }
    //Print
    public void printLoanInfo(){
        System.out.println("The loan was created on " + this.getDate());
        System.out.println("The monthly payment is " + String.format("%.2f", this.getMonthlyPayment()));
        System.out.println("The total payment is " + String.format("%.2f", this.getTotalPayment()));

    }



}
