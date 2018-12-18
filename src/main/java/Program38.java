import java.util.Scanner;

//求一个字符串的长度
public class Program38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String str = scan.nextLine();
        int len = str.length();
        System.out.println(len);
    }

}
