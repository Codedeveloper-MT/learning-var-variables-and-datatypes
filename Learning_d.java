//calculate the age of a person
import java.util.Scanner;

public class Learning_d
{
	public static void main(String[]args)
	{
		/*variables*/
		int iCurentYear,iYearBorn,iYear;
		
		Scanner input=new Scanner(System.in);

		//get current year
		System.out.println("enter the current year:");
		iCurentYear=input.nextInt();
		
		//get year a person was born in
		System.out.println("enter ther year u were born in: ");
		iYearBorn=input.nextInt();
		
		//do calculations
		iYear=iCurentYear-iYearBorn;
		//display output
		System.out.println("you are:\t"+iYear+"years old");
		
		
		
	}
}