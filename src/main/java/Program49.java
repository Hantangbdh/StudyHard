//计算字符串中子串出现的次数
public class Program49 {
    public static void main(String[] args) {
    //如:
        String str = "abc12abc45abc67";
        String sub_str = "abc";

        String str_replace =str.replaceAll(sub_str," ");
        //一个空格等于一个字符 去代替每个子串 >每个子串就少了len(子串)-1 个字符
        //代替后总共少的字符 / 每个子串少的字符 = 子串数

        int len1=str.length();
        int len2=sub_str.length();
        int len3=str_replace.length();
        System.out.println((len1-len3)/(len2-1));

    }
}
