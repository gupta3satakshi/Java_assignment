package Assignment2;


public class Student {
	private int rollNo;
	private String name;
	private double [] marks;
		
	public Student(int rollNo,String name, double[] marks){
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public double calculateAverage() {
		double sum=0;
		for(double m: marks) {
			sum += m;
		}
		return(sum/marks.length);
	}
	public double calculatePercentage() {
		double sum=0;
		for (double m:marks) {
			sum+=m;
		}
		double total = marks.length*100;
		return ((sum*100)/total);
	}
	public void studentDisplayinfo() {
		System.out.println("Enter Name: "+name);
		System.out.println("Rollno: "+rollNo);
		System.out.println("Average: " +calculateAverage());
		System.out.println("Percentage"+calculatePercentage()+"%");
	}
	

	}


