import java.util.Scanner;

//最小公倍数&最大公约数
//最大公约数 Great Common Divisor
//最小公倍数 Least Common Multiple
public class Program6 {
    public static int GCD(int m,int n){
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        return m;
    }
    public static int LCM(int m,int n){
        int z;
        for( z=m;;z++){
            if(z%m==0&&z%n==0){
                break;
            }
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入两个数：");
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(GCD(m,n));
        System.out.println(LCM(m,n));
        scan.close();

    }
}
