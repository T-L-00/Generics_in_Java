package com.example.genericDemo;

import com.example.boundedGenerics.lower.*;
import com.example.boundedGenerics.upper.SportPlayer;
import com.example.boundedGenerics.upper.SportsTeam;
import com.example.genericMethod.OnlineStore;
import com.example.genericMethod.Product;
import com.example.multipleGenerics.Customer;
import com.example.multipleGenerics.DailyAgenda;
import com.example.multipleGenerics.OnlineOrder;
import com.example.multipleGenerics.SynonymsAssociation;
import com.example.wildcard.ProductListSorter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootApplication
public class GenericDemoApplication {

	public static void main(String[] args) {

		// Generics type for method
		List<Product> products = Arrays.asList(
			new Product("Laptop", 1200.0),
			new Product("Phone", 800.0),
			new Product("Headphones", 100.0),
			new Product("Monitor", 350.0)
		);

		Product mostExpensive = OnlineStore.findMostExpensiveItem(products);
		log.info("Most Expensive Item: " + mostExpensive.getName() + " - Price: " + mostExpensive.getPrice());

		Product cheapest = OnlineStore.findCheapestItem(products);
		log.info("Cheapest Item: " + cheapest.getName() + " - Price: " + cheapest.getPrice());

		// Upper bounded generics
		List<SportPlayer> players = new ArrayList<>();
		players.add(new SportPlayer("John", 8));
		players.add(new SportPlayer("Alice", 6));
		players.add(new SportPlayer("Mike", 9));
		SportsTeam<SportPlayer> sportsTeam = new SportsTeam<>(players);
		double averageRank = sportsTeam.calculateAverageRank();
		log.info("Average rank: " + averageRank);

		// Lower bounded example
		List<Animal> animals = Arrays.asList(new Dog("Buddy", 4), new Cat("Mittens", 4), new Bird("Robin", 2));
		Animal animalWithMostLegs = AnimalSearcher.findAnimalWithMostLegs(animals);
		log.info("Animal with most legs: " + animalWithMostLegs);

		// DailyAgenda - Multiple generics with one parameter
		List<String> highPriorityTasks = Arrays.asList("Prepare presentation", "Attend meeting");
		List<String> lowPriorityTasks = Arrays.asList("Reply to emails", "Take a break");
		DailyAgenda<String> dailyAgenda = new DailyAgenda<>(highPriorityTasks, lowPriorityTasks);
		List<String> highPriority = dailyAgenda.getHighPriorityTasks();
		List<String> lowPriority = dailyAgenda.getLowPriorityTasks();

		log.info("High Priority Tasks: " + highPriority);
		log.info("Low Priority Tasks: " + lowPriority);

		// SynonymsAssociation - Multiple generics with 2 and 3 parameters
		SynonymsAssociation<String, String> happySynonyms = new SynonymsAssociation<>("happy",
				Arrays.asList("joyful", "content"));
		SynonymsAssociation<String, String> sadSynonyms = new SynonymsAssociation<>("sad",
				Arrays.asList("unhappy", "miserable"));
		log.info("Synonyms for happy: " + happySynonyms.getSynonyms());
		log.info("Synonyms for sad: " + sadSynonyms.getSynonyms());

		Customer customer = new Customer("John Doe", "john.doe@example.com");
		List<Product> orderedItems = Arrays.asList(new Product("Laptop", 1200.0),
			new Product("Headphones", 100.0));
		Double orderTotal = 1300.0;
		OnlineOrder<Customer, Product, Double> onlineOrder = new OnlineOrder<>(customer, orderedItems, orderTotal);

		log.info("Customer: " + onlineOrder.getCustomer());
		log.info("Ordered Items: " + onlineOrder.getOrderedItems());
		log.info("Order Total: " + onlineOrder.getOrderTotal());

		//wildcards example
		ProductListSorter.sortProductsByPrice(products);

		for (Product product : products) {
			log.info(String.valueOf(product));
		}
	}
}

