//打印杨辉三角 打印出十行
//对应(a+b)^n的展开系数

public class Program33 {


    public static void main(String[] args) {
        int rows = 10;

        for (int i = 0; i < rows; i++) {
            int number = 1;
            //打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}