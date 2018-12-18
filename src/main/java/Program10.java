import static java.lang.Math.pow;

//球从100米高落下，每次反弹高度为原来1/2；第10次反弹多高，经过了多少米
public class Program10 {
    public static void main(String[] args) {
        double sum=0;
        for(int i=1;i<11;i++){
            int h=100;
            double h_bounce=h * pow(1/2,i);
            sum=100;
            sum += h_bounce*2;
        }
        System.out.println("到第十次落地，共经过"+sum+"米。");
    }
}
