import java.util.Scanner;

class array345{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[]= new int [size];

      //  marks[0]=22;
       // marks[1]=33;
      //  marks[2]=44;

       // System.out.println(marks[0]);
      //  System.out.println(marks[2]);
       // System.out.println(marks[1]);

        //input
        for (int i = 0; i <size; i++){
            marks[i]= sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for (int i =0; i<size; i++){
            if (marks[i]== x){
                System.out.println("index number is :" + i);
            }else {
                System.out.println("the number not found");
            }
        }
    }
}