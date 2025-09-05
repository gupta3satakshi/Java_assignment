package Assignment3;

public class InsuranceDetail {

	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler("Qws 001", " Toyota", "Belta", 500000);
		FourWheeler fw = new FourWheeler("Qws 002", " Suzuki", "Ciaz", 700000);
		tw.calculateInsurance();
		tw.displayDetails();
		fw.calculateInsurance();
		fw.displayDetails();
		
	}

}
