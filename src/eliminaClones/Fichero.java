package eliminaClones;

import java.io.File;

public class Fichero {
	String nombre;
	long tamano;
	String direccion;
	
public Fichero(String nombre, long tamano,
			String direccion) {
		super();
		this.nombre = nombre;
		this.tamano = tamano;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public long getTamano() {
		return tamano;
	}
	
	public void setTamano(long tamano) {
		this.tamano = tamano;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Fichero [nombre=" + nombre + "]";
	}
	public String comparar(){
		System.out.println(nombre);
		if(nombre.lastIndexOf(".")!=-1)
			return nombre.substring(0,nombre.lastIndexOf("."));
		else
			return nombre;
	}
	
}
