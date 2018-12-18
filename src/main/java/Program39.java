import java.util.Scanner;

//编写函数
//输入n为偶数时 式子为1/2+1/4+1/6+...+1/n
//输入n为奇数时 式子为1/1+1/3+1/5+...+1/n
public class Program39 {
    public static double fraction_sum(int n) {
        double sum = 0;
        //n是偶数
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i = i + 2) {
                sum +=(1.0 / i);                    //注意这里是1.0而不是1  出的错在这里 i本身是int  1/i的话只得到0
            }
        }
        else if (n % 2 != 0) {
            for (int i = 1; i <= n; i = i + 2) {
                sum += (1.0 / i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("enter n:");
        int n =scan.nextInt();
        System.out.println(fraction_sum(n));
    }
}
