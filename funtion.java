import java.util.Scanner;

class kawser55{
    public static void myname(String name){
        System.out.println(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        myname(name);

    }
}