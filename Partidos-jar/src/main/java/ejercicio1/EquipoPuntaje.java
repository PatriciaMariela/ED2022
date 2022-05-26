package ejercicio1;

import java.util.List;
import java.util.Objects;

public class EquipoPuntaje implements Comparable<EquipoPuntaje> {
	private List<Partido> partido;
	private Equipo equipo;
	private int puntos;

	public EquipoPuntaje(Equipo equipo, List<Partido> partido) {
		setEquipo(equipo);
		this.partido = partido;
		getPuntos();

	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public int getPuntos() {
		int partidosGanados = 0;
		int partidosEmpatados = 0;

		for (Partido p : partido) {
			if (this.equipo.equals(p.getEquipoLocal()) && p.getResultado().getDescripcion().equals("Victoria Local")
					|| (this.equipo.equals(p.getEquipoVisitante())
							&& p.getResultado().getDescripcion().equals("Victoria Visitante"))) {
				partidosGanados++;
			} else {
				if (this.equipo.equals(p.getEquipoLocal()) || this.equipo.equals(p.getEquipoVisitante())
						&& partido.get(0).getResultado().getDescripcion().equals("Empate")) {
					partidosEmpatados++;
				}
			}
		}
		int puntosG = (partidosGanados * 3);
		int puntosE = (partidosEmpatados * 1);
		puntos = puntosG + puntosE;

		return puntos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(equipo, puntos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquipoPuntaje other = (EquipoPuntaje) obj;
		return Objects.equals(equipo, other.equipo) && puntos == other.puntos;
	}

	@Override
	public String toString() {

		return getEquipo() + " | " + getPuntos();
	}

	@Override
	public int compareTo(EquipoPuntaje o) {
		int rta = 0;
		if (this.equipo.getNombre().compareTo(o.equipo.getNombre()) < 0) {
			rta = 1;
		} else {
			if (this.equipo.getNombre().compareTo(o.equipo.getNombre()) > 0) {
				rta = -1;
			}
		}
		return rta;
	}
}
