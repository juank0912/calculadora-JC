
public class Resto {
private double num1;
private double num2;
public Resto(double n1, double n2) {
	num1 = n1;
	num2 = n2;
}

public double resto() {
	double resultado =this.num1%this.num2;
	return resultado;
}
}
