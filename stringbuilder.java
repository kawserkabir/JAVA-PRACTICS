class stringbuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("kawser");
        System.out.println(sb);

        System.out.println(sb.charAt(2));

        sb.setCharAt(2 ,'g');
        System.out.println(sb);
    }
}