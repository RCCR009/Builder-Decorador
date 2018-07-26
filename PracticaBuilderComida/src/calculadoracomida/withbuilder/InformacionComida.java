/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida.withbuilder;

/**
 *
 * @author maguero
 */
public class InformacionComida {
    private String nombre; 
    private int cantidadPorcion;
    private Medida unidadDeMedida;
    private int porciones;
    private int calorias;
    private int grasa;
    private int sodio;
    private int carbohidratos;

    public InformacionComida(String pNombre, int pCantidadPorcion, Medida pMedida, 
                              int pPorciones, int pCalorias, int pGrasa, int pSodio, int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}
    
	public static class InformacionComidaBuilder {
	    private String nestedNombre; 
	    private int nestedCantidadPorcion;
	    private Medida nestedUnidadDeMedida;
	    private int nestedPorciones;
	    private int nestedCalorias;
	    private int nestedGrasa;
	    private int nestedSodio;
	    private int nestedCarbohidratos;
	    
	    public InformacionComidaBuilder() {
	    	
	    }
	    
	    
	    public InformacionComidaBuilder  nombre(String pnombre) {
	    	this.nestedNombre = pnombre;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder  cantidadPorcion(int pcantidadPorcion) {
	    	this.nestedCantidadPorcion = pcantidadPorcion;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder  unidadMedida(Medida punidadMedida) {
	    	this.nestedUnidadDeMedida = punidadMedida;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder  porciones(int pporciones) {
	    	this.nestedPorciones = pporciones;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder  calorias(int pcalorias) {
	    	this.nestedCalorias = pcalorias;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder  grasa(int pgrasa) {
	    	this.nestedGrasa = pgrasa;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder  sodio(int psodio) {
	    	this.nestedSodio = psodio;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder  carbohidratos(int pcarbohidratos) {
	    	this.nestedCarbohidratos = pcarbohidratos;
	    	return this;
	    }
	    
	    public InformacionComida getFood() {
	    	return new InformacionComida(nestedNombre, nestedCantidadPorcion, nestedUnidadDeMedida, 
                    nestedPorciones, nestedCalorias, nestedGrasa, nestedSodio, nestedCarbohidratos);
	    }
	    
	}
    
}
