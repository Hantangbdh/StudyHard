import java.util.Scanner;

//字符串排序
public class Program40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scan.nextLine();
        char[] ch=str.toCharArray();
        int len=ch.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(ch[i]>ch[j]){
                    char temp;
                    temp=ch[i];ch[i]=ch[j];ch[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(ch[i]);
        }
    }

}
