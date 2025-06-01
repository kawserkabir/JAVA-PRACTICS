import java.util.Scanner;
//add two number with function call
class Funtionsadd{
    public static int AddNumber(int a, int b){
       int sum = a + b;
       return sum;
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("input fst number");
        int a = sc.nextInt();
        System.out.println("input 2nd number");
        int b = sc.nextInt();
        System.out.println("the number of sum");
        int sum = AddNumber(a , b);

        System.out.println(sum);

    }
}