class print_largest_and_smallest_arr{
	public static void main(String[] args) {
		int [] original_arr = {121, 34, 56, 639, 12, 34, 34, 639};
		int largest_elem = original_arr[0];
		int smallest_elem = original_arr[0];
		for(int i=1; i<original_arr.length; i++){
			if (largest_elem < original_arr[i]){
				largest_elem = original_arr[i];
			}
			if(smallest_elem > original_arr[i]){
				smallest_elem = original_arr[i];
			} 
		}
		System.out.println("smallest elem is " + smallest_elem + " and largest elem is " + largest_elem);
	}
}