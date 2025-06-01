import java.util.Scanner;
//condition cheak with switch condition
class Condition03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        switch (button){
            case 1 :
                System.out.println("hellow");
                break;

            case 2 :
                System.out.println("hellow 2");
                break;

            case 3 :
                System.out.println("hellow 3");
                break;

            default:
                System.out.println("invalid button");
        }
    }
}