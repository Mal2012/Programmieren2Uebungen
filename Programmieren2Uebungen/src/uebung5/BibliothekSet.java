package uebung5;

import java.util.TreeSet;

public class BibliothekSet extends AbstractBibliothek {

	public BibliothekSet() {
		super.buecher = new TreeSet<Buch>();
	}

}
