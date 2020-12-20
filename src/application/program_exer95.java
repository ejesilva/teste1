package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import empregado.employee95;

public class program_exer95 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<employee95> lista = new ArrayList<>();
		
		
		System.out.println("Quantos empregados vai registrar?");
		int n = sc.nextInt();
		
	    for (int i=0; i<n; i++) {
	    	
	    	System.out.println();
	    	System.out.println("Empregado #: "+ (i+1)+": ");
	    	
	    	System.out.println("Id: ");
	    	Integer id=sc.nextInt();
	    	
	    	
	    	while (temid(lista, id)) {
	    		System.out.println("Este id já está sendo ultilizado, insira um novo id");
	    		 id=sc.nextInt();
	    	}
	    	sc.nextLine();
	    	System.out.println("Nome: ");
	    	//sc.nextLine();
	    	String nome=sc.nextLine();
	    	
	    	System.out.println("Salário: ");
	    	Double salario=sc.nextDouble();
	    	
	    	employee95 emp= new employee95(id, nome,salario);
	    	
	    	lista.add(emp);    	
	    	 
	    }
	    
	    System.out.println();
	    System.out.println("Insira o id do empregado que vai ter aumento do salário: ");
	    int n_emp = sc.nextInt();
	    
	    int chk_emp=chk_emp(lista, n_emp);
	    //employee95 emp = lista.stream().filter(x -> x.getId_emp() == n_emp).findFirst().orElse(null);
	    
	    
	    if (chk_emp==-1) {
	    	System.out.println("Este id não existe");
	    	
	    	
	    } else {
	    	System.out.println("Insira a percentagem do aumento: ");
	    	double taxa = sc.nextDouble();
	    	lista.get(chk_emp).AumentoSalario(taxa);
	    	
	    }
	    
	    System.out.println("");;
        System.out.println("Lista de empregados: ");

    	for (employee95 emp:lista) {
    		System.out.println(emp.getId_emp()+ ", "+emp.getNome_emp()+" "+emp.getSalary_emp());
    	}
	    
	       
		
		
		sc.close();
	}
	
	public static int chk_emp(List<employee95> lista, int id) {
		for (int i=0; i<lista.size(); i++) {
			if(lista.get(i).getId_emp()==id) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	public static boolean temid(List<employee95> lista, int id) {
		employee95 emp = lista.stream().filter(x -> x.getId_emp() == id).findFirst().orElse(null);
		return emp != null;
	}

}
