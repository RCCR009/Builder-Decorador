package cr.ac.cenfotec.elemento.extras;

import cr.ac.cenfotec.elemento.Elemento;

public class Armadura extends DecoradorObjeto {

	Elemento elemento;
	
	public Armadura(Elemento elemento) {
		this.elemento = elemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + ", armadura";
	}

	@Override
	public int vida() {
		return 20 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 0 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 20 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return 0 + this.elemento.magia();
	}

}
