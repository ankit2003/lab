abstract class vehicle
{
	String fuel;
	public vehicle(String fuel)
	{
		this.fuel=fuel;
	}
	public void fuelstatus(String vehicle)
	{
		System.out.println("The fuel status of "+vehicle+"is"+fuel);
	}
	abstract void topspeed();

}
class bike extends vehicle
{
	int speed;
	public bike(String fuel,int topspeed)
	{
		super(fuel);
		speed=topspeed;
	}
	void topspeed()
	{
			System.out.println("The topspeed of bike is "+speed+"km/hr");
	}
}

class car extends vehicle
{
	int speed;
	public car(String fuel,int topspeed)
	{
		super(fuel);
		speed=topspeed;
	}
	void topspeed()
	{
			System.out.println("The topspeed of car is "+speed+"km/hr");
	}
}
class prg2
{
		public static void main(String args[])
		{
			bike b1=new bike("Empty",16);
			b1.fuelstatus("Bike");
			b1.topspeed();
			car c1=new car("Full",12);
			c1.fuelstatus("Car");
			c1.topspeed();
		}
}