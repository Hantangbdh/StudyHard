//一个数加上100完全平方，再加168完全平方
public class Program13 {
    public static void main(String[] args){
        for(int i=1;i<100000;i++) {
            for (int j = 1; j < 333; j++) {
                if (i + 100 == j * j) {

                    for (int k = 1; k < 333; k++) {
                        if (i + 268 == k * k ) {

                            System.out.println(i);
                        }
                    }
                }
            }


        }

    }
}
