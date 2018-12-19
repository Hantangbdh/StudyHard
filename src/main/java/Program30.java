import java.util.Scanner;

//有已经排好序的数组  输入一个数，把它按照原来的规律插入到数组中

public class Program30 {

    public static void main(String[] args) {
        int[] arr1 = {12, 23, 34, 45, 56,67};
        int[] arr2 = new int[7];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        arr2 = insert(arr1, number);
        System.out.print("新数组为： ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("  " + arr2[i]);
        }
    }
    public static int[] insert(int[] arr, int number) {
        int[] arr_new = new int[arr.length + 1];

        //将元素添加到新数组
        // 新数组最后一个元素为需要插入的数字
        for (int i = 0; i < arr.length; i++) {
            arr_new[i] = arr[i];
        }
        arr_new[arr.length] = number;

        //对最后一个开始排序
        for (int i = arr.length; i > 0; i--) {
            if (arr_new[i] < arr_new[i - 1]) {
                int temp;
                temp = arr_new[i];
                arr_new[i] = arr_new[i - 1];
                arr_new[i - 1] = temp;
            }

        }
        return arr_new;
    }
}