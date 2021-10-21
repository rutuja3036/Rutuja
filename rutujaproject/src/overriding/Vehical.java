package overriding;

public class Vehical {
	void run() 
	{
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehical {
	public static void main(String[] args)
	{
		Bike obj = new Bike();
		obj.run();
	}
}


	

