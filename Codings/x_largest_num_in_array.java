class x_largest_elem_in_arr{
	public static void main(String[] args) {
		int [] list_ = {211, 322, 145, 87, 191, 996};
		int total = list_.length;
		int temp;
		for (int i = 0; i < total; i++) 
        {
            for (int j = i + 1; j < total; j++) 
            {
                if (list_[i] > list_[j]) 
                {
                    temp = list_[i];
                    list_[i] = list_[j];
                    list_[j] = temp;
                }
            }
        }
       System.out.println("largest number in array is ---->" + list_[total-1]);
       System.out.println("2nd largest number in array is ---->" + list_[total-2]);
       System.out.println("3rd largest number in array is ---->" + list_[total-3]);
       System.out.println("4th largest number in array is ---->" + list_[total-4]);

	}

}

