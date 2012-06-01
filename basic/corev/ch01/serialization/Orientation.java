package corev.ch01.serialization;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Orientation implements Serializable {
	//private fields
	private int value;
	private Orientation(int v) { value = v; }
	
	//public fields
	public static final Orientation HORIZONTAL = new Orientation(1);
	public static final Orientation VERTICAL = new Orientation(2);

	protected Object readResolve() throws ObjectStreamException {
		if(value == 1) return Orientation.HORIZONTAL;
		if(value == 2) return Orientation.VERTICAL;
		return null;
	}
}
