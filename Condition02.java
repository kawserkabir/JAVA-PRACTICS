import java.util.Scanner;

class condition02{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        if(button == 1){
            System.out.println("hellow");
        } else if (button == 2) {
            System.out.println("hellow 2");
        } else if (button == 3) {
            System.out.println("hellow 3");
        } else {
            System.out.println("invalid call");
        }
    }
}