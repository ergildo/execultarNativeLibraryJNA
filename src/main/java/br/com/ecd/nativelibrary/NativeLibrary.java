package br.com.ecd.nativelibrary;

import com.sun.jna.Library;

/**
 * Representa a biblioteca library.dll. Devem ser definidos aqui os mesmo com a
 * mesma assinatura da biblioteca.
 * 
 * @author Ergildo.dias
 *
 */
public interface NativeLibrary extends Library {
	/**
	 * M�todo com a mesma assintatura da bilbioteca
	 * 
	 * @param name
	 * @return retorno da chamada do m�todo da biblioteca
	 */
	public String sayHello(String name);
}
