class print_odd_even_no_in_arr{
	public static int[] print_odd_no(int[] arr, int[] odd_arr){
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2 != 0){
				odd_arr[i] = arr[i];
			}
		}
	return odd_arr;
	}

	public static int[] print_even_no(int[] arr, int[] odd_arr){
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2 == 0){
				odd_arr[i] = arr[i];
			}
		}
	return odd_arr;
	}

	public static void main(String[] args) {
		int [] arr= {27, 37, 78, 90, 86, 45};
		int [] result_arr = new int [arr.length];
		result_arr = print_odd_no(arr, result_arr);
		System.out.println("odd numbers");
		for (int i=0; i<result_arr.length; i++){
			if (result_arr[i] != 0){
				System.out.print(result_arr[i]+ " ");
			}
			
		}
		System.out.println();
		int [] result_arr1 = new int [arr.length];
		result_arr1 = print_even_no(arr, result_arr1);
		System.out.println("even numbers are");
		for (int i=0; i<result_arr1.length; i++){
			if (result_arr1[i] != 0){
				System.out.print(result_arr1[i]+ " ");
			}
			
		}


	}
}
