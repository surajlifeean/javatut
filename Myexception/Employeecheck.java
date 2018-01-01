
//this is an example of user defined exception
// Question:  Create a user defined exception to check whether 
// your employee exist in your data structure
// (use any data structure to store the employees - like array, ArrayList etc.) 
// and throw exception if name is not in the employees list.
// Use the catch and finally block to make an appropriate) 

class Employeecheck{


    public int Check(String n[],String find)throws Exception{
    	int flag=0;
    	for(int i=0;i<n.length;i++){
    		if(find.equals(n[i]))
    			flag=i;
    	}

    	if(flag==0)
    		throw new Exception("No records found");
    	else
    		return flag;

    }
	public static void main(String args[]){


		String name[]={"Suraj","sweety","ranjit","anand"};
		String find=args[0];

		Employeecheck obj=new Employeecheck();
		try{
		int i=obj.Check(name,find);
		System.out.println(i);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}


	}

}