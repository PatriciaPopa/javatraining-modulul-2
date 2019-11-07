package lambda_demos;

@FunctionalInterface
interface Sayable1 {
	public String say(String name);
}

public class LambdaWithOneParameter {
	public static void main(String[] args) {

		int a = 4;
		// Lambda expression with single parameter.
		Sayable1 s1 = (name) -> {
			return "Hello, " + name;
		};

		System.out.println(s1.say("Ion"));

		// You can omit function parentheses
		Sayable1 s2 = name1 -> {
			return "Hello, " + name1;
		};

		System.out.println(s2.say("Sonoo"));

		// You can also omit the curly brackets when you have exactly 1 parameter
		Sayable1 s3 = name -> "Hello, " + name;

		System.out.println(s2.say("Gigi"));
	}
}