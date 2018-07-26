package cr.ac.cenfotec.elemento.extras;

import cr.ac.cenfotec.elemento.Elemento;

public class Guerrero extends DecoradorPersonaje {

	Elemento elemento;
	
	public Guerrero(Elemento elemento) {
		this.elemento = elemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + ", guerrero";
	}

	@Override
	public int vida() {
		return 20 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 30 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 30 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return 20 + this.elemento.magia();
	}
	
}