import java.util.Scanner;

//利润提成-奖金发放问题
public class Program12 {

    public static int L_J(Long  I){
        double salary_up;
        if(I<=100000){
            salary_up=I*0.1;
        }
        else if(I<=200000){


        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("输入利润：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
            long n = Integer.valueOf(str1);
            System.out.printf("result = %d\n", L_J(n));
        }
        scan.close();
    }
}
