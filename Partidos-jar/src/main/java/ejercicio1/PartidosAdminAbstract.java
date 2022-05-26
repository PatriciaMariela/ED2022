package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class PartidosAdminAbstract {

	protected List<Partido> datosPartidos;

	public PartidosAdminAbstract() {
		this.datosPartidos = new ArrayList();
	}

	/** Agrega una entrada a equipoTorneoList */
	public abstract void agregar(Partido partido);

	/** Ordena las entradas en equipoTorneoList seg�n los criterios por defecto */
	public abstract void ordenar();

	// Devuelve todos los partidos de un equipo.
	public abstract List<Partido> filtrarPorEquipo(Equipo equipo);

	// Devuelve el equipo que m�s gan� de local.
	public abstract Equipo fuerteDeLocal();

	// Devuelve el equipo que m�s goles recibi�.
	public abstract Equipo deportivoEmpate();

	// Devuelve en orden descendente los equipos junto con su puntaje
	public abstract List<EquipoPuntaje> tablaDePosiciones();
}
