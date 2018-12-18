import java.util.Scanner;

//从1--50中读取七个数的整数值，每读取一个值打印出该值个数的*
public class Program47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("first 1-50:");
        int a=scan.nextInt();

        if(a>=1&&a<=50){
            for(int i=1;i<=a;i++){
                System.out.print("*");
            }
        }
    }


}
