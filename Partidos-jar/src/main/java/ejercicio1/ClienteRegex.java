package ejercicio1;


public class ClienteRegex {

	public static void main(String[] args) {
		String archivo = "C:\\Users\\Pa\\eclipse-workspace\\TrabajoPractico3\\src\\PremierLeague.csv";
		String regex = "^(.{2},((\\d{2})[-/](\\d\\d)[-/](\\d\\d\\d\\d)),.{5},(([A-Z]{1}[a-z]+)(\\s)?([A-Z]{1}[a-z]+)?),(([A-Z]{1}[a-z]+)(\\s)?([A-Z]{1}[a-z]+)?),(\\d),(\\d),(\\D),+.*)$";

		LectorDeFichero fichero = new LectorDeFichero(archivo, regex);
		
//		PartidosAdmin pa = new PartidosAdmin();
//		for(Partido p : fichero.getPartidos()) {			
//			pa.agregar(p);
//		}
		
//		System.out.println(pa);
//		
//		pa.ordenar();
//		Equipo e = new Equipo("Liverpool");
//		System.out.println("filtrarPorEquipo(e): " + pa.filtrarPorEquipo(e));
//		System.out.println("pa.fuerteDeLocal(): " + pa.fuerteDeLocal());
//		System.out.println("pa.deportivoEmpate(): " + pa.deportivoEmpate());
//		System.out.println("pa.tablaDePosiciones(): " + pa.tablaDePosiciones());
		
		//instanciando el otro constructor
		PartidosAdmin p = new PartidosAdmin(fichero.getPartidos());
		
		System.out.println(p);

		p.ordenar();
		Equipo e = new Equipo("Liverpool");
		System.out.println("filtrarPorEquipo(e): " + p.filtrarPorEquipo(e));
		System.out.println("p.fuerteDeLocal(): " + p.fuerteDeLocal());
		System.out.println("p.deportivoEmpate(): " + p.deportivoEmpate());
		System.out.println("p.tablaDePosiciones(): " + p.tablaDePosiciones());
		
		

	}
}
