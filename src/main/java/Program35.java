//输入数组，最大值与第一个元素交换，最小值与最后一个元素交换  输出

import java.util.Scanner;

//如何确定输入数组的最大值与最小值
//排序
public class Program35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        //输入10个数构成一个数组
        System.out.println("请输入10个数构成一个数组:");
        for(int i=0;i<10;i++){
            a[i] = scan.nextInt();
        }
        System.out.println("您输入的数组为：");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
        //对数组进行排序
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a[i]>a[j]){
                    int temp;
                    temp = i;i = j; j = temp;
                }
            }
        }
        //输出排序后的数组
        System.out.println("排序整理后的数组为：");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }

    }

}
