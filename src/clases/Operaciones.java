package clases;

import gui.VentanaPrincipal;

public class Operaciones {
	
	private VentanaPrincipal ventana;
	

	public void setVentana(VentanaPrincipal ventanaPrincipal) {
		this.ventana = ventanaPrincipal;
	}

	public String sumar(String num1, String num2) {
		double x,y,suma;
		String resultado="";
		
		try {
			x = Double.parseDouble(num1);
			y = Double.parseDouble(num2);
			suma = x + y;
			resultado =Double.toString(suma);
		} catch (Exception e ) {
			resultado = "Error";
		}
		if (num1.equals("") || num2.equals("")) {
			resultado ="";
		}
		return resultado;
	}

	public String restar(String num1, String num2) {
		double x,y,resta;
		String resultado="";
		
		try {
			x = Double.parseDouble(num1);
			y = Double.parseDouble(num2);
			resta = x - y;
			resultado = Double.toString(resta);
		} catch (Exception e ) {
			resultado = "Error";
		}
		if (num1.equals("") || num2.equals("")) {
			resultado ="";
		}
		return resultado;
	}

	public String multiplicar(String num1, String num2) {
		double x,y,multiplicacion;
		String resultado="";
		
		try {
			x = Double.parseDouble(num1);
			y = Double.parseDouble(num2);
			multiplicacion = x * y;
			resultado = Double.toString(multiplicacion);
		} catch (Exception e ) {
			resultado = "Error";
		}
		if (num1.equals("") || num2.equals("")) {
			resultado ="";
		}
		return resultado;
	}

	public String dividir(String num1, String num2) {
		double x,y,division;
		String resultado="";
		
		try {
			x = Double.parseDouble(num1);
			y = Double.parseDouble(num2);
			if (y == 0) {
				resultado = "Error division por 0";
			} else {
				division = x / y;
				resultado = Double.toString(division);
				}
		} catch (Exception e ) {
			resultado = "Error";
		}
		if (num1.equals("") || num2.equals("")) {
			resultado ="";
		}
		return resultado;
	}

	public String modulo(String num1, String num2) {
		double x,y,multiplicacion;
		String resultado="";
		
		try {
			x = Double.parseDouble(num1);
			y = Double.parseDouble(num2);
			multiplicacion = x % y;
			resultado = Double.toString(multiplicacion);
		} catch (Exception e ) {
			resultado = "Error";
		}
		if (num1.equals("") || num2.equals("")) {
			resultado ="";
		}
		return resultado;
	}
}