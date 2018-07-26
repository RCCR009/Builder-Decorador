package calculadoracomida.withbuilder;

import calculadoracomida.withbuilder.InformacionComida;
import calculadoracomida.withbuilder.InformacionComida.InformacionComidaBuilder;
import calculadoracomida.withbuilder.Medida;

public class CalculadoraComida {

	public static void main(String[] args) {
		InformacionComida miComida;
		InformacionComidaBuilder  builder = new InformacionComida.InformacionComidaBuilder();
		builder = builder.cantidadPorcion(1).calorias(3).carbohidratos(4);
		miComida = builder.getFood();
		System.out.println(miComida.toString());
	}

}
