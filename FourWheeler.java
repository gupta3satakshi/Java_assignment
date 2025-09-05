package Assignment3;

public class FourWheeler extends Vehicle {
	double insurance;
	public FourWheeler(String reg_no, String company_name, String model, double price) {
		super(reg_no, company_name, model, price);
	
	}
	@Override
	public void calculateInsurance() {
		
		insurance=this.price*0.1;
		System.out.println("Insurance price of four wheeler is: " +insurance);
		
		
	}
	public void displayDetails(){
		System.out.println("Insurance Details:\nRegistration no. : " +reg_no+ ", Company name: " +company_name+ ", Model: " +model+ ", Price: " +price );
		System.out.println("Insurance price of four wheeler is: " +insurance);
		
	}
	

	

}
