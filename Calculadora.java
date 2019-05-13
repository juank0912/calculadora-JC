package calculadora;

import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws ParseException {


		menu();

	}

	public static void menu() throws ParseException {

		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		while (!salir) {
			System.out.println("***BIENVENIDO AL CINESA EEP******");
			System.out.println("selecciona 1 para sumar");
			System.out.println("selecciona 2 para restar");
			System.out.println("selecciona 3 para multiplicar");
			System.out.println("selecciona 4 para dividir");
			System.out.println("selecciona 0 para salir");
			System.out.println("selecciona una opcion");
			int opcion = sc.nextInt();

			try {
				switch (opcion) {
				case 1: sumar();
					break;

				case 2: restar();
					break;
					
				case 3: multiplicar();
					break;
				
				case 4: dividir();
					break;

				case 0:
					salir = true;

				default:
					System.out.println("La opcion introducida no es correcta");

				}
			} catch (InputMismatchException e) {
				System.out.println("Error, introducido dato no numerico");
			}
		}

	}
	
	public static void sumar() {
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce el primer numero: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		double n2 = sc.nextDouble();
		
		Suma s = new Suma(n1, n2);
		
		s.suma();
	}

	public static void restar() {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce el primer numero: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		double n2 = sc.nextDouble();
		
		resta r = new resta(n1, n2);
		
		r.restar();
		
	}
	
	public static void multiplicar() {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce el primer numero: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		double n2 = sc.nextDouble();
		
		Multiplicar m = new Multiplicar(n1, n2);
		
		m.multiplicar();
		
	}
	
	public static void dividir() {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Introduce el primer numero: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo numero: ");
		double n2 = sc.nextDouble();
		
		Dividir d = new Dividir(n1, n2);
		
		d.dividir();
		
	}

}
