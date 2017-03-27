package com.ss.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatC extends JFrame{
	
	JTextArea area;
	JTextField txt;
	JButton bt;
	JPanel p_north;
	JPanel p_south;
	ChatA chatA;
	ChatB chatB;
	
	
	public ChatC() {
		area = new JTextArea(20,40);
		txt = new JTextField(20);
		bt = new JButton("³ª¹öÆ°");
		p_north= new JPanel();
		p_south=new JPanel();
		
		p_north.add(area);
		p_south.add(txt);
		p_south.add(bt);
		
		
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
					chatB.area.append(txt.getText()+"\n");
					txt.setText("");
					area.updateUI();
					
				}
			}
			
		});
	}




	public void setChatA(ChatA chatA) {
		this.chatA = chatA;
	}



	public void setChatB(ChatB chatB) {
		this.chatB = chatB;
	}



}
