package observer_java_inbuilt_refactored;

import java.util.Observer;

public class ObserverTestRefactored {

	public static void main(String[] args) {
		
		StarWorld channel = new StarWorld();

		//registerObserver, as add does not give reference back for unregistering.
		Observer father = channel.registerObserver(EpisodeWatchers::father);

		Observer mother = channel.registerObserver(EpisodeWatchers::mother);

		Observer child = channel.registerObserver(EpisodeWatchers::child);

		channel.setEpisode(Episode.DESPERATE_HOUSEWIVES);
		channel.setEpisode(Episode.SUITS);
		channel.setEpisode(Episode.MOWGLI);

		channel.deleteObserver(father);
		channel.setEpisode(Episode.SUITS);

	}

}
