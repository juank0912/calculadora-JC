package calculadora;

public class resta {
	
	
	private double num1;
	private double num2;
	
	public resta(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}

	public double restar() {
		double resultado;
		
		if(num2 > num1) {
			resultado = num2-num1;
		}
		else {
			resultado = num1-num2;
		}
		return resultado;
	}
	
}
