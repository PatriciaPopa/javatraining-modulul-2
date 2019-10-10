package inheritance_demo;

import package1.Derived;

public abstract class Animal {
	protected String name;
	protected float age;

	public Animal() {

	}

	public Animal(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

//	public void talk() {
//		System.out.println("Animal is talking");
//	}

	public abstract void talk();

	protected /* final */ Object doNothing() {
		return new Object();
	}

}
