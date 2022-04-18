package controller;

public class ConversorData {
	
	private int ano;
	private int mes;
	private int dia;
	private int diaJuliano;
	
	public int dataJuliana(int dia, int mes, int ano){		
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		
		diaJuliano = (1461 * (ano + 4800 +(mes -14)/12)) / 4 + (367 * (mes - 2 -12 *((mes -14)/12)))/12 - (3 * ((ano +4900+(mes -14)/12)/100))/4 + dia -32075;
		
		/**diaJuliano= ( 1461 * ( ano + 4800 + ( mes - 14)/12 )  ) / 4 +

                ( 367 * ( mes - 2- 12 * (  ( mes - 14)/12 )  ) ) /12 -

                ( 3 * ( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 )  ) / 4 + dia - 32075;**/
		
		return diaJuliano;
	}

}
