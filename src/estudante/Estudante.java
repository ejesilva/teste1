package estudante;

public class Estudante {
	
		public String nome; 
		public double nota1;
		public double nota2;
		public double nota3;
		
		
		public double finalGrade() {
			return nota1*0.3+nota2*0.35+nota3*0.35;
		}
		public String result() {
			if (finalGrade() >= 60){
				return "Aprovado";
			} else {
				double valorFalta =60-finalGrade();
				return "Reprovado => Missing "+valorFalta+" points";
			}
					
		}
}
