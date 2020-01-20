class fibonacci_series
{
	static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args)
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println(fib(i));
		}
	}	
}




class prime{
	public static void main(String[] args) {
		int n = 13;
		for (int i=2; i<n; i++) {
			if(n%i==0){
				System.out.println("it is not a prime");
				break;
			}
		}
		System.out.println("it is a prime");

	}
}



class pallindrome{
	public static void main(String[] args) {
		int n = 5;
		String s = "abcba";
		String temp = "";
		for (int i=n-1; i>=0; i--){
			temp = temp+s.charAt(i);
		}
		// System.out.println(temp);
		if(temp != s){
			System.out.println(temp);
			System.out.println(s);
			System.out.println("it is not a pallindrome");
		}
		else{
			System.out.println("it is a pallindrome");
		}	
	}
}


// class palindrome_int{
// 	public static void main(String[] args) {
// 		int n = 123;

// 	}
// }


class factorial{
	public static void main(String[] args) {
		int n = 6;
		long fact = 1;
		for(int i=1; i<=n; i++){
			fact *= i;
		}
		System.out.println(fact);
	}
}



class armstrong{
	public static void main(String[] args) {
		int n = 156;
		int sum_ = 0;
		int digit = 0;
		int m = n;
		int p = n;
		while(m > 0){
			m /= 10;
			digit += 1;
		}
		while(n>0){
			int r = n%10;
			n /= 10;
			int i = 1;
			int temp = 1;
			while(i<=digit){
				temp *= r;
				i ++;
			}
			// System.out.println(temp);
			sum_ += temp;

		// System.out.println(sum_);
		// System.out.println(n);


		}
	if(sum_==p){
		// System.out.println(p);
		// System.out.println(sum_);
	System.out.println("yes number is armstrong");
	}
	else{
		// System.out.println(p);
	System.out.println("not a armstrong");
	}
	}
}



