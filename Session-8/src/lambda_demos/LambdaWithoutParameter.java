package lambda_demos;

@FunctionalInterface
interface Sayable {
	public String say();
}

public class LambdaWithoutParameter {

	public static void main(String[] args) {

		Sayable s = () -> {
			return "I have nothing to say.";
		};

		System.out.println(s.say());
	}
}