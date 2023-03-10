package herencia;

public class MainBuscador {
	
	public static void main(String[] args) {
		
		//simular que el usuario escribio algo
		String claveDelUsuario = "iron man";
		
		Buscador miBuscador = new Buscador(claveDelUsuario);
		
		//miBuscador.claveBusqueda = "";
		miBuscador.setClaveBusqueda(claveDelUsuario);
		
		miBuscador.buscar();
		
		//System.out.println("Mostrando resultados");
		//ahora que tengo los resultados en el obj miBuscador, recorro.. 
		miBuscador.mostrarResultados();
		
	}

}
