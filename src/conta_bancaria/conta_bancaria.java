package conta_bancaria;

public class conta_bancaria {
	
	public int numero_Conta;
	public String nome_Titular;
	public String chk_deposito;
	public double valor_Deposito;
	
	
	public String datosConta() {
		return "Conta "
				+numero_Conta
				+", Titular: "
				+nome_Titular
				+", Valor na conta: "
				+valor_Deposito;
	}
	
	public void Deposito(double valor_Deposito) {
		this.valor_Deposito +=valor_Deposito;
	}
	
	public void Levantamento(double valor_Deposito) {
		this.valor_Deposito -= valor_Deposito;
	}

}
