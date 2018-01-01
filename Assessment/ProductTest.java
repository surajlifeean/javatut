class Product{
	int productid;
	String productName="Ghee";
	String productType;
	float productPrice;
	public void displayProductDetails(){
		
	System.out.println(productName);
	}
}
class ProductTest{

	public static void main(String args[]){

	Product obj=new Product();
        obj.displayProductDetails();

	}


}





