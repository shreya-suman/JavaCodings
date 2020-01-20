class matrix_problems{
	public static void transpose_matrix(int[][] mat, int n){
		// transpose of a matrix is row changes to column and vice versa
		System.out.println("Transpose of the matrix is:");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(mat[j][i]);
			}
			System.out.println();
		}
	}

// -----------------------------------------------------------------------------------------------------------------------------------------


	public static void identity_matrix(int[][] mat, int n){
		// identity matrix is a square matrix in which all diagonal element == 1 and rest all element == 0
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i==j && mat[i][j]!=1){
					System.out.println("Given matrix is not identity matrix");
					return;
				}
				else if(i!=j && mat[i][j]!=0){
					System.out.println("Given matrix is not identity matrix");
					return;
				}
			}
		}
		System.out.println("Given matrix is identity matrix");		
	}

// -----------------------------------------------------------------------------------------------------------------------------------------


	public static void sparse_matrix(int[][] mat, int n){
		//  For the matrix to be sparse, count of zero elements present in an array must be greater than size/2
		int count_zero = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if (mat[i][j] == 0){
					count_zero += 1;
				}
			}
		}
		if (count_zero > n*n/2){
			System.out.println("Given matrix is sparse matrix");
		}
		else{
			System.out.println("Given matrix is not sparse matrix");
		}
	}

// -----------------------------------------------------------------------------------------------------------------------------------------

	public static void equal_matrix(int[][] mat1, int[][] mat2, int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if (mat1[i][j] != mat2[i][j]){
					System.out.println("Given matrix is not equal matrix");
					return;
				}
			}
		}
		System.out.println("Given matrix is equal matrix");		
	}

// -----------------------------------------------------------------------------------------------------------------------------------------


	public static int[][] lower_triangle_matrix(int[][] mat, int n, int[][] result_mat){
		// lower triangle of a matrix means to convert upper triangle equals to zero
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(j<=i){
					result_mat[i][j] = mat[i][j];
				}
				else{
					while (j<n){
						result_mat[i][j] = 0;
						j += 1;
					}
				}

			}
		}
		return result_mat;
	}


// -----------------------------------------------------------------------------------------------------------------------------------------
	public static int[][] upper_triangle_matrix(int[][] mat, int n, int[][] result_mat){
		// lower triangle of a matrix means to convert upper triangle equals to zero
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(j>=i){
					result_mat[i][j] = mat[i][j];
				}
				else{
					
						result_mat[i][j] = 0;
					
				}

			}
		}
		return result_mat;
	} 


// -----------------------------------------------------------------------------------------------------------------------------------------
	public static void odd_even_nos_in_matrix(int [][]mat, int n){
		// count no of adds and evens in a matrix and print numbers 
		int count_odd = 0;
		int count_even = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(mat[i][j]%2==0){
					count_even += 1;
					System.out.println(mat[i][j] + " number is even at the index "+i+" "+j);
				}
				else{
					count_odd += 1;
					System.out.println(mat[i][j] + " number is odd at the index "+i+" "+j);
				}
			}
		}
	}



// -----------------------------------------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};    
		transpose_matrix(a, 3);
		
		int b[][] = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
		identity_matrix(b, 3);
		
		sparse_matrix(b, 3);

		equal_matrix(b, a, 3);

		odd_even_nos_in_matrix(a, 3);

		int[][]result_mat = new int[3][3];
		result_mat = lower_triangle_matrix(a, 3, result_mat);
		System.out.println("result of lower_triangle_matrix is");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(result_mat[i][j]+ " ");
			}
			System.out.println();
		}


		int[][]result_upper_mat = new int[3][3];
		result_upper_mat = upper_triangle_matrix(a, 3, result_upper_mat);
		System.out.println("result of upper_triangle_matrix is");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(result_upper_mat[i][j]+ " ");
			}
			System.out.println();
		}
	
	}
}
