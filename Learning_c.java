//display name with age

import java.util.Scanner;

public class Learning_c{
	public static void main(String[]args){
Scanner input=new Scanner(System.in);

//variables
String sName;
int iAge;

System.out.println("What is your name?");
sName=input.nextLine();
System.out.println("how old are you?");
iAge=input.nextInt();

System.out.println("Your details is:"+sName+" "+"you are"+iAge+" "+"years old");

	
	
	} 
}