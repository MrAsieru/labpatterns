package factory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.DigestiveSymptom;
import domain.NeuroMuscularSymptom;
import domain.RespiratorySymptom;
import domain.Symptom;

public class SymptomFactory {
	private Map<String, Symptom> symptomList;
	
	public SymptomFactory() {
		this.symptomList = new HashMap<>();
		symptomList.put("nauseas", new DigestiveSymptom("nauseas", (int)5.0, 1));
		symptomList.put("vómitos", new DigestiveSymptom("vómitos", (int)4.8, 1));
		symptomList.put("diarrea", new DigestiveSymptom("diarrea", (int)0.9, 1));
		
		symptomList.put("fiebre", new NeuroMuscularSymptom("fiebre", (int)87.9, 5));
		symptomList.put("astenia", new NeuroMuscularSymptom("astenia", (int)38.1, 5));
		symptomList.put("cefalea", new NeuroMuscularSymptom("cefalea", (int)13.6, 3));
		symptomList.put("mialgia", new NeuroMuscularSymptom("mialgia", (int)14.8, 3));
		symptomList.put("escalofrios", new NeuroMuscularSymptom("escalofrios", (int)11.4, 3));
		symptomList.put("mareos", new NeuroMuscularSymptom("mareos", (int)3.2, 1));
		
		symptomList.put("tos seca", new RespiratorySymptom("tos seca", (int)67.7, 5));
		symptomList.put("expectoracion", new RespiratorySymptom("expectoracion", (int)33.4, 5));
		symptomList.put("disnea", new RespiratorySymptom("disnea", (int)18.6, 3));
		symptomList.put("dolor de garganta", new RespiratorySymptom("dolor de garganta", (int)13.9, 3));
		symptomList.put("congestión nasal", new RespiratorySymptom("congestión nasal", (int)3.7, 1));
		symptomList.put("hemoptisis", new RespiratorySymptom("hemoptisis", (int)0.8, 1));
		symptomList.put("congestion conjuntival", new RespiratorySymptom("congestion conjuntival", (int)2.1, 1));
		
	}
	
	public Symptom createSymptom(String symptomName) {
		if (symptomList.containsKey(symptomName)) return symptomList.get(symptomName);
		else return null;
	}
}
