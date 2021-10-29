package adapter;

import java.util.Comparator;

import domain.Symptom;
import domain.Symptom;

public class severityIndex implements Comparator<Symptom>{
	public int compare(Symptom arg0, Symptom arg1) {
		return (arg0.getSeverityIndex()<arg1.getSeverityIndex()) ? 0 : 1;
	}
}
