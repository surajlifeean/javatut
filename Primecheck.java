class Primecheck{
		public static void main(String args[]){

		int arr[]={97,59,79,87,89};

		for(int i=0;i<arr.length;i++)
		{


			for(int j=3;j<arr[i];j++){
				if(arr[i]%j==0){

					arr[i]=0;
				        break;
				}
			
		
		}	
		

		}

		for(int i:arr){


		System.out.println(i);
		
		}
	



}
}
