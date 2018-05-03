/**
 * 反转整数
 * @author Administrator
 *
 */
public class A7 {
	public int reverse(int x) {
        int result = 0;
        	while (x != 0){
        		int temp = x%10;
        		int newresult = result *10 +temp;
        		if((newresult-temp)/10!=result) return 0;
        		result = newresult;
        		x= x/10;
        	}
        
        return result;
    }
	public static void main(String[] args) {
		int x = -321;
		A7 a = new A7();
		System.out.println(a.reverse(x));
	}
}
