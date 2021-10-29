package observer;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main2Prot {
	private static SymptomFactory sf = new SymptomFactory();

	public static void main(String[] args) {
		lehenAriketa();
		bigarrenAriketa();
		hirugarrenAriketa();
		
	}

	private static void lehenAriketa(){
		// 1. ariketa
		Covid19Pacient cp = new Covid19Pacient("aitor", 36, sf);
		sortu3GUISetForPacient(cp);
	}
	
	private static void bigarrenAriketa() {
		// 2. ariketa
		Covid19Pacient cp1 = new Covid19Pacient("pepe", 56, sf);
		sortu3GUISetForPacient(cp1);
		Covid19Pacient cp2 = new Covid19Pacient("ane", 36, sf);
		sortu3GUISetForPacient(cp2);
		Covid19Pacient cp3 = new Covid19Pacient("sara", 19, sf);
		sortu3GUISetForPacient(cp3);
	}
	private static void hirugarrenAriketa() {
		// 3. ariketa
		Covid19Pacient cp = new Covid19Pacient("aitor", 36, sf);
		sortu3GUISetForPacient(cp);
		new SemaphorGUI(cp);
		
	}
	
	private static void sortu3GUISetForPacient(Covid19Pacient cp) {
		new PacientSymptomGUI(cp);
		new PacientObserverGUI(cp);
		new PacientThermometerGUI(cp);
	}
	
	
}
