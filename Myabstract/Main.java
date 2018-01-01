
class Main{
	public static void main(String args[]){

		//Vehical vehical=new Vehical(); would have given an error since objects of abstract class is not possible.
		
		Vehical car = new Car();
		car.start();
		Vehical bike = new Bike();
		bike.start();



	}

}
