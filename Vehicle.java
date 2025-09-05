package Assignment3;

public abstract class Vehicle {

	String reg_no;
	String company_name;
	String model;
	double price;
	
	public Vehicle(String reg_no, String company_name, String model, double price) {
		this.reg_no=reg_no;
		this.company_name=company_name;
		this.model=model;
		this.price=price;
						
	}
	public abstract void calculateInsurance();
	
}
