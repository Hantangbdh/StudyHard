import java.util.Scanner;

//判断一个五位数是不是回文数

public class Program25 {
    public static int Palindrome(int n){

        return 0;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //把字符串转换为一个char数组
        char[] ch = str.toCharArray();
        int len = ch.length;
        for(int i=0;i<=len/2;i++){               //应该是同时进行
            for(int j=len-1;j>=len/2;j--){
                if(ch[i]==ch[j]){

                }
                else{

                }

            }
        }

    }



}

