class add_multiply_subtract_two_matrices{
	public static int[][] add_two_matrices(int[][] mat1, int[][] mat2, int[][] mat_sum){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				mat_sum[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
	return mat_sum;
	}
	public static int[][] sub_two_matrices(int[][] mat1, int[][] mat2, int[][] mat_sum){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				mat_sum[i][j]=mat1[i][j]-mat2[i][j];
			}
		}
	return mat_sum;
	}
	public static int[][] mul_two_matrices(int[][] mat1, int[][] mat2, int[][] mat_sum){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				mat_sum[i][j]=mat1[i][j]*mat2[i][j];
			}
		}
	return mat_sum;
	}

	public static void main (String[] args){
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};    
		int b[][] = {{1,3,4},{2,4,3},{1,2,4}};
		int c[][] = new int[3][3];
		c = add_two_matrices(a,b,c);
		System.out.println("addition matrix");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}

		c = sub_two_matrices(a,b,c);
		System.out.println("subtraction matrix");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}


		c = mul_two_matrices(a,b,c);
		System.out.println("multiplication matrix");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}


	}
}

