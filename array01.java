class array01{
public static void main(String args []){
     int[] arr = {4, 7, 2, 9, 1};
   
    int max = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
    
        if (arr[i] > max) {
        max = arr[i];
    }
}

System.out.println("Maximum = " + max);
}

   

}