import java.util.Scanner;

//将一个正整数分解质因数
public class Program4 {
    public static int fenjie_yinshu(int n){
        int k=2;
        while(k<=n){
            if(k==n){
                System.out.println(n);
                break;
            }
            else if(n%k==0){
                System.out.print(k+"*");
                n=n/k;
            }
            else{
                k++;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入要分解的质因数：");
        int m=scan.nextInt();
        fenjie_yinshu(m);
        scan.close();
    }
}
