package observer_java_inbuilt_usual;

public class ObserverUsualTest {
	
	public static void main(String[] args) {
		StarWorld channel = new StarWorld();
	
		
		Father father = new Father();
		Mother mother = new Mother();
		Child child = new Child();
		
		channel.addObserver(father);
		channel.addObserver(mother);
		channel.addObserver(child);
		
		
		
		channel.setEpisode(Episode.DESPERATE_HOUSEWIVES);
		channel.setEpisode(Episode.SUITS);
		channel.setEpisode(Episode.MOWGLI);
		
		channel.deleteObserver(father);
		channel.setEpisode(Episode.SUITS);
		
	}

}
