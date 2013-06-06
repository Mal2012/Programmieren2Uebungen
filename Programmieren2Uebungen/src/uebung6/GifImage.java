package uebung6;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GifImage extends JPanel {

	private Image img;

	public GifImage() {

		try {
			img = ImageIO.read(new File("src/uebung6/baum29.gif"));
		} catch (Exception e) {
			System.out.print("IO exception");
		}
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (img != null) {
			g.drawImage(img, 0, 0, 140, 140, this);
		}

	}

}
