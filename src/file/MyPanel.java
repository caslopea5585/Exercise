package file;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	JLabel la;
	JButton bt;
	
	public MyPanel(Icon icon,String title) {
		la = new JLabel(title);
		bt = new JButton(icon);
		
		bt.setFocusPainted(false);
		bt.setOpaque(false);
		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		
		
		setLayout(new BorderLayout());
		add(la,BorderLayout.NORTH);
		add(bt, BorderLayout.CENTER);
		
		
	}
}
