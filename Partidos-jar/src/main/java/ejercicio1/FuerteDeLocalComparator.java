package ejercicio1;

import java.util.Comparator;

public class FuerteDeLocalComparator implements Comparator<Partido> {

	@Override
	public int compare(Partido o1, Partido o2) {
		int rta = 0;
		if (o1.getEquipoLocal().compareTo(o2.getEquipoLocal()) < 0) {
			rta = -1;
		} else {
			if (o1.getEquipoLocal().compareTo(o2.getEquipoLocal()) > 0) {
				rta = 1;
			}
		}
		if (o1.getResultado().compareTo(o2.getResultado()) < 0) {
			rta = -1;
		} else {
			if (o1.getResultado().compareTo(o2.getResultado()) > 0) {
				rta = 1;
			}
		}

		return rta;
	}

}
