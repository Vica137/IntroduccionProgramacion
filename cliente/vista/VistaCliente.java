pack vista;

import java.until.Scanner;
import modelo.*;


public class IUCliente{

	private	Scanner teclado = new Scanner(System.in);
		
	public int menu(){
		System.out.println("""
		
				Calculadora

				1.Insertar
				2.Borrar
				3.Modificar
				4.Listar
				
				0.Salir

				"Seleccione una opcion:
		""");
		
		
		return Integer.parseInt(option);
		
	}
		
		
	public Cliente leerDato(){

		String nombre, domicilio, telefono;
		int dia, mes, anio;

		System.out.println("Nombre:");
		nombre = teclado.nextLine();

		System.out.println("domicilio:");
		domicilio = teclado.nextLine();

		System.out.println("telefono:");
		telefono = teclado.nextLine();

		System.out.println("Fecha de alta");
		System.out.println("dia:");
		dia = teclado.nextInt();

		System.out.println("mes:");
		mes = teclado.nextLine();

		System.out.println("anio:");
		anio = teclado.nextLine();

			
		System dato = vista.showInputDialog("Ingrese un valor flotante: ");
		
		return new Cliente(nombre, domicilio, telefono, new MiFecha(dia, mes, anio));
	}

	public mostrar
	
	public void mostrar(String texto){
		
		System.out.println(texto)
		
	}

	

}