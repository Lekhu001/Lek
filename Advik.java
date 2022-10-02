package Interface;

import java.util.Scanner;

public class Advik implements client {
String name;
double sal;
public void Input()
{
	Scanner r=new Scanner(System.in);
	System.out.println("Enter Username: ");
	name=r.nextLine();
	
	System.out.println("Enter Salary: ");
	sal=r.nextDouble();
}
public void Output()
{
	System.out.println(name+" "+sal);
}
}
