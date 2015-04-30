package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaHistoria extends JPanel {
	
	
	public PantallaHistoria() {

		setLayout(null);
		setBounds(0, 0, 1355, 600);
		
		
		
		//Boton Decada 70
		JButton button70 = new JButton("70's");
		button70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada70();
			}
		});
		button70.setBounds(145, 140, 58, 23);
		add(button70);
		
		//Boton Decada 80
		JButton button80 = new JButton("80's");
		button80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada80();
			}
		});
		button80.setBounds(400, 140, 58, 23);
		add(button80);
		
		//Boton Decada 90
		JButton button90 = new JButton("90's");
		button90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada90();
			}
		});
		button90.setBounds(650, 140, 58, 23);
		add(button90);
		
		//Boton Decada 00's
		JButton button00 = new JButton("00's");
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada00();
			}
		});
		button00.setBounds(900, 140, 58, 23);
		add(button00);
		
		//Boton Decada 10's
		JButton button10 = new JButton("10's");
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada10();
			}
		});
		button10.setBounds(1150, 140, 58, 23);
		add(button10);
		
		
		Image marcoDecadas = new ImageIcon(this.getClass().getResource("/Marco.png")).getImage();
		
		JLabel lblMarco70 = new JLabel("/Marco.png");
		lblMarco70.setBounds(75,200,200,350);
		lblMarco70.setIcon(new ImageIcon(marcoDecadas));
		this.add(lblMarco70);
		
		Image marco80 = new ImageIcon(this.getClass().getResource("/Marco80.png")).getImage();
		JLabel lblMarco80 = new JLabel("/Marco80.png");
		lblMarco80.setBounds(325,200,200,350);
		lblMarco80.setIcon(new ImageIcon(marco80));
		this.add(lblMarco80);
		
		Image marco90 = new ImageIcon(this.getClass().getResource("/Marco90.png")).getImage();
		JLabel lblMarco90 = new JLabel("/Marco90.png");
		lblMarco90.setBounds(575,200,200,350);
		lblMarco90.setIcon(new ImageIcon(marco90));
		this.add(lblMarco90);
		
		
		JLabel lblMarco00 = new JLabel("/Marco.png");
		lblMarco00.setBounds(825,200,200,350);
		lblMarco00.setIcon(new ImageIcon(marcoDecadas));
		this.add(lblMarco00);

		JLabel lblMarco10 = new JLabel("/Marco.png");
		lblMarco10.setBounds(1075,200,200,350);
		lblMarco10.setIcon(new ImageIcon(marcoDecadas));
		this.add(lblMarco10);
		
		
		//Label elige
		JLabel lblElige = new JLabel("Elige la década que quieras leer");
		lblElige.setForeground(Color.WHITE);
		lblElige.setFont(new Font("BatangChe", Font.BOLD, 20));
		lblElige.setBounds(475, 50, 365, 33);
		add(lblElige);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
	}
}
