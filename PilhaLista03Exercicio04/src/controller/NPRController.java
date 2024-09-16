package controller;

import br.com.jonas.estruturas.PilhaInt;

public class NPRController {
	public NPRController() {
		super();
	}
	
	public void insereValor(PilhaInt p, int valor) {
		p.push(valor);
	}
	
	public double npr(PilhaInt p, String op) {
		int resultado = 0, valor = 0, valor2 = 0;
		
		switch (op) {
			case "+": 
				try {
					resultado = p.pop() + p.pop();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			break;
			case "-":
				try {
					valor2 = p.pop();
					valor = p.pop();
					resultado = valor - valor2;
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			break;
			case "*":
				try {
					resultado = p.pop() * p.pop();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			break;
			case "/":
				try {
					valor2 = p.pop();
					valor = p.pop();
					return valor / valor2;
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			break;
		}
		
		return resultado;
	}
}
