class freq_of_elem_of_arr_and_find_duplicate_and_distinct_count{
	public static void main(String[] args) {
			int [] original_arr = {12, 34, 56, 639, 12, 34, 34, 639};
			int [] freq_arr = new int[original_arr.length]; 

			for (int i= 0; i<original_arr.length; i++){
				int count = 1;
				for(int j = i+1; j<original_arr.length; j++){
					if (original_arr[i] == original_arr[j]){
						freq_arr[j] = -1;
						count += 1;
					}

				}
				if (freq_arr[i] != -1){
					freq_arr[i] = count;
				}

			}
			// for(int element:freq_arr){
			// 	System.out.println(element);
			// }

			for (int k= 0; k<original_arr.length; k++){
				// if (freq_arr[k] != -1){
				// 	System.out.println("frequency of " + original_arr[k] + " is " + freq_arr[k]);
				// }

				if (freq_arr[k] > 1){
					System.out.println(original_arr[k]);
				}
			}



		}
	}
