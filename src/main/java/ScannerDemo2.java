import java.util.Scanner;
//输入：str类型
public class ScannerDemo2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //以nextline方式接收
        System.out.println("请输入：");

        if(scan.hasNextLine()){
            String str2=scan.nextLine();
            System.out.println("输入的数据为："+str2);
        }
        scan.close();
    }
}
