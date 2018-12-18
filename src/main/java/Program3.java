public class Program3 {
    public static void main(String[] args){
        for(int i=100;i<1000;i++){
            int a=i/100;
            int b=i/10%10;
            int c=i%10;
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
        //test();
    }

   /* static void test() {
        String str = "eikuguhikuwer";
        char ch = str.charAt(2);
        System.out.printf("ch = %d\n", (byte)ch);
    }*/
}
