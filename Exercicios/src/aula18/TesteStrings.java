package aula18;

public class TesteStrings {

	public static void main(String[] args) {
		// testeString();
		// testeMetodos();
		testeConcat();
	}

	private static void testeConcat() {

		long tempo = 0;
		int qtde = 1000_000;

		String str = "";
		tempo = System.currentTimeMillis();

		for (int i = 0; i < qtde; i++) {
			str = str.concat("x");
		}
		tempo = System.currentTimeMillis() - tempo;
		System.out.println("String.concat = " + tempo);
		
		StringBuilder sb = new StringBuilder();
		tempo = System.currentTimeMillis();

		for (int i = 0; i < qtde; i++) {
			sb.append("o");
		}
		tempo = System.currentTimeMillis() - tempo;
		System.out.println("StringBuilder.append = " + tempo);

	}

	private static void testeMetodos() {
		String s = "JavaProgrammer";

		System.out.println("Métodos da Classe String");
		System.out.println("String de base = " + s);
		System.out.println("O tamanho dessa String é".length());
		System.out.println("s.charAt(3) = " + s.charAt(3));
		System.out.println("concat = " + s.concat(" é bem legal"));
		System.out.println("indexOf('g') + " + s.indexOf('g'));
		System.out.println("replaceAll(a, i) = " + s.replaceAll("a", "i"));
		System.out.println("split(a)");
		String[] s2 = s.split("a");
		for (String s3 : s2) {
			System.out.println(s3);
		}

	}

	private static void testeString() {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = s1;
		s1 = "jvm";

		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s1 == s4 : " + (s1 == s4));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s2 == s4 : " + (s2 == s4));
		System.out.println("s3 == s4 : " + (s3 == s4));

		System.out.println("s2.equals(s3) : " + s2.equals(s3));

	}

}
