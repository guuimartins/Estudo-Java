package Entities;

public class ConversorDol {
	
	public static final double IOF = 6;
	
	public static double converter(double dolar, double quantidade) {
		double valor = quantidade * dolar;
		return valor += valor * (IOF / 100);
	}
	
}
