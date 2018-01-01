class Main implements I1, I2{

	public void check(int i){


	System.out.println(i);


	}
	public void check(String i){



	System.out.println(i);

	}

	public static void main(String args[]){

	Main obj = new Main();
	obj.check(5);
	obj.check("Suraj");
	
	}



}
