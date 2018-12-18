//求一数列的前二十项和
public class Program20 {
    public static void main(String[] args){
        float a=2;float b=1;float sum=0;
        float temp;

        for(int i=1;i<21;i++){

            float k=a/b;

            sum += k;
            temp=b;b=a; a=a+temp;

        }
        System.out.println(sum);
    }
}

