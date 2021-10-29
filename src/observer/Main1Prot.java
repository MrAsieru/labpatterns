package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main1Prot {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory sf = new SymptomFactory();
		Observable pacient=new Covid19Pacient("aitor", 35, sf);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		
		PacientSymptomGUI frame = new PacientSymptomGUI((Covid19Pacient) pacient);

		// 2. Covid Pacient
		Observable pacient2=new Covid19Pacient("pedro", 23, sf);
		PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
		
		PacientSymptomGUI frame2 = new PacientSymptomGUI((Covid19Pacient) pacient2);
	}


}
