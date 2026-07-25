import java.util.Scanner;

public class kawserty{

    public static void printmyname(String name){
        System.out.println(name);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printmyname(name);
    }
}