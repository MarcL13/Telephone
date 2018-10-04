import java.util.Scanner;

/**
 * 
 * 
 * @author Marc Lussier, Period 7
 *
 */

public class TelephoneMain
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String firstName= in.next();
		in.nextLine();
		System.out.print("Please enter your last name: ");
		String lastName = in.next();
		in.nextLine();
		String name = firstName + lastName;
		System.out.print("Please enter your phone number: ");
		String numberFull = in.next();
		in.nextLine();
		String sub1 = numberFull.substring(0,3);
		String sub2 = numberFull.substring(3,6);
		String sub3 = numberFull.substring(6,10);
		String number = "(" + sub1 + ")" + "" + sub2 + "-" + sub3;
		System.out.printf("%-20s" + number,name );
		
			
		
		
		
		
		
		

	}

}
