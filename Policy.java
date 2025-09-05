package Assignment4;

import Assignment3.FourWheeler;
import Assignment3.TwoWheeler;
import Assignment3.Vehicle;

public class Policy {
	public void displayPolicy(Vehicle v) {
		v.calculateInsurance();
	}
	public static void main(String[] args) {
		TwoWheeler t1 = new TwoWheeler("Qws 001", " Toyota", "Belta", 500000);
		FourWheeler f1= new FourWheeler("Qws 002", " Suzuki", "Ciaz", 700000);
		Policy p = new Policy();
		p.displayPolicy(t1);
		p.displayPolicy(f1);
	}
}
;