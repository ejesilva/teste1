package application;

import java.util.Scanner;

import entities_exer90.RendaQuartos;

public class program_exer90 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos vão ser alugados?");
		int n = sc.nextInt();
		
    	RendaQuartos[] vect = new RendaQuartos[10];
    	
    	
    	for (int i=0; i<n; i++) {
    		sc.nextLine();
    		
    		
    		System.out.printf("Insira o nome do %dº estudante: ", i+1);
    		String nome = sc.nextLine();
    		System.out.printf("Insira o email do %dº estudante: ", i+1);
    		String email = sc.nextLine();    		
    		System.out.println("Insira o número de quarto que pretende ocupar, de 0 a 9");
    		int numQuarto = sc.nextInt();
    		
    		vect[numQuarto] = new RendaQuartos(nome, email);
    		
    	}
    	
    	sc.nextLine();
    	
    	System.out.println("Quartos ocupados: ");
    	
    	for (int i=0; i<vect.length;i++) {
    		
    		if (vect[i] != null) { 
    			System.out.println(i+": "+ vect[i].getNome()+", "+vect[i].getEmail());
    		}
    		
    	}
    	
		
		
		sc.close();
		
	}

}
