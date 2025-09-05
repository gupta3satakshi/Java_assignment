package Assignment7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProblems {

	public static void main(String[] args) {
		List<String> fruits = List.of("Mango","orange","Grape","apple","Banana","strawberry","Watermelon");
		
		System.out.println("--------------------list of fruits in Uppercase--------------------------");
		Stream<String> str = fruits.stream();
		List<String> upperFruits = str.map(String :: toUpperCase).collect(Collectors.toList());
		System.out.println(upperFruits);
		
		System.out.println("--------------------list of fruits in lowercase--------------------------");
		str = fruits.stream();
		List<String> lowerFruits = str.map(String :: toLowerCase).collect(Collectors.toList());
		System.out.println(lowerFruits);
		
		System.out.println("-------------------list of fruits less than \"n\" in ascending and descending order---------------------------");
		str = fruits.stream();
		//stream.filter(s)-> s.toLowerCase().charAt(0) <'n').forEach(System.out::println);
		List<String> lessThanN = str.filter(fruit->fruit.toLowerCase().compareTo("n")<0).sorted().collect(Collectors.toList());
		System.out.println(lessThanN);
		Collections.reverse(lessThanN);
		System.out.println(lessThanN);
		
		System.out.println("---------------------list of fruits with uppercase names-------------------------");
		str = fruits.stream();
		List<String> upperCaseList = str.filter((frt) -> Character.isUpperCase(frt.charAt(0))).collect(Collectors.toList());
		System.out.println(upperCaseList);
		
		System.out.println("---------------------list of fruits with uppercase names-------------------------");
		str = fruits.stream();
		List<String> filterByCharLength = str.filter(fruit -> fruit.length() <= 6).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		//str.filter(fruit -> fruit.length() <= 6).sorted(Collections.reverseOrder()).forEach(System.out :: println);
		System.out.println(filterByCharLength);
		
		System.out.println("--------------------Sort the fruits length-wise--------------------------");
		str = fruits.stream();
		str.sorted(Comparator.comparing(String:: length)).forEach(System.out :: println);
		//
		//str = fruits.stream();
		//Comparator<String> cmp =Comparator.comparingInt(String::length).thenComparing(string.CASE_INSENSITIVE_ORDER);
		//stream.sorted(cmp).forEach(Sytem.out::println);
	}

}
