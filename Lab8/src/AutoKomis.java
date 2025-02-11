import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AutoKomis {

	private int lp;

	public static void main(String[] args) {
		ArrayList<Samochod> komis = new ArrayList<>();

		Samochod auto1 = new Samochod("s","a",99.999);

		komis.add(auto1);
		komis.add(new Samochod("a","s",199.999));
		komis.add(new Samochod("b","v",299.999));
		komis.add(new Samochod("v","b",399.999));

		Set<Double> pojemnosci = new TreeSet<>();

		komis.forEach((n)->{
			pojemnosci.add(n.getPojemnoscSilnika());
		});

		System.out.println(pojemnosci);

		if(komis.contains(auto1))
		{
			System.out.println("Auto Komis");
		}

	}

}
