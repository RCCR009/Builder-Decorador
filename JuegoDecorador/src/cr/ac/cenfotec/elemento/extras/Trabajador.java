package cr.ac.cenfotec.elemento.extras;

import cr.ac.cenfotec.elemento.Elemento;

public class Trabajador extends DecoradorPersonaje {

Elemento elemento;
	
	public Trabajador(Elemento elemento) {
		this.elemento = elemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + ", trabajador";
	}

	@Override
	public int vida() {
		return 25 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 10 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 10 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return 10 + this.elemento.magia();
	}

}
