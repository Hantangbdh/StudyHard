//输入三个数a b c 按大小顺序输出
//就设定a最大 b二大 c最小
//通过数值交换使其满足上述大小关系

import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter three numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a<b){
            int temp;
            temp=a;a=b;b=temp;
        }
        if(a<c){
            int temp;
            temp=a;a=c;c=temp;
        }
        if(b<c){                                   //就用多个if语句  一个if语句确定是否需要交换  多个if语句输出得到结果
            int temp;
            temp=b;b=c;c=temp;
        }
        System.out.println(a+" "+b+" "+c+" ");
    }

}

