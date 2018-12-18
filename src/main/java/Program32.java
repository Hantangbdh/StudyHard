import java.util.Scanner;

//取一个整数a从右端开始的4-7位
public class Program32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个7位或7位以上的数字：");
        long m = scan.nextLong();
        String str = Long.toString(m);
        char[] ch = str.toCharArray();

        int len = ch.length;
        if(len<7){
            System.out.println("输入有误.");
        }
        for(int i=len-4;i>=len-7;i--){
           System.out.print(ch[i]);
        }
    }
}
