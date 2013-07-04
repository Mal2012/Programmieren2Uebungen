package uebung9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);

		//
		// createTestFile();
		//
		// long timetemp2 = System.nanoTime();
		// System.out.println(compare(file1, file2));
		// System.out.println(System.nanoTime() - timetemp2);

		long timetemp = System.nanoTime();
		System.out.println(compare2(file1, file2));
		System.out.println(System.nanoTime() - timetemp);

		// long timetemp3 = System.nanoTime();
		// System.out.println(compare3(file1, file2));
		// System.out.println(System.nanoTime() - timetemp3);

	}

	public static void copy(File file1, File file2) {
		FileChannel reader;
		FileChannel writer;
		try {
			reader = new FileInputStream(file1).getChannel();
			writer = new FileOutputStream(file2).getChannel();

			reader.transferTo(0, reader.size(), writer);

			reader.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void cat(String file1) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			String templine = reader.readLine();
			Scanner scanner = new Scanner(System.in);
			int counter = 0, length = 40;
			while (templine != null) {
				counter++;
				if (counter <= length) {
					System.out.println(templine);
					templine = reader.readLine();
				} else {
					System.out.println("Press \"Return\" to continue");
					scanner.nextLine();
					counter = 0;
				}
			}
			reader.close();
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Boolean compare(File file1, File file2) {
		try {
			InputStreamReader input1 = new InputStreamReader(
					new FileInputStream(file1));

			InputStreamReader input2 = new InputStreamReader(
					new FileInputStream(file2));

			byte[] temp1 = new byte[4096];
			byte[] temp2 = new byte[4096];

			if (file1.length() != file2.length()) {

				input1.close();
				input2.close();
				return false;
			} else {

				for (int j = 0; j <= (file1.length() / 4096); j++) {

					for (int i = 0; i < 4096; i++) {

						temp1[i] = (byte) input1.read();
						temp2[i] = (byte) input2.read();
						if (temp1[i] == temp2[i]) {
							continue;
						} else {
							return false;
						}
					}
					temp1 = new byte[4096];
					temp2 = new byte[4096];
				}

			}

			input1.close();
			input2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;

	}

	public static Boolean compare2(File file1, File file2) {
		try {
			InputStreamReader input1 = new InputStreamReader(
					new FileInputStream(file1));

			InputStreamReader input2 = new InputStreamReader(
					new FileInputStream(file2));

			if (file1.length() != file2.length()) {

				input1.close();
				input2.close();
				return false;
			} else {
				int tempLength = (int) file1.length();
				while (tempLength > 0) {

					if (input1.read() == input2.read()) {
						tempLength--;
						continue;
					} else {
						input1.close();
						input2.close();
						return false;
					}

				}

			}

			input1.close();
			input2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;

	}

	public static Boolean compare3(File file1, File file2) {

		if (file1.hashCode() == file2.hashCode()) {
			return true;
		} else {
			return false;
		}

	}

	public static void createTestFile() {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("Testfile.dat"), 4096);
			for (int i = 0; i < 1024 * 1024 * 1024; i++) {
				writer.write((byte) (Math.random() * 128));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("penis");
				}
			}
		}
	}

}
