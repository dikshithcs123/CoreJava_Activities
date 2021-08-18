package act5.ltts;
import act5.ltts.*;

import java.util.Scanner;

public class calculate_runrate 
{
	public static void main(String[] args) 
	{
		 try {
			 
			 Scanner sc= new Scanner(System.in);
			 
			 System.out.println("Enter the total runs scored ");
			int score =sc.nextInt();
			 
			 System.out.println("Enter the total overs faced ");
			 int over=sc.nextInt();
		     
		      float runRate= score/over ;
		      System.out.println("Current Run Rate : "+runRate);
		      sc.close();
		    }
		    
		    catch (Exception e) 
		    {
		      System.out.println(e);
		    }
		 
	}
}
