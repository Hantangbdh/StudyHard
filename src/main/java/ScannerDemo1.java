import java.util.Scanner;
//输入：str类型
//Scanner类： 一个next方式接受；一个nextline方式接受
public class ScannerDemo1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //next方式接受
        System.out.println("请输入：");
        //判断是否还有输入
        if(scan.hasNext()){
            String str1=scan.next();
            System.out.println("输入的数据为："+str1);

        }
        scan.close();

    }
}
