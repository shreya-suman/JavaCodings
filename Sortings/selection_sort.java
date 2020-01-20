class selection_sorting{
	public static void main(String[] args) {
		int [] arr = {5, 1, 4, 3, 2};
		int n = 5;
		// for (int element: arr) {
  //           System.out.println(element);
  //       }
  //       System.out.println("************");
		
		for(int i=0; i<n; i++){
			int min_ = i;
			for(int j=i+1; j<n; j++){
				if(arr[j] < arr[min_]){
					min_ = j;
				}
			int temp = arr[i];
			arr[i] = arr[min_];
			arr[min_] = temp;
			}
			for (int element: arr) {
            System.out.print(element);

		}
        System.out.println("************");


        }
	}
}
