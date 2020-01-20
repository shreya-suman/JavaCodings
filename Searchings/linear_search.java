class linear_search{
	public static void main(String[] args) {
		int elem_to_be_search = 21;
		int [] arr = {22, 45, 87, 21, 96};
		for(int i=0; i<arr.length; i++){
			if(arr[i] == elem_to_be_search){
				System.out.println(i);
			}
		} 
		
	}
}

