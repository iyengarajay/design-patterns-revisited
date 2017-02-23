package static_factory_refactored;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalFactory {

	private Map<String, Supplier<Animal>> animals  = new HashMap<>(); 
	
	public void registerAnimal(String animalName, Supplier<Animal> animal){
		animals.put(animalName, animal);
	}
	
	public Animal create(String animalName){
		return animals.getOrDefault(animalName, 
							() -> {throw new RuntimeException("Extinct");}
						)
				.get();
				
	}	
	
}
