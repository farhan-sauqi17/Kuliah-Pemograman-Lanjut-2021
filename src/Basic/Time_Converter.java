package Basic;
import java.util.Scanner;
public class Time_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        //your code goes here
        int result = days*24*60*60;
        System.out.println(result);
    }
}
