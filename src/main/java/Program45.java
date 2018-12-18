import java.util.Scanner;

//判断一个整数能被几个9整除
public class Program45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int m = scan.nextInt();
        int sum=9;int count=0;
        do{
            sum*=9;
            count++;
        }while(sum<=m);
        System.out.println("能被"+count+"个9整除。");
    }

}
