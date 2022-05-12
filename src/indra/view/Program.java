package indra.view;


import indra.model.*;
import indra.view.*;


public class Program {
	public static void main(String[] args) {

		System.out.println("Ey");
		// EntidadSistema carpetaRaiz = new Carpeta("root");

		
		FyleSystem observer=new FyleSystem();
		EntidadSistema.registrarQuienMeMira(observer);
		
		//System.out.println("Creando carpeta root");
		Carpeta carpetaRaiz = new Carpeta("root");
		Carpeta temp = new Carpeta("temp");
	//	System.out.println("Creando carpeta trash");

		Carpeta trash = new Carpeta("trash");

		Archivo autoexec = new Archivo("autoexec.bat", 100);
		Archivo imagen = new Archivo("imagen.jpg");
		imagen.setTamanio(350);

		carpetaRaiz.Add(temp);
		temp.Add(autoexec);
		temp.Add(trash);
		trash.Add(imagen);
		
		/*
		 root
		 	temp
		 		autoexec
		 			trash
		 				imagen
		 */
		
		EntidadSistema root = carpetaRaiz;
		System.out.println("tamanio " + root.calcularTamanio());
		System.out.println("tamanio " + imagen.calcularTamanio());

		
	}
}