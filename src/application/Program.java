package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		
		System.out.println("Enter client data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email:");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY):");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt1);
		System.out.println("Enter order data:");
		System.out.println("Status:");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());
		Order order = new Order(orderStatus, new Client(name, email, birthDate));
		System.out.println("How many items to this order?");
		Integer orders = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<orders; i++) {
			int aux = i+1;
			System.out.println("Enter #" + aux + " item data:");
			System.out.println("Product name:");
			String nameProd = sc.nextLine();
			System.out.println("Product price:");
			Double priceProd = sc.nextDouble();
			System.out.println("Quantity:");
			Integer quantityProd = sc.nextInt();
			sc.nextLine();
			OrderItem orderItem = new OrderItem(quantityProd, priceProd, nameProd);
			order.addItem(orderItem);
		}
		
		System.out.println(order);
		
	}

}
