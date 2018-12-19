import java.util.Scanner;

//将一个数组逆序输出
public class Program31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入几个正整数,输入-1结束输入：");
        int[] a = new int[20];
        int i=0;int j;
        do {
            a[i] = scan.nextInt();
            i++;                                 //当输入多个不确定数量的正整数时  这样 得到的i-1就是输入的正整数的个数。
        }while(a[i-1]!=-1);                //当输入的最后一个数是-1的时候结束
                                            //运行得出此时的i值也就是正整数的个数是包括-1在内的
        System.out.println(i);
        System.out.println("输入的数组输出：");
        for(j=0;j<i-1;j++){                //符合要求的数组长度是i-1
            System.out.print(a[j]+"  ");
        }
        System.out.println();
        System.out.println("数组逆序输出：");
        for(j=i-2;j>=0;j--){
            System.out.print(a[j]+"  ");
        }

    }
}

