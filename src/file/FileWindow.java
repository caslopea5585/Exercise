package file;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileWindow extends JFrame{
	MyPanel mypanel;
	MyIcon folder_on, folder_off;
	URI url;
	ArrayList<JPanel> panel_list ;
	
	public FileWindow() {
		
		folder_off = new MyIcon(this.getClass().getResource("/folder_off.png"),50,50);
		folder_on = new MyIcon(this.getClass().getResource("/folder_on.png"),50,50);
		
		panel_list= new ArrayList<JPanel>();
		
		ArrayList<String> list = getDirList();	
		
		for(int i=0;i<list.size();i++){
			
			mypanel = new MyPanel(folder_off,list.get(i));
			panel_list.add(mypanel);
			add(mypanel);
			
		}
		
		
		
		
/*		for(int j=0;j<panel_list.size();j++){
			
			
		}
		*/
		
		setLayout(new FlowLayout());
		
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public ArrayList<String> getDirList(){
		
		File file = new File("C:/");
		File[] file_list = file.listFiles();
		ArrayList<String> array_file = new ArrayList<String>();
		for(int i=0;i<file_list.length;i++){
			if(file_list[i].isDirectory()){
				array_file.add(file_list[i].getName());
			}
			
		}
		return array_file;
	}
	public static void main(String[] args) {
		new FileWindow();

	}

}
