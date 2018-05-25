/*********************************************************
 * Program Name: CSC 143
 * Project: PLAB-05A.
 * Student Name: Thao Truong
 * Description: Return and print out a two_dimension array that is 
 * 				the result of Adding or multiplying 2 given two_dimension arrays 
 * Date Created: 4/30/2018
 *  Date Updated: 4/30/2018 
 * *******************************************************/

package arrays;

public class Test {
	
	//a method to add two matrices and checks before two matrices are added, if they have the same dimensions
	public static double[][] addMatrix(double[][] a, double[][] b) {
		int m = a.length;                            // m rows of matrix (a)
		int n = a[m - 1].length;                     // n rows of matrix (a)
		double c[][] = new double[m][n];             // m x n matrix
		if (a.length == b.length) {                  // check if the rows match
			for (int i = 0; i < m; i++) {
				for (int k = 0; k < n; k++) {
					c[i][k] = a[i][k] + b[i][k];
					System.out.print(c[i][k] + "\t");
				}
				System.out.println();
			}
		} else {System.out.println("The rows of the matrixes don't match each other");}
		return c;
	}
	
	// a method to multiply two matrices and checks before the two matrices are
	//multiplied, that the number of columns in matrix a is the same as the number of rows
	//in matrix b
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		int m = a.length;                        // m rows of matrix (a)
		int p = a[m-1].length;                   //p rows of matrix (a)
		int n = b[p-1].length;                   // n rows of matrix (b)
		double c[][] = new double[m][n];         // m x n matrix
		if (p == b.length) {					//check if  the number of columns in a must be the same as the number of rows in b
			for (int i = 0; i < m; i++) {
				for (int k = 0; k < n; k++) {
					c[i][k] = a[i][0] * b[0][k] + a[i][1] * b[1][k] + a[i][2] * b[2][k];
					System.out.print(c[i][k] + "\t");
				}
				System.out.println();
			}

		} else {
			System.out.println("the number of columns in a doesn't match the number of rows in b");
		}
		return c;
	}

	public static void main(String[] args) {
		double a[][] = {};
		double b[][] = { };
		double c[][] = {{2,2,3},{1,2,3},{1,0,2}};
		double d[][] = {{1,2,0},{0,1,1},{1,2,2}};
		
		System.out.println("After adding two matrices, the result is ");
		addMatrix(a, b);
		System.out.println();
		System.out.println("After mutliplying two matrices, the result is ");
		multiplyMatrix(c, d);

	}

}
