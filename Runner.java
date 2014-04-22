import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Runner {
	Chess1 chess = new Chess1(new String("Chess"));
	GridLayout layout = new GridLayout(2,4); 

	public static void main(String[] args) {
		layout.setHgap(0);
		layout.setVgap(550);
		this.setLayout(layout);

		hit = new JButton("New Game");
		hit.setActionCommand("New Game");
		hit.addActionListener(this);
		this.add(hit);
	}

	public void actionPerformed (ActionEvent e) {
		if ("New Game".equals(e.getActionCommand())) {
			chess = new Chess1(new String("Chess"));
		}
	}
}