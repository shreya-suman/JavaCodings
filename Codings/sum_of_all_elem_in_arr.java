class sum_of_all_elem_in_arr{
	public static void main(String[] args) {
		int sum = 0;
		int [] list_ = {21, 22, 45, 87, 91, 96};
		for(int i = 0; i<list_.length; i++){
			sum += list_[i];
		}
		System.out.println(sum);
	}
}