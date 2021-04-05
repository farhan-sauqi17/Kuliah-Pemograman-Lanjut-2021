package Condotional_and_Loops;
import java.util.Scanner;
public class Loan_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
        int rem_amt = amount;
        for (int i = 1 ; i <= 3 ; i++) {
            int paid = (int)Math.ceil(10/100.0*rem_amt);
            rem_amt -= paid ;
        }
        System.out.println(rem_amt);

    }
}
