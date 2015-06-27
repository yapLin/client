package client;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class videoPanel extends JPanel {
	String[] fileList = {"柯南1", "柯南2","柯南3","柯南4","柯南5","犬夜叉"};
//	JLabel currentTab;
	public void paintComponent(Graphics g){
		
		g.setColor(new Color(98,98,102, 150));
		g.fillRect(100, 100, 620, 500);
		
		
		JTextArea text = new JTextArea();
		JScrollPane scroller = new JScrollPane(text);
		
		for(int i = 0; i < fileList.length; i++){
			text.append("#"+(i+1)+"   "+fileList[i]+"\n");
			//text.setText("sssss");
		}
		//
		
		text.setLineWrap(true);
		text.setEditable(false);
		text.setOpaque(false);
		//scroller.setBackground();
		//scroller.setOpaque(false);
		scroller.getViewport().setBackground(new Color(98,98,102, 150));
		
		
		scroller.setBounds(100, 100, 620, 500);
		//text.setBounds(100, 100, 620, 500);
		add(scroller);
		super.paintComponents(g);

	    
	    
	}

}
