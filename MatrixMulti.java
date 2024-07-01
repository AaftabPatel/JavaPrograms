import java.lang.Thread;
import java.util.*;
import java.text.SimpleDateFormat;

class MatrixMulti{
	public static final int THREAD_NO = 9;
	public static void main(String args[]){
		int matrix1[][] = {{1345,1423,1789},{8642,3342,4472},{8673,3434,9423}};
		int matrix2[][] = {{1465,1979,1980},{2243,2533,2866},{3098,4633,3867}};
		int matrix[][] = new int[3][3];
		int matrixres[][] = new int[3][3];
		int j, i, k, tcount=0;
		Thread[] t = new Thread[THREAD_NO];
		try{
			System.out.println(new SimpleDateFormat("mm:ss:SSS").format(new Date()));
			for(i = 0; i < 3; i++){
				for (j = 0; j < 3; j++) {
					t[tcount] = new Thread(new MatrixMultiThread(matrix,matrix1,matrix2,i,j));
					t[tcount].start();
					tcount++;
				}
			}
			for(tcount = 0; tcount < 9; tcount++){
				t[tcount].join();
			}
			System.out.println(new SimpleDateFormat("mm:ss:SSS").format(new Date()));
		}catch(InterruptedException e){
			System.out.println("error: "+e);
		}
		
		//multiplying normally
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
				matrixres[i][j] = 0;
				for (k = 0; k < 3; k++) {
					matrixres[i][j] += matrix1[i][k] * matrix2[k][j];	
				}
			}
		}
		System.out.println(new SimpleDateFormat("mm:ss:SSS").format(new Date()));

		System.out.println("Resulting Matrix:");
		for(i = 0; i < 3; i++){
			System.out.print("|");
			for(j = 0; j < 3; j++){
				System.out.print(matrix[i][j]+"  ");	
			}
			if(j == 3)
				System.out.println("|");
		}	
		
	}
}

class MatrixMultiThread implements Runnable{
	int[][] matrix, matrix1, matrix2 = new int[3][3];
	int row, col;
	public MatrixMultiThread(int matrix[][], int matrix1[][], int matrix2[][], int i,int j){
		this.matrix = matrix;
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.row = i;
		this.col = j;
	}

	@Override
	public void run(){
		for(int k = 0; k < matrix2.length; k++){
			matrix[row][col] += matrix1[row][k]+matrix2[k][col];
		}
	}
}
