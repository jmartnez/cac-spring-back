package herencia;

public class DBUtil {

	Articulo[] ObtenerResultado(String claveBusqueda) {
		
		Articulo primero = new Articulo("https://sitio.com.ar/img/img1.jpg", "titulo" + claveBusqueda, "AUTOR1", 4390);
		Articulo segundo = new Articulo("https://sitio.com.ar/img/img2.jpg", "titulo" + claveBusqueda, "AUTOR2", 40500);
		Articulo tercero = new Articulo("https://sitio.com.ar/img/img3.jpg", "titulo" + claveBusqueda, "AUTOR3", 2040);
		
		//crear un array
		//Articulo[] resultados = new Articulo[3];
		//resultados[0] = primero;
		//resultados[1] = segundo;
		//resultados[2] = tercero;
		
		//Articulo[] res = new Articulo[] {primero,segundo,tercero};
		
		//return res;
		
		return new Articulo[] {primero,segundo,tercero};

	}	
	
}
