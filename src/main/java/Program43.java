//求0--7所能组成的奇数个数
//这不是无限么..
//组成一位数奇数：4               个
//组成二位数奇数：7*4
//组成三位数奇数：7*8*4
//组成四位数奇数：7*8*8*4
//组成五位数奇数：7*8*8*8*4       个
//组成n位数奇数：7*8^（n-2)*4
public class Program43 {
    public static void main(String[] args) {
        int sum=4;
        System.out.println("一位数奇数："+sum+"个");
        sum =sum*7;
        System.out.println("二位数奇数："+sum+"个");
        for(int i=3;i<=10;i++){
            sum = sum*8;
            System.out.println(i+"位数奇数:"+sum+"个");
        }
    }



}
