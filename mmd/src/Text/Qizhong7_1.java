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

                                                 �÷�����������׷�����ݵ���ǰStringBuffer�����ĩβ���������ַ��������ӡ����ø÷����Ժ�StringBuffer���������Ҳ�����ı䣬���磺

                  StringBuffer sb = new StringBuffer(��abc��);

                  sb.append(true);     �����sb��ֵ����ɡ�abctrue��*/
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
        while (in.hasNext()) {  //hasNext()��Scanner���һ���������ж��Ƿ������룬�������a .hasNext()Ϊtrue��û�������a .hasNext()Ϊfalse
            string1 = in.next();
            string2 = in.next();
            System.out.println(prefix(string1, string2));
        }
        in.close();
    }
}
