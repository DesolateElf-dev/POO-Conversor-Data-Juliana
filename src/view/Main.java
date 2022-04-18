package view;

import controller.ConversorData;

public class Main {

	public static void main(String[] args) {
		
		ConversorData dataGregoriana = new ConversorData();
		
		System.out.println(dataGregoriana.dataJuliana(5, 8, 2016));

	}

}
