package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonCreator extends JFrame implements ActionListener{
	
	JButton creBt, color;
	JPanel p_north,p_south;
	int count=0;
	
	public ButtonCreator() {
		creBt= new JButton("버튼생성");
		color = new JButton("색상");
		
		p_north=new JPanel();
		p_south=new JPanel();
		
		p_north.add(creBt);
		p_north.add(color);
		
		add(p_north,BorderLayout.NORTH);
		
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		/*creBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				p_south.add(new JButton(Integer.toString(count)));
				add(p_south,BorderLayout.CENTER);
				p_south.updateUI();
			}
		});
		*/
		
		creBt.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {	
		count++;
		p_south.add(new JButton(Integer.toString(count)));
		add(p_south,BorderLayout.CENTER);
		p_south.updateUI();
	}
	public static void main(String[] args) {
		new ButtonCreator();
	}

}
