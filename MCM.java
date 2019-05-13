
public class MCM {
	private double num1;
	private double num2;
	public MCM(double n1, double n2) {
		num1 = n1;
		num2 = n2;
	}

	public double mcm() {
		int numero;
		int[] numeros1;
		  for(int i=2;i<num1;i++){
	            while(numero%i==0){
	                numero=numero/i;
	                System.out.print(i+"  ");
	              //Para evitar hacer cálculos innecesarios :
	                 if(numero==1){
	                    System.exit(0);
	                }
	            }
	}
}
