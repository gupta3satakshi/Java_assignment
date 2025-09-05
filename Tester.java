package Assignment6;

import java.util.List;
import java.util.Map;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("-----------------------List the Stock---------------------------");
		List<Toy> stock = Store.createToyLists();
		Store.printList(stock);
		
		System.out.println("-----------------------fiterByCategory---------------------------");
		
		List<Toy> bycategory = Store.filterByCategory(stock, "Machine Operated");
		Store.printList(bycategory);
		
		System.out.println("-----------------------binarySearchByProductId---------------------------");
		
		Toy index = Store.binarySearchByProductId(stock, 2);
		System.out.println(index);
		
		System.out.println("-----------------------fiterByPriceRange---------------------------");
		List<Toy> byprice = Store.filterByPriceRange(stock, 300, 1000);
		Store.printList(byprice);
		
		System.out.println("-----------------------fiterByAge---------------------------");
		List<Toy> byage = Store.filterByAge(stock, 10);
		Store.printList(byage);
		
		System.out.println("-----------------------Sort by Price---------------------------");
		List<Toy> sortedByPrice = Store.sortByPrice(stock);
		Store.printList(sortedByPrice);

		System.out.println("-----------------------Sort by Name---------------------------");
		List<Toy> sortedByName = Store.sortByName(stock);
		Store.printList(sortedByName);

		System.out.println("-----------------------Sort by Product ID---------------------------");
		List<Toy> sortedByProdId = Store.sortByProdid(stock);
		Store.printList(sortedByProdId);
		
		System.out.println("-----------------------oldStockList---------------------------");
		List<Toy> oldstocklist = Store.listOldStock(stock);
		Store.printList(oldstocklist);
		
		System.out.println("-----------------------groupedby---------------------------");
		Map<String, List<Toy>> groupedByList = Store.groupByCategory(stock);
		Store.printGroupedList(groupedByList);

}
}
