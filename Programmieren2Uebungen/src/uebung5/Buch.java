package uebung5;

public class Buch implements Comparable {
	protected String autor, isbn, titel;

	public Buch(String autor, String isbn, String titel) {
		super();
		this.autor = autor;
		this.isbn = isbn;
		this.titel = titel;
	}

	@Override
	public String toString() {
		return "Buch [autor=" + autor + ", isbn=" + isbn + ", titel=" + titel
				+ "]";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
