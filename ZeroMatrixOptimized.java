package tinkering;

/*
 * This is an optimized version of ZeroMatrix.java.
 * The space complexity here is O(M + N) where M and N are the dimensions of the given array,
 * instead of O(MN) in the non-optimized version.
 */

public class ZeroMatrixOptimized {
	public void setZeroes(int[][] arr) {
	        boolean[] rows = new boolean[arr.length];
	        boolean[] columns = new boolean[arr[0].length];
	        
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[0].length; j++) {
	                if (arr[i][j] == 0) {
	                    rows[i] = true;
	                    columns[j] = true;
	                }
	            }
	        }
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (rows[i] == true) {
	                for (int j = 0; j < arr[0].length; j++) {
	                    arr[i][j] = 0;
	                }
	            }
	        }
	        
	        for (int j = 0; j < arr[0].length; j++) {
	            if (columns[j] == true) {
	                for (int i = 0; i < arr.length; i++) {
	                    arr[i][j] = 0;
	                }
	            }
	        }
	    }
}
