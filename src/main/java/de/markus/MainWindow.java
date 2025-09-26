package de.markus;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.String;

public class MainWindow {
	public static final String mWinTxt = "Inventory-App AWT";
	public static final String cmBtnTxt = "Click me!";
	public static final String greetTxtStart = "Hallo";
	public static final String greetTxtModified	= "Button pressed!";
	private Frame frame; 

	public MainWindow() {
		frame = new Frame(MainWindow.mWinTxt);
		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout());
		
		Label lbl_Greeting = new Label(MainWindow.greetTxtStart);
		Button btn_ClickMe = new Button(MainWindow.cmBtnTxt);
		
		btn_ClickMe.addActionListener(e -> lbl_Greeting.setText(MainWindow.greetTxtModified));
		
		frame.add(lbl_Greeting);
		frame.add(btn_ClickMe);
	      
		frame.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent we) {
		        System.exit(0);
		    }
		});
	}
	
	public void Show() {
		frame.setVisible(true);
	}
}
