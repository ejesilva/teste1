
import java.util.Scanner;

import conta_bancaria.conta_bancaria;

public class main_class_81 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		conta_bancaria conta_banca = new conta_bancaria();
		
		System.out.println("Insere o nome da conta: ");		
		conta_banca.nome_Titular=sc.nextLine();
		
			
		System.out.println("Insere o numero da conta: ");
		conta_banca.numero_Conta=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Deseja depositar um valor na conta? S/N");
		conta_banca.chk_deposito = sc.nextLine();
		
		if (conta_banca.chk_deposito.equals("S")) {
			System.out.println("Insere o valor a depositar: ");
			conta_banca.valor_Deposito=sc.nextDouble();
		}
		
		System.out.println("Datos da conta: ");
		System.out.println(conta_banca.datosConta());
		
		System.out.println("");

		System.out.println("Insira o valor a depositar: ");
		conta_banca.Deposito(sc.nextDouble());
		
		System.out.println("Datos atualizados da conta: ");
		System.out.println(conta_banca.datosConta());
		
		System.out.println("");

		System.out.println("Insira o valor a levantar: ");
		conta_banca.Levantamento(sc.nextDouble());
		
		System.out.println("Datos atualizados da conta: ");
		System.out.println(conta_banca.datosConta());
		sc.close();
	}

}
