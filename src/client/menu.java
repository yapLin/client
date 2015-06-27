package client;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class menu extends JFrame implements ActionListener{
	
		//创建一个容器
		Container ct;
		//创建背景面板。
		bgPanel bgp;
		subPanel sbp;
		regPanel rgp;
		userPanel usp;
		loPanel lop;
		topPhoto top3;
		videoPanel vdp;
		
		int login = 0;
		int state = 0;
		
		//创建一个按钮，用来证明我们的确是创建了背景图片，而不是一张图片。
		JButton userBut;
		JButton videoBut;
		JButton loginBut;
		JButton logoutBut;
		JButton regBut;
		JTextField userIn = new JTextField(10);
		JTextField mailIn = new JTextField(10);
		JPasswordField passwordIn = new JPasswordField(10);
		JLabel top;
		String[] video = {"柯南", "犬夜叉", "天空之城"};
		
		public static void main(String[] args)
		{
			menu m = new menu();
			m.go();
		}
		
		public void go()
		{
			JFrame window = new JFrame();
			ct = window.getContentPane();
			window.setLayout(null);
			
			
			//menu button
			userBut=new JButton("會員專區");
			userBut.setBounds(800,230,130,80);
			userBut.addActionListener(this);
			ct.add(userBut);
			
			videoBut=new JButton("影片獨享");
			videoBut.setBounds(800,430,130,80);
			videoBut.addActionListener(this);
			ct.add(videoBut);
			
			
			//首頁--最hot影片
			sbp = new subPanel(video, (new ImageIcon("pic/me.jpg")).getImage(), (new ImageIcon("pic/me.jpg")).getImage(), (new ImageIcon("pic/me.jpg")).getImage());
			sbp.setBounds(0,0,1000,700);
			ct.add(sbp);
			
			
			//會員專區
			usp = new userPanel(login);
			usp.setBounds(0,0,1000,700);
			usp.setVisible(false);
			usp.setLayout(null);
			ct.add(usp);
			
			//註冊專區
			rgp = new regPanel();
			rgp.setBounds(0,0,1000,700);
			rgp.setVisible(false);
			rgp.setLayout(null);
			ct.add(rgp);
			
			//登出專區
			lop = new loPanel();
			lop.setBounds(0,0,1000,700);
			lop.setVisible(false);
			lop.setLayout(null);
			ct.add(lop);
			
			
			////登入註冊按鈕
			userIn.setBounds(390,340,150,32);
			passwordIn.setBounds(390,390,150,32);
			mailIn.setBounds(390,440,150,32);

			loginBut = new JButton("登入");
			loginBut.addActionListener(this);
			
			logoutBut = new JButton("登出");
			logoutBut.setBounds(570,480,50,50);
			logoutBut.addActionListener(this);
			
			regBut = new JButton("註冊");
			regBut.addActionListener(this);

			
			//影片頁面
			vdp = new videoPanel();
			vdp.setBounds(0,0,1000,700);
			vdp.setVisible(false);
			vdp.setLayout(null);
			ct.add(vdp);
			
			
			
			
			
			
			//背景
			bgp = new bgPanel((new ImageIcon("pic/back2.jpg")).getImage());
			bgp.setBounds(0,0,1000,700);
			ct.add(bgp);
			
			window.setSize(1000,700);
			window.setLocation(200,50);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//進入會員專區
			if(e.getSource() == userBut){
				state = 1;
				sbp.setVisible(false);
				rgp.setVisible(false);
				vdp.setVisible(false);
				userIn.setText("");
				passwordIn.setText("");
				
				if(login == 0){
					usp.add(userIn);
					usp.add(passwordIn);
					usp.add(loginBut);
					usp.add(regBut);
					usp.setVisible(true);
				}
				else{
					lop.add(logoutBut);
					lop.setVisible(true);
				}
				
				loginBut.setBounds(550,480,50,50);
				regBut.setBounds(620,480,50,50);
			}
			//登入按鈕
			else if(e.getSource() == loginBut){
				//登入畫面->登入
				if(state == 1){
					System.out.println("**Login**");
					System.out.println(userIn.getText());
					System.out.println(passwordIn.getPassword());
					
					////////登入的話～～～///////
					login = 1;
					usp.setVisible(false);
					lop.setVisible(true);
					lop.add(logoutBut);
					
					userIn.setText("");
					passwordIn.setText("");
				}
				//註冊畫面->轉入登入畫面
				if(state == 2){
					state = 1;
					usp.setVisible(true);
					rgp.setVisible(false);
					userIn.setText("");
					passwordIn.setText("");
					
					if(login == 0){
						usp.add(userIn);
						usp.add(passwordIn);
						usp.add(loginBut);
						usp.add(regBut);
					}
					
					loginBut.setBounds(550,480,50,50);
					regBut.setBounds(620,480,50,50);
				}
			}
			//註冊按鈕
			else if(e.getSource() == regBut){
				
				//登入畫面->轉入註冊畫面
				if(state == 1){
					state = 2;
					usp.setVisible(false);
					rgp.setVisible(true);
					userIn.setText("");
					mailIn.setText("");
					passwordIn.setText("");
					rgp.add(userIn);
					rgp.add(mailIn);
					rgp.add(passwordIn);
					rgp.add(loginBut);
					rgp.add(regBut);
					loginBut.setBounds(620,480,50,50);
					regBut.setBounds(550,480,50,50);
				}
				//註冊畫面->註冊
				else if(state == 2){
					System.out.println("**Register**");
					System.out.println(userIn.getText());
					System.out.println(mailIn.getText());
					System.out.println(passwordIn.getPassword());
				}
			}
			//登出按鈕
			else if(e.getSource() == logoutBut){
				login = 0;
				usp.setVisible(true);
				lop.setVisible(false);
				usp.add(userIn);
				usp.add(passwordIn);
				usp.add(loginBut);
				usp.add(regBut);
			}
			//進入影片頁面
			else if(e.getSource() == videoBut){
				sbp.setVisible(false);
				usp.setVisible(false);
				lop.setVisible(false);
				rgp.setVisible(false);
				vdp.setVisible(true);
				userIn.setText("");
				mailIn.setText("");
				passwordIn.setText("");
			}
		}	
}
