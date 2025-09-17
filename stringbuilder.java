class stringbuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("kawser");
        System.out.println(sb);

        System.out.println(sb.charAt(2));

        sb.setCharAt(2 ,'g');
        System.out.println(sb);

        sb.insert(0 , 'f');
        System.out.println(sb);

        sb.delete(3 , 4);
        System.out.println(sb);

        sb.append("kswerf");
        System.out.println(sb);
    }
}