
public class Pattern1
{

	public static void main(String[] args) 
	{	   
		int n = 25;
		for(int i = 0; i < n; i++)
		 {
			for(int j = 0; j < n; j++)
		     {
			  if(j -i >=(n-1)/2 || i + j <= (n-1)/2 || j == 0 || j == n-1 || i == 0 || i == n-1)
			  {
				 System.out.print("*");
			  }
			  else
			  {
				 System.out.print(" ");
			  }
			 } 
		  
		 System.out.println();
	    } 
	}
}





 	
	

