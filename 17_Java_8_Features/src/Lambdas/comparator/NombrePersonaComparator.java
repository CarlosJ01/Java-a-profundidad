package Lambdas.comparator;

import java.util.Comparator;

public class NombrePersonaComparator implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNonmbre().compareTo(o2.getNonmbre());
	}

}
