package tp1.ej8;

public class CircularQueue<T> extends Queue<T> {
	public T shift() { 
		 T e = this.dequeue();
		 this.enqueue(e);
		 return e;
	}
}
