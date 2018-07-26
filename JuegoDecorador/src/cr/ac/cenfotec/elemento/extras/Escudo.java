package cr.ac.cenfotec.elemento.extras;

import cr.ac.cenfotec.elemento.Elemento;

public class Escudo extends DecoradorObjeto {

	Elemento elemento;
	
	public Escudo(Elemento elemento) {
		this.elemento = elemento;
	}
	
	@Override
	public String getNombre() {
		return this.elemento.getNombre() + ", escudo";
	}

	@Override
	public int vida() {
		return 10 + this.elemento.vida();
	}

	@Override
	public int ataque() {
		return 0 + this.elemento.ataque();
	}

	@Override
	public int defensa() {
		return 40 + this.elemento.defensa();
	}

	@Override
	public int magia() {
		return 0 + this.elemento.magia();
	}
}
