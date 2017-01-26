package br.com.ecd.nativelibrary;

import com.sun.jna.Native;

/**
 * Este é um exemplo básico de como fazer chamadas a biblioteca nativas do
 * sistema operacional, como DLL do windows, por exemplo. Interagir com
 * aplicações desenvolvida em outras linguagens a partir do código Java
 * utilizando JNA(Java Native API).
 * 
 * @author Ergildo.dias
 *
 */
public class ExecutarNativeLibraryJNA {

	/**
	 * Método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Carrega a biblioteca
		NativeLibrary library = (NativeLibrary) Native.loadLibrary("library", NativeLibrary.class);
		// Chama o método sayHello passando como parâmetro a palavra "Java"
		String retornLibrary = library.sayHello("Java");
		// Imprime o retorno da chamada do método da biblioteca
		System.out.println("Retorno da DLL:" + retornLibrary);

	}
}
