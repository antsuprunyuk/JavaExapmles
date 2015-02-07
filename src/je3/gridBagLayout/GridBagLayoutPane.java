package je3.gridBagLayout;

import java.awt.*;
import javax.swing.*;

public class GridBagLayoutPane extends JPanel{
	public GridBagLayoutPane() {
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.insets = new Insets(5, 5, 5, 5);
		
		c.gridx = 0; c.gridy = 0; c.gridwidth = 4; c.gridheight = 4;
		c.weightx = c.weighty = 1.0;
		this.add(new JButton("Button #1"), c);
		
		c.gridx = 4; c.gridy = 0; c.gridwidth = 1; c.gridheight = 1;
		c.weightx = c.weighty = 0.0;
		this.add(new JButton("Button #2"), c);
		
		c.gridx = 4; c.gridy = 1; c.gridwidth = 1; c.gridheight = 1;
		this.add(new JButton("Button #3"), c);
		
		c.gridx = 4; c.gridy = 2; c.gridwidth = 1; c.gridheight = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.NORTH;
		this.add(new JButton("Button #4"), c);
		
		c.gridx = 0; c.gridy = 4; c.gridwidth = 1; c.gridheight = 1;
		this.add(new JButton("Button #5"), c);
		
		c.gridx = 2; c.gridy = 4; c.gridwidth = 1; c.gridheight = 1;
		this.add(new JButton("Button #6"), c);
		
		c.gridx = 3; c.gridy = 4; c.gridwidth = 2; c.gridheight = 1;
		this.add(new JButton("Button #7"), c);
		
		c.gridx = 1; c.gridy = 5; c.gridwidth = 1; c.gridheight = 1;
		this.add(new JButton("Button #8"),  c);
		
		c.gridx = 3; c.gridy = 5; c.gridwidth = 1; c.gridheight = 1;
		this.add(new JButton("Button #9"), c);
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel panel = new GridBagLayoutPane();
		frame.getContentPane().add(panel);
		frame.pack();
	}
}
