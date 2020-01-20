class copy_arr_to_other_arr{
	public static void main(String[] args) {
			int [] original_arr = {12, 34, 56, 43, 12, 90, 87, 639};
			int [] copied_arr = new int[original_arr.length]; 
			for (int i= 0; i<original_arr.length; i++){
				copied_arr[i] = original_arr[i];
			}
			for (int element: copied_arr){
				System.out.println(element);
			}
		}	
}






