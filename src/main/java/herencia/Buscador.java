package herencia;

public class Buscador {
	
	private String claveBusqueda;
	private Articulo[] resultados;
	
	//default: visibles en el mimso paquete y poder ser usadas por cualq clase
	public Buscador(String claveDelUsuario) {
		//this.claveBusqueda = claveDelUsuario;
		this.setClaveBusqueda(claveDelUsuario);
		//error nulo!!
		//this.resultados = new Articulo[] {};
		this.setResultados(new Articulo[] {});
	}

	public void buscar() {
		//simular que busco en una db
		
		DBUtil db = new DBUtil();
		
		//Articulo[] resultados = db.ObtenerResultado(this.claveBusqueda);
		//this.resultados = resultados;
		
		//this.resultados = db.ObtenerResultado(this.claveBusqueda);
		this.setResultados(db.ObtenerResultado(this.getClaveBusqueda()));
	}
	
	public void mostrarResultados() {
		
		System.out.println("Hemos encontrado "+ this.cantidadResultados() +" resultados para " + this.claveBusqueda);
		
		//ahoara que tengo los resultados en el obj miBuscador, recorro
		for (Articulo aux : this.resultados) {
			System.out.println("Titulo: " + aux.getTitulo());
			System.out.println("Autor: " + aux.getAutor());
			System.out.println("Img: " + aux.getImg());
			System.out.println("Precio: " + aux.getPrecio());
			System.out.println("----------------------");
		}
	}
	
	int cantidadResultados() {
		return this.resultados.length;
	}
	
	//getters y setters: metodos
	String getClaveBusqueda() {
		return this.claveBusqueda;
	}
	
	Articulo[] getResultados() {
		return this.resultados;
	}
	
	void setResultados(Articulo[] resultados) {
		this.resultados = resultados;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}

}
