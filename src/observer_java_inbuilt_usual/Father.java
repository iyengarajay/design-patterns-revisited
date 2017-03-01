package observer_java_inbuilt_usual;

import java.util.Observable;
import java.util.Observer;

public class Father implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof StarWorld){
			if((Episode)arg == Episode.SUITS){
				System.out.println("Father : Suit up !!!!");
			}	
		}
		
	}

}
