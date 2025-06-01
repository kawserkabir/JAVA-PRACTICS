import java.util.Scanner;
//print the table of number 
class forloopsTableNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < 11; i++){
            System.out.println(n * i);
        }

    }
}