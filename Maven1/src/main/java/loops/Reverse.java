package loops;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int r = 0;
        while (n != 0) {
            int digit = n % 10;
             r = r * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed number: " + r);

        sc.close();
    }
}
