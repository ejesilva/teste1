import java.util.Scanner;

import empregado.Empregado;

public class main_class69_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		System.out.println("Insira o nome do empregado: ");		
		emp.nome = sc.nextLine();
		
		System.out.println("Insira o sal�rio bruto do empregado: ");
		emp.salarioBruto = sc.nextDouble();
		
		System.out.println("Insira a taxa: ");		
		emp.taxa = sc.nextDouble();
		
		//System.out.println("Empregado: "+emp.nome+", sal�rio: "+emp.salarioLiquido());
		System.out.println("Empregado: "+emp.toString());
				
		System.out.println("Aumentar o sal�rio em quantas percentagens?: ");
		emp.aumentoSalario(sc.nextDouble());
		//System.out.println("Updated Data: "+emp.nome+", sal�rio: "+emp.salarioLiquido());
		System.out.println("Updated Data: "+emp.toString());
		sc.close();
		
	}

}
