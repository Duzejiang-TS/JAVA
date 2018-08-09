package Text;

import java.math.BigInteger;
import java.util.Scanner;

public class Da_shu_yu_suan{
    public static void main(String []args){
        int len;
        char symbol = 0;
        Scanner input = new Scanner(System.in);
        String string,formarString = null,laterString = null;
        string = input.nextLine();
        len = string.length();
        for(int i =0 ;i<len ;i++)
        {
            if(string.charAt(i) == '+' || string.charAt(i) == '-' || string.charAt(i) =='*' || string.charAt(i) =='/')
            {
                symbol = string.charAt(i);
                formarString = formar(string,i);
                laterString = later(string,i+1);
            }
        }
        BigInteger a = new BigInteger(formarString);
        BigInteger b = new BigInteger(laterString);
        System.out.println(mothed(a,b,symbol));
    }
    public static String formar(String s,int j){
        String temp;
        temp = s.substring(0,j);
        return temp;
    }
    public  static String later(String s,int j){
        String temp;
        temp = s.substring(j);
        return temp;
    }
    public static BigInteger mothed(BigInteger a,BigInteger b,char symbol){
        BigInteger result = null;
        switch (symbol)
        {
            case '+':
                result = a.add(b);break;
            case '-':
                result =  a.subtract(b);break;
            case '*':
                result = a.multiply(b);break;
            case '/':
                result = a.divide(b);break;
        }
        return result;
    }
}
