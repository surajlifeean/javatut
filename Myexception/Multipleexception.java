class Multipleexception{

	public static void main(String args[]){
try{
	String fname=args[0];

	System.out.println(fname);

}

catch(ArrayIndexOutOfBoundsException e){ //specific exception


 System.out.println("Array Index Out Of Bound");
}

catch(Exception e){  //generic exception

 System.out.println("Exception");

	}
finally{

	System.out.println("Finally is executed");

}

	}



}
