package inheritance_demo;

public class Dog extends Animal implements TerrestrialAnimal {
	private String breed;

	public Dog(String name, float age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	public Dog(String name, float age) {
		this(name, age, "husky");
	}

	public Dog() {

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void doDogTalk() {
		talk();
	}

	@Override
	public void talk() {
		System.out.println("Dog is talking");
	}

	@Override
	public String doNothing() {
		return new String();
	}

	@Override
	public void walk() {
		System.out.println("Dog is walking");
	}
}
