class Throwscheck{

	public float divide(int dividend, int divisor)throws ArithmeticException{

		if(divisor==0){
			throw new ArithmeticException("Can not divide by 0");
		}
		return dividend/divisor;


	}
	public static void main(String args[]){

		Throwscheck obj=new Throwscheck();
		try{
		obj.divide(10,0);
	}
	catch(ArithmeticException e){
		e.printStackTrace();
		}

	}




}
