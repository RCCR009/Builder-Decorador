package cr.ac.cenfotec.elemento.extras;

import cr.ac.cenfotec.elemento.Elemento;

public class Amuleto extends DecoradorObjeto {

	Elemento elemento;
	
	public Amuleto(Elemento elemento) {
		this.elemento = elemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + ", espada";
	}

	@Override
	public int vida() {
		return 0 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 0 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 0 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return 10 + this.elemento.magia();
	}

}
