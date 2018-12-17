//猴子吃桃问题
public class Program17 {

    public static int taozi(int n) {
        if(n==10) return 1;
        return (taozi(n+1)+1)*2;

    }

    public static void main(String[] args) {
        for(int n=10;n>0;n--){
            System.out.println(taozi(n));
        }


    }
}
