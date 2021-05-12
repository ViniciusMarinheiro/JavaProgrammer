package aula22;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Mascara {

	public static MaskFormatter data() {
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter("##/##/####");
			mf.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return mf;

	}

	public static MaskFormatter celular() {
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter("(##) # ####-####");
			mf.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return mf;

	}

	public static MaskFormatter cep() {
		MaskFormatter mf = null;
		try {
			mf = new MaskFormatter("#####-###");
			mf.setPlaceholderCharacter('_');
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return mf;
	}

}
