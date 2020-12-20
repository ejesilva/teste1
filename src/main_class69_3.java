import java.util.Scanner;

import estudante.Estudante;

public class main_class69_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estudante est = new Estudante();
		
		System.out.println("Insira o nome do aluno");
		est.nome= sc.nextLine();
		
		System.out.println("Insira a noa do primeiro trimestre do aluno");
		est.nota1=sc.nextDouble();
		
		System.out.println("Insira a noa do primeiro trimestre do aluno");
		est.nota2=sc.nextDouble();
				
		System.out.println("Insira a noa do primeiro trimestre do aluno");
		est.nota3=sc.nextDouble();
				
		System.out.println("Nota Final: "+ est.finalGrade());
		System.out.println("Resultado: "+est.result());
		sc.close();
	}

}
