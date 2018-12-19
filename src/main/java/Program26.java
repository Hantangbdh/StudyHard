import java.util.Scanner;

//输入星期几的第一个字母判断是星期几 第一个字母一样继续判断第二个字母
//Monday Tuesday Wednesday Thursday Friday Saturday Sunday
//case语句
public class Program26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个字母,in uppercase：");

        char first = scan.next().charAt(0);

        switch (first){
            case'M':                 //case(能否写入or  如m\\M)
                System.out.println("Maybe you want 'Monday'");
                break;
            case 'T':
                System.out.println("Maybe you want 'Tuesday'or 'Thursday',you can type the second character so wo can confirm.");
                System.out.println("type the second character:");
                char second_1 = scan.next().charAt(0);
                if(second_1=='u'){
                    System.out.println("It is 'Tuesday'.");
                }
                else if(second_1 == 'h'){
                    System.out.println("It is a 'Thursday'.");
                }
                scan.close();
                break;
            case'W':
                System.out.println("Maybe you want 'Wednesday'");
                break;

            case'F':
                System.out.println("Maybe you want 'Friday'");

                break;
            case'S':
                System.out.println("Maybe you want 'Saturday'or 'Sunday',you can type the second character so wo can confirm.");
                System.out.println("type the second character:");
                char second_2 = scan.next().charAt(0);
                if(second_2 =='a'){
                    System.out.println("It is 'Saturday'.");
                }
                else if(second_2 == 'u'){
                    System.out.println("It is a 'Sunday'.");
                }
                else{
                    System.out.println("I guess maybe you type the wrong character.");
                }
                scan.close();
                break;

        }
    }
}
