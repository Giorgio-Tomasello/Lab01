package it.polito.tdp.parole.model;

import java.util.Comparator;

public class Comparatore implements Comparator<String>{
	
	public int compare(String s1, String s2)
	{
		if(s1.compareTo(s2)>0)
			return 1;
		if(s1.compareTo(s2)<0)
			return -1;
					
	return 0;
	}

}
