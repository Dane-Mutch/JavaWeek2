package src;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class LibraryDatabase implements LibraryChangable {
	
	ArrayList<Item> itemDatabase = new ArrayList<Item>();
	ArrayList<Item> thingsToCheckOut = new ArrayList<Item>();
	HashMap<Person, ArrayList<Item>> checkingSystem = new HashMap<Person, ArrayList<Item>>();


	@Override
	public void checkIn(ArrayList<Person> memberList, ArrayList<Item> itemInventory) {
		
	}

	@Override
	public void checkOut(ArrayList<Person> memberList, ArrayList<Item> itemInventory) {
		Boolean addAnother = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which member is checking out an item?");
		String memberName = sc.next();
			for (Person i : memberList) {
				if (memberName.equals(i.getName())) { 
					System.out.println("Which item would you like to check out?");
					String itemCheckOut = sc.next();
					while (addAnother = true) {
					for (Item j : itemInventory) { 
						if (itemCheckOut.equals(j.name)) {
							thingsToCheckOut.add(j);
							System.out.println("Would you like to check out another item? (Y/N");
							String anotherItem = sc.next();		
							if (anotherItem.equals("Y")) || anotherItem.equals("N") {
					checkingSystem.put(i, thingsToCheckOut);
							}
						
						}
							
						}
					
				if (!memberList.contains(memberName)) {
					System.out.println("User not found");
				}
				}
				
			}
		
		
	}

	@Override
	public void removeItem(Item item) {
		
		
	}
	
	@Override
	public void addItem(Item item) {
		
		
	}
	
	@Override
	public void currentlyCheckedOutItems(HashMap<Person, ArrayList<Item>> checkingSystem) {


	}
}


