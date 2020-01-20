class print_even_place_elem_arr{
	public static void main(String[] args) {
		int [] original_arr = {12, 34, 56, 639, 12, 34, 34, 639};
		for(int i=0; i<original_arr.length; i++){
			if(i%2==0){
				System.out.println(original_arr[i]);
			}
		}
	}
}