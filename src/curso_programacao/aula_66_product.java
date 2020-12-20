package curso_programacao;

import java.util.Locale;

import java.util.Scanner;

import curso_programacao.Product;

public class aula_66_product {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name= sc.nextLine();
		System.out.println("Price: ");
		product.price= sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity= sc.nextInt();
		
		 //double a= product.totalValueInStock(); 
			System.out.println(product.totalValueInStock());

		
		
		sc.close();
	}

}
