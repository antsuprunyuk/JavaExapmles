package je3.nullLayoutPane;

import java.awt.*;
import javax.swing.*;

public class NullLayoutPane extends JPanel {

	public NullLayoutPane() {
		this.setLayout(null);
		
		for (int i = 1; i < 9; i++) {
			JButton b = new JButton("Button #" + i);
			b.setBounds(i*30, i*20, 125, 30);
			this.add(b);
		}
	}
	
	
	public Dimension getPreferredSize() {
		return new Dimension(425, 250);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel panel = new NullLayoutPane();
		frame.getContentPane().add(panel);
		frame.pack();
	}

}
