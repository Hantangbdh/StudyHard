import java.util.Scanner;

//求一个3*3矩阵对角线元素
//二维数组的使用
public class Program29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 9 numbers:");
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=scan.nextInt();
            }
        }
        System.out.println("the 3*3 matrix you entered:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();                  //注意矩阵的输出方法
        }
        int sum=0;
        for(int i=0;i<3;i++){
            sum += a[i][i];
        }
        System.out.println(sum);
    }
}
