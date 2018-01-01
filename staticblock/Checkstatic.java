
class Checkstatic{
	static int age=22;
	static{
		System.out.println(age);
	}

	Checkstatic(){
	age++;
	System.out.println(age);
	}


}
