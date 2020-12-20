package application;

import java.util.Scanner;

public class program_exer99 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o numero de linhas: ");
		int num_linhas = sc.nextInt();
		
		System.out.println("Insira o numero de colunas: ");
		int num_colunas = sc.nextInt();
		
		int [][] m_matriz = new int [num_linhas][num_colunas];
		
	    System.out.println("Insira os valores da matriz");

		for (int i=0; i<m_matriz.length;i++) {
			for (int j=0; j<m_matriz[i].length;j++) {
				m_matriz[i][j]= sc.nextInt();
				}
		}
		
		System.out.println("Insira um numero da matriz: ");
		int n = sc.nextInt();
		
		for (int i=0; i<m_matriz.length;i++) {
			for (int j=0; j<m_matriz[i].length;j++) {
				if (m_matriz[i][j]==n) {
					System.out.println("Position: "+i+", "+j);

					if (j-1 >0) {
						int esquerda = m_matriz[i][j-1];
						System.out.println("Esquerda: "+ esquerda);
					}
					if (j+1 <m_matriz[i].length) {
						int direita = m_matriz[i][j+1];
						System.out.println("Direita: "+direita);
					}
					if (i<m_matriz.length) {
						int abaixo = m_matriz[i+1][j];
						System.out.println("abaixo: "+abaixo);
					}
					
					if (i-1>0) {
						int acima = m_matriz[i-1][j];
						System.out.println("Acima: "+acima);
					}
					
				}
			}
		}
		
		for (int i=0; i<m_matriz.length;i++) {
			for (int j=0; j<m_matriz[i].length;j++) {
				
				
			}
		}	
		
		sc.close();
		
		

	}

}
