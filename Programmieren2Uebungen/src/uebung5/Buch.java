package uebung5;

public class Buch implements Comparable<Buch> {

	protected final String isbn, autor, titel;

	public Buch(String isbn, String autor, String titel) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.titel = titel;
	}

	@Override
	public int compareTo(Buch b) {
		return this.isbn.compareTo(b.isbn);
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitel() {
		return titel;
	}

	@Override
	public String toString() {
		return "\n" + String.format("%-22s", autor) + " "
				+ String.format("\"%-15s\"", titel) + " "
				+ String.format("%13s", isbn);
	}

}
