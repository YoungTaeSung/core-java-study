package czymongrel.generic.basic;

public class GenericPair<T> {
	private T first;
	private T second;
	
	public GenericPair() { first = null; second = null; }
	public GenericPair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	public T getFirst() { return first; }
	public T getSecond() { return second; }
	public void setFirst(T newFirst) { first = newFirst; }
	public void setSecond(T newSecond) { second = newSecond; }
}
