import static java.lang.Math.pow;

//求s=a+aa+aaa+aaaa+a.....a 的值  a为一个数
//以2为例 4项和
public class Program8 {
    public static void main(String[] args) {
        int sum=0;
        int sum_total=0;
    for(int i=1;i<5;i++) {
        double n = 2 * pow(10, i - 1);

        sum += n;
        System.out.print(sum+"  ");

        sum_total += sum;

    }
        System.out.println(sum_total);

    }
}
