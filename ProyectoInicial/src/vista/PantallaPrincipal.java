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
import controlador.ManejoVistas;

public class PantallaPrincipal extends JFrame {
	
	private JPanel contentPane;
	private static JPanel panelPantallas = new JPanel();
	
	private ManejoApis control;
	private ManejoVistas controlV;
	
	private JButton btnInicio;
	private JButton btnHistoria;
	private JButton btnConsolas;
	private JButton btnJuegos;
	
	public PantallaPrincipal(ManejoApis c,ManejoVistas m) {
		control = c;
		controlV=m;
		
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

				
		panelPantallas.add(controlV.getpI(),"PanelInicio");
		controlV.getpI().setLayout(null);
				
		panelPantallas.add(controlV.getpH(),"PanelHistoria");
		controlV.getpH().setLayout(null);
		
		panelPantallas.add(controlV.getD70(),"Decada70");
		controlV.getD70().setLayout(null);
			
		panelPantallas.add(controlV.getD80(),"Decada80");
		controlV.getD80().setLayout(null);
		
		panelPantallas.add(controlV.getD90(),"Decada90");
		controlV.getD90().setLayout(null);
		
		panelPantallas.add(controlV.getD00(),"Decada00");
		controlV.getD00().setLayout(null);
			
		panelPantallas.add(controlV.getD10(),"Decada10");
		controlV.getD10().setLayout(null);
			
		panelPantallas.add(controlV.getpC(),"PanelConsolas");
		controlV.getpC().setLayout(null);
		
		panelPantallas.add(controlV.getpJ(),"PanelJuegos");
		controlV.getpJ().setLayout(null);
		
		panelPantallas.add(controlV.getpQ(),"PanelQuiz");
		controlV.getpQ().setLayout(null);
		
		panelPantallas.add(controlV.getpO(),"PanelOpciones");
		controlV.getpO().setLayout(null);
		
		// JPanel para los botones
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(0, 0, 1355, 85);
		contentPane.add(panelBotones);
		panelBotones.setLayout(null);
		
		// Boton Inicio
		btnInicio = new JButton("Inicio");
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
		btnHistoria = new JButton("Historia");
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
		btnConsolas = new JButton("Consolas");
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
		btnJuegos = new JButton("Juegos");
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
		
		JButton esp = new JButton("");
		esp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CAMBIO TEXTO DECADAS
				controlV.getD70().getTxtpnDec70().setText(controlV.getTextoEsp().getProperty("decada70"));
				controlV.getD70().getJscroll().setViewportView(controlV.getD70().ponerTitulosEsp70());
				controlV.getD80().getTxtpnDec80().setText(controlV.getTextoEsp().getProperty("decada80"));
				controlV.getD80().getJscroll().setViewportView(controlV.getD80().ponerTitulosEsp80());
				controlV.getD90().getTxtpnDec90().setText(controlV.getTextoEsp().getProperty("decada90"));
				controlV.getD90().getJscroll().setViewportView(controlV.getD90().ponerTitulosEsp90());
				controlV.getD00().getTxtpnDec00().setText(controlV.getTextoEsp().getProperty("decada00"));
				controlV.getD00().getJscroll().setViewportView(controlV.getD00().ponerTitulosEsp00());
				//CAMBIO BOTONES INICIO
				controlV.getD10().getTxtpnDecActual().setText(controlV.getTextoEsp().getProperty("decada10"));
				controlV.getD10().getJscroll().setViewportView(controlV.getD10().ponerTitulosEsp10());
				controlV.getpP().getBtnInicio().setText(controlV.getTextoEsp().getProperty("inicio"));
				controlV.getpP().getBtnHistoria().setText(controlV.getTextoEsp().getProperty("historia"));
				controlV.getpP().getBtnConsolas().setText(controlV.getTextoEsp().getProperty("consolas"));
				controlV.getpP().getBtnJuegos().setText(controlV.getTextoEsp().getProperty("juegos"));
				//CAMBIO DATOS JUEGOS
				controlV.getpJ().getBtnBuscar().setText(controlV.getTextoEsp().getProperty("buscar"));	
				controlV.getpJ().getLblEmp().setText(controlV.getTextoEsp().getProperty("empresa")+": ");	
				controlV.getpJ().getLblFechaSalida().setText(controlV.getTextoEsp().getProperty("fecha")+":");	
				controlV.getpJ().getLblGenero().setText(controlV.getTextoEsp().getProperty("genero")+":");	
				controlV.getpJ().getLblGnero().setText(controlV.getTextoEsp().getProperty("genero")+": ");	
				controlV.getpJ().getLblMulti().setText(controlV.getTextoEsp().getProperty("multijugador")+":");	
				controlV.getpJ().getLblNom().setText(controlV.getTextoEsp().getProperty("nombre")+":");	
				controlV.getpJ().getLblNombre().setText(controlV.getTextoEsp().getProperty("nombre")+": ");	
				controlV.getpJ().getLblPlataforma().setText(controlV.getTextoEsp().getProperty("plataforma")+":");
				controlV.getpJ().getLblPlataformas().setText(controlV.getTextoEsp().getProperty("plataforma")+":");	
				controlV.getpJ().getLblSinopsis().setText(controlV.getTextoEsp().getProperty("sinopsis")+":");
				controlV.getpJ().getRdbtnMultijugador().setText(controlV.getTextoEsp().getProperty("multijugador"));
				//CAMBIO DATOS CONSOLAS
				controlV.getpC().getBtnBuscar().setText(controlV.getTextoEsp().getProperty("buscar"));	
				controlV.getpC().getLblEmp().setText(controlV.getTextoEsp().getProperty("empresa")+":");
				controlV.getpC().getLblEmpresa().setText(controlV.getTextoEsp().getProperty("empresa")+":");
				controlV.getpC().getLblFecha().setText(controlV.getTextoEsp().getProperty("fecha")+":");
				controlV.getpC().getLblNom().setText(controlV.getTextoEsp().getProperty("nombre")+":");
				controlV.getpC().getLblNombre().setText(controlV.getTextoEsp().getProperty("nombre")+":");
				controlV.getpC().getLblSinopsis().setText(controlV.getTextoEsp().getProperty("especificaciones")+":");
				//CAMBIO DATOS QUIZ
				controlV.getpQ().getBtnConfirmar().setText(controlV.getTextoEsp().getProperty("resultado"));
				controlV.getpQ().getBtnSiguiente().setText(controlV.getTextoEsp().getProperty("siguiente"));
				controlV.getpQ().getLblPregunta().setText(controlV.getTextoEsp().getProperty("pregunta")+" "+controlV.getpQ().getNumPreg()+":");
				//CAMBIO DATOS OPCIONES
				controlV.getpO().getLblEligeIdioma().setText(controlV.getTextoEsp().getProperty("idioma"));
				controlV.getpO().getCopyRight().setText("Copyright \r\n"+controlV.getTextoEsp().getProperty("copy"));
				controlV.getpO().getTextoEnlace().setText(controlV.getTextoEsp().getProperty("aplicacion"));
				//CAMBIO DATOS INICIO
				controlV.getpI().getLblBienvenido().setText(controlV.getTextoEsp().getProperty("bienvenido"));
				controlV.getpI().getLblHistoria().setText(controlV.getTextoEsp().getProperty("infoH"));
				controlV.getpI().getLblConsola().setText(controlV.getTextoEsp().getProperty("infoC"));
				controlV.getpI().getLblJuegos().setText(controlV.getTextoEsp().getProperty("infoJ"));
				controlV.getpI().getLblQuiz().setText(controlV.getTextoEsp().getProperty("infoQ"));
				controlV.getpI().getLblOpciones().setText(controlV.getTextoEsp().getProperty("infoO"));
			}
		});
		esp.setContentAreaFilled(false);
		esp.setOpaque(false);
		esp.setBounds(1201, 33, 40, 32);
		panelBotones.add(esp);
		
		JButton ing = new JButton("");
		ing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CAMBIO TEXTO DECADAS
				controlV.getD70().getTxtpnDec70().setText(controlV.getTextoIng().getProperty("decada70"));
				controlV.getD70().getJscroll().setViewportView(controlV.getD70().ponerTitulosEng70());
				controlV.getD80().getTxtpnDec80().setText(controlV.getTextoIng().getProperty("decada80"));
				controlV.getD80().getJscroll().setViewportView(controlV.getD80().ponerTitulosEng80());
				controlV.getD90().getTxtpnDec90().setText(controlV.getTextoIng().getProperty("decada90"));
				controlV.getD90().getJscroll().setViewportView(controlV.getD90().ponerTitulosEng90());
				controlV.getD00().getTxtpnDec00().setText(controlV.getTextoIng().getProperty("decada00"));
				controlV.getD00().getJscroll().setViewportView(controlV.getD00().ponerTitulosEng00());
				//CAMBIO BOTONES INICIO
				controlV.getD10().getTxtpnDecActual().setText(controlV.getTextoIng().getProperty("decada10"));
				controlV.getD10().getJscroll().setViewportView(controlV.getD10().ponerTitulosEng10());
				controlV.getpP().getBtnInicio().setText(controlV.getTextoIng().getProperty("inicio"));
				controlV.getpP().getBtnHistoria().setText(controlV.getTextoIng().getProperty("historia"));
				controlV.getpP().getBtnConsolas().setText(controlV.getTextoIng().getProperty("consolas"));
				controlV.getpP().getBtnJuegos().setText(controlV.getTextoIng().getProperty("juegos"));
				//CAMBIO DATOS JUEGOS
				controlV.getpJ().getBtnBuscar().setText(controlV.getTextoIng().getProperty("buscar"));	
				controlV.getpJ().getLblEmp().setText(controlV.getTextoIng().getProperty("empresa")+":");	
				controlV.getpJ().getLblFechaSalida().setText(controlV.getTextoIng().getProperty("fecha")+":");	
				controlV.getpJ().getLblGenero().setText(controlV.getTextoIng().getProperty("genero")+":");	
				controlV.getpJ().getLblGnero().setText(controlV.getTextoIng().getProperty("genero")+":");	
				controlV.getpJ().getLblMulti().setText(controlV.getTextoIng().getProperty("multijugador")+":");	
				controlV.getpJ().getLblNom().setText(controlV.getTextoIng().getProperty("nombre")+":");	
				controlV.getpJ().getLblNombre().setText(controlV.getTextoIng().getProperty("nombre")+":");	
				controlV.getpJ().getLblPlataforma().setText(controlV.getTextoIng().getProperty("plataforma")+":");
				controlV.getpJ().getLblPlataformas().setText(controlV.getTextoIng().getProperty("plataforma")+":");	
				controlV.getpJ().getLblSinopsis().setText(controlV.getTextoIng().getProperty("sinopsis")+":");
				controlV.getpJ().getRdbtnMultijugador().setText(controlV.getTextoIng().getProperty("multijugador"));
				//CAMBIO DATOS CONSOLAS
				controlV.getpC().getBtnBuscar().setText(controlV.getTextoIng().getProperty("buscar"));	
				controlV.getpC().getLblEmp().setText(controlV.getTextoIng().getProperty("empresa")+":");
				controlV.getpC().getLblEmpresa().setText(controlV.getTextoIng().getProperty("empresa")+":");
				controlV.getpC().getLblFecha().setText(controlV.getTextoIng().getProperty("fecha")+":");
				controlV.getpC().getLblNom().setText(controlV.getTextoIng().getProperty("nombre")+":");
				controlV.getpC().getLblNombre().setText(controlV.getTextoIng().getProperty("nombre")+":");
				controlV.getpC().getLblSinopsis().setText(controlV.getTextoIng().getProperty("especificaciones")+":");
				//CAMBIO DATOS QUIZ
				controlV.getpQ().getBtnConfirmar().setText(controlV.getTextoIng().getProperty("resultado"));
				controlV.getpQ().getBtnSiguiente().setText(controlV.getTextoIng().getProperty("siguiente"));
				controlV.getpQ().getLblPregunta().setText(controlV.getTextoIng().getProperty("pregunta")+" "+controlV.getpQ().getNumPreg()+":");
				//CAMBIO DATOS OPCIONES
				controlV.getpO().getLblEligeIdioma().setText(controlV.getTextoIng().getProperty("idioma"));
				controlV.getpO().getCopyRight().setText("Copyright \r\n"+controlV.getTextoIng().getProperty("copy"));
				controlV.getpO().getTextoEnlace().setText(controlV.getTextoIng().getProperty("aplicacion"));
				//CAMBIO DATOS INICIO
				controlV.getpI().getLblBienvenido().setText(controlV.getTextoIng().getProperty("bienvenido"));
				controlV.getpI().getLblHistoria().setText(controlV.getTextoIng().getProperty("infoH"));
				controlV.getpI().getLblConsola().setText(controlV.getTextoIng().getProperty("infoC"));
				controlV.getpI().getLblJuegos().setText(controlV.getTextoIng().getProperty("infoJ"));
				controlV.getpI().getLblQuiz().setText(controlV.getTextoIng().getProperty("infoQ"));
				controlV.getpI().getLblOpciones().setText(controlV.getTextoIng().getProperty("infoO"));
			}
		});
		ing.setOpaque(false);
		ing.setContentAreaFilled(false);
		ing.setBounds(1258, 33, 40, 32);
		panelBotones.add(ing);
		
		//Imagen español
		Image imgEspañol = new ImageIcon(this.getClass().getResource("/miniEspañol.png")).getImage();
						
		//Label ingles
		Image imgIngles = new ImageIcon(this.getClass().getResource("/miniIngles.png")).getImage();
		
		JLabel labelIng = new JLabel(" ");
		labelIng.setBounds(1258, 33, 40, 32);
		panelBotones.add(labelIng);
		labelIng.setIcon(new ImageIcon(imgIngles));
		JLabel labelEsp = new JLabel(" ");
		labelEsp.setBounds(1201, 33, 40, 32);
		panelBotones.add(labelEsp);
		labelEsp.setIcon(new ImageIcon(imgEspañol));
		
		
		
		
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

	public JButton getBtnInicio() {
		return btnInicio;
	}

	public JButton getBtnHistoria() {
		return btnHistoria;
	}

	public JButton getBtnConsolas() {
		return btnConsolas;
	}

	public JButton getBtnJuegos() {
		return btnJuegos;
	}
}
