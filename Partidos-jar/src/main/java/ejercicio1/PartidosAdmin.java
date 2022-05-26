package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PartidosAdmin extends PartidosAdminAbstract {

	private Equipo ganadosLocal = new Equipo("");
	private Equipo masGolesRecibidos;

	public PartidosAdmin(List<Partido> datosPartidos) {
		super();
		this.datosPartidos = datosPartidos;

	}

	public PartidosAdmin() {

	}

	@Override
	public void agregar(Partido partido) {
		datosPartidos.add(partido);
	}

	@Override
	public void ordenar() {
		Collections.sort(datosPartidos);
	}

	// Devuelve todos los partidos de un equipo.
	public List<Partido> filtrarPorEquipo(Equipo equipo) {
				
		List<Partido> todosLosPartidos = new ArrayList<Partido>();

		for (Partido p : datosPartidos) {
			if (p.getEquipoLocal().equals(equipo) || p.getEquipoVisitante().equals(equipo)) {
				todosLosPartidos.add(p);
			}
		}
		return todosLosPartidos;

	}

	// Devuelve el equipo que m�s gan� de local.
	public Equipo fuerteDeLocal() {
		List<List<Partido>> partidosXequipos = new ArrayList();

		List<Partido> arsenalLocal = new ArrayList();
		List<Partido> astonLocal = new ArrayList();
		List<Partido> brentfordLocal = new ArrayList();
		List<Partido> brightonLocal = new ArrayList();
		List<Partido> burnleyLocal = new ArrayList();
		List<Partido> chelseaLocal = new ArrayList();
		List<Partido> crystalLocal = new ArrayList();
		List<Partido> evertonLocal = new ArrayList();
		List<Partido> leedsLocal = new ArrayList();
		List<Partido> leicesterLocal = new ArrayList();
		List<Partido> liverpoolLocal = new ArrayList();
		List<Partido> cityLocal = new ArrayList();
		List<Partido> unitedLocal = new ArrayList();
		List<Partido> newcastleLocal = new ArrayList();
		List<Partido> norwichLocal = new ArrayList();
		List<Partido> southamptonLocal = new ArrayList();
		List<Partido> tottenhamLocal = new ArrayList();
		List<Partido> watfordLocal = new ArrayList();
		List<Partido> westLocal = new ArrayList();
		List<Partido> wolvesLocal = new ArrayList();

		for (Partido p : datosPartidos) {
			if (p.getResultado().getDescripcion() == "Victoria Local") {
				switch (p.getEquipoLocal().getNombre()) {
				case "Arsenal":
					arsenalLocal.add(p);
					break;
				case "Aston Villa":
					astonLocal.add(p);
					break;
				case "Brentford":
					brentfordLocal.add(p);
					break;
				case "Brighton":
					brightonLocal.add(p);
					break;
				case "Burnley":
					burnleyLocal.add(p);
					break;
				case "Chelsea":
					chelseaLocal.add(p);
					break;
				case "Crystal Palace":
					crystalLocal.add(p);
					break;
				case "Everton":
					evertonLocal.add(p);
					break;
				case "Leeds":
					leedsLocal.add(p);
					break;
				case "Leicester":
					leicesterLocal.add(p);
					break;
				case "Liverpool":
					liverpoolLocal.add(p);
					break;
				case "Man City":
					cityLocal.add(p);
					break;
				case "Man United":
					unitedLocal.add(p);
					break;
				case "Newcastle":
					newcastleLocal.add(p);
					break;
				case "Norwich":
					norwichLocal.add(p);
					break;
				case "Southampton":
					southamptonLocal.add(p);
					break;
				case "Tottenham":
					tottenhamLocal.add(p);
					break;
				case "Watford":
					watfordLocal.add(p);
					break;
				case "West Ham":
					westLocal.add(p);
					break;
				case "Wolves":
					wolvesLocal.add(p);
					break;

				}
			}

		}
		partidosXequipos.add(arsenalLocal);
		partidosXequipos.add(astonLocal);
		partidosXequipos.add(brentfordLocal);
		partidosXequipos.add(brightonLocal);
		partidosXequipos.add(burnleyLocal);
		partidosXequipos.add(chelseaLocal);
		partidosXequipos.add(crystalLocal);
		partidosXequipos.add(evertonLocal);
		partidosXequipos.add(leedsLocal);
		partidosXequipos.add(leicesterLocal);
		partidosXequipos.add(liverpoolLocal);
		partidosXequipos.add(cityLocal);
		partidosXequipos.add(unitedLocal);
		partidosXequipos.add(newcastleLocal);
		partidosXequipos.add(norwichLocal);
		partidosXequipos.add(southamptonLocal);
		partidosXequipos.add(tottenhamLocal);
		partidosXequipos.add(watfordLocal);
		partidosXequipos.add(westLocal);
		partidosXequipos.add(wolvesLocal);

		int mayor = 0;
		for (int i = 0; i < partidosXequipos.size(); i++) {
			if (partidosXequipos.get(i).size() > mayor) {
				mayor = partidosXequipos.get(i).size();
				ganadosLocal = partidosXequipos.get(i).get(i).getEquipoLocal();
			}
		}

		return ganadosLocal;

	}

	// Devuelve el equipo que m�s goles recibi�.
	public Equipo deportivoEmpate() {
		Set<Equipo> equipos = new TreeSet();
		Collections.sort(datosPartidos, new FuerteDeLocalComparator());
		for (Partido p : datosPartidos) {
			equipos.add(p.getEquipoLocal());
		}

		List<Equipo> eq = new ArrayList();
		for (Equipo e : equipos) {

			eq.add(e);
		}

		int golesArsenal = 0, golesAston = 0, golesBrentford = 0, golesBrighton = 0, golesBurnley = 0, golesChelsea = 0,
				golesCrystal = 0, golesEverton = 0, golesLeeds = 0, golesLeicester = 0, golesLiverpool = 0,
				golesCity = 0, golesUnited = 0, golesNewcastle = 0, golesNorwich = 0, golesSouthampton = 0,
				golesTottenham = 0, golesWatford = 0, golesWest = 0, golesWolves = 0;

		for (Partido p : datosPartidos) {
			for (int i = 0; i < eq.size(); i++) {
				if (p.getEquipoLocal().getNombre().equals(eq.get(i).getNombre())) {
					switch (eq.get(i).getNombre()) {
					case "Arsenal":
						golesArsenal += p.getGolesVisitante();
						break;
					case "Aston Villa":
						golesAston += p.getGolesVisitante();
						break;
					case "Brentford":
						golesBrentford += p.getGolesVisitante();
						break;
					case "Brighton":
						golesBrighton += p.getGolesVisitante();
						break;
					case "Burnley":
						golesBurnley += p.getGolesVisitante();
						break;
					case "Chelsea":
						golesChelsea += p.getGolesVisitante();
						break;
					case "Crystal Palace":
						golesCrystal += p.getGolesVisitante();
						break;
					case "Everton":
						golesEverton += p.getGolesVisitante();
						break;
					case "Leeds":
						golesLeeds += p.getGolesVisitante();
						break;
					case "Leicester":
						golesLeicester += p.getGolesVisitante();
						break;
					case "Liverpool":
						golesLiverpool += p.getGolesVisitante();
						break;
					case "Man City":
						golesCity += p.getGolesVisitante();
						break;
					case "Man United":
						golesUnited += p.getGolesVisitante();
						break;
					case "Newcastle":
						golesNewcastle += p.getGolesVisitante();
						break;
					case "Norwich":
						golesNorwich += p.getGolesVisitante();
						break;
					case "Southampton":
						golesSouthampton += p.getGolesVisitante();
						break;
					case "Tottenham":
						golesTottenham += p.getGolesVisitante();
						break;
					case "Watford":
						golesWatford += p.getGolesVisitante();
						break;
					case "West Ham":
						golesWest += p.getGolesVisitante();
						break;
					case "Wolves":
						golesWolves += p.getGolesVisitante();
						break;

					}
				} else {
					if (p.getEquipoVisitante().getNombre().equals(eq.get(i).getNombre())) {
						switch (eq.get(i).getNombre()) {
						case "Arsenal":
							golesArsenal += p.getGolesLocal();
							break;
						case "Aston Villa":
							golesAston += p.getGolesLocal();
							break;
						case "Brentford":
							golesBrentford += p.getGolesLocal();
							break;
						case "Brighton":
							golesBrighton += p.getGolesLocal();
							break;
						case "Burnley":
							golesBurnley += p.getGolesLocal();
							break;
						case "Chelsea":
							golesChelsea += p.getGolesLocal();
							break;
						case "Crystal Palace":
							golesCrystal += p.getGolesLocal();
							break;
						case "Everton":
							golesEverton += p.getGolesLocal();
							break;
						case "Leeds":
							golesLeeds += p.getGolesLocal();
							break;
						case "Leicester":
							golesLeicester += p.getGolesLocal();
							break;
						case "Liverpool":
							golesLiverpool += p.getGolesLocal();
							break;
						case "Man City":
							golesCity += p.getGolesLocal();
							break;
						case "Man United":
							golesUnited += p.getGolesLocal();
							break;
						case "Newcastle":
							golesNewcastle += p.getGolesLocal();
							break;
						case "Norwich":
							golesNorwich += p.getGolesLocal();
							break;
						case "Southampton":
							golesSouthampton += p.getGolesLocal();
							break;
						case "Tottenham":
							golesTottenham += p.getGolesLocal();
							break;
						case "Watford":
							golesWatford += p.getGolesLocal();
							break;
						case "West Ham":
							golesWest += p.getGolesLocal();
							break;
						case "Wolves":
							golesWolves += p.getGolesLocal();
							break;

						}
					}
				}

			}
		}

		List<Integer> golesRecibidos = new ArrayList();
		golesRecibidos.add(golesArsenal);
		golesRecibidos.add(golesAston);
		golesRecibidos.add(golesBrentford);
		golesRecibidos.add(golesBrighton);
		golesRecibidos.add(golesBurnley);
		golesRecibidos.add(golesChelsea);
		golesRecibidos.add(golesCrystal);
		golesRecibidos.add(golesEverton);
		golesRecibidos.add(golesLeeds);
		golesRecibidos.add(golesLeicester);
		golesRecibidos.add(golesLiverpool);
		golesRecibidos.add(golesCity);
		golesRecibidos.add(golesUnited);
		golesRecibidos.add(golesNewcastle);
		golesRecibidos.add(golesNorwich);
		golesRecibidos.add(golesSouthampton);
		golesRecibidos.add(golesTottenham);
		golesRecibidos.add(golesWatford);
		golesRecibidos.add(golesWest);
		golesRecibidos.add(golesWolves);

		int mayor = 0;
		for (int i = 0; i < golesRecibidos.size(); i++) {
			if (golesRecibidos.get(i) > mayor) {
				mayor = golesRecibidos.get(i);
				masGolesRecibidos = eq.get(i);
			}
		}

		return masGolesRecibidos;
	}

	// Devuelve en orden descendente los equipos junto con su puntaje
	public List<EquipoPuntaje> tablaDePosiciones() {
		Set<Equipo> equipos = new TreeSet();
		Collections.sort(datosPartidos, new FuerteDeLocalComparator());
		for (Partido p : datosPartidos) {
			equipos.add(p.getEquipoLocal());
		}

		List<Equipo> eq = new ArrayList();
		for (Equipo e : equipos) {

			eq.add(e);
		}
		List<EquipoPuntaje> todosLosPartidos = new ArrayList<EquipoPuntaje>();
		Set<EquipoPuntaje> equipoPuntaje = new TreeSet();

		for (Partido p : datosPartidos) {
			for (int i = 0; i < eq.size(); i++) {
				if (p.getEquipoLocal().equals(eq.get(i)) || p.getEquipoVisitante().equals(eq.get(i))) {
					equipoPuntaje.add(new EquipoPuntaje(eq.get(i), datosPartidos));
				}
			}
		}
		for (EquipoPuntaje ep : equipoPuntaje) {
			todosLosPartidos.add(ep);
		}
		return todosLosPartidos;
	}

	@Override
	public String toString() {

		for (Partido p : datosPartidos) {
			System.out.println(p.getFecha() + " | " + p.getEquipoLocal() + " (vs) " + p.getEquipoVisitante() + " | "
					+ p.getGolesLocal() + " | " + p.getGolesVisitante() + " | " + p.getResultado().getDescripcion());
		}
		return "";
	}

}
