import java.util.Scanner;

class 2darray4563{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][]=new int[row][cols];
        //input
        for (int i =0; i<row; i++){
            for (int j=0; j<cols; j++){
                numbers[i][j]= sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        for (int i = 0; i <row; i++){
            for (int j = 0; j <cols; j++){
                if (numbers[i][j]==x){
                    System.out.println("the index number is :"+ i + j );
                }
            }
        }
    }
}