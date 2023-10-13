package airam.museo;

import java.util.Scanner;

public class Vista {

	// escribir las opciones y devolver la opci�n elegida
	public int elegirOpcion(String ... opciones) {
		int ind,opcion=0;
		Scanner scanner = new Scanner (System.in);
		
		for (ind = 0; ind < opciones.length; ind++) {
                    
                    System.out.println((ind+1) +" - " + opciones[ind]);
		
                    System.out.println("\n\n Elija opcion: ");
                }
		
		do{
                    opcion = scanner.nextInt();
		}while(opcion > opciones.length);
		
		return opcion;
	}

	public void mostrar() {
            System.out.println(DAO.catalogo.toString());
	}

	public void leerObra() {
            int nI = pedirNumInentario();
            DAO.catalogo.buscarObra(nI);
	}

	public int pedirNumInentario() {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Introduzca numero de inventario");
            return scanner.nextInt();
	}
	
	
	

}
