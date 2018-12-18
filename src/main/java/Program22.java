//利用递归方法求5！
public class Program22 {
    public static int jiecheng(int n){
        if(n==1) return 1;
        else{
            return n*jiecheng(n-1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(jiecheng(5));
    }
}
