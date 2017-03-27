package file;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class MyIcon extends ImageIcon{
	
	public MyIcon(URL url, int width, int height) {
		super(url);
		
		Image size = this.getImage();
		Image re_size = size.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
		this.setImage(re_size);
		
		
	}
}
