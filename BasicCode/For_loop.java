class SimpleForLoop{
	public static void main(String[] args) {
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}
	}
}


class NestedForLoop{
	public static void main(String[] args) {
		for(int i=1; i<=10; i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
		System.out.println();//new line 
		}
	}
}


class ForEachLoop{
	public static void main(String[] args) {
		int arr[] = {12, 24, 36, 48, 60};
		for(int i:arr){
			System.out.println(i);
		}
	}
}


class ForBreakLoop{
	public static void main(String[] args) {
		int i =1;
		for (; i<=10; i++) {
			if(i==5){
				break;
			}
			System.out.println(i);
		}
	}
}


class ForContinueLoop{
	public static void main(String[] args) {
		int i =1;
		for (; i<=10; i++) {
			if(i==5){
				continue;
			}
			System.out.println(i);
		}
	}
}

