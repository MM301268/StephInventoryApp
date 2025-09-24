package de.markus;

import java.awt.*;
import java.awt.event.*;

public class Main {
	public static void main(String[] args) {
        Frame frame = new Frame("Steph's Inventory-App");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        Label label = new Label("Hallo Steph!");
        Button button = new Button("Klick mich");

        button.addActionListener(e -> label.setText("Button gedrückt!"));

        frame.add(label);
        frame.add(button);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
			//System.out.println("Hello Steph!");
		}

}
