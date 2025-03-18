package tp1.ej8;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> extends Sequence {
	protected List<T> data;

	public Queue() {
		data = new ArrayList<T>();
	}

	public void enqueue(T dato) {
		data.add(dato);
	}

	public T dequeue() {
		T e = data.get(0);
		data.remove(0);
		return e;
	}

	public T head() {
		T e = data.get(0);
		return e;
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
		/*
		 * En realidad quieren que pongamos: return data.size()==0;
		 */
	}

	@Override
	public String toString() {
		return "Queue [data=" + data + "]";
		/*
		 * Podria iterar pero es lo mismo, ya lo hace solo.
		 */
	}

}
