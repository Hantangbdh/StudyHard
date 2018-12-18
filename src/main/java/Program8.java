import java.util.Scanner;

import static java.lang.Math.pow;

//求s=a+aa+aaa+aaaa+a.....a 的值  a为一个数
//以2为例 4项和
public class Program8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入设置的a的值：");
        int a = scan.nextInt();

        System.out.println("请输入项数：");
        int n = scan.nextInt();

        int sum=0;
        int sum_total=0;
    for(int i=1;i<=n;i++) {
        double m = a * pow(10, i - 1);

        sum += m;
        System.out.print(sum+"  ");

        sum_total += sum;

    }
        System.out.println();
        System.out.println(sum_total);

    }
}
