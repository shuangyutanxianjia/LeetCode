/**
 * 字符串转整数
 * @author Administrator
 *
 */
public class A8 {
	public int myAtoi(String str) {
        if(str == null )return 0;
        String temp =  str.trim(); //去除前后的留白
        if(temp.length() == 0) return 0;
        long result = 0;
        int m = 0;
        boolean Flag = false; //记录是否负数
        char c = temp.charAt(0);
        if(c == '+') m =1;
        else if(c == '-') {m = 1;Flag = true;}
        else if(!Character.isDigit(c)) return 0;
        
        int len = temp.length();
        while(m<len&&Character.isDigit(temp.charAt(m))){
        	int d = Character.getNumericValue(temp.charAt(m));
        	result = result*10 + d;
        	if(result > Integer.MAX_VALUE || (result*-1) < Integer.MIN_VALUE){ 
                if(Flag) return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            m++;
        }
       return (int) (Flag?result*(-1):result);
    }
}
