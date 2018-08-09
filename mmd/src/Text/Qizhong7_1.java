package Text;
import java.util.Scanner;

public class Qizhong7_1 {
    public static String prefix(String s1, String s2){
    	
        StringBuffer str = new StringBuffer("");
        StringBuffer no = new StringBuffer("No common prefix");
        StringBuffer yes = new StringBuffer("The common prefix is ");
        boolean hasPrefix = false;
        int i=0;
        
        while (i < s1.length() && i < s2.length()){
            if (s1.charAt(i) == s2.charAt(i)) {
                hasPrefix = true;
                str.append(s1.charAt(i));
                /*public StringBuffer append(boolean b)

                                                 该方法的作用是追加内容到当前StringBuffer对象的末尾，类似于字符串的连接。调用该方法以后，StringBuffer对象的内容也发生改变，例如：

                  StringBuffer sb = new StringBuffer(“abc”);

                  sb.append(true);     则对象sb的值将变成”abctrue”*/
                i++;
            }
            else {
                break;
            }
        }
        if (hasPrefix){
            str = yes.append(str);
        }else{
            str = no.append(str);
        }
        return new String(str);
    }
    
    public static void main(String[] args){
        String string1,string2;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {  //hasNext()是Scanner类的一个方法，判断是否有输入，有输入项，a .hasNext()为true，没有输入项，a .hasNext()为false
            string1 = in.next();
            string2 = in.next();
            System.out.println(prefix(string1, string2));
        }
        in.close();
    }
}
