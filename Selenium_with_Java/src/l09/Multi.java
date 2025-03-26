package l09;

public class Multi {

	public static void main(String[] args) 
	{
		
			int a[]= {26,58,89,56,45,59,8,56,78,32,45};
			int b=a.length;
			int c=0;
			
			for(int x=0;x<a.length;x++) 
			{
				c+=a[x];
			}
			
			int average=c/b;
			System.out.println("Average is:"+average);
//			System.out.println("github");

		

	}

}
