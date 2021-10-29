package adapter;

import java.util.Comparator;

import domain.Symptom;

public class symtomName implements Comparator<Symptom>{
	public int compare(Symptom arg0, Symptom arg1) {
		return (arg0.getName().compareTo(arg1.getName()))<=0 ? 0 : 1;
	}
}
