import java.util.Scanner;

public class Program5 {
    public static int score_sort(int n) {
        return(n >= 90 ? 'a' : (n <60 ? 'c' :'b' ));//运行时返回的是数值
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("请输入成绩：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
            int n = Integer.valueOf(str1);

            System.out.print(score_sort(n));
        }
        scan.close();
    }

}
