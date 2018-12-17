//编写函数
//输入n为偶数时 式子为1/2+1/4+1/6+...+1/n
//输入n为奇数时 式子为1/1+1/3+1/5+...+1/n
/*public class Program39 {
    public static int fraction_sum(int n){
        if(n%2==0){
            float sum=0;
            for(int i=1;i<=n/2;i++){
                sum +=1.0/(2i);
            }
        }
        else if(n%2!=0){
            float sum=0;
            for(int i=1;i<=n/2;i++){
                sum +=1.0/(2i-1);
        }
    }
}
*/