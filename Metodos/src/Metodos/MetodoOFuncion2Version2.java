package Metodos;

import java.util.Scanner;

public class MetodoOFuncion2Version2 {

	public static void main(String[] args) {
		
		 
		
MetodoOFuncion2Version2 obj = new MetodoOFuncion2Version2();
		
		obj.calcularRaicesCuadraticas(); //LLamada del metodo
		obj.calcularRaicesCuadraticas();
	}//cierre del main
	

	//modificador de acceso + tipo de dato que devolvera el metodo + nombre del metodo + los 
	//parentesis () y/o la lista de parametros de entrada 
	//DeFINICION DEL METODO
	private void calcularRaicesCuadraticas() {
		//El cuerpo del metodo
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("a = ");
		double a = lector.nextDouble();

		
		System.out.println("b = ");
		double b = lector.nextDouble();
		
		System.out.println("c = ");
		double c = lector.nextDouble();
		
		double discriminante = Math.pow(b, 2) - 4*a*c;
		
		double x1 = (-b + Math.sqrt(discriminante))/(2*a);
		double x2 = (-b - Math.sqrt(discriminante))/(2*a);
		
		
		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
		
	//	lector.close();
	}

}//cierre de la clase
