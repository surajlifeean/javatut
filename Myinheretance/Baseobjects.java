//this is to show that base class objects are created before dervide clas objects
class Animal{

	Animal(){
		System.out.println("I m just an Animal");
	}

}
class Cat extends Animal{
	Cat(){
	System.out.println("I m a cat");
	}
}
class Tiger extends Cat{
	Tiger(){
	System.out.println("I am a tiger");
	}
}
class Baseobjects{
	public static void main(String args[]){
		System.out.println("lets create Tiger object");
		Tiger tiger=new Tiger();
		System.out.println("lets create cat object");
		Cat cat=new Cat();
		System.out.println("lets create animal object");
		Animal animal=new Animal();
	}

}
