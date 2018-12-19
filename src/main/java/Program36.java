import java.util.Scanner;

//有n个数 每个数都向后移动m个位置 这样最后的m个数就变成了最前面的m个数
//N>M?
// >>i=0      0<=i<len-m:a[i+m]=a[i]
// >>i=len-m  len-m<=i<=len-1:a[i-(len-m)]=a[i]
//假设n=5；m=3;
public class  Program36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入5个数：");
        int[] a = new int[5];
        int len=a.length;
        for(int i=0;i<5;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("您输入的数组为：");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //假设每个数都向后移动三个位置 >>  m=3


    /*
       //前面的数  向后
        for(int i=0;0<=i&&i<len-3;i++){
            a[i+3]=a[i];
        }                                                  //12345>12312
        //后面的数   向前
        for(int i=len-3;len-3<=i&&i<=len-1;i++){           //本意是把原来后面的数移动到前面 但此时后面的数已经不是原来的了
            a[i-(len-3)]=a[i];                             //后面的数已经是向后挪过之后的前面的数  就变成了12312>31212
        }
    */


        //考虑再开辟一个新数组 先存放后面的数
        //待原数组向后移动完成后  再覆盖进去  如345 覆盖12312  >34512
        int[] b=new int[3];      //新数组的长度是向后移动的长度
        b[0]=a[len-3];
        b[1]=a[len-2];
        b[2]=a[len-1];
        //原数组向后移动3(m)
        for(int i=0;0<=i&&i<len-3;i++){
            a[i+3]=a[i];
        }
        //覆盖  i=0  i<m
        for(int i=0;i<3;i++){
            a[i]=b[i];
        }
        //输出数组
        System.out.println("移动后的数组为：");
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");                    //应是12345>34512
        }
    }
}
