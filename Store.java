package Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
//	List<Toy> stock = new ArrayList<>();
	public static List<Toy> createToyLists(){
		List<Toy> stock = new ArrayList<>();
		stock.add(new Toy(001, "Larbubu", 100, "Educational", 10, 2020,8));
		stock.add(new Toy(002, "Stitch", 200, "Battery Operated", 20, 2020,5));
		stock.add(new Toy(003, "Larbubu", 100, "Machine Operated", 10, 2020,6));
		stock.add(new Toy(004, "Abcd", 100, "Machine Operated", 10, 2022,8));
		stock.add(new Toy(005, "Pooh", 500, "Battery Operated", 10, 2023,4));
		stock.add(new Toy(006, "Robot", 100, "Machine Operated", 30, 2026,8));
		
		return stock;
	
}
	public static void addToy(List<Toy> stock, Toy toy) {
		stock.add(toy);
	}
	public static void printList(List<Toy> stock) {
		for(Toy toy: stock) {
			System.out.println(toy);
		}
	}
	public static void printGroupedList(Map<String, List<Toy>> groupedByList) {
	    for (Map.Entry<String, List<Toy>> entry : groupedByList.entrySet()) {
	        System.out.println("--- Category: " + entry.getKey() + " ---");
	        for (Toy toy : entry.getValue()) {
	            System.out.println(toy);
	        }
	    }
	}
	
	public static List<Toy> filterByCategory(List<Toy> stock, String category){
		List<Toy> bycategory = new ArrayList<>();
		for(Toy toy : stock) {
			if(toy.getCategory().equalsIgnoreCase(category)) {
				bycategory.add(toy);
			}
		}
		return bycategory;
	}
	
//	public static Toy searchByProductId(List<Toy> stock, int prod_id) {
//
//		for (Toy toy : stock) {
//			if(toy.getProd_id() == prod_id);
//			return toy;
//		}
//		return null;
//	}
	
	public static Toy binarySearchByProductId(List<Toy> stock, int prodId) {
		List<Toy> sortedStock = new ArrayList<>(stock);
		Collections.sort(sortedStock, new ProdIdComparator());
		Toy searchKey = new Toy (prodId,null,0,null,0,0,0);
		int index = Collections.binarySearch(stock,searchKey, new ProdIdComparator());
		
		if (index >=0)
			return stock.get(index);
		else 
			return null;
	}
		
	
	public static List<Toy> filterByPriceRange (List<Toy> stock, double minPrice, double maxPrice){
		List<Toy> filteredList = new ArrayList<>();
		for (Toy toy : stock) {
			if(toy.getPrice() >= minPrice && toy.getPrice() <= maxPrice) {
				filteredList.add(toy);
			}
		}return filteredList;
		
	}
	
	public static List<Toy> filterByAge(List<Toy> stock, int age){
		List<Toy> filteredList = new ArrayList<>();
		for (Toy toy : stock) {
			if(toy.getAge() == age) {
				filteredList.add(toy);
			}
		}return filteredList;
	}
//	public static List<Toy> sortToyList(List<Toy> stock, double price, String name, int prod_id){
//		List<Toy> sortedToyList = new ArrayList<>();
//			for (Toy toy : stock) {
//			if(toy.compare(toy, toy)) {
//				filteredList.add(toy);
//			}
//		}return filteredList;
//}
	public static List<Toy> sortByPrice(List<Toy> stock){
		List<Toy> sortedByPriceList = new ArrayList<>();
		sortedByPriceList.sort(Comparator.comparingDouble(Toy::getPrice));
		
		return sortedByPriceList;
		
	}
	public static List<Toy> sortByName(List<Toy> stock){
		List<Toy> sortedByNameList = new ArrayList<>(stock);
		sortedByNameList.sort(new NameComparator());
		return sortedByNameList;
		
		
	}
	public static List<Toy> sortByProdid(List<Toy> stock){
		List<Toy> sortedByProdidList = new ArrayList<>(stock);
		sortedByProdidList.sort(new ProdIdComparator());
		return sortedByProdidList;
		
		
	}
	public static List<Toy> listOldStock(List<Toy> stock){
		List<Toy> oldStockList = new ArrayList<>();
		int currentYear = 2025;
		int currentMonth = 8;
		for (Toy toy : stock) {
			if(toy.isOlderThanOneYear(currentYear,currentMonth)) {
			oldStockList.add(toy);
		}
	}return oldStockList;
				
	}
	
	public static Map<String,List<Toy>> groupByCategory(List<Toy> stock){
		Map<String, List<Toy>> groupedToys = new HashMap<>();
		for(Toy toy: stock) {
			String category = toy.getCategory();
			if(!groupedToys.containsKey(category)) {
				groupedToys.put(category, new ArrayList<>());
			}
				groupedToys.get(category).add(toy);
			}
		return groupedToys;
	}
	
}
