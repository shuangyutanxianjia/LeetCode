package weekly.week86;
/**
 * 3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
 * 给定一个由整数组成的 N × N 矩阵，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。
 * @author Administrator
 *
 */
public class P840 {
	public static int numMagicSquaresInside(int[][] grid) {
        if(grid == null) return 0;
		int row = grid.length;
        int colum = grid[0].length;
        int count = 0;
        if(row<3||colum<3) return 0;
		
		for(int i = 0;i<row-2;i++){
        	for(int j=0;j<colum-2;j++){
        		int[][] help= {	{grid[i][j],grid[i][j+1],grid[i][j+2]},
        					{grid[i+1][j],grid[i+1][j+1],grid[i+1][j+2]},
        					{grid[i+2][j],grid[i+2][j+1],grid[i+2][j+2]}};
        		if(helper(help)) count++;
        	}
        }
		return count;		
    }
	public static boolean helper(int[][] help){
		int sum = 0;
		int rowsum =0;
		int columsum =0;
		for(int i = 0;i<3;i++){
			rowsum = columsum =0;
			for(int j =0;j<3;j++){
				if(help[i][j]>9||help[i][j]<1) return false;
				rowsum += help[i][j];
				columsum += help[j][i];
				sum += help[i][j];
			}
			if(rowsum != columsum) return false;
		}
		if(sum != 45) return false;
		int x1 =0;
		int x2 =0;
		for(int i =0;i<3;i++){
			x1 += help[i][i];
			x2 += help[i][2-i];
		}
		if(x1!=x2 ||x1!=rowsum||x2!=rowsum) return false;
		return true;
	}
	
	public static void main(String[] args) {
		int[][] grid = {{10,3,5},{1,6,11},{7,9,2}};
		System.out.println(P840.numMagicSquaresInside(grid));
	}
}
