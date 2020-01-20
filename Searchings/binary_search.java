class binary_search{
	public static void main(String[] args) {
		int item = 91;
		int [] list_ = {21, 22, 45, 87, 91, 96};
		int end = list_.length;
		int st = 0;
		while(end>st){
			int mid = mid = (st+end)/2;
			if (item == list_[mid]){
				System.out.println(mid);
				break;
			}
			else if(item < list_[mid]){
				end = mid;

			}
			else if(){
				st = mid+1;
			}

		}

	}
}





