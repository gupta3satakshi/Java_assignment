package Assignment10;

public enum Course {
	DAI("Diploma in Aritificial Intelligence"),
	DAC ("Diploma in Advanced Computing"),
	DBDA ("Diploma in Big Data Analytic"),
	DASSD(" Diploma in Advanced Secure Software Development");
	private String description;


Course(String description) {
	this.description= description;
}


public String getDescription() {
	return description;
}


}
