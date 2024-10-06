import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Addittion();
		substraction();
		Division();
		multiplication();
	}
	public static void Addittion()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int num1=sc.nextInt();
		System.out.println("enter number2");
		int num2=sc.nextInt();
		int add=num1+num2;
		System.out.println(":the addition of :"+num1+":and:"+num2+":is:"+add);
		//return add;
	}
	public static void substraction()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int num1=sc.nextInt();
		System.out.println("enter number2");
		int num2=sc.nextInt();
		int sub=num1-num2;
		System.out.println(":the substraction of :"+num1+":and:"+num2+":is:"+sub);
		
	}
	public static void Division()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int num1=sc.nextInt();
		System.out.println("enter number2");
		int num2=sc.nextInt();
		int div=num1/num2;
		System.out.println(":the division of :"+num1+":and:"+num2+":is:"+div);
		
	}
	public static void multiplication()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number1");
		int num1=sc.nextInt();
		System.out.println("enter number2");
		int num2=sc.nextInt();
		int multi=num1*num2;
		System.out.println(":the multiplication of :"+num1+":and:"+num2+":is:"+multi);
		
	}
	
}