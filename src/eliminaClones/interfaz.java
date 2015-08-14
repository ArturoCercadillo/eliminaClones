package eliminaClones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
		texto= new JTextArea(10,60);
		JScrollPane scrollPane = new JScrollPane(texto);
		contentPane.add(scrollPane);
		JButton afondo = new JButton("A fondo");
		afondo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Main.buscarAFondo();
			}
		});
		contentPane.add(afondo);
		setVisible(true);
	}
	public void escribir(String cadena){
		texto.setText(texto.getText()+cadena+"\n");
	}
}
