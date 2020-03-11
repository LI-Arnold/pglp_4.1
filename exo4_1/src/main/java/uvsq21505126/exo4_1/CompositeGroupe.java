package uvsq21505126.exo4_1;

import java.util.ArrayList;
import java.util.List;

public class CompositeGroupe implements Groupe{
	private List<Groupe> childGroupe = new ArrayList<Groupe>();
	
	public void print() {
		for (Groupe groupe : childGroupe) {
			groupe.print();
		}
	}
	
	public void add(Groupe groupe) {
		childGroupe.add(groupe);
	}
	
	public void remove(Groupe groupe) {
		childGroupe.remove(groupe);
	}
	
}
