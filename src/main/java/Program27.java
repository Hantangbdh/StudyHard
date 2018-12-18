//求100之内的素数
public class Program27 {
    public static void main(String[] args){
        for(int i=3;i<101;i+=2){
            boolean b = false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    b=false;
                    break;
                }
                else{
                    b = true;
                }

            }
            if(b){
                System.out.println(i);
            }
        }

    }

}
