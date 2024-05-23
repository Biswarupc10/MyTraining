package com.acc.lkm.CollectionActivity;
import java.util.*;
import java.util.Scanner;

public class Management {

	private static HashSet<Customer> customers = new HashSet<>();
	private static LinkedHashSet<Customer> customers1 = new LinkedHashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Update Customer");
            System.out.println("3. Remove Customer");
            System.out.println("4. Display Customers");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    updateCustomer();
                    break;
                case 3:
                    removeCustomer();
                    break;
                case 4:
                    displayCustomers();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addCustomer() {
        System.out.print("Enter Customer ID: ");
        String cust_id = scanner.nextLine();
        Integer id=Integer.parseInt(cust_id);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product: ");
        String product = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        customers.add(new Customer(id,name,product,price));
        customers1.add(new Customer(id,name,product,price));
        System.out.println("Customer added successfully.");
    }

    private static void updateCustomer() {
        System.out.print("Enter the ID of the customer to update: ");
        String cust_id = scanner.nextLine();
        Integer id=Integer.parseInt(cust_id);
        String name="";
        String product="";
        double price=0.0;
        for (Customer customer : customers) {
            if (customer.getCust_id()==id) {
                System.out.print("Enter new name: ");
                 name = scanner.nextLine();
                System.out.print("Enter new product: ");
               product = scanner.nextLine();
                System.out.print("Enter new price: ");
                 price = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                customer.setName(name);
                customer.setProduct(product);
                customer.setPrice(price);
                
                
                
                System.out.println("Customer updated successfully.");
                break;
            }
        }
        for (Customer customer : customers1) {
            if (customer.getCust_id()==id) {
//                System.out.print("Enter new name: ");
//                String name = scanner.nextLine();
//                System.out.print("Enter new product: ");
//                String product = scanner.nextLine();
//                System.out.print("Enter new price: ");
//                double price = scanner.nextDouble();
//                scanner.nextLine(); // Consume newline

                customer.setName(name);
                customer.setProduct(product);
                customer.setPrice(price);
                
                
                
                System.out.println("Customer updated successfully.");
                return;
            }
        }
        System.out.println("Customer with ID " + cust_id + " not found.");
    }

    private static void removeCustomer() {
        System.out.print("Enter the ID of the customer to remove: ");
        String cust_id = scanner.nextLine();
        Integer id=Integer.parseInt(cust_id);
        for (Customer customer : customers) {
            if (customer.getCust_id()==id) {
                customers.remove(customer);
                System.out.println("Customer removed successfully.");
              
                break;
            }
        }
        
        for (Customer customer : customers1) {
            if (customer.getCust_id()==id) {
                customers1.remove(customer);
                System.out.println("Customer removed successfully.");
                return;
            }
        }
        System.out.println("Customer with ID " + cust_id + " not found.");
    }

    private static void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers to display.");
        } else {
            System.out.println("Customer List for HashSet:");
            for (Customer customer : customers) {
                System.out.println(customer);
            }
            System.out.println();
        }
        
        if (customers1.isEmpty()) {
            System.out.println("No customers to display.");
        } else {
            System.out.println("Customer List for LinkedHashSet:");
            for (Customer customer : customers1) {
                System.out.println(customer);
            }
        }
	}

}
