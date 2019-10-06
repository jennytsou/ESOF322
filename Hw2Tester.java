package hw02;

// YuehChen Tsou and John Singleton
// ESOF 322 - Software Engineering
// HW2 due R 9/19/2019 by 12:15 PM
import java.io.*;

public class Hw2Tester {
		

	public static void main(String[] args) throws IOException{
	
		SoftwareSystem db;
		
		System.out.println("The customer, Keanu, wants to store the names of albums that he would "
				+ "like to listen to in the future.");
		System.out.println("\nKeanu decides to try out the Relational software first.");
		TableStore ts = new TableStore();
		db = new SoftwareSystem(ts);
		System.out.println("\nKeanu: \"Store The Beatles - The White Album.\"");
		db.store("The Beatles - The White Album");
		
		System.out.println("\nKeanu: \"Store Nirvana - In Utero.\"");
		db.store("Nirvana - In Utero");

		System.out.println("\nKeanu decides to try out the NoSQL software second.");
		DocumentStore ds = new DocumentStore();
		db.setStoreStrategy(ds);
		System.out.println("\nKeanu: \"Store Def Leppard - Hysteria.\"");
		db.store("Def Leppard - Hysteria");
		
		System.out.println("\nKeanu decides to try out the Graph software third.");
		NodeStore ns = new NodeStore();
		db.setStoreStrategy(ns);
		System.out.println("\nKeanu: \"Store Aphex Twin - Syro.\"");
		db.store("Aphex Twin - Syro");

		System.out.println("\nKeanu decides to go back to the Relational software fourth.");
		db.setStoreStrategy(ts);
		System.out.println("\nKeanu: \"Store Alicia Keys - Songs In A Minor.\"");
		db.store("Alicia Keys - Songs In A Minor");
	}

}
