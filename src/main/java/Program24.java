import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

//给出一个不多于五位的正整数 求它是几位数+逆序打印出各位数字
public class Program24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入小于五位的正整数：");
        Long n = scan.nextLong();
        //n是0到100 一位数到两位数
        if (n / 100 < 0) {
            if (n / 10 < 0) {
                System.out.println("一位数");
            } else {
                System.out.println("两位数");
            }
        }
        //n是100到1000，三位数到四位数
        else if (n / 100 > 0) {
            if (n / 1000 < 0) {
                System.out.println("三位数");
            } else {
                System.out.println("四位数");
            }
        String str =Long.toString(n);
        char[] ch = str.toCharArray();
        int len =ch.length;
        for(int i=len-1;i>=0;i--){
            System.out.print(ch[i]);
        }

            scan.close();
        }
    }
}
