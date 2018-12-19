import java.util.Scanner;

//利润提成-奖金发放问题
public class Program12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入利润I：");
        double I = scan.nextDouble();
        double s;
        if (I <= 100000) {
            s = I * 0.1;
            System.out.println(s);
        }
        else if (I > 100000 && I <= 200000) {
            s = 100000 * 0.1 + (I - 100000) * 0.75;
            System.out.println(s);
        }
        else if (I > 200000 && I <= 400000) {
            s = 100000 * 0.1 + 100000 * 0.075 + (I - 200000) * 0.05;
            System.out.println(s);
        }
        else if (I > 400000 && I <= 600000) {
            s = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (I - 400000) * 0.03;
            System.out.println(s);
        }

    }
}

