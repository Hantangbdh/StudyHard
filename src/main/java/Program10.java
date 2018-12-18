import static java.lang.Math.pow;

//球从100米高落下，每次反弹高度为原来1/2；第10次反弹多高，经过了多少米
//第一次反弹经过了100+50
//第二次反弹经过了100+50+50+25
//第三次反弹经过了100+50+50+25+25+12.5
public class Program10 {
    public static void main(String[] args) {
        double sum=0;
        for(int i=0;i<10;i++){

            double a=100*pow(1.0/2,i);
            double b=50*pow(1.0/2,i);
            sum=sum+a+b;
        }
        System.out.println("到第十次落地，共经过"+sum+"米。");
    }
}
