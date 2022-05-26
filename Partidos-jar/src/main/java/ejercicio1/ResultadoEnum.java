package ejercicio1;

public enum ResultadoEnum {
	H("Victoria Local"), A("Victoria Visitante"), D("Empate");

	private String descripcion;

	private ResultadoEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
