import java.util.Scanner;

//输入三个整数xyz 把这三个数从小到大输出
//x>y>z    x>z>y   y>x>z   y>z>x   z>x>y  z>y>x
public class Program15 {
    public static int sort_numbers(int x,int y,int z){
        if(x>y&&x>z){
            if(y>z){
                System.out.println(z+""+y+""+x);
            }
            else{
                System.out.println(y+""+z+""+x);
            }
        }
        if(y>z&&y>x){
            if(z>x){
                System.out.println(x+""+z+""+y);
            }
            else{
                System.out.println(z+""+x+""+y);
            }
        }
        if(z>x&&z>y){
            if(y>x){
                System.out.println(x+""+y+""+z);
            }
            else{
                System.out.println(y+""+x+""+z);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入三个数：");
        int x;int y;int z;
        while(scan.hasNextInt()){
             x=scan.nextInt();
             y=scan.nextInt();
             z=scan.nextInt();
             sort_numbers(x,y,z);
        }
        scan.close();

    }

}
