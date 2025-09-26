package de.markus.app;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import de.markus.ui.MainWindow;

public class Main {
	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater(() -> new MainWindow().show());
        
		}

}
