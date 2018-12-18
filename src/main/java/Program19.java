//打印图形   三角形/菱形
//控制行
//控制空格的数量
//控制*的数量

//对于菱形来说分为上下两部分
public class Program19 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(3-i+1)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

