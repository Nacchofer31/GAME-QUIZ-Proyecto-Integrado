package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import controlador.ManejoApis;

public class PantallaQuiz extends JPanel {
	private ManejoApis control;

	public PantallaQuiz(ManejoApis c) {
		control=c;
		
		setBounds(0, 105, 1355, 591);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		setLayout(null);
		
		JTextPane textPregunta = new JTextPane();
		textPregunta.setEnabled(false);
		textPregunta.setEditable(false);
		textPregunta.setForeground(Color.WHITE);
		textPregunta.setFont(new Font("Batang", Font.BOLD, 24));
		textPregunta.setText("> "+control.getApiQuiz().getDato(0, 1));
		textPregunta.setOpaque(false);
		textPregunta.setBounds(164, 100, 977, 91);
		add(textPregunta);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSiguiente.setBounds(1019, 545, 122, 35);
		add(btnSiguiente);
		
		JButton btnPregunta1 = new JButton(control.getApiQuiz().getDato(0, 2));
		btnPregunta1.setForeground(Color.WHITE);
		btnPregunta1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPregunta1.setContentAreaFilled(false);
		btnPregunta1.setBorderPainted(false);
		btnPregunta1.setBounds(164, 202, 977, 49);
		add(btnPregunta1);
		
		JButton btnPregunta2 = new JButton(control.getApiQuiz().getDato(0, 3));
		btnPregunta2.setForeground(Color.WHITE);
		btnPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPregunta2.setContentAreaFilled(false);
		btnPregunta2.setBorderPainted(false);
		btnPregunta2.setBounds(164, 262, 977, 49);
		add(btnPregunta2);
		
		JButton btnPregunta3 = new JButton(control.getApiQuiz().getDato(0, 4));
		btnPregunta3.setForeground(Color.WHITE);
		btnPregunta3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPregunta3.setContentAreaFilled(false);
		btnPregunta3.setBorderPainted(false);
		btnPregunta3.setBounds(164, 322, 977, 49);
		add(btnPregunta3);
		
		JButton btnPregunta4 = new JButton(control.getApiQuiz().getDato(0, 5));
		btnPregunta4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPregunta4.setForeground(Color.WHITE);
		btnPregunta4.setContentAreaFilled(false);
		btnPregunta4.setBorderPainted(false);
		btnPregunta4.setBounds(164, 382, 977, 49);
		add(btnPregunta4);
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);

	}
}
