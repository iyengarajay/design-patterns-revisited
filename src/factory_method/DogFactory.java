package factory_method;

public class DogFactory implements AnimalFactory{
	
	public Animal create(){
		return new Dog();
	}

}
