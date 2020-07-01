import java.awt.*;
import javax.swing.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Font font = new Font("Monospaced", Font.PLAIN, 15);
		
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		
		JTextArea textArea = new JTextArea(20, 40);
		textArea.setFont(font);
		p.add(textArea); 
		f.add(p);          
		
		
		f.setSize(500,500);  
		f.setVisible(true); 
	}

}
