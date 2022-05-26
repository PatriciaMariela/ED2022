package ejercicio1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejrm {

	public static void main(String[] args) {
		String texto = "E0,13/08/2021,20:00,Brentford,Arsenal,2,0,H,1,0,H,M Oliver,8,22,3,4,12,8,2,5,0,0,0,0,4,3.4,1.95,4,3.5,1.95,3.8,3.4,2.05,4.05,3.46,2.05,4,3.4,1.9,4.1,3.4,2,4.62,3.72,2.1,4.02,3.43,2.02,2.1,1.72,2.22,1.73,2.26,1.83,2.16,1.73,0.5,1.86,2.07,1.88,2.06,2.05,2.08,1.87,2.03,3.8,3.25,2.05,3.8,3.3,2.05,3.8,3.25,2.1,3.94,3.33,2.13,3.9,3,2.05,3.9,3.25,2.1,4.2,3.5,2.18,3.89,3.28,2.1,2.37,1.57,2.44,1.62,2.47,1.75,2.33,1.62,0.5,1.75,2.05,1.81,2.13,2.05,2.17,1.8,2.09";

		// String equipo =
		// ".{2},.{10},.{5},(([A-Z]{1}[a-z]+)(\\s)?([A-Z]{1}[a-z]+)?),+.*";
		// String fecha = ".*((\\d{2})[-/](\\d\\d)[-/](\\d\\d\\d\\d)),+.*";
		// String equipo = ".*,(([A-Z]\\w+)(\\s)?([A-Z]\\w+)?),.*";
		String regex = "^(.{2},((\\d{2})[-/](\\d\\d)[-/](\\d\\d\\d\\d)),.{5},(([A-Z]{1}[a-z]+)(\\s)?([A-Z]{1}[a-z]+)?),(([A-Z]{1}[a-z]+)(\\s)?([A-Z]{1}[a-z]+)?),(\\d),(\\d),(\\D),+.*)$";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(texto);

		if (m.matches()) {
			System.out.println(m.group(5));

		}
		// fecha =m.group(2); ----->dia:m.group(3), mes:m.group(4), anio:m.group(5);
		// equipoLocal = m.group(6);
		// equipoVisitante = m.group(10);
		// golesLocal=m.group(14);
		// golesVisitante=m.group(15);
		// resultado = m.group(16);

	}

}
