package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame{
	
	JTextArea area;
	JTextField txt;
	JButton bt;
	JPanel p_north;
	JPanel p_south;
	
	ChatA chatA;
	ChatC chatC;
	
	
	public ChatB() {
		area = new JTextArea(20,40);
		txt = new JTextField(20);
		
		p_north= new JPanel();
		p_south=new JPanel();
		
		p_north.add(area);
		p_south.add(txt);
		
		
		
		add(p_north,BorderLayout.NORTH);
		add(p_south,BorderLayout.SOUTH);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		txt.addKeyListener(new KeyAdapter() {
			
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					area.append(txt.getText()+"\n");
					
					chatA.area.append(txt.getText()+"\n");
					chatC.area.append(txt.getText()+"\n");
					txt.setText("");
					area.updateUI();
					
				}
			}
			
		});
		
	}





	public void setChatA(ChatA chatA) {
		this.chatA = chatA;
	}





	public void setChatC(ChatC chatC) {
		this.chatC = chatC;
	}



}
