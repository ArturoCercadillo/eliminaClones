package eliminaClones;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	static ArrayList<Fichero> ficheros;
	static ArrayList<Fichero> ficherosRepes;
	static ArrayList<Fichero> ficherosRepesAFondo;
	public static void main(String [] args){
		interfaz interfaz = new interfaz();
		ficheros = new ArrayList<Fichero>();
		ficherosRepes = new ArrayList<Fichero>();
		ficherosRepesAFondo = new ArrayList<Fichero>();
		String ruta = ".";
		final File folder = new File(ruta);
		listFilesForFolder(folder);
		Iterator i = ficheros.iterator();
			while (i.hasNext()){
				Fichero fich = (Fichero) i.next();
				System.out.println(fich.toString());
		}
		System.out.println();
		System.out.println("REPETIDOS");
		System.out.println();
		i = ficherosRepes.iterator();
			while (i.hasNext()){
				Fichero fich = (Fichero) i.next();
				interfaz.escribir(fich.toString()+" --> "+fich.getDireccion());
				System.out.println(fich.toString()+" --> "+fich.getDireccion());
		}
	}
	public static void listFilesForFolder(final File folder) {
		System.out.println("leyendo");
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
				comprobar(fileEntry);
	            ficheros.add(nuevoFichero(fileEntry));
	        }
	    }
	}
	public static Fichero nuevoFichero(File fileEntry){
		Fichero fich = new Fichero(fileEntry.getName(), fileEntry.getTotalSpace(), fileEntry.getAbsolutePath());
		return fich;
	}
	public static void comprobar(File f){
	Iterator i = ficheros.iterator();
	while (i.hasNext()){
		Fichero fich = (Fichero) i.next();
		if (fich.getNombre().equals(f.getName())){
			ficherosRepes.add(fich);
			ficherosRepes.add(nuevoFichero(f));
		}
	}
	
}
	public static void buscarAFondo(){
		ficherosRepesAFondo = new ArrayList<Fichero>();
		Iterator i = ficheros.iterator();
		while(i.hasNext()){
			Fichero f = (Fichero) i.next();
			Iterator ite = ficheros.iterator();
			while(ite.hasNext()){
				Fichero file = (Fichero) ite.next();
				if (!f.getNombre().equals(file.getNombre()))
				if (f.toString().contains(file.comparar())){
					ficherosRepesAFondo.add(f);
					ficherosRepesAFondo.add(file);
				}
			}
		}
		i = ficherosRepesAFondo.iterator();
		interfaz inter = new interfaz();
		while(i.hasNext()){
			Fichero fich = (Fichero) i.next();
			inter.escribir(fich.toString()+" --> "+fich.getDireccion());
		}
	}
}
