import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class ImagePlayer extends Component {
	BufferedImage bufferedImage = null;

	ImagePlayer() {
		String imageFilename = "C:\\temp\\jyoukyuImage1.jpg";
		try {
			bufferedImage = ImageIO.read(new File(imageFilename));
		} catch (IOException e) {
			System.out.println("image file not found. [" + imageFilename + "]");
		}
	}

	public void paint(Graphics graphics) {
		graphics.drawImage(bufferedImage, 0, 0, null);
	}

	public Dimension getPreferredSize() {
		int width = 100;
		int height = 100;
		if (bufferedImage != null) {
			width = bufferedImage.getWidth(null);
			height = bufferedImage.getHeight(null);
		}
		return new Dimension(width, height);
	}

	void writeImage() {
	}
	public static void main(String[] args) {
		ImagePlayer image = new ImagePlayer();
		image.paint(null);
		image.getPreferredSize();
		image.writeImage();
	
	}
}