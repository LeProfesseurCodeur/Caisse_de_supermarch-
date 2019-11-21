import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
//import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class MyWindow extends JFrame {


	private static final long serialVersionUID = 1L;
	
	private JComboBox liste1;

	public MyWindow() {
		super("Caisse Automatique");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(600, 400);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.add(new JButton("Démarrer"));
		contentPane.add(new JButton("Terminer"));
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		contentPane.add(new JButton("cerise"));
		contentPane.add(new JButton("pommes"));
		contentPane.add(new JButton("poires"));
		contentPane.add(new JButton("fraises"));
		//contentPane.add(new JCheckBox("hello"));
		
		contentPane.add(new JTextField("                                      "));
		Object[] comboBox = new Object[]{"Fraises", "Cerises", "Chocolat", "Confiture", "Chips"};
		contentPane.add(new JComboBox(comboBox));
		contentPane.add(new JTextArea(30, 30));
		
	}

	public static void main(String[] args) {
		MyWindow myWindow = new MyWindow();
		myWindow.setVisible(true);
	}

}
