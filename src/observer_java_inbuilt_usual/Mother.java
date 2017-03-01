package observer_java_inbuilt_usual;

import java.util.Observable;
import java.util.Observer;

public class Mother implements Observer{

	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof StarWorld){
			if((Episode)arg == Episode.DESPERATE_HOUSEWIVES){
				System.out.println("Mother : Grab remote from mother-in-law and switch channel..");
			}
		}
		
	}

}
