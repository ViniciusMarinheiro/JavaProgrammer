package aula23;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Datas {
	public static void main(String[] args) {
		testeDate();
		testeSDF();
	}

	public static void testeSDF() {
		Date agora = new Date(); // data e hora atual do sistema
		
		
		SimpleDateFormat dmy = new SimpleDateFormat("dd/MM/yy - HH:mm:ss w");
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("Formato dd/MM/yyyy " + dmy.format(agora));
		System.out.println("Formato yyyy/MM/dd " + ymd.format(agora));
		
	}
	
	public static void testeDate() {
		Date agora = new Date(); // data e hora atual do sistema
		Date inicio = new Date(0); //data inicial 
		Date inicioBR = new Date(1000*60*60*3); //data inicial do Brasil
		Date d1 = new Date("05/02/2021");
		Date d2 = Date.from(Instant.parse("2021-02-05T23:00:00Z"));
		
		
		System.out.println("Data atual " + agora);
		System.out.println("Data inicial " + inicio);
		System.out.println("Data inicial do Brasil " + inicioBR);
		System.out.println("Data new date " + d1);
		System.out.println("Data.from instant " + d2);
	}
	
	
}
