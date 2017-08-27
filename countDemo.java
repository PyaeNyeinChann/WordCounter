package BatmanLab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class countDemo extends JFrame {
	JTextArea jtxa;
	JButton jbn;
	JLabel jblWord,jblCha,jblBanner;
	
	public countDemo() {
	setTitle("Word Counter");
	setSize(400,500);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	
	jblBanner = new JLabel("Words Counter V.0");
	jblBanner.setBounds(95,0,150,50);
	jblBanner.setHorizontalAlignment(SwingConstants.CENTER);
	add(jblBanner);
	
	jblWord = new JLabel("Words: ");
	jblWord.setBounds(30,5,150,150);
	add(jblWord);
	
	jblCha = new JLabel("Character: ");
	jblCha.setBounds(250,5,150,150);
	add(jblCha);
	
	jtxa = new JTextArea();
	JScrollPane jsp = new JScrollPane(jtxa);
	jsp.setBounds(30,100,300,150);
	add(jsp);
	
	jbn = new JButton("Count Now!");
	jbn.setBounds(95,280,150,50);
	add(jbn);
	jbn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String text = jtxa.getText();
			String words[] = text.split("\\s");
			jblWord.setText("Words: " + words.length);
			jblCha.setText("Character: " + text.length());
			
		}
	});
	
	
	setVisible(true);
	
	}

	public static void main(String[] args) {
	new countDemo();

	}
}
