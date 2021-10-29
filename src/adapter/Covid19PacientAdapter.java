package adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import domain.Covid19Pacient;
import domain.Symptom;
import observer.PacientObserverGUI;

public class Covid19PacientAdapter implements InvertedIterator{
	List<Symptom> list;
	int counter;
	
	public Covid19PacientAdapter(Covid19Pacient p) {
		this.list = new ArrayList<>(p.getSymptoms());
		this.counter = this.list.size();
	}
	
	public Symptom previous() {
		return list.get(--counter);
	}
	
	public void goLast() {
		counter = list.size();
	}
	
	public boolean hasPrevious() {
		return counter-1>=0;
	}
}
