package client;

import java.awt.*;
import javax.swing.*;

public class regPanel extends JPanel{
	JLabel title ;
	JLabel subtitle ;
	JLabel user;
	JLabel password;
	JLabel mail;

	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.setColor(new Color(98,98,102, 150));
		g.fillRect(100, 100, 620, 500);
		
		
		title = new JLabel("歡迎註冊！");
		title.setBounds(340,100, 800, 150);		
		title.setFont(new java.awt.Font("Dialog", 1, 30));	
		title.setForeground(new Color(255,155,155));
		
		subtitle = new JLabel("成為會員以享受免廣告觀看影片！");
		subtitle.setBounds(190,150, 800, 150);
		subtitle.setFont(new java.awt.Font("Dialog", 1, 30));
		subtitle.setForeground(new Color(255,155,155));
		
		user = new JLabel("Account：");
		user.setBounds(250,280, 150, 150);		
		user.setFont(new java.awt.Font("Dialog", 1, 20));	
		user.setForeground(new Color(12,212,235));
		
		password = new JLabel("Password：");
		password.setBounds(250,330, 800, 150);		
		password.setFont(new java.awt.Font("Dialog", 1, 20));	
		password.setForeground(new Color(12,212,235));
		
		mail = new JLabel("Email：");
		mail.setBounds(250,380, 800, 150);		
		mail.setFont(new java.awt.Font("Dialog", 1, 20));	
		mail.setForeground(new Color(12,212,235));
		
		

		
		
		add(title);
		add(subtitle);
		add(user);
		add(password);
		add(mail);

		
	}
}
