class bubble_sorting{
	public static void main(String[] args) {
		int [] arr = {5, 1, 4, 3, 2};
		for (int element: arr) {
            System.out.println(element);
        }
        System.out.println("************");
		int n = 5;
		for(int i=0; i<=n-1; i++){
			for(int j=i+1; j<=n-1; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int element: arr) {
            System.out.println(element);
        }
	}
}