//求1！+2！+3！+...+20！的和
public class Program21 {
    public static int jiecheng(int n){
        if(n==1) return 1;
        return n*jiecheng(n-1);
    }
    public static void main(String[] args) {
        int sum=0;
        for(int k=1;k<21;k++){
            sum +=jiecheng(k);
        }
        System.out.println(sum);


    }
}
