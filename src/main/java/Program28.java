import java.util.Scanner;

//对10个数进行排序
public class Program28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input ten numbers:");
        int[] a = new int[10];     //不可以不指定数组长度
        for(int n=0;n<10;n++){
            a[n] = scan.nextInt();       //
        }                                      //键入空格输入一个数 输入十个数后回车出结果。

        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a[i]>a[j]){
                  int  temp;
                  temp=a[i];a[i]=a[j];a[j]=temp;
                }
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(a[i]+"   ");
        }




    }

}
