package package5;

public class bisinessLogic {
	int productId;
	String productName;
	double price;
	int quantity;
	
	public void setproductId(int Id) {
		productId = Id;
	}
	public void setproductName(String Name) {
		productName = Name;
	}
	public void setprice(double Price) {
		price = Price;
	}
	public void setquantity(int Quantity) {
		quantity = Quantity;
	}
	public int getproductId() {
		return productId;
	}
	public String getproductName() {
		return productName;
	}
	public double getprice() {
		return price;
	}
	public int getquantity() {
		return quantity;
	}
	public String displayDetails() {
		return " Product Id :" + getproductId() + "Product Name :" + getproductName() + 
				"Price :"+getprice()+ "Quantity :"+ quantity;
	}

}
