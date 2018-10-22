package fr.gwilhermbaudic.imageFilters;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.image.BufferedImage;
import java.awt.FlowLayout;

public class DisplayWindow extends JFrame {
	public DisplayWindow(BufferedImage image) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Instagram result");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image));
		getContentPane().add(lblNewLabel);
		
		pack();
		setVisible(true);
	}

	private static final long serialVersionUID = 1L;



}
