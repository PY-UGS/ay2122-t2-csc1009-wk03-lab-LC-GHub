package wk03_lab;
import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Loan Loan1 = new Loan();
        Scanner input = new Scanner(System.in);


        System.out.print("Enter annual interest rate, for example, 8.25: ");
        Loan1.setAnnualInterstRate(input.nextDouble());

        System.out.print("Enter numbers of years as an integers: ");
        Loan1.setnumberOfYears(input.nextInt());

        System.out.print("Enter loan amount, for example, 120000.95:  ");
        Loan1.setLoanAmount(input.nextDouble());

        Loan1.printLoanInfo();
        
        
    }
    
}
