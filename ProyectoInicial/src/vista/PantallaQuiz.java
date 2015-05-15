package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import controlador.ManejoApis;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaQuiz extends JPanel {
	private ManejoApis control;
	Border emptyBorder = BorderFactory.createEmptyBorder();
	private int numPreg=1;
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
		
		JLabel lblPregunta = new JLabel("Pregunta "+numPreg+":");
		lblPregunta.setFont(new Font("BatangChe", Font.BOLD, 21));
		lblPregunta.setForeground(Color.WHITE);
		lblPregunta.setBounds(164, 54, 171, 35);
		add(lblPregunta);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numPreg=numPreg+1;
				lblPregunta.setText("Pregunta "+numPreg+":");
			}
		});
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setContentAreaFilled(false);
		btnSiguiente.setFont(new Font("BatangChe", Font.BOLD, 20));
		btnSiguiente.setBounds(1018, 526, 142, 35);
		add(btnSiguiente);
		
		JButton btnPregunta1 = new JButton(control.getApiQuiz().getDato(0, 2));
		JButton btnPregunta2 = new JButton(control.getApiQuiz().getDato(0, 3));
		JButton btnPregunta3 = new JButton(control.getApiQuiz().getDato(0, 4));
		JButton btnPregunta4 = new JButton(control.getApiQuiz().getDato(0, 5));
		btnPregunta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPregunta1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnPregunta2.setBorder(emptyBorder);
				btnPregunta3.setBorder(emptyBorder);
				btnPregunta4.setBorder(emptyBorder);
			}
		});
		btnPregunta1.setForeground(Color.WHITE);
		btnPregunta1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnPregunta1.setContentAreaFilled(false);
		btnPregunta1.setBorderPainted(true);
		btnPregunta1.setBorder(emptyBorder);
		btnPregunta1.setBounds(164, 202, 977, 49);
		add(btnPregunta1);
		
		
		btnPregunta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPregunta2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnPregunta1.setBorder(emptyBorder);
				btnPregunta3.setBorder(emptyBorder);
				btnPregunta4.setBorder(emptyBorder);
			}
		});
		btnPregunta2.setForeground(Color.WHITE);
		btnPregunta2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnPregunta2.setContentAreaFilled(false);
		btnPregunta2.setBorderPainted(true);
		btnPregunta2.setBorder(emptyBorder);
		btnPregunta2.setBounds(164, 262, 977, 49);
		add(btnPregunta2);
		
		
		btnPregunta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPregunta3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnPregunta1.setBorder(emptyBorder);
				btnPregunta2.setBorder(emptyBorder);
				btnPregunta4.setBorder(emptyBorder);
			}
		});
		btnPregunta3.setForeground(Color.WHITE);
		btnPregunta3.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnPregunta3.setContentAreaFilled(false);
		btnPregunta3.setBorderPainted(true);
		btnPregunta3.setBorder(emptyBorder);
		btnPregunta3.setBounds(164, 322, 977, 49);
		add(btnPregunta3);
		
		
		btnPregunta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPregunta4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				btnPregunta1.setBorder(emptyBorder);
				btnPregunta2.setBorder(emptyBorder);
				btnPregunta3.setBorder(emptyBorder);
			}
		});
		btnPregunta4.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnPregunta4.setForeground(Color.WHITE);
		btnPregunta4.setContentAreaFilled(false);
		btnPregunta4.setBorderPainted(true);
		btnPregunta4.setBorder(emptyBorder);
		btnPregunta4.setBounds(164, 382, 977, 49);
		add(btnPregunta4);
		Image iTipQuiz = new ImageIcon(this.getClass().getResource("/tipQuiz.png")).getImage();
		JLabel lblTipQuiz = new JLabel("");
		lblTipQuiz.setBounds(1084, 39, 190, 130);
		lblTipQuiz.setIcon(new ImageIcon(iTipQuiz));
		add(lblTipQuiz);
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);

	}
}
