package org.foobarspam.KataNumeralesRomanos;

import java.util.regex.*;

public class NumerosRomanosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int conversor(String numeroRomano) {

		int numero = 0;
		String patron = "M{0,3}D{0,1}C{0,3}L{0,1}X{0,3}V{0,1}I{0,3}";
		Pattern pat = Pattern.compile(patron);
		Matcher mat = pat.matcher(numeroRomano);

		if (mat.find()) {
			String grupo = mat.group();
			for (char c : grupo.toCharArray()) {

			}
		}

		return numero;
	}

	public static int restativos(String numeroRomano) {

		NumerosRomanos numero = 0;
		String patron = "IV|IX|CD|CM|XL|XC";
		Pattern pat = Pattern.compile(patron);
		Matcher mat = pat.matcher(numeroRomano);

		while (mat.find()) {
			String grupo = mat.group().toString();
			numero = NumerosRomanos.valueOf(grupo.substring(1));
		}

		return numero;

	}

}
