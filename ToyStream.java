package Assignment8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Assignment6.Toy;
import Assignment7.Predicate;

	public class ToyStream {
		public static List<Toy> createToyLists(){
			List<Toy> stock = new ArrayList<>();
			stock.add(new Toy(001, "Larbubu", 50, "Educational", 10, 2020,8));
			stock.add(new Toy(002, "Stitch", 200, "Battery Operated", 20, 2020,5));
			stock.add(new Toy(003, "Larbubu", 100, "Machine Operated", 10, 2020,6));
			stock.add(new Toy(004, "Abcd", 600, "Machine Operated", 10, 2022,8));
			stock.add(new Toy(005, "Pooh", 500, "Battery Operated", 10, 2023,4));
			stock.add(new Toy(006, "Robot", 100, "Machine", 30, 2026,8));
			
			return stock;
		
		}
	public static void main(String[] args) {
		List<Toy> toys = createToyLists();
		Stream<Toy> stream = toys.stream();
		System.out.println("_____________List the Stock_______________");
		System.out.println(toys);
		System.out.println("_____________Filter By Category_______________");
		//Predicate<Toy> byCategory =(t) -> t.getCategory().contains("Machine Operated")
		stream.filter((t) -> t.getCategory().contains("Machine Operated")).forEach(System.out::println);
		
		System.out.println("_____________Filter By Price_______________");
		stream = toys.stream();
		stream.filter((t) -> t.getPrice() >= 500 && t.getPrice() <=1000 ).forEach(System.out::println);
		
		System.out.println("_____________Sort the toys by price- category wise_______________");
		stream = toys.stream();
		Comparator<Toy> byPriceCategory= Comparator.comparing(Toy :: getPrice).thenComparing (Comparator.comparing(Toy::getCategory));
		stream.sorted(byPriceCategory).forEach(System.out::println);
		
		System.out.println("_____________ Make the list of old stock [older than 1 year]_______________");
		stream = toys.stream();
		//stream.filter((t) -> t.isOlderThanOneYear() ).forEach(System.out::println);
		
		System.out.println("_____________ Make a group of toys as per their category_______________");
		stream = toys.stream();
		stream.collect(Collectors.groupingBy(Toy::getCategory, Collectors.counting())).forEach((k,v)-> System.out.println(k +"==" +v));
		//groupbycategory.forEach((k,v)-> System.out.println(k +"==" +v));
		
		System.out.println("_____________Display the most expensive/least expensive toy_______________");
		stream = toys.stream();
		Optional<Toy> min = stream.min(byPriceCategory);
		if (min.isPresent())
			System.out.println(min.get());
		stream = toys.stream();
		Optional<Toy> max = stream.max(byPriceCategory);
		if (max.isPresent())
			System.out.println(max.get());
		
		System.out.println("_____________Print total no of toys in stock for each age grp_______________");
		stream = toys.stream();
		stream.collect(Collectors.groupingBy(Toy::getAge, Collectors.counting())).forEach((k,v)-> System.out.println(k +"==" +v));
	}
		
		
		
		
		
	

}
