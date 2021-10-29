package observer;

import java.awt.Color;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;


public class SemaphorGUI extends JFrame implements Observer{
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		Covid19Pacient cp = (Covid19Pacient) arg0;
		double impact = cp.covidImpact();
		Color c;
		if 		(impact < 5) 	c = Color.green;
		else if (impact < 10) 	c = Color.yellow;
		else 					c = Color.red;
		
		getContentPane().setBackground(c);
		repaint();
	}
}     

