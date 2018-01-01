// creation of objects and calling member function

class Car{

	int speed;
	int gear;

		void increasegear(){
		  if(gear<=3)
			  gear++;

		}
		void decreasegear(){
		if(gear!=0)
			gear--;
		}

		void increasespeed(){
		if(speed<=120)
			speed+=10;

		}
		void decreasespeed(){
		if(speed!=0)
			speed-=10;
		}
		void showspeed(){
		System.out.println(speed);
		}
		void showgear(){
		System.out.println(gear);
		}

}
public class Testtwo{
	public static void main(String args[]){
		
		Car car1=new Car();  // creating object of car classin Testtwo class
		car1.showspeed();
		car1.increasespeed();
		car1.increasegear();
		car1.showgear();
		car1.showspeed();



	}

}
