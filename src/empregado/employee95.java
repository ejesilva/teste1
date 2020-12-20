package empregado;

public class employee95 {
	
	private int id_emp;
	private String nome_emp;
	private double salary_emp;
	
	public employee95() {};
	public employee95(int id_emp, String nome_emp, double salary_emp) {
		this.id_emp = id_emp;
		this.nome_emp = nome_emp;
		this.salary_emp = salary_emp;
	}


	public int getId_emp() {
		return id_emp;
	}


	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}


	public String getNome_emp() {
		return nome_emp;
	}


	public void setNome_emp(String nome_emp) {
		this.nome_emp = nome_emp;
	}


	public double getSalary_emp() {
		return salary_emp;
	}


	/*public void setSalary_emp(double salary_emp) {
		this.salary_emp = salary_emp;
	}*/
	
	
	public void AumentoSalario (double taxa_aumento) {
		salary_emp +=salary_emp*(taxa_aumento/100);
	}
	

}
