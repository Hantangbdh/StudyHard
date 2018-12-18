//1 2 3 4四个数字能组成多少个无重复数字互不相同的三位数
//如何判定无重复数字-----利用多个&&条件使其每个位不相等
public class Program11 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                for(int k=1;k<5;k++){
                    if(i!=j&&j!=k&&i!=k){
                        count++;

                        System.out.println(i*100+j*10+k);
                    }
                }
            }
        }
        System.out.println("个数为："+count);
    }
}
