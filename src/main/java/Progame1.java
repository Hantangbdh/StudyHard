import java.util.Scanner;

public class Progame1 {
    public static int tuzi(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        return tuzi(n - 1) + tuzi(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
            int n = Integer.valueOf(str1);    //'数字字符串'转换为数字
            System.out.printf("result = %d\n", tuzi(n));
        }
        scan.close();
    }
}
