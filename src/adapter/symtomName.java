package adapter;

import java.util.Comparator;

import domain.Symptom;

public class symtomName implements Comparator<Object>{
	public int compare(Object arg0, Object arg1) {
		return ((Symptom)arg0).getName().compareTo( ((Symptom)arg1).getName() );
	}
}
