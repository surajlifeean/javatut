class Cylinder extends Circle{
	double height;
	Cylinder(double radius, double height){

	super(radius);
	this.height=height;

	}
	// double getarea(){

	// 	return 25;
	// } this lines of codes are illegal. since getarea() is final and will lead to error :overridden method is final
 
	public double getcylinderarea(){


	return getarea()*height*radius/3;


	}
	




}
