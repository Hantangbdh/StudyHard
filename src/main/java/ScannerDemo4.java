import java.util.Scanner;
//实例
//输入多个数字   求其总和及平均数
//每输入一个数字 用回车来进行确认      /*  Hint---用while循环来实现不断回车输入*/
//输入非数字结束输入 执行输出结果
public class ScannerDemo4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("输入一系列数据：");
        double sum=0;int n=0;

        while(scan.hasNextDouble()){
            //接受数据
            double x=scan.nextDouble();
            sum +=x;
            n +=1;
        }
        System.out.print("输入的数总和为："+sum);
        System.out.print("输入的数的和的平均数为："+(sum/n));
        scan.close();
    }
}
