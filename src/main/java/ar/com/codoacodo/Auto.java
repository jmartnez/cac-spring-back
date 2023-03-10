package ar.com.codoacodo;

public class Auto {
	
	/*atributos*/
	
	boolean encendido;
	float velocidadActual;
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;
	
	//constructor x defecto (existe)
	Auto(){
		encendido = false;
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}
	
	//new auto(250)
	Auto(final float velocidadMaxima) {
		this.velocidadActual = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//metodos
	
	void encender() {
		if(!encendido) {
			System.out.println("se ha encendido");
			encendido = true;
		} else {
			System.out.println("ya esta encendido");
		}
	}
	
	void apagar() {
		if (encendido) {
			System.out.println("apagando");
			this.encendido = false;
			this.detener();
		} else {
			System.out.println("ya esta apagado");
		}
	}
	
	void acelerar() {
		if(this.encendido) {
			if(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			} else {
				System.out.println("se quema el auto");
			}
		} else {
			System.out.println("debe encender el auto");
		}
	}
	
	void quintaAfondo() {
		if(this.encendido) {
			while (this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}
		} else {
			System.out.println("se quema el auto");
		}
	}
	
	void frenar() {
		//if (this.encendido) {
			if (this.velocidadActual > 0) {
				System.out.println("frenando");
				this.velocidadActual--;
			} else {
				System.out.println("llegaste a 0");
			}
		//} else {
		//	System.out.println("auto apagado");
		//}
	}
	
	void mostrarInfo() {
		System.out.println("encendido:" + encendido);
	}

	public void detener() {
		//acceder a otro metodo, desde un metodo
		//if (this.encendido) {
			while (this.velocidadActual > 0) {
				this.frenar();
			}
		//}
	}

}
