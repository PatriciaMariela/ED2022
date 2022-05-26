package ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LectorDeFichero {

	private LocalDate lD;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private ResultadoEnum resultado;
	private Partido partido;
	private List<Partido> partidos;
	private String archivo;
	private String regex;

	public LectorDeFichero(String archivo, String regex) {
		this.archivo = archivo;
		this.regex = regex;
		this.partidos = new ArrayList();
		lector();
	}

	private void lector() {
		FileReader fr;

		try {
			fr = new FileReader(archivo);
			String linea = "";
			BufferedReader br = new BufferedReader(fr);

			while ((linea = br.readLine()) != null) {

				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(linea);

				if (m.matches()) {

					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

					this.lD = LocalDate.parse(m.group(2), formatter);
					this.equipoLocal = new Equipo(m.group(6));
					this.equipoVisitante = new Equipo(m.group(10));
					this.golesLocal = Integer.parseInt(m.group(14));
					this.golesVisitante = Integer.parseInt(m.group(15));
					this.resultado = ResultadoEnum.valueOf(m.group(16));

					partido = new Partido(lD, equipoLocal, equipoVisitante, golesLocal, golesVisitante, resultado);

					this.partidos.add(partido);

				}
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

}
