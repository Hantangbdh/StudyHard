import java.util.Scanner;

//判断一个数是不是回文数

public class Program25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number:");
        String str = scan.nextLine();
        //把字符串转换为一个char数组
        char[] ch = str.toCharArray();
        int len = ch.length;
        boolean b =true;
        for(int i=0;i<len/2;i++) {
            if (ch[i] != ch[len - i - 1]) {
                b = false;
            }
        }
            if(b){
                System.out.println("It is a palindrome.");
            }
            else{
                System.out.println("It is not a palindrome.");
            }


    }



}

