import java.util.*;
class Bus
{
	static String[] seats=new String[30];
	static final double ticketprice=2000;
	static String date="29/10/2024  9:00pm";
	static String hault=" jail road near yerwada jail";
	static final String busNumber="MH12AR2876";
	static double totalcoll;
	static
	{
		Arrays.fill(seats,"AVAILABLE");
	}
	public void displaySeats()
	{
		for(int i=0;i<seats.length;i++)
		{
			System.out.println((i+1)+":-"+seats[i]+"  ");
		}
		System.out.println();
	}
	public void bookSeat(int seatNumber)
	{
		if(!(seatNumber<1&&seatNumber>30))
		{
			if(seats[seatNumber+1]=="AVAILABLE")
			{
				seats[seatNumber-1]="BOOKED";
				displaySeats();
				payment();
			}
			else
			{
				System.out.println("seat occupied");
			}
		}
		else
		{
			System.out.println("wrong seat number entered ");
		}
	}
	public void payment()
	{
		System.out.println("payment confirmed");
		System.out.println("booking details");
		System.out.println("bus Number :"+busNumber);
		System.out.println("Date and time "+date);
		System.out.println("HAULT :"+hault);
		Passenger copy=BookMyBusDriver.obj;
		System.out.println("passenger name :"+copy.getName());
		System.out.println("passenger gender :"+copy.getGender());
		System.out.println("passenger contact :"+copy.getContact());
		System.out.println("passenger boarding :"+copy.getBoarding());
		System.out.println("passenger destination :"+copy.getDest());
		System.out.println();
		System.out.println("HAPPY JOURNEY GOHOME AND HAPPY DIWALI :");
	}
}
class Passenger
{
	private String name;
	private String gender;
	private long contact;
	private String boarding;
	private String dest;
	Passenger(String name,String gender,long contact,String boarding,
		String dest)
	{
		this.name=name;
		this.gender=gender;
		this.contact=contact;
		this.boarding=boarding;
		this.dest=dest;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String newName)
	{
		this.name=newName;
	}
	public String getGender()
	{
		return this.gender;
	}
	public long getContact()
	{
		return this.contact;
	}
	public void setContact(long newCont)
	{
		this.contact=newCont;
	}
	public String getBoarding()
	{
		return this.boarding;
	}
	public void setBoarding(String newBoarding)
	{
		this.boarding=newBoarding;
	}
	public String getDest()
	{
		return this.dest;
	}
	public void setDest(String newDest)
	{
		this.dest=newDest;
	}
}
	

class BookMyBusDriver
{
	static Passenger obj;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to book my bus");
		for(; ;)
		{
			System.out.println("passenger name :");
			String name=sc.nextLine();
			System.out.println("gender :");
			String gender=sc.next();
			System.out.println("contact :");
			long contact=sc.nextLong();
			System.out.println("boarding point :");
			sc.nextLine();
			String boarding=sc.nextLine();
			System.out.println("destination:");
			String dest=sc.nextLine();
			
			
			obj=new Passenger(name,gender,contact,boarding,dest);
			
			Bus bus=new Bus();
			System.out.println();
			bus.displaySeats();
			System.out.println("enter the seat number :");
			int seatNumber=sc.nextInt();
			bus.bookSeat(seatNumber);
		}
	}
} 
