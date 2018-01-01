class Exceptionhandler{
	public static void main(String args[]){

	int d=0;
	try{
	int result=27/d;
	System.out.println(result);
	}
       catch(ArithmeticException e){
	System.out.println("Opps!");

	}

 System.out.println("Done");
	
	}

}
