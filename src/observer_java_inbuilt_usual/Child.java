package observer_java_inbuilt_usual;

import java.util.Observable;
import java.util.Observer;

public class Child implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof StarWorld){
			if((Episode)arg == Episode.MOWGLI){
				System.out.println("Child : Finish studying, Get pop-corn, Enjoy....");
			}
		}
	}

}
