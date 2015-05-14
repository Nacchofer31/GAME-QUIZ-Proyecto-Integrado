package vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.ManejoApis;

public class PantallaPrincipal extends JFrame {
	
	private JPanel contentPane;
	private static JPanel panelPantallas = new JPanel();
	PantallaInicio pI= new PantallaInicio();
	PantallaHistoria pH= new PantallaHistoria();
	Decada70 d70 = new Decada70();
	Decada80 d80 = new Decada80();
	Decada90 d90 = new Decada90();
	Decada00 d00 = new Decada00();
	Decada10 d10 = new Decada10();
	PantallaConsolas pC;
	PantallaJuegos pJ;
	PantallaQuiz pQ;
	PantallaOpciones pO= new PantallaOpciones();
	
	private ManejoApis control;
	
	public PantallaPrincipal(ManejoApis c) {
		control = c;
		pJ= new PantallaJuegos(control);
		pC= new PantallaConsolas(control);
		pQ= new PantallaQuiz(control);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(005, 000, 1355, 725);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// JPanel para las pantallas
		panelPantallas.setBounds(0, 105, 1355, 605);
		contentPane.add(panelPantallas);
		this.setResizable(false);
		panelPantallas.setLayout(new CardLayout(0, 0));

				
		panelPantallas.add(pI,"PanelInicio");
		pI.setLayout(null);
				
		panelPantallas.add(pH,"PanelHistoria");
		pH.setLayout(null);
		
		panelPantallas.add(d70,"Decada70");
		d70.setLayout(null);
			
		panelPantallas.add(d80,"Decada80");
		d80.setLayout(null);
		
		panelPantallas.add(d90,"Decada90");
		d90.setLayout(null);
		
		panelPantallas.add(d00,"Decada00");
		d00.setLayout(null);
			
		panelPantallas.add(d10,"Decada10");
		d10.setLayout(null);
			
		panelPantallas.add(pC,"PanelConsolas");
			pC.setLayout(null);
		
		panelPantallas.add(pJ,"PanelJuegos");
			pJ.setLayout(null);
		
		panelPantallas.add(pQ,"PanelQuiz");
			pQ.setLayout(null);
		
		panelPantallas.add(pO,"PanelOpciones");
			pO.setLayout(null);
		
		// JPanel para los botones
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(0, 0, 1355, 85);
		contentPane.add(panelBotones);
		panelBotones.setLayout(null);
		
		// Boton Inicio
		JButton btnInicio = new JButton("Inicio");
		Image imgInicio = new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		btnInicio.setIcon(new ImageIcon(imgInicio));
		btnInicio.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setOpaque(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBorderPainted(false);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelInicio");
			}
		});
		
		Image imgHeader = new ImageIcon(this.getClass().getResource("/MuroMadera.png")).getImage();
		btnInicio.setBounds(150, 10, 150, 80);
		panelBotones.add(btnInicio);
		
		//Boton Historia
		JButton btnHistoria = new JButton("Historia");
		Image imgHistoria = new ImageIcon(this.getClass().getResource("/book.png")).getImage();
		btnHistoria.setIcon(new ImageIcon(imgHistoria));
		btnHistoria.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnHistoria.setForeground(Color.WHITE);
		btnHistoria.setOpaque(false);
		btnHistoria.setContentAreaFilled(false);
		btnHistoria.setBorderPainted(false);
		btnHistoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelHistoria");
			}
		});
		btnHistoria.setBounds(325, 10, 177, 75);
		panelBotones.add(btnHistoria);
		
		//Boton Consolas
		JButton btnConsolas = new JButton("Consolas");
		Image imgConsolas = new ImageIcon(this.getClass().getResource("/consoles.png")).getImage();
		btnConsolas.setIcon(new ImageIcon(imgConsolas));
		btnConsolas.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnConsolas.setForeground(Color.WHITE);
		btnConsolas.setOpaque(false);
		btnConsolas.setContentAreaFilled(false);
		btnConsolas.setBorderPainted(false);
		btnConsolas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelConsolas");
			}
		});
		btnConsolas.setBounds(500, 10, 190, 75);
		panelBotones.add(btnConsolas);
		
		
		//Boton Juegos
		JButton btnJuegos = new JButton("Juegos");
		Image imgJuegos = new ImageIcon(this.getClass().getResource("/games.png")).getImage();
		btnJuegos.setIcon(new ImageIcon(imgJuegos));
		btnJuegos.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnJuegos.setForeground(Color.WHITE);
		btnJuegos.setOpaque(false);
		btnJuegos.setContentAreaFilled(false);
		btnJuegos.setBorderPainted(false);
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelJuegos");
			}
		});
		btnJuegos.setBounds(675, 10, 190, 75);
		panelBotones.add(btnJuegos);
		
		//Boton Quiz
		JButton btnQuiz = new JButton("Quiz");
		Image imgQuiz = new ImageIcon(this.getClass().getResource("/thumbs.png")).getImage();
		btnQuiz.setIcon(new ImageIcon(imgQuiz));
		btnQuiz.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnQuiz.setForeground(new Color(255, 255, 255));
		btnQuiz.setOpaque(false);
		btnQuiz.setContentAreaFilled(false);
		btnQuiz.setBorderPainted(false);
		btnQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelQuiz");
			}
		});
		btnQuiz.setBounds(850, 10, 150, 75);
		panelBotones.add(btnQuiz);
		
		//Boton Opciones
		JButton btnOpciones = new JButton("");
		Image imgSettings = new ImageIcon(this.getClass().getResource("/settings.png")).getImage();
		btnOpciones.setIcon(new ImageIcon(imgSettings));
		btnOpciones.setFont(new Font("Courgette", Font.PLAIN, 19));
		btnOpciones.setForeground(Color.WHITE);
		btnOpciones.setOpaque(false);
		btnOpciones.setContentAreaFilled(false);
		btnOpciones.setBorderPainted(false);
		btnOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout)panelPantallas.getLayout();
				c.show(panelPantallas, "PanelOpciones");
			}
		});
		btnOpciones.setBounds(1025, 10, 150, 75);
		panelBotones.add(btnOpciones);
		
		//Logo GameQuiz
		Image imgLogo = new ImageIcon(this.getClass().getResource("/LogoDef.png")).getImage();
		JLabel logo = new JLabel("");
		logo.setBounds(38, 6, 80, 84);
		logo.setIcon(new ImageIcon(imgLogo));
		panelBotones.add(logo);
		JLabel header = new JLabel("");
		header.setBounds(0, 0, 1355, 85);
		panelBotones.add(header);
		header.setIcon(new ImageIcon(imgHeader));
		
		//MARCO BAJO BOTONES SOBRE PANTALLA
		JPanel panel = new JPanel();
		panel.setBounds(0, 84, 1355, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Image imgBar = new ImageIcon(this.getClass().getResource("/bar.png")).getImage();
		JLabel labelMuroMadera = new JLabel("");
		labelMuroMadera.setBounds(0, 0, 1355, 30);
		labelMuroMadera.setIcon(new ImageIcon(imgBar));
		panel.add(labelMuroMadera);
	
	}
	
	public static void ponerDecada70(){
		CardLayout c= (CardLayout)panelPantallas.getLayout();
		c.show(panelPantallas, "Decada70");
	}
	
	public static void ponerDecada80(){
		CardLayout c= (CardLayout)panelPantallas.getLayout();
		c.show(panelPantallas, "Decada80");
	}
	
	public static void ponerDecada90(){
		CardLayout c= (CardLayout)panelPantallas.getLayout();
		c.show(panelPantallas, "Decada90");
	}
	
	public static void ponerDecada00(){
		CardLayout c= (CardLayout)panelPantallas.getLayout();
		c.show(panelPantallas, "Decada00");
	}
	
	public static void ponerDecada10(){
		CardLayout c= (CardLayout)panelPantallas.getLayout();
		c.show(panelPantallas, "Decada10");
	}
}
