import java.util.Scanner;
//在Scanner中也支持输入 int/float 类型的数据
//在输入前可以先使用 hasNextXxx() 来验证
//再使用 nextXxx() 来读取

public class ScannerDemo3 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int i=0;
        float f=0.0f;
        if(scan.hasNextInt()){
            i=scan.nextInt();
            System.out.println("输入的整数为："+i);
        }
        else{
            System.out.println("您输入的不是整数。");
        }

        System.out.print("请输入一个小数：");    //未输入
        if(scan.hasNextFloat()){
            f=scan.nextFloat();
            System.out.println("输入的小数为："+f);
        }
        else{
            System.out.println("您输入的不是小数。"); //未报错
        }
        scan.close();
    }

}
