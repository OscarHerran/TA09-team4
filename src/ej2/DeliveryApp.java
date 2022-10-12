package ej2;

public class DeliveryApp {

	public static void main(String[] args) {
		Serie[] series = new Serie[5];
		Videojuego[] juegos = new Videojuego[5];
		
		String SerieArray[] = new String[5];
		String VideoJuegos[] = new String[5];
		
		series[0] = new Serie("hola", 5, "comedia", "yo");
		series[1] = new Serie("hola1", 9, "comedia", "tu");
		series[2] = new Serie("hola2", "el");
		series[3] = new Serie();
		series[4] = new Serie("hola4", 17, "comedia", "si");
		
		juegos[0] = new Videojuego("Halo 5", 500, "sandbox", "microsoft");
		juegos[1] = new Videojuego("Fable", 200);
		juegos[2] = new Videojuego("The lord of the ring ", 900, "estrategia", "si");
		juegos[3] = new Videojuego("Warcraft 3", 60);
		juegos[4] = new Videojuego();
		
		//SERIES
		int cont=0;
		System.out.println("Series: ");
		
		for(Serie s : series) {
			if(s.equals(series[0]) || s.equals(series[3])) {
				s.entregar();
				s.isEntregado();
				cont++;
			}
			System.out.println("Serie: "+s);
		}
		System.out.println("Series entregados: "+ cont);
		System.out.println("Devueltos:");
		for(Serie s : series) {
			if(s.equals(series[0]) || s.equals(series[3])) {
				s.devolver();
				System.out.println("Serie: "+s);
			}
		}
		int MaxTemp=0;
		for(int i = 0; i < series.length; i++) {
			if(series[i].compareTo(series[MaxTemp])) {
				MaxTemp=i;
			}
		}
		System.out.println("\nLa serie con mas temporadas: " + series[MaxTemp].getTitulo() + " con: " + series[MaxTemp].getN_temp());
		
		//VIDEOJUEGOS
		cont=0;
		System.out.println("\nVideojuegos: ");
		for(Videojuego v : juegos) {
			if(v.equals(juegos[1]) || v.equals(juegos[4])) {
				v.entregar();
				v.isEntregado();
				cont++;
			}
			
			System.out.println("Juego: "+v);
		}
		
		System.out.println("Juegos entregados: "+ cont);
		System.out.println("Devueltos:");
		for(Videojuego v : juegos) {
			if(v.equals(juegos[1]) || v.equals(juegos[4])) {
				v.devolver();
				System.out.println("Juego: "+v);
			}
		}
		int MaxHoras=0;
		for(int i = 0; i < juegos.length; i++) {
			if(juegos[i].compareTo(juegos[MaxHoras])) {
				MaxHoras=i;
			}
		}
		System.out.println("\nEl juego con mas horas: " + juegos[MaxHoras].getTitulo() + " con: " + juegos[MaxHoras].getH_estimadas());
		
		
	}

}
