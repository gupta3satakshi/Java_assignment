package Assignment6;

import java.util.Comparator;

public class ProdIdComparator implements Comparator<Toy> {

	@Override
	public int compare(Toy t1, Toy t2) {
		return Integer.compare(t1.getProd_id(), t2.getProd_id());
	}

}
