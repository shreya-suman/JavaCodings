class insertion_sorting{
	public static void main(String[] args) {
		int [] arr = {5, 1, 4, 3, 2};
		int n = 5;
		for(int i=1; i<n; i++){
			for(int j=0; j<=i; j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int element: arr) {
            System.out.println(element);
        }
	}
}