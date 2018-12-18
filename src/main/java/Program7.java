//输入一行字符，统计出英文字母 数字 空格 其他字符 的个数

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        int abcNums=0;int digitNumbers=0;
        int blankNumbers=0;int otherNumbers=0;
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        //***把取到的字符串变成一个char数组
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            //是数字的话
            if(Character.isDigit(ch[i])){
                digitNumbers++;
            }
            //是字母的话
            else if(Character.isLetter(ch[i])){
                abcNums++;
            }
            //是空格的话
            else if(Character.isSpaceChar(ch[i])){
                blankNumbers++;
            }
            //是其他字符的话
            else{
                otherNumbers++;
            }
            scan.close();
        }
        System.out.println("字母："+abcNums);
        System.out.println("空格："+blankNumbers);
        System.out.println("数字："+digitNumbers);
        System.out.println("其他:"+otherNumbers);
    }

}
