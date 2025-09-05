package Assignment10;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Tester {

	public static void main(String[] args) {
				
		try(Scanner sc = new Scanner (System.in)){
			
			for(Course c: Course.values()) {
				System.out.println(c.getDescription());
		}
		List<Student> students = new ArrayList<>();
		} catch(Exception e) {
			 e.printStackTrace();
		}
		
//		students.add(new Student("1000", "Mg Mg",20 , "DAI", LocalDate.of(2025, 8, 21),6.0,"Pune"));
//		students.add(new Student("1001", "Aye Aye",24 , "DAC", LocalDate.of(2025, 8, 22),6.0,"Pune"));
//		students.add(new Student("1002", "Aye Aye",24 , "DAC", LocalDate.of(2025, 8, 22),5.0,"New Dehli"));
//		students.add(new Student("1003", "Ajay",24 , "DBDA", LocalDate.of(2025, 4, 22),6.0,"Mumbi"));
//		students.add(new Student("1004", "Amem",24 , "DAC", LocalDate.of(2025, 8, 27),6.0,"Pune"));
//		
	}

}
