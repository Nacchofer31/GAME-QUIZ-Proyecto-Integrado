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
	private JButton btnPregunta1;
	private JButton btnPregunta2;
	private JButton btnPregunta3;
	private JButton btnPregunta4;
	
	private JTextPane textPregunta;
	
	private JButton btnConfirmar;	
	private JLabel lblPregunta;	
	private JButton btnSiguiente;
	private JButton btnReset;
	public PantallaQuiz(ManejoApis c) {
		control=c;
		
		setBounds(0, 105, 1355, 591);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		setLayout(null);
		
		textPregunta = new JTextPane();
		textPregunta.setEnabled(false);
		textPregunta.setEditable(false);
		textPregunta.setForeground(Color.WHITE);
		textPregunta.setFont(new Font("Batang", Font.BOLD, 24));
		textPregunta.setText("> "+control.primeraPregunta()[1]);
		textPregunta.setOpaque(false);
		textPregunta.setBounds(164, 100, 977, 91);
		add(textPregunta);
		
		lblPregunta = new JLabel("Pregunta "+numPreg+":");
		lblPregunta.setFont(new Font("BatangChe", Font.BOLD, 21));
		lblPregunta.setForeground(Color.WHITE);
		lblPregunta.setBounds(164, 54, 171, 35);
		add(lblPregunta);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numPreg=numPreg+1;
				lblPregunta.setText("Pregunta "+numPreg+":");
				String pregunta[] = control.pasarPregunta();
				int turno[] = control.numeroRespuesta(Math.random()*5);
				textPregunta.setText(pregunta[1]);
				btnPregunta1.setText(pregunta[turno[0]]);
				btnPregunta2.setText(pregunta[turno[1]]);
				btnPregunta3.setText(pregunta[turno[2]]);
				btnPregunta4.setText(pregunta[turno[3]]);
				btnPregunta1.setEnabled(true);
				btnPregunta2.setEnabled(true);
				btnPregunta3.setEnabled(true);
				btnPregunta4.setEnabled(true);
				btnSiguiente.setEnabled(false);
				btnPregunta1.setBorder(emptyBorder);
				btnPregunta2.setBorder(emptyBorder);
				btnPregunta3.setBorder(emptyBorder);
				btnPregunta4.setBorder(emptyBorder);
				
			}
		});
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setEnabled(false);
		btnSiguiente.setBorderPainted(false);
		btnSiguiente.setContentAreaFilled(false);
		btnSiguiente.setFont(new Font("BatangChe", Font.BOLD, 20));
		btnSiguiente.setBounds(1018, 526, 142, 35);
		add(btnSiguiente);
		int pregunta[] = control.numeroRespuesta(Math.random()*5);
		btnPregunta1 = new JButton(control.primeraPregunta()[pregunta[0]]);
		btnPregunta1.setBackground(new Color(102, 0, 102));
		btnPregunta2 = new JButton(control.primeraPregunta()[pregunta[1]]);
		btnPregunta2.setBackground(new Color(153, 0, 0));
		btnPregunta3 = new JButton(control.primeraPregunta()[pregunta[2]]);
		btnPregunta3.setBackground(new Color(255, 153, 0));
		btnPregunta4 = new JButton(control.primeraPregunta()[pregunta[3]]);
		btnPregunta4.setBackground(new Color(255, 255, 51));
		btnPregunta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numPreg==10){
					btnPregunta1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					btnPregunta2.setBorder(emptyBorder);
					btnPregunta3.setBorder(emptyBorder);
					btnPregunta4.setBorder(emptyBorder);
					control.guardarRespuesta(btnPregunta1.getText());
					btnPregunta1.setEnabled(false);
					btnPregunta2.setEnabled(false);
					btnPregunta3.setEnabled(false);
					btnPregunta4.setEnabled(false);
					btnConfirmar.setVisible(true);
				}else{
					btnPregunta1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					btnPregunta2.setBorder(emptyBorder);
					btnPregunta3.setBorder(emptyBorder);
					btnPregunta4.setBorder(emptyBorder);
					control.guardarRespuesta(btnPregunta1.getText());
					btnPregunta1.setEnabled(false);
					btnPregunta2.setEnabled(false);
					btnPregunta3.setEnabled(false);
					btnPregunta4.setEnabled(false);
					btnSiguiente.setEnabled(true);
				}
				
				
			}
		});
		btnPregunta1.setForeground(new Color(102, 0, 102));
		btnPregunta1.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnPregunta1.setContentAreaFilled(false);
		btnPregunta1.setBorderPainted(true);
		btnPregunta1.setBorder(emptyBorder);
		btnPregunta1.setBounds(164, 202, 977, 49);
		add(btnPregunta1);
		
		
		btnPregunta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numPreg==10){
					btnPregunta2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					btnPregunta1.setBorder(emptyBorder);
					btnPregunta3.setBorder(emptyBorder);
					btnPregunta4.setBorder(emptyBorder);
					control.guardarRespuesta(btnPregunta2.getText());
					btnPregunta1.setEnabled(false);
					btnPregunta2.setEnabled(false);
					btnPregunta3.setEnabled(false);
					btnPregunta4.setEnabled(false);
					btnConfirmar.setVisible(true);
				}else{
					btnPregunta2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					btnPregunta1.setBorder(emptyBorder);
					btnPregunta3.setBorder(emptyBorder);
					btnPregunta4.setBorder(emptyBorder);
					control.guardarRespuesta(btnPregunta2.getText());
					btnPregunta1.setEnabled(false);
					btnPregunta2.setEnabled(false);
					btnPregunta3.setEnabled(false);
					btnPregunta4.setEnabled(false);
					btnSiguiente.setEnabled(true);
				}
			}
		});
		btnPregunta2.setForeground(new Color(153, 0, 0));
		btnPregunta2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnPregunta2.setContentAreaFilled(false);
		btnPregunta2.setBorderPainted(true);
		btnPregunta2.setBorder(emptyBorder);
		btnPregunta2.setBounds(164, 262, 977, 49);
		add(btnPregunta2);
		
		
		btnPregunta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numPreg==10){
					btnPregunta3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					btnPregunta1.setBorder(emptyBorder);
					btnPregunta2.setBorder(emptyBorder);
					btnPregunta4.setBorder(emptyBorder);
					control.guardarRespuesta(btnPregunta3.getText());
					btnPregunta1.setEnabled(false);
					btnPregunta2.setEnabled(false);
					btnPregunta3.setEnabled(false);
					btnPregunta4.setEnabled(false);
					btnConfirmar.setVisible(true);
				}else{
					btnPregunta3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					btnPregunta1.setBorder(emptyBorder);
					btnPregunta2.setBorder(emptyBorder);
					btnPregunta4.setBorder(emptyBorder);
					control.guardarRespuesta(btnPregunta3.getText());
					btnPregunta1.setEnabled(false);
					btnPregunta2.setEnabled(false);
					btnPregunta3.setEnabled(false);
					btnPregunta4.setEnabled(false);
					btnSiguiente.setEnabled(true);
				}
			}
		});
		btnPregunta3.setForeground(new Color(255, 153, 0));
		btnPregunta3.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnPregunta3.setContentAreaFilled(false);
		btnPregunta3.setBorderPainted(true);
		btnPregunta3.setBorder(emptyBorder);
		btnPregunta3.setBounds(164, 322, 977, 49);
		add(btnPregunta3);
		
		
		btnPregunta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(numPreg==10){
					btnPregunta4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					btnPregunta1.setBorder(emptyBorder);
					btnPregunta2.setBorder(emptyBorder);
					btnPregunta3.setBorder(emptyBorder);
					control.guardarRespuesta(btnPregunta4.getText());
					btnPregunta1.setEnabled(false);
					btnPregunta2.setEnabled(false);
					btnPregunta3.setEnabled(false);
					btnPregunta4.setEnabled(false);
					btnConfirmar.setVisible(true);
				}else{
					btnPregunta4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
					btnPregunta1.setBorder(emptyBorder);
					btnPregunta2.setBorder(emptyBorder);
					btnPregunta3.setBorder(emptyBorder);
					control.guardarRespuesta(btnPregunta4.getText());
					btnPregunta1.setEnabled(false);
					btnPregunta2.setEnabled(false);
					btnPregunta3.setEnabled(false);
					btnPregunta4.setEnabled(false);
					btnSiguiente.setEnabled(true);
				}
				
			}
		});
		btnPregunta4.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		btnPregunta4.setForeground(new Color(255, 255, 51));
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
		
		btnConfirmar = new JButton("Conocer Resultado");
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConfirmar.setForeground(Color.WHITE);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPregunta1.setVisible(false);
				btnPregunta2.setVisible(false);
				btnPregunta3.setVisible(false);
				btnPregunta4.setVisible(false);
				btnSiguiente.setVisible(false);
				lblPregunta.setVisible(false);
				textPregunta.setText(control.resultado());
				btnReset.setVisible(true);
			}
		});
		btnConfirmar.setVisible(false);
		btnConfirmar.setBounds(164, 509, 209, 49);
		add(btnConfirmar);
		
		Image iReset = new ImageIcon(this.getClass().getResource("/refresh.png")).getImage();
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setIcon(new ImageIcon(iReset));
		btnReset.setForeground(Color.WHITE);
		btnReset.setContentAreaFilled(false);
		btnReset.setBorderPainted(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				control.cargaPreguntas();
				int pregunta[] = control.numeroRespuesta(Math.random()*5);
				btnPregunta1.setText(control.primeraPregunta()[pregunta[0]]);
				btnPregunta2.setText(control.primeraPregunta()[pregunta[1]]);
				btnPregunta3.setText(control.primeraPregunta()[pregunta[2]]);
				btnPregunta4.setText(control.primeraPregunta()[pregunta[3]]);
				textPregunta.setText("> "+control.primeraPregunta()[1]);
				btnPregunta1.setVisible(true);
				btnPregunta2.setVisible(true);
				btnPregunta3.setVisible(true);
				btnPregunta4.setVisible(true);
				btnPregunta1.setEnabled(true);
				btnPregunta2.setEnabled(true);
				btnPregunta3.setEnabled(true);
				btnPregunta4.setEnabled(true);
				numPreg=1;
				lblPregunta.setText("Pregunta "+numPreg+":");
				lblPregunta.setVisible(true);
				btnReset.setVisible(false);
				btnConfirmar.setVisible(false);
				btnSiguiente.setVisible(true);
				control.setNumeroPregunta(0);
				control.setAciertos(0);
				control.setFallos(0);
			}
		});
		btnReset.setBounds(538, 509, 163, 49);
		btnReset.setVisible(false);
		add(btnReset);
		
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);

	}
	public int getNumPreg() {
		return numPreg;
	}
	public void setNumPreg(int numPreg) {
		this.numPreg = numPreg;
	}
	public JButton getBtnConfirmar() {
		return btnConfirmar;
	}
	public JLabel getLblPregunta() {
		return lblPregunta;
	}
	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}
}
