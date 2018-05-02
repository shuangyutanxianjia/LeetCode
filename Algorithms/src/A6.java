/**
 * 仿照的是走向
 * @author Administrator
 *
 */
public class A6 {
	public String convert(String s, int numRows) {
        int m = numRows;
        int n = s.length();
        char[][] ch=new char[m][n];
        
        
        StringBuilder sb = new StringBuilder();
        
        int jflag = 0;
        int iflag = 0;
        int dir = 0; //记录上次转折前的方向
        
       for(int i = 0;i<s.length();){
    	   if(numRows == 1){
    		   ch[jflag][iflag++] = s.charAt(i++);
    	   }else{
	    	   if(direction(jflag,numRows) == 0){
	    		   dir = 0;
	    	   }
	    	   if(direction(jflag,numRows) == 1){
	    		   dir = 1;
	    	   }
	    	   if(dir == 0){
	    		   ch[jflag++][iflag] = s.charAt(i++);
	    	   }else{
	    		   ch[jflag--][iflag++] = s.charAt(i++);
	    	   }
    	   }
       }
       for(int p=0;p<m;p++){
  		 for(int q=0;q<n;q++){  
  			 if(ch[p][q]!='\0')
  				sb.append(ch[p][q]);
  		 }
  	 }
  	 return sb.toString();     
       
    }
	//转弯方向
	public int direction(int flag,int numRows){	
		int result = 0;
		if(numRows == 1) return 2;
		if(flag == 0) result =0;
		else if(flag == numRows-1) result = 1;
		else result =2;
		return result;
	}
	
	public static void main(String[] args) {
		String s = "asdasdsafsaf";
		int num = 3;
		A6 a = new A6();
		a.convert(s, num);
	}
		
}
