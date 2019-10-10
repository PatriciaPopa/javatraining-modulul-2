package inheritance_demo;

public class AnimalDemo {
	public static void main(String[] args) {

		// atata timp cat clasa Animal e abstracta, nu putem sa o mai instantiem (sa
		// apelam costructorul sau, folosind new)
//		Animal ani1 = new Animal();
//		Animal ani2 = new Animal("blabla", 1);
//
		Dog d1 = new Dog();
		Dog d2 = new Dog("Jimmy", 2, "golden retriever");
		Dog d3 = new Dog("Tony", 1);
		System.out.println(d3.getBreed());
		d3.doDogTalk();

		// atata timp cat clasa Animal e abstracta, nu putem sa o mai instantiem (sa
		// apelam costructorul sau, folosind new)
//		Dog d5 = new Animal();

		Animal ani4 = new Dog();
		Dog d4 = new Dog();
		ani4.talk(); // dog
		d4.talk(); // dog

//		d4.doDogTalk();

	}
}
