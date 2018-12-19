import java.util.*;

//一个偶数总能表示为两个素数之和
//利用check(i)&&check(n-i)
//输出这个偶数的所有素数
public class Program44 {

    public static boolean test(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个偶数：");
        int n = scan.nextInt();
        //从输入的偶数n的质数范围里：
        for(int i=2;i<n/2;i++){
            if(test(i)&&test(n-i)){
                System.out.println(n+"="+i+"+"+(n-i));      //输出所有符合和的式子
            }
        }

    }


}