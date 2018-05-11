package weekly.test;

public class P829 {
	public int consecutiveNumbersSum(int N) {
//        int count =1;
//        for(int x = 1;x<=N/2+1;x++){
//        	for(int m =2;m<=N/2+1;m++){
//        		int temp = (x+x+m-1)*m/2;
//        		if(temp == N) {count++;break;}
//        		if(temp >N) break;
//        	}
//        }
//        return count;
		
		int c =1;
		int count = 0;
		while(c<N/2+1){
			if(N / c < c / 2 + c % 2)break;
			if(c%2 == 1 && N%c == 0) {count++;}
			if(c%2 == 0 && (Math.floor(N/c)*c+c/2) == N){				
				count++;
				}			
			c++;
		}
		return count;
    }
	public static void main(String[] args) {
		int N =15;
		P829 p = new P829();
		System.out.println(p.consecutiveNumbersSum(N));
	}
}
