package org.foobarspam.dni;

import java.util.regex.*;

public class Validador {

	static String regexDocumento = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b|\\b[XYZ]\\d{7}[A-Z&&[^IÑOU]]\\b";

	static Pattern p = Pattern.compile(regexDocumento);

	public static boolean leer(String documento) {

		Matcher m = p.matcher(documento);

		return m.find();

	}
}
