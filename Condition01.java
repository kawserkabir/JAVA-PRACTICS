import java.util.Scanner;
// input a number and cheak with condition
class Condition01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("equal");
        }else if(a > b){
            System.out.println("grater then b");
        }else{
            System.out.println("lesser then b");
        }
    }
}