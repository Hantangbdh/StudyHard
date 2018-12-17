import java.lang.reflect.Array;
import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {


        int[] nums = {101, 89, 76, 258, 379, 6, 38, 99, 817, 108};
        ArrayList arr = new ArrayList();

        arr.add(nums[3]);

        for (int i = 0; i < 10; i++) {
            if(nums[i]>100){
                System.out.println(nums[i]);

            }
        }
        arr.set(3, 5);

        for(int i =0;i<5;i++){
            for(int j=i+1;j<5;j++){


            }
        }
    }
}
