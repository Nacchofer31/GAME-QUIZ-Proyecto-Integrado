package vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;

public class Decada70 extends JPanel {
	
	public Decada70() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		JLabel lblDecada = new JLabel("DECADA70");
		lblDecada.setForeground(Color.RED);
		lblDecada.setBounds(57, 55, 84, 41);
		add(lblDecada);
		
				
		//Boton Decada 80
		JButton button80 = new JButton("80's");
		button80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada80();
			}
		});
		button80.setBounds(90, 400, 60, 100);
		add(button80);
				
		//Boton Decada 90
		JButton button90 = new JButton("90's");
		button90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada90();
			}
		});
		button90.setBounds(180, 400, 60, 100);
		add(button90);
				
		//Boton Decada 00's
		JButton button00 = new JButton("00's");
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada00();
			}
				});
		button00.setBounds(270, 400, 60, 100);
		add(button00);
				
		//Boton Decada 10's
		JButton button10 = new JButton("10's");
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada10();
			}
		});
		button10.setBounds(360, 400, 60, 100);
		add(button10);
		
		//PRUEBA//
		JScrollPane jscroll = new JScrollPane();
		jscroll.setBounds(475, 30, 775, 550);
		this.add(jscroll);
		//PRUEBA//
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setForeground(Color.WHITE);
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		
		
		
		
		
		
		
		
		
		

	}
}
