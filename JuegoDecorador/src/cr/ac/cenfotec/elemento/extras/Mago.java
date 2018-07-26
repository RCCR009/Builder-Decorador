package cr.ac.cenfotec.elemento.extras;

import cr.ac.cenfotec.elemento.Elemento;

public class Mago extends DecoradorPersonaje {

Elemento elemento;
	
	public Mago(Elemento elemento) {
		this.elemento = elemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + ", mago";
	}

	@Override
	public int vida() {
		return 8 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 15 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 15 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return 40 + this.elemento.magia();
	}

}