package weekly.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class P831 {
	 public String maskPII(String S) {
	        String result = new String();
	        if(S.charAt(0)>='a' && S.charAt(0)<='z' || S.charAt(0)>='A' && S.charAt(0)<='Z'){
	        	if(S.length()<8) return null; //为邮箱
	        	if(S.charAt(0)>='A' && S.charAt(0)<='Z'){
	        		result +=Character.toLowerCase(S.charAt(0)) ;
	        	}else{
	        		result = result + S.charAt(0);
	        	}
	        	result +="*****";
	        	int i = 0;
	        	while(i<S.length()){
	        		if(S.charAt(i+1)=='@'){
	        			break;
	        		}
	        		i++;
	        	}
	        	if(S.charAt(i)>='A' && S.charAt(i)<='Z'){
	        		result +=Character.toLowerCase(S.charAt(i)) ;
	        	}else{
	        		result += S.charAt(i);
	        	}
	        	i++;
	        	while(i<S.length()){
	        		if(S.charAt(i)>='A' && S.charAt(i)<='Z'){
		        		result +=Character.toLowerCase(S.charAt(i)) ;
		        	}else{
		        		result += S.charAt(i);
		        	}
	        		i++;
	        	}
	        }else{ //电话
	        	List<Integer> num = new ArrayList<>();
	        	if(S.length()<10) return null;
	        	int i=0;
	        	while(i<S.length()){
	        		if(S.charAt(i)>='0'&&S.charAt(i)<='9'){
	        			num.add(S.charAt(i)-'0');
	        		}
	        		i++;
	        	}
	        	if(num.size()>10){
	        		result += '+';
	        		for(int j=0;j<num.size()-10;j++){
	        			result +='*';
	        		}
	        		result+='-';
	        	}
	        	result +="***-***-";
	        	for(int j=num.size()-4;j<num.size();j++){
	        		result += num.get(j);
	        	}
	        }
	        return result;
	        
	  }
	 public static void main(String[] args) {
		String S ="86-(10)12345678";
		P831 p = new P831();
		
		System.out.println(p.maskPII(S));
	}
}
