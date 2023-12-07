package ex03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LoginForm {
	UserDataSet u=new UserDataSet();
	String[]arData=new String[5];
	public static int insertCnt;
	
	public void pms() {
		JPanel idPanel=new JPanel(new BorderLayout(50,0));
		JPanel pwPanel=new JPanel(new BorderLayout(40,0));
		JLabel idLabel=new JLabel("ID");
		JLabel pwLabel=new JLabel("PASSWORD");
		
		//입력받은 아이디
		JTextField id=new JTextField();
		//입력받은 비밀번호
		JPasswordField pw=new JPasswordField();
		
		String title="로그인";
		String[] menu= {"LOGIN","JOIN"};
		String [] userMenu= {"INSERT","LIST"};
		
		ImageIcon mainImg=new ImageIcon("./src/img/01.png");
		ImageIcon userImg=new ImageIcon("./src/img/02.png");
		int choice=0;
		String userChoice=null;
		
		
		idPanel.setOpaque(true);
		idPanel.setBackground(Color.WHITE);
		idPanel.add(idLabel,BorderLayout.WEST);
		idPanel.add(id);
		
		pwPanel.setOpaque(true);
		pwPanel.setBackground(Color.WHITE);
		pwPanel.add(pwLabel,BorderLayout.WEST);
		pwPanel.add(pw);
		
		idLabel.setFont(new Font("Arial",Font.BOLD,18));
		pwLabel.setFont(new Font("Arial",Font.BOLD,18));
		
		UIManager.put("OptionPane.okButtonText", "ok");
		UIManager.put("OptionPane.cancelButtonText", "LOGOUT");
		UIManager.put("OptionPane.ButtonFont", new Font("Arial",Font.BOLD,18));
		UIManager.put("OptionPane.background", Color.white);
		UIManager.put("Panel.background", Color.white);
		
		while(true) {
			choice=JOptionPane.showOptionDialog(null,new Object[] {mainImg,idPanel,pwPanel}, title, JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE,null,menu,null);
			
			String password="";
			for(int i=0;i<pw.getPassword().length;i++) {
				password+=pw.getPassword()[i];
			}
			User.setId(id.getText());
			User.setPw(password);
			
			if(choice==-1)break;
			
			switch(choice) {
			case 0:
				//로그인
				if(u.login(id.getText(),password)) {
					while(true) {
						userChoice=""+JOptionPane.showInputDialog(null,"",title,JOptionPane.PLAIN_MESSAGE,userImg,userMenu,null);
						if(userChoice.intern()=="INSERT") {
							arData=JOptionPane.showInputDialog(null,"이름,나이,주소,성별\n 순서대로 입력하세요.","박경빈,24,익산시 신동,남자").split(",");
							insert();
						}
						break;
					}						
				}	
						else {
							JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 확인해주세요",title,JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					
				
			case 1:
				//회원가입
				if(u.join()) {
					JOptionPane.showMessageDialog(null, "회원가입 완료",title,JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "중복된 아이디입니다",title,JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			}
			
			}
			
			
		}//추가
	public void insert() {
		insertCnt++;
		User.getArrList().get(UserDataSet.rowNum).add(insertCnt+",");
		for(int i=0;i<arData.length;i++) {
			User.getArrList().get(UserDataSet.rowNum).add(arData[i]);
		}
		System.out.println(User.getArrList());
		
		
		
	}

}

