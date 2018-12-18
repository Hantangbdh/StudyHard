public class dadadad {
    public static void main(String[] args) {
        int[] a = {1,3,4,7,9,2,4,6,8,12};
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a[i]>a[j]){
                    int temp;
                    temp = i;i = j; j = temp;
                }
            }
        }

    }
}
//35 36 40 41 44  49 50
