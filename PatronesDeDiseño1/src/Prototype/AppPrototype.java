package Prototype;

import java.util.Scanner;

public class AppPrototype {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion, posX,posY;
		
		Circulo circulo = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		
		Figura figura;
		
		circulo.setNombre("Mi circulo");
		circulo.mover(12, 34);
		
		cuadrado.setNombre("Mi cuadrado");
		cuadrado.mover(200, 200);
		
		System.out.println(" Estas son las figuras originales: ");
		System.out.println("Circulo: " + circulo.getNombre());
		System.out.println("cuadrado: " + cuadrado.getNombre());
		System.out.println("Estas son la posiciones originales");
		circulo.getPosicion();
		cuadrado.getPosicion();
		
		
		System.out.println("digite la opcion que desea clonar: ");
		System.out.println("1= circulo, 2= cuadrado");
		opcion= sc.nextInt();
		
		if(opcion == 1) {
			figura = circulo.clonar();
		}else
			figura = cuadrado.clonar();
		
		figura.setNombre(figura.getNombre() + " clonado");
		System.out.println("digite la posicion x:");
		posX = sc.nextInt();
		System.out.println("Digite la posicion y:");
		posY = sc.nextInt();
		figura.mover(posX, posY);
		
		
		System.out.println(" Estas es la figura clonada: ");
		System.out.println(figura.getNombre());
		System.out.println(" Esta es la posicion: ");
		figura.getPosicion();
		
		}
	}	


