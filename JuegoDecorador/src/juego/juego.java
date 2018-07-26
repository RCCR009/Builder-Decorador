package juego;

import cr.ac.cenfotec.elemento.Personaje;
import cr.ac.cenfotec.elemento.extras.*;

public class juego {
	
	public static void main(String[] args) {
		Personaje personaje = new Personaje();
		
		Guerrero guerrero = new Guerrero(personaje);
		Mago mago = new Mago(personaje);
		Trabajador trabajador = new Trabajador(personaje);
		
		System.out.println("Tenemos un "+ personaje.getNombre() + " que tiene:\n"+
		"> vida = "+personaje.vida()+ "\n"+ "> Ataque = "+ personaje.ataque()+"\n"+
		"> Defensa = " +personaje.defensa()+"\n"+ "> Magia = " +personaje.magia());
		
		System.out.println("Tenemos un "+ guerrero.getNombre() + " que tiene:\n"+
				"> vida = "+guerrero.vida()+ "\n"+ "> Ataque = "+ guerrero.ataque()+
				"\n"+ "> Defensa = " +guerrero.defensa()+ "\n"+ "> Magia = " +guerrero.magia());
		
		System.out.println("Tenemos un "+ mago.getNombre() + " que tiene:\n"+
				"> vida = "+mago.vida()+ "\n"+ "> Ataque = "+ mago.ataque()+
				"\n"+ "> Defensa = " +mago.defensa()+ "\n"+ "> Magia = "+mago.magia());
		
		System.out.println("Tenemos un "+ trabajador.getNombre() + " que tiene:\n"+
				"> vida = "+trabajador.vida()+ "\n"+ "> Ataque = "+ trabajador.ataque()+
				"\n"+ "> Defensa = " +trabajador.defensa()+ "\n"+ "> Magia = " +trabajador.magia());
		
	}

}
