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
