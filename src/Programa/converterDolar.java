package Programa;

import java.util.Locale;
import java.util.Scanner;

import Entities.ConversorDol;

public class converterDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual cotação de hoje? ");
		double dolar = sc.nextDouble();
		System.out.print("Qual quantidade de compra? ");
		double quantidade = sc.nextDouble();
		
		double result = ConversorDol.converter(dolar, quantidade);
		
		System.out.printf("Total a pagar: %.2f", result);
		
		
		sc.close();

	}

}
