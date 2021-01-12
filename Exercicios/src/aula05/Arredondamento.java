package aula05;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Arredondamento {
	
	public static void main(String[] args) {
		//arredondaComMathRound();
		arredondarComDecimalFormat();
		
	}
	
	public static void arredondarComDecimalFormat() {
		
		DecimalFormat df = new DecimalFormat("#.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		double num = 100.5;

		System.out.println(num);
		System.out.println(df.format(num));
		
		
	}
	
	public static void arredondaComMathRound() {
		double num = 100.987654321;
		int casas = 100;
		
		System.out.println(num);
		num = num * casas;
		
		num = Math.round(num);
		num = num / casas;
		System.out.println(num);
		
	}

}
