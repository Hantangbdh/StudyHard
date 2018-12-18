//判断101-200之间有多少个素数，并输出所有素数
public class Program2 {
    public static void main(String[] args) {

        for (int i = 101; i <= 200; i += 2) {//增量直接写为2  因为除了2以外所有的素数都不会是偶数
            boolean b = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    b=false;
                    break;
                }
                else {
                    b=true;
                }
            }
            if(b){
                System.out.println(i);
            }
        }
    }


}
