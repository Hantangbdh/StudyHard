//a不和x比
//c不和x比 + c不和z 比  >>c和y比
//>>a不和y比    >>a和z比


//>>a 不和x   a不和y     az
//>>b不和z    b不和y     bx
//>>c不和x  c不和z       cy

//能否构建出数值已知但顺序不知的数组？

public class Program18 {
    public static void main(String[] args) {
        char[] jia ={'a','b','c'};
        char[] yi = {'x','y','z'};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(jia[i]=='a'&&yi[j]=='x'){
                    continue;
                }
                if(jia[i]=='a'&&yi[j]=='y'){
                    continue;
                }
                if(jia[i]=='b'&&yi[j]=='z'){
                    continue;
                }
                if(jia[i]=='b'&&yi[j]=='y'){
                    continue;
                }
                if(jia[i]=='c'&&yi[j]=='x'){
                    continue;
                }
                if(jia[i]=='c'&&yi[j]=='z'){
                    continue;
                }

                else{
                    System.out.println(jia[i]+"  vs  "+yi[j]);
                }
            }
        }


    }


}
