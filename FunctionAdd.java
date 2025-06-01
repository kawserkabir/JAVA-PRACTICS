import java.util.Scanner;
//add two number with function call
class Funtionsadd{
    public static int AddNumber(int a, int b){
       int sum = a + b;
       return sum;
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = AddNumber(a , b);

        System.out.println(sum);

    }
}