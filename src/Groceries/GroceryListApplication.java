package Groceries;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//public class GroceryListApplication {
//    static final String[] CATEGORIES = {"Dairy", "Bakery", "Produce", "Meat", "Seafood", "Deli", "Canned Goods", "Frozen Foods", "Beverages", "Other"};
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Would you like to create a grocery list? (y/n): ");
//        String input = scanner.nextLine();
//        if (!input.equalsIgnoreCase("y")) {
//            return;
//        }
//
//        Map<String, List<GroceryItem>> groceryList = new HashMap<>();
//        for (String category : CATEGORIES) {
//            groceryList.put(category, new ArrayList<>());
//        }
//
//        boolean addingItems = true;
//        while (addingItems) {
//            System.out.print("Would you like to add an item? (y/n): ");
//            input = scanner.nextLine();
//            if (!input.equalsIgnoreCase("y")) {
//                addingItems = false;
//            } else {
//                System.out.println("Select a category:");
//                for (int i = 0; i < CATEGORIES.length; i++) {
//                    System.out.println((i + 1) + ". " + CATEGORIES[i]);
//                }
//                System.out.print("Enter a number: ");
//                int categoryIndex = scanner.nextInt() - 1;
//                scanner.nextLine(); // consume newline character
//
//                System.out.print("Enter the name of the item: ");
//                String name = scanner.nextLine();
//
//                System.out.print("Enter the quantity: ");
//                int quantity = scanner.nextInt();
//                scanner.nextLine(); // consume newline character
//
//                GroceryItem item = new GroceryItem(name, quantity);
//                groceryList.get(CATEGORIES[categoryIndex]).add(item);
//            }
//        }
//
//        // sort each category list alphabetically
//        for (List<GroceryItem> categoryList : groceryList.values()) {
//            Collections.sort(categoryList);
//        }
//
//        boolean filtering = true;
//        while (filtering) {
//            System.out.println("Grocery List: ");
//            for (Map.Entry<String, List<GroceryItem>> entry : groceryList.entrySet()) {
//                String category = entry.getKey();
//                List<GroceryItem> items = entry.getValue();
//                if (!items.isEmpty()) {
//                    System.out.println(category + ": ");
//                    for (GroceryItem item : items) {
//                        System.out.println("  " + item.getQuantity() + " x " + item.getName());
//                    }
//                }
//            }
//        }
//

