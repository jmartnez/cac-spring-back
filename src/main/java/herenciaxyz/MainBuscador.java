package herenciaxyz;

import herencia.Buscador;

public class MainBuscador {
	
	public static void main(String[] args) {
		
		//simular que el usuario escribio algo
		String claveDelUsuario = "iron man";
		
		Buscador miBuscador = new Buscador(claveDelUsuario);
		
		miBuscador.setClaveBusqueda(claveDelUsuario);
		
		miBuscador.buscar();
		
		//ahora q tengo los resultados, recorro
		miBuscador.mostrarResultados();
		
	}

}
