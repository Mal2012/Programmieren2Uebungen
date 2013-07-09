package uebung9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.LinkedList;

import uebung9.Kleidungsstueck.Farbe;

public class Artikelverwaltung {

	LinkedList<Artikel> artikel;

	public Artikelverwaltung(Artikel[] artikel) {
		this.artikel = new LinkedList<Artikel>();
		for (Artikel a : artikel) {
			this.artikel.add(a);
		}
	}

	public Artikelverwaltung() {
		this.artikel = new LinkedList<Artikel>();
	}

	public void write(String filename) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(filename));

			writer.write(this.toString());
			writer.write(System.lineSeparator());

		} catch (IOException e) {

		} finally {
			try {
				writer.close();
				System.out.println("Datei erstellt");
			} catch (IOException e) {

			}
		}
	}

	public void create(int anzahl) {

		for (int i = 0; i < anzahl; i++) {
			this.artikel.add(new Jeans((int) (Math.random() * 51), Farbe
					.values()[(int) (Math.random() * Farbe.values().length)],
					"Jeans", (int) (Math.random() * 51)));
		}

	}

	public void read(String filename) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			this.artikel = new LinkedList<Artikel>();
			String line;
			while ((line = reader.readLine()) != null) {
				StreamTokenizer st = new StreamTokenizer(new StringReader(line));
				String[] bla = new String[5];
				int i = 0;
				while (st.nextToken() != StreamTokenizer.TT_EOF) {
					if (st.ttype == StreamTokenizer.TT_WORD) {
						bla[i] = st.sval;
					} else if (st.ttype == StreamTokenizer.TT_NUMBER) {
						bla[i] = String.valueOf(((int) st.nval));
					}
					i++;
				}
				this.artikel.add(new Jeans(Integer.parseInt(bla[2]), Farbe
						.valueOf(bla[3]), bla[1], Integer.parseInt(bla[4])));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < this.artikel.size() - 1; i++)
			buffer.append(this.artikel.toArray()[i]).append(',').append('\n');
		buffer.append(this.artikel.getLast());

		return buffer.toString();
	}
}
