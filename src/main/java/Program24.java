import java.util.Scanner;

//给出一个不多于五位的正整数 求它是几位数+逆序打印出各位数字
public class Program24 {
    public static int number_process(int n){
        //。。。。
        //n是0到100 一位数到两位数
        if(n/100<0){
            if(n/10<0) {
                System.out.println("一位数");
            }
            else{
                System.out.println("两位数");
            }
        }
        //n是100到1000，三位数到四位数
        else if(n/100>0){
            if(n/1000<0){
                System.out.println("三位数");
            }
            else{
                System.out.println("四位数");
            }
        }
        //逆序打印 不会

        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("请输入不多于五位的正整数：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
            int n = Integer.valueOf(str1);
            System.out.print(number_process(n));
        }
        scan.close();
    }
}
