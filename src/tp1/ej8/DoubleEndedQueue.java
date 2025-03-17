package tp1.ej8;

public class DoubleEndedQueue<T> extends Queue<T> {
	public void enqueueFirst(T e){
		data.add(0,e);
	}
}
