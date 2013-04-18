package uebung4;

public class OrtTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ort<String> einOrt = new Ort<String>(1);
		einOrt.hinzufuegen("OO-Softwareentwicklung");

		String s = einOrt.getEingelagertesElement();
		// s = "OO-Softwareentwicklung"
		System.out.println(einOrt); // "1 OO-Softwareentwicklung"
		s = einOrt.entnehmen();
		System.out.println(einOrt); // "1 null"
	}

}
