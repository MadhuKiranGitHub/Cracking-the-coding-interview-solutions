package arrays_and_Strings;

public class Rotate_nxn_matrix_90degree {
	
	public static void printArray(int[][] arr){
		for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
		
/*
	static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ret = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                ret[i][j] = matrix[n-1-j][i];
            }
        }
        return ret;
    }
*/
    // In place.
    // Relation matrix[i][j] = matrix[n-1-j][i] holds.
    static void rotateInPlace(int[][] matrix) {
        int n = matrix.length;
        System.out.println("Matrix length"+ n);
        for (int i = 0; i < n/2; ++i) {
            for (int j = i; j < n-1-i; ++j) {
                // save top
                int tmp = matrix[i][j];
                // left to top
                matrix[i][j] = matrix[n-1-j][i];
                // bottom to left
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                // right to bottom
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                // top to right
                matrix[j][n-1-i] = tmp;
            }
        }
    }

  
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5},
                     {11,22,33,44,55},
                     {5, 4, 3, 2, 1},
                     {55,44,33,22,11},
                     {6, 7, 8, 9, 0}};
        printArray(a);
        System.out.println("----------------");
       // printArray(rotate(a));
       System.out.println("----------------");
        rotateInPlace(a);
        printArray(a);
    }

}
