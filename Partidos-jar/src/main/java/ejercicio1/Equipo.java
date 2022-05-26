package ejercicio1;

import java.util.Objects;

public class Equipo implements Comparable<Equipo> {
	private String nombre;

	public Equipo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public int compareTo(Equipo o) {
		int rta = 0;
		if (this.nombre.compareTo(o.getNombre()) < 0) {
			rta = -1;
		} else {
			if (this.nombre.compareTo(o.getNombre()) > 0) {
				rta = 1;
			}

		}
		return rta;
	}

}
