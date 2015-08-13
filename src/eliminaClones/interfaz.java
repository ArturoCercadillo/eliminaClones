package eliminaClones;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class interfaz extends JFrame{
	JPanel contentPane;
	JTextArea texto;
	public interfaz(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 210);
		setTitle("Repetidos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		texto= new JTextArea();
		contentPane.add(texto);
		setVisible(true);
	}
	public void escribir(String cadena){
		texto.setText(texto.getText()+cadena+"\n");
	}
}
