//输入某年某月某日，判断是此年第几天

import java.util.Scanner;

//闰年的判断条件：1.能被4整除且不能被100整除
//                2.能被400整除
//年 月 日   y,m,d
public class Program14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年：");
        int y = scan.nextInt();
        System.out.println("请输入月：");
        int m = scan.nextInt();
        if(m<1||m>12){
            System.out.println("日期输入有误");
            System.exit(0);
        }
        System.out.println("请输入日：");
        int d = scan.nextInt();
        if(d<1||d>31){
            System.out.println("日期输入有误");
            System.exit(0);
        }
        //闰年
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            if (m == 1) {
                System.out.println(d);
            }
            if (m == 2) {
                System.out.println(31 + d);
            }
            if (m == 3) {
                System.out.println(31 + 29 + d);
            }
            if (m == 4) {
                System.out.println(31 * 2 + 29 + d);
            }
            if (m == 5) {
                System.out.println(31 * 2 + 30 + 29 + d);
            }
            if (m == 6) {
                System.out.println(31 * 3 + 29 + 30 + d);
            }
            if (m == 7) {
                System.out.println(31 * 3 + 30 * 2 + 29 + d);
            }
            if (m == 8) {
                System.out.println(31 * 4 + 30 * 2 + 29 + d);
            }
            if (m == 9) {
                System.out.println(31 * 4 + 30 * 3 + 29 + d);
            }
            if (m == 10) {
                System.out.println(31 * 5 + 30 * 3 + 29 + d);
            }
            if (m == 11) {
                System.out.println(31 * 5 + 30 * 4 + 29 + d);
            }
            if (m == 12) {
                System.out.println(31 * 6 + 30 * 4 + 29 + d);
            }
        } else {
            if (m == 1) {
                System.out.println(d);
            }
            if (m == 2) {
                System.out.println(31 + d);
            }
            if (m == 3) {
                System.out.println(31 + 28 + d);
            }
            if (m == 4) {
                System.out.println(31 * 2 + 28 + d);
            }
            if (m == 5) {
                System.out.println(31 * 2 + 30 + 28 + d);
            }
            if (m == 6) {
                System.out.println(31 * 3 + 28 + 30 + d);
            }
            if (m == 7) {
                System.out.println(31 * 3 + 30 * 2 + 28 + d);
            }
            if (m == 8) {
                System.out.println(31 * 4 + 30 * 2 + 28 + d);
            }
            if (m == 9) {
                System.out.println(31 * 4 + 30 * 3 + 28 + d);
            }
            if (m == 10) {
                System.out.println(31 * 5 + 30 * 3 + 28 + d);
            }
            if (m == 11) {
                System.out.println(31 * 5 + 30 * 4 + 28 + d);
            }
            if (m == 12) {
                System.out.println(31 * 6 + 30 * 4 + 28 + d);
            }
        }


    }
//闰年
//平年
}

