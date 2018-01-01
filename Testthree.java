//varargs is an important feature in java. In inputs are not pre defined we can tell the compiler that there could be 
//undefined set of inputs using <variable type>... <variable name> in the parameters.

class Testthree{
	static void print(String... args){

		for(String a:args){
		System.out.print(a+" ");
		}

	}
	public static void main(String args[]){
		String arr[]={"hello","suraj","how","are","you"};
		print(arr);
	}

}
