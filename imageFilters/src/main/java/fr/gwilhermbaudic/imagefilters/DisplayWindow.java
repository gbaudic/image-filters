package fr.gwilhermbaudic.imagefilters;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.image.BufferedImage;
import java.awt.FlowLayout;

/**
 * Basic window to display the result
 * @author g.baudic
 */
public class DisplayWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor
	 * @param image image to display
	 */
	public DisplayWindow(BufferedImage image) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Result");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image));
		getContentPane().add(lblNewLabel);
		
		pack();
		setVisible(true);
	}

}
