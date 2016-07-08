# power2
import java.util.Scanner;
class number
{
	public static void main (String[] args){ 
	 	System.out.println("Enter number");
	  Scanner in =new Scanner(System.in);
	  Integer number;
	  number=in.nextInt();
	  if(Integer.bitCount(number)==1)
	  {
	  	System.out.println("Power of 2");
	  }
	  else
	  {
	  	System.out.println("Not a Power of 2");
	  }
	}
}
