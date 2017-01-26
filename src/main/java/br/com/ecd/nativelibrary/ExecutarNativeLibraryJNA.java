package br.com.ecd.nativelibrary;

import com.sun.jna.Native;

/**
 * Este � um exemplo b�sico de como fazer chamadas a biblioteca nativas do
 * sistema operacional, como DLL do windows, por exemplo. Interagir com
 * aplica��es desenvolvida em outras linguagens a partir do c�digo Java
 * utilizando JNA(Java Native API).
 * 
 * @author Ergildo.dias
 *
 */
public class ExecutarNativeLibraryJNA {

	/**
	 * M�todo main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Carrega a biblioteca
		NativeLibrary library = (NativeLibrary) Native.loadLibrary("library", NativeLibrary.class);
		// Chama o m�todo sayHello passando como par�metro a palavra "Java"
		String retornLibrary = library.sayHello("Java");
		// Imprime o retorno da chamada do m�todo da biblioteca
		System.out.println("Retorno da DLL:" + retornLibrary);

	}
}
