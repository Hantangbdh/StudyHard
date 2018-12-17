import java.util.Scanner;

//四位数加密处理
public class Program48 {
    public static int encryption(int x){
        //四位数 千位m 百位n 十位j 个位k
        int m=x/1000;
        int n=x/100%10;
        int j=x%100/10;
        int k=x%100%10;
        //每位数字都加上5的和除以10的余数代替该数字
        m=(m+5)%10;n=(n+5)%10;j=(j+5)%10;k=(k+5)%10;
        //将第一位和第四位交换 第二位和第三位交换
        int temp1;int temp2;
        temp1=m;m=k;k=temp1;
        temp2=n;n=j;j=temp2;

        return m*1000+n*100+j*10+k;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("请输入一个四位数：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
            int n = Integer.valueOf(str1);
            System.out.printf("result = %d\n", encryption(n));
        }
        scan.close();
    }

}


