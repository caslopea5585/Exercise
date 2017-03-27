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

public class ChatA extends JFrame{
	
	JTextArea area;
	JTextField txt;
	JButton bt;
	JPanel p_north;
	JPanel p_south;
	ChatA chatA;
	ChatB chatB;
	ChatC chatC;
	
	
	
	
	public ChatA() {
		area = new JTextArea(20,40);
		txt = new JTextField(20);
		bt = new JButton("³ª¹öÆ°");
		p_north= new JPanel();
		p_south=new JPanel();
		
		p_north.add(area);
		p_south.add(txt);
		p_south.add(bt);
		
		chatA=this;
		
		add(p_north,BorderLayout.NORTH);
		add(p_south,BorderLayout.SOUTH);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				chatB = new ChatB();
				chatC = new ChatC();
				
				chatB.setChatA(chatA);
				chatB.setChatC(chatC);
				
				chatC.setChatA(chatA);
				chatC.setChatB(chatB);
				
				
				
			}
		});
		
		txt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					
					
					area.append(txt.getText()+"\n");
								
					chatB.area.append(txt.getText()+"\n");
					chatC.area.append(txt.getText()+"\n");
					txt.setText("");
					area.updateUI();
				}	
			}
		});
		
	}

	
	
	public static void main(String[] args) {
		 new ChatA();

	}


}
