package l03;

public class Instance_variable //Instance_variable is name given to class and its object to the class.
{
//  data type(int) variable name(a)=variable value(10)	
	
	//non-static.
     int a=10;
     int b=24;
     int c=a+b;

	public static void main(String[] args) 
	{
		System.out.println("Sum of total is:"+new Instance_variable().c );
	}
// To access non static method we create an object(instance_variable) to the class
}
//it is also knows as global variable.