import java.util.Scanner;
//factorial calculate input number 
class funtions{
    public static void PrintFactorial(int n){
        
        if(n < 0){
            System.err.println("INVALID NUMBER");
            return;
        }

        int factorial = 1;

        for (int i = n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintFactorial(n);

    }
}