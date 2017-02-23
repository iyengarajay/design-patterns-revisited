package factory_method;

public class DuckFactory implements AnimalFactory{
	
	public Animal create(){
		return new Duck();
	}

}
