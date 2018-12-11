/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
		// AsusROGE
		Computer roge = new Computer(/*todos los atributos*/);
		
		// AsusZenbook
		Computer zenbook = new Computer(/*todos los atributos*/);
		
		//Mostrar las caracteristicas de ambas computadoras 
		roge.toString();
		zenbook.toString();

	}

}
