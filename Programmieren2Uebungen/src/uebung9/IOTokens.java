package uebung9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class IOTokens {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bitte Satz eingeben: ");
		try {
			StreamTokenizer st = new StreamTokenizer(new StringReader(
					r.readLine()));

			while (st.nextToken() != StreamTokenizer.TT_EOF) {

				if (st.ttype == StreamTokenizer.TT_WORD) {
					System.out.println("Word: " + st.sval);
				} else if (st.ttype == StreamTokenizer.TT_NUMBER) {
					System.out.println("Number: " + st.nval);
				} else if (st.ttype == StreamTokenizer.TT_EOL) {
					System.out.println();
				} else {
					System.out.println("Zeichen: " + (char) st.ttype);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
