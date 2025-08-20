import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        double avg = (a + b) / 2.0;
        System.out.println("Average = " + avg);
    }
}