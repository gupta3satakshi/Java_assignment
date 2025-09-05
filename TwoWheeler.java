package Assignment3;

public class TwoWheeler extends Vehicle {
	double insurance;
	public TwoWheeler(String reg_no, String company_name, String model, double price) {
		super(reg_no, company_name, model, price);
		
	}
	@Override
	public void calculateInsurance() {
		insurance=this.price*0.05;
		System.out.println("Insurance price of two wheeler is: " +insurance);
//		return insurance=this.price*0.05;
	}
	public void displayDetails(){
		System.out.println("Insurance Details:\nRegistration no. : " +reg_no+ ", Company name: " +company_name+ ", Model: " +model+ ", Price: " +price );
		System.out.println("Insurance price of two wheeler is: " +insurance);
		
	}
	
}
