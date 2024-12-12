package com.sist.client;
// MintLookAndFeel
import javax.swing.*;
public class ClientMainFrame extends JFrame {
    MenuForm mf = new MenuForm();  //포함 클래스 => 있는 그대로 
    ControlPanel cp = new ControlPanel();
    // 배치
    public ClientMainFrame() {
    	setLayout(null); // 사용자 정의 => 직접 배치 
    	mf.setBounds(350, 15, 800, 50);
    	add(mf);
    	cp.setBounds(10, 75, 1560, 880);
    	add(cp);
    	setSize(1600,1000);
    	setVisible(true);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainFrame();
		
	}

}
