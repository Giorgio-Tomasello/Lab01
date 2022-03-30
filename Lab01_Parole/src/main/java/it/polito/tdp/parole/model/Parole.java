package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Parole {
	
	LinkedList<String> listaParole ;
	ArrayList<String> arrayParole;
	//TreeMap<String,Parole> mappaParole;
		
	public Parole() {
		listaParole = new LinkedList<String>();
		//mappaParole  = new TreeMap<String,Parole>();
		//TODO
	}
	
	public void addParola(String p) {
		listaParole.add(p);
		//TODO
	}
	
	public List<String> getElenco() {
		
		Collections.sort(listaParole, new Comparatore());

		//TODO
		return listaParole;
	}
	
	public void reset() {
		listaParole.removeAll(listaParole);
		// TODO
	}
	
	public void removeParola(String p) {
		
		listaParole.remove(p);
		
	}

}
