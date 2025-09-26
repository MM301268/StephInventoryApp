package de.markus.ui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow {
	public static final String TITLE = "Inventory-App AWT";
	public static final String BUTTON_TEXT = "Click me!";
	public static final String GREET_START = "Hallo";
	public static final String GREET_AFTER	= "Button pressed!";
	private Frame frame; 

	public MainWindow() {
		frame = new Frame(MainWindow.TITLE);
		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout());
		
		Label lblGreeting = new Label(MainWindow.GREET_START);
		Button btnClickMe = new Button(MainWindow.BUTTON_TEXT);
		btnClickMe.addActionListener(e -> lblGreeting.setText(MainWindow.GREET_AFTER));
		
		frame.add(lblGreeting);
		frame.add(btnClickMe);
	      
		frame.addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent we) {
		    	frame.dispose();
		        System.exit(0);
		    }
		});
	}
	
	public void show() {
		frame.setVisible(true);
	}
}
