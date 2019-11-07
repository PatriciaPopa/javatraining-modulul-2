package lambda_demos;

import java.util.*;

public class LambdaForEach {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ion");
		list.add("ana");
		list.add("maria");
		list.add("gigi");

		list.forEach((n) -> System.out.println(n));
	}
}