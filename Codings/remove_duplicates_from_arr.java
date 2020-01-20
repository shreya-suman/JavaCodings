class remove_duplicates_from_arr{
	public static void main(String[] args) {
		// int [] list_ = {211, 322, 145, 87, 191, 996, 211, 322, 145, 87, 191, 996, 211, 211, 322, 145};
		int [] list_ = {10, 20, 20, 30, 30, 30, 40, 50, 50};
		int n = list_.length;
        int[] unique_list = new int[n]; //new is used to create object, here it's used to create array, coz array is also object
        int k = 0;
		for(int i=0; i<list_.length; i++){
			if(unique_list[k] != list_[i]){
				System.out.println("k --->" + k);
				System.out.println("unique_list--->" + unique_list[k]);
				System.out.println("original_list----->" + list_[i]);
				unique_list[k] = list_[i];
				k++;
				// System.out.println("unique_list--->" + unique_list[k]);

				// k += 1;
			}
			

		}
		for(int j=0; j<unique_list.length; j++){
			System.out.println(unique_list[j]);
		}

	}
}








// public class RemoveDuplicateInArrayExample{
// public static int removeDuplicateElement(int arr[], int n)
//     {
//         if (n==0 || n==1)
//             return n;
      
//         int[] temp = new int[n];
//         int j = 0;
//         for (int i=0; i<n-1; i++)
//             if (arr[i] != arr[i+1])
//                 temp[j++] = arr[i];
         
//         temp[j++] = arr[n-1];   
         
//         // Changing original array
//         for (int i=0; i<j; i++)
//             arr[i] = temp[i];
      
//         return j;
//     }
     
//     public static void main (String[] args) 
//     {
//         int arr[] = {10,20,20,30,30,40,50,50};
//         int length = arr.length;
         
//         length = removeDuplicateElement(arr, length);
//         //printing array elements
//         for (int i=0; i<length; i++)
//            System.out.print(arr[i]+" ");
//     }
// }
