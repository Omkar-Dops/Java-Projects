import java.util.Scanner;
class VotingMachine
{
	static int bjp,congress,aap,mns,sena,nota;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(": *****VOTING MACHINE*** :");
		System.out.println(":enter the no of voters :");
		int voters=sc.nextInt();
		for(int i=1;i<=voters;i++)
		{
			System.out.println();
			System.out.println("1.BJP 2.CONGRESS 3.AAP 4.MNS 5.SHIVSENA 6.NOTA :");
			System.out.print("enter the option :");
			int option=sc.nextInt();
			System.out.println(" ");
		
		switch(option)
		{
			case 1:bjp++;System.out.println("sabka sath sabka vikas");break;
			case 2:congress++;System.out.println("bharat chodo");break;
			case 3:aap++;System.out.println("apka ek vote hame azad kar sakta hai");break;
			case 4:mns++;System.out.println("jai maharashtra");break;
			case 5:sena++;System.out.println("asli sena");break;
			case 6:nota++;System.out.println("you are educated");break;
			default:System.out.println("wrong option entered");i--;
		}
		if(bjp>congress && bjp>aap && bjp>mns && bjp>sena && bjp>nota)
			{
			System.out.println("bjp has won the election by"+bjp+"votes");
			}
		else if(congress>bjp && congress>mns && congress>aap && congress>sena && congress>nota)
			{
			System.out.println("congress has won the election by"+congress+"votes");
			}
		else if(aap>bjp && aap>congress && aap>mns && aap>sena && aap>nota)
			{
			System.out.println("aap has won the election by"+aap+"votes");
			}
		else if(mns>bjp && mns>congress && mns>aap && mns>sena && mns>nota)
			{
			System.out.println("mns has won the election by"+mns+"votes");
			}
		else if(sena>bjp && sena>congress && sena>aap && sena>aap && sena>nota)
			{
			System.out.println("sena has won the election by"+sena+"votes");
			}
		else
			System.out.println("nota with"+nota+"votes");
	}
	}
}
		
