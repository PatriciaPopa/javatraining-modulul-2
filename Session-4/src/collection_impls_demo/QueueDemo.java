package collection_impls_demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		que.offer(2);
		que.offer(3);
		que.add(4);

		System.out.println(que);

		/* ---------------------------------------------------------------- */
		System.out.println(que.element());
		System.out.println(que.peek());

		Queue<Integer> que1 = new LinkedList<>();
		System.out.println(que1.peek());

		/* Cand elementul nu exista, metoda element() arunca o exceptie */

		// System.out.println(que1.element());

		/* ---------------------------------------------------------------- */
		System.out.println(que.poll());
		System.out.println(que.remove());

		System.out.println(que1.poll());

		/* Cand elementul nu exista, metoda element() arunca o exceptie */

//		System.out.println(que1.remove());

		System.out.println(que);
	}

}
