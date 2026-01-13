package com.fundamentals;
import java.util.*;
public class Restaurant {
    public static void main(String[] args) {
        System.out.println("Welcome to Akshar Restaurant");
        System.out.println("do you want to order 'Y' or 'N'?");
        Scanner sc=new Scanner(System.in);
        char choice=sc.next().charAt(0);

//
        HashMap<String,Integer> orderedItems=new HashMap<>();
        if (choice=='Y')
        {
            System.out.println("1.\t\t Snacks");
            System.out.println("2.\t\t Meal");
            System.out.println("3.\t\t Dinner");
            int option=sc.nextInt();
            sc.nextLine();  // Consume the newline left by nextInt()
            switch (option)
            {

                case 1: {
                    System.out.println("Snacks Items");
                    System.out.println("1.\t Idli_Sambhar");
                    System.out.println("2.\t Poha");
                    while (true) {
                        System.out.println("Enter Item and Quantity (or type 'exit' to finish): ");
                        String input = sc.nextLine();
                        if (input.equalsIgnoreCase("exit")) {
                            break;
                        }
                        String[] itemInp = input.split(" ");
                        if (itemInp.length != 2) {
                            System.out.println("Invalid input. Please enter in 'Item Quantity' format.");
                            continue;
                        }
                        String item = itemInp[0];
                        int quantity = Integer.parseInt(itemInp[1]);

                        // Add to orderedItems
                        orderedItems.put(item, orderedItems.getOrDefault(item, 0) + quantity);
                    }
                    break;
                }
                case 2:
                    System.out.println("Meal Items");
                    System.out.println("1. Punjabi_Thali");
                    while (true) {
                        System.out.println("Enter Item and Quantity (or type 'exit' to finish): ");
                        String input = sc.nextLine();
                        if (input.equalsIgnoreCase("exit")) {
                            break;
                        }
                        String[] itemInp = input.split(" ");
                        if (itemInp.length != 2) {
                            System.out.println("Invalid input. Please enter in 'Item Quantity' format.");
                            continue;
                        }
                        String item = itemInp[0];
                        int quantity = Integer.parseInt(itemInp[1]);

                        // Add to orderedItems
                        orderedItems.put(item, orderedItems.getOrDefault(item, 0) + quantity);
                    }
                    break;
                case 3:
                    System.out.println("Dinner Items");
                    System.out.println("1.\t Paav bhaji");
                    while (true) {
                        System.out.println("Enter Item and Quantity (or type 'exit' to finish): ");
                        String input = sc.nextLine();
                        if (input.equalsIgnoreCase("exit")) {
                            break;
                        }
                        String[] itemInp = input.split(" ");
                        if (itemInp.length != 2) {
                            System.out.println("Invalid input. Please enter in 'Item Quantity' format.");
                            continue;
                        }
                        String item = itemInp[0];
                        int quantity = Integer.parseInt(itemInp[1]);

                        // Add to orderedItems
                        orderedItems.put(item, orderedItems.getOrDefault(item, 0) + quantity);
                    }
                    break;
                default:
                    System.out.println("No valid option");
            }

            System.out.println("\nOrders: ");
            for(Map.Entry<String,Integer> entry:orderedItems.entrySet()){
//                System.out.println(orderedItems.keySet()+" : "+orderedItems.values());
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("Thanks visit again..");
        }
        else {
            System.out.println("Thanks visit again..");
            System.exit(0);
        }

    }
}
