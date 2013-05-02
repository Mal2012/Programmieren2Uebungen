package uebung5;

import java.util.LinkedList;

public class BibliothekList extends AbstractBibliothek {

	public BibliothekList() {
		super.buecher = new LinkedList<Buch>();
	}

}
