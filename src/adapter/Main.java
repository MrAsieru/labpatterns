package adapter;

import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;
import factory.PacientSymptomGUI;
import factory.SymptomFactory;

public class Main {
	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("Paco", 66, new SymptomFactory());
		p1.addSymptom(new Symptom("aneurisma", 1, 10), null);
		p1.addSymptom(new Symptom("mocos", 1, 1), null);
		p1.addSymptom(new Symptom("fiebre", 1, 2), null);
		p1.addSymptom(new Symptom("mareo", 1, 7), null);
		p1.addSymptom(new Symptom("zarandeos", 1, -1), null);
		
		Iterator<Object> myNameIterator = Sorting.sortedIterator(new Covid19PacientAdapter(p1), new symtomName());
		for (Iterator iterator = myNameIterator; iterator.hasNext();) {
			Symptom s = (Symptom) iterator.next();
			System.out.println("Sintomaren izanea: "+s.getName());
		}
		
		Iterator<Object> mySeverityIterator = Sorting.sortedIterator(new Covid19PacientAdapter(p1), new severityIndex());
		for (Iterator iterator = mySeverityIterator; iterator.hasNext();) {
			Symptom s = (Symptom) iterator.next();
			System.out.println("Sintomaren garrantzia: "+s.getSeverityIndex());
		}

	}
}
