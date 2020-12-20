import java.util.Scanner;

import retangulo.Retangulo;

public class main_class69 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in); 
		
		Retangulo ret = new Retangulo();
		System.out.println("Insira a altura do retangulo: ");
		
		ret.altura = sc.nextDouble();
		System.out.println("Insira a largura do retangulo: ");
		ret.largura	=sc.nextDouble();	
		

		System.out.printf("A area do retangulo é: %.2f%n", ret.Area());
		System.out.printf("O perimetro do retangulo é: %.2f%n", ret.Perimetro());
		System.out.printf("A diagonal do retangulo é: %.2f%n", ret.Area());

		sc.close();
	}

}
