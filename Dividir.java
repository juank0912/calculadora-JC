package calculadora;

public class Dividir {
	
	
	private double num1;
	private double num2;

	public Dividir(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}
	
	public double dividir() {
		double resultado = num1 / num2;
		return resultado;
	}
	
}
