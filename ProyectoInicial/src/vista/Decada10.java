package vista;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Decada10 extends JPanel {
	
	public Decada10() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		JLabel lblDecada = new JLabel("DECADA10");
		lblDecada.setForeground(Color.RED);
		lblDecada.setBounds(10, 68, 84, 41);
		add(lblDecada);
		
		//Boton Decada 70
		JButton button70 = new JButton("70's");
		button70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada70();
			}
		});
		button70.setBounds(63, 432, 58, 23);
		add(button70);
				
		//Boton Decada 80
		JButton button80 = new JButton("80's");
		button80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada80();
			}
		});
		button80.setBounds(131, 432, 58, 23);
		add(button80);
				
		//Boton Decada 90
		JButton button90 = new JButton("90's");
		button90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada90();
			}
		});
		button90.setBounds(199, 432, 58, 23);
		add(button90);
				
		//Boton Decada 00's
		JButton button00 = new JButton("00's");
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada00();
			}
		});
		button00.setBounds(267, 432, 58, 23);
		add(button00);

		//JScrollPane
		JScrollPane jscroll = new JScrollPane();
		jscroll.setEnabled(false);
		jscroll.setBounds(475, 30, 775, 550);
		jscroll.setBorder(null);
		this.add(jscroll);
				
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.setFont(new Font("BatangChe", Font.PLAIN, 16));
		textPane.setForeground(Color.WHITE);
		textPane.setOpaque(false);
		textPane.setText("Aqui se incorporara \n"
				+ "el texto de la decada de los 10");
		jscroll.setViewportView(textPane);
				
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
				
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

	}
}
