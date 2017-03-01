package observer_java_inbuilt_refactored;

import java.util.Observable;

public class EpisodeWatchers {

	public static void father(Observable observable, Object obj) {
		if(observable instanceof StarWorld){
			if((Episode)obj == Episode.SUITS){
				System.out.println("Father : Suit up !!!!");
			}	
		};
	}

	public static void mother(Observable observable, Object obj) {
		if(observable instanceof StarWorld){
			if((Episode)obj == Episode.DESPERATE_HOUSEWIVES){
				System.out.println("Mother : Grab remote from mother-in-law and get ready..");
			}
		};
	}

	public static void child(Observable observable, Object obj) {
		if (observable instanceof StarWorld) {
			if ((Episode) obj == Episode.MOWGLI) {
				System.out.println("Child : Finish studying, Get pop-corn, Enjoy....");
			}
		}
		;
	}
}
