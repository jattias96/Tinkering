package tinkering;

public class ZeroMatrix {
	
	public static int[][] zeroMatrix(int[][] arr) {
		
		boolean[][] boolArr = new boolean[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) boolArr[i][j] = true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (boolArr[i][j] == true) {
					for (int k = 0; k < arr[0].length; k++) {
						arr[i][k] = 0;
					}
					
	                for (int h = 0; h < arr.length; h++) {
	                	arr[h][j] = 0;
	                }
				}
			}
		}
		
		return arr;
	}
}
