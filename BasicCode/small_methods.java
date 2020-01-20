class SumOfNum{
	public static void main(String[] args){  
	int n = 10;
	int m = 20;
	int o = n+m;
	System.out.println(o);
	}
}

class Typecasting{  
public static void main(String[] args){  
float f=10.5f;  
//int a=f;//Compile time error  
int a=(int)f;  
System.out.println(f);  
System.out.println(a);  
}} 


class Widening{  
public static void main(String[] args){  
int a=10;  
float f=a;  
System.out.println(a);  
System.out.println(f);  
}}  


class Overflowing{  
public static void main(String[] args){  
//Overflow  
int a=130;  
byte b=(byte)a;  
System.out.println(a);  
System.out.println(b);  
}}


class AddingLowerType{  
public static void main(String[] args){  
byte a=10;  
byte b=10;  
//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
byte c=(byte)(a+b);  
System.out.println(c);  
}}