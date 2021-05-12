package aula10;

public class Principal {

	public static void main(String[] args) {

		Consumidor c1 = new Consumidor("Vinicius Marinheiro", "email@email.com", 11111111111L, 551194451206351L);

		System.out.println(c1.nome);
		
		Empresa e1 = new Empresa("SADIA S.A.", "compras@saida.com", 1112223330001L, "5511123456789 RAMAL 37", 30);
		
		e1.telegram = "@Sadia";
		c1.pagar();
		
		
		e1.setPrazo(30);
		e1.setPrazo(-1000);
		System.out.println(e1.nome  + "  : "+  e1.getPrazo());
		e1.pagar();
		
	}

}
