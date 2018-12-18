//question: 809*?? = 800*?? + 9*??   求两位数??及809*??的结果。
//known conditions: 8*??=两位数   9*??=三位数

 //8*12=96 8*13=104 9*12=108 9*13=117》》??=12
public class Program42 {
     public static void main(String[] args) {
         for(int i=1;i<=20;i++){
             if(8*i<100&&9*i>100){
                 System.out.println(i);
                 System.out.println(809*i);
             }
         }
     }
}
