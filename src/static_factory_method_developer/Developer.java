package static_factory_method_developer;

public abstract class Developer {
	
	private String firstName;
	
	private String lastName;
	
	private String[] skills;
	
	private int experience;
	
	
	public abstract void conductInterview();
	
	
	public void callForInterview(){
		System.out.println("Contact developer for interview..");
	}
	
	public void makeOffer(){
		System.out.println("Make an offer...");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
