package Assignment6;

import java.util.Comparator;

public class NameComparator implements Comparator<Toy> {
	@Override
	public int compare(Toy t1, Toy t2) {
		return t1.getName().compareTo(t2.getName());
	}
}
