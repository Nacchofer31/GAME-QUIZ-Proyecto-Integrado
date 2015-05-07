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
		JButton button70 = new JButton(" ");
		button70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada70();
			}
		});
		button70.setBounds(60,100,225,400);
		button70.setContentAreaFilled(false);
		button70.setBorderPainted(false);
		add(button70);
		
		//Boton Decada 80
		JButton button80 = new JButton(" ");
		button80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada80();
			}
		});
		button80.setBounds(311,100,225,400);
		button80.setContentAreaFilled(false);
		button80.setBorderPainted(false);
		add(button80);
		
		//Boton Decada 90
		JButton button90 = new JButton(" ");
		button90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada90();
			}
		});
		button90.setBounds(560,100,225,400);
		button90.setContentAreaFilled(false);
		button90.setBorderPainted(false);
		add(button90);
		
		//Boton Decada 00's
		JButton button00 = new JButton(" ");
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada00();
			}
		});
		button00.setBounds(810,100,225,400);
		button00.setContentAreaFilled(false);
		button00.setBorderPainted(false);
		add(button00);
		
		//Boton Decada 10's
		JButton button10 = new JButton(" ");
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada10();
			}
		});
		button10.setBounds(1065,100,225,400);
		button10.setContentAreaFilled(false);
		button10.setBorderPainted(false);
		add(button10);
		
		
		Image marcoDecadas = new ImageIcon(this.getClass().getResource("/Marco.png")).getImage();
		Image marco70 = new ImageIcon(this.getClass().getResource("/Marco70.png")).getImage();
		JLabel lblMarco70 = new JLabel("/Marco70.png");
		lblMarco70.setBounds(60,100,225,400);
		lblMarco70.setIcon(new ImageIcon(marco70));
		this.add(lblMarco70);
		
		Image marco80 = new ImageIcon(this.getClass().getResource("/Marco80.png")).getImage();
		JLabel lblMarco80 = new JLabel("/Marco80.png");
		lblMarco80.setBounds(311,100,225,400);
		lblMarco80.setIcon(new ImageIcon(marco80));
		this.add(lblMarco80);
		
		Image marco90 = new ImageIcon(this.getClass().getResource("/Marco90.png")).getImage();
		JLabel lblMarco90 = new JLabel("/Marco90.png");
		lblMarco90.setBounds(560,100,225,400);
		lblMarco90.setIcon(new ImageIcon(marco90));
		this.add(lblMarco90);
		
		Image marco00 = new ImageIcon(this.getClass().getResource("/Marco00.png")).getImage();
		JLabel lblMarco00 = new JLabel("/Marco.png");
		lblMarco00.setBounds(810,100,225,400);
		lblMarco00.setIcon(new ImageIcon(marco00));
		this.add(lblMarco00);

		Image marco10 = new ImageIcon(this.getClass().getResource("/Marco10.png")).getImage();
		JLabel lblMarco10 = new JLabel("/Marco.png");
		lblMarco10.setBounds(1065,100,225,400);
		lblMarco10.setIcon(new ImageIcon(marco10));
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
