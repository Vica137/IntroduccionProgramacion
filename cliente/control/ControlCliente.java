package control;

import vista.VistaCliente;
import modelo.ModeloCliente;

public class ControlCliente {
	
	private VistaCalculadora vista = new VistaCalculadora();
	private ModeloCalculadora modelo = new ModeloCalculadora();
	
	public ControlCalculadora(){

		float numero1 = 0.0f, numero2 = 0.0f;
		int opcion;
		
		do {
			
			opcion = vista.menu();
			
			if(opcion > 0 && opcion < 5){
				
				numero1 = vista.leerDato();
				numero2 = vista.leerDato();
				
			}
			
			switch(opcion){

				case 1:	vista.mostrar(numero1 + " + " + numero2 + " = " + modelo.sumar(numero1,numero2));
					
					break;
				case 2: vista.mostrar(numero1 + " - " + numero2 + " = " + modelo.restar(numero1,numero2));
					
					break;
				case 3: vista.mostrar(numero1 + " x " + numero2 + " = " + modelo.multiplicar(numero1,numero2));
					
					break;
				case 4: vista.mostrar(numero1 + " / " + numero2 + " = " + modelo.dividir(numero1,numero2));
					
					break;
				case 0: vista.mostrar("Adios");
					
					break;
				default: vista.mostrar("Error");
					
					break;
				
			}
		}while (opcion != 0);
	}
	
}