import java.util.Scanner;

//两个字符串连接程序
public class Program46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first string:");
        String str1 = scan.nextLine();
        System.out.println("Please enter the second string:");
        String str2 = scan.nextLine();
        System.out.println(str1+str2);
        scan.close();
    }

}
