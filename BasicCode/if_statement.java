class IfSmallExample {
public static void main(String[] args){
	int n=10;
	if(n>5){
		System.out.print("needs full ticket for reservation");
	}

}
}


class IfExample {  
public static void main(String[] args) {  
    //defining an 'age' variable  
    int age=20;  
    //checking the age  
    if(age>18){  
        System.out.print("Age is greater than 18");  
    }  
}  
}  


class IfElseExample {
	public static void main(String[] args) {
		int n=20;
		if(n>25){
			System.out.print("n is greater than 25");
		}
		else{
			System.out.print("n is smaller than 25");
		}
	}
}


class IfElseIf{
	public static void main(String[] args) {
		int marks = 65;
		if(marks<50){
			System.out.print("FAIL");
		}
		else if(marks>50 && marks <= 60){
			System.out.print("GRADE = E");
		}
		else if(marks>60 && marks <= 70){
			System.out.print("GRADE = D");
		}
		else if(marks>70 && marks <= 80){
			System.out.print("GRADE = C");
		}
		else if(marks>80 && marks <= 90){
			System.out.print("GRADE = B");
		}
		else{
			System.out.print("GRADE = A");
		}

	}
}


class IfNested{
	public static void main(String[] args) {
		int age = 23;
		int weight = 50;

		if(age>20){
			if(weight>=50){
				System.out.print("you can donate blood");
			}
		}
	}
}



