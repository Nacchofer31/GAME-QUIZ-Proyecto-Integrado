
package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import controlador.ManejoVistas;

public class PantallaOpciones extends JPanel {
	
	private ManejoVistas controlV;
	
	private JLabel lblEligeIdioma;
	private JTextPane CopyRight;
	private JLabel textoEnlace;

	public PantallaOpciones(ManejoVistas v) {
		controlV=v;
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);

		
		//Boton español
		JButton esp = new JButton("");
		esp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				lblEligeIdioma.setText(controlV.getTextoEsp().getProperty("idioma"));
				CopyRight.setText("Copyright \r\n"+controlV.getTextoEsp().getProperty("copy"));
				textoEnlace.setText(controlV.getTextoEsp().getProperty("aplicacion"));
				//CAMBIO DATOS INICIO
				controlV.getpI().getLblBienvenido().setText(controlV.getTextoEsp().getProperty("bienvenido"));
				controlV.getpI().getLblHistoria().setText(controlV.getTextoEsp().getProperty("infoH"));
				controlV.getpI().getLblConsola().setText(controlV.getTextoEsp().getProperty("infoC"));
				controlV.getpI().getLblJuegos().setText(controlV.getTextoEsp().getProperty("infoJ"));
				controlV.getpI().getLblQuiz().setText(controlV.getTextoEsp().getProperty("infoQ"));
				controlV.getpI().getLblOpciones().setText(controlV.getTextoEsp().getProperty("infoO"));
			}
		});
		esp.setBounds(488, 62, 100, 80);
		esp.setContentAreaFilled(false);
		esp.setBorderPainted(false);
		this.add(esp);
		
		//Boton ingles
		JButton ing = new JButton("");
		ing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				lblEligeIdioma.setText(controlV.getTextoIng().getProperty("idioma"));
				CopyRight.setText("Copyright \r\n"+controlV.getTextoIng().getProperty("copy"));
				textoEnlace.setText(controlV.getTextoIng().getProperty("aplicacion"));
				//CAMBIO DATOS INICIO
				controlV.getpI().getLblBienvenido().setText(controlV.getTextoIng().getProperty("bienvenido"));
				controlV.getpI().getLblHistoria().setText(controlV.getTextoIng().getProperty("infoH"));
				controlV.getpI().getLblConsola().setText(controlV.getTextoIng().getProperty("infoC"));
				controlV.getpI().getLblJuegos().setText(controlV.getTextoIng().getProperty("infoJ"));
				controlV.getpI().getLblQuiz().setText(controlV.getTextoIng().getProperty("infoQ"));
				controlV.getpI().getLblOpciones().setText(controlV.getTextoIng().getProperty("infoO"));
				
				}
		});
		ing.setBounds(772, 62, 100, 80);
		ing.setContentAreaFilled(false);
		ing.setBorderPainted(false);
		this.add(ing);
		
		//Label elegir idioma
		lblEligeIdioma = new JLabel("Elige idioma");
		lblEligeIdioma.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblEligeIdioma.setForeground(Color.WHITE);
		lblEligeIdioma.setBounds(622, 70, 164, 59);
		this.add(lblEligeIdioma);
		
		//Imagen español
		Image imgEspañol = new ImageIcon(this.getClass().getResource("/español.png")).getImage();
		JLabel labelEsp = new JLabel(" ");
		labelEsp.setBounds(488, 62, 100, 80);
		labelEsp.setIcon(new ImageIcon(imgEspañol));
		this.add(labelEsp);
		
		//Label ingles
		Image imgIngles = new ImageIcon(this.getClass().getResource("/ingles.png")).getImage();
		JLabel labelIng = new JLabel(" ");
		labelIng.setBounds(772, 62, 100, 80);
		labelIng.setIcon(new ImageIcon(imgIngles));
		this.add(labelIng);
		
		//Texto del enlace
		textoEnlace = new JLabel("Aplicaci\u00F3n desarrollada por");
		textoEnlace.setFont(new Font("BatangChe", Font.PLAIN, 20));
		textoEnlace.setForeground(Color.WHITE);
		textoEnlace.setBounds(475, 192, 275, 59);
		this.add(textoEnlace);
		
		//Space 1
		Image space1 = new ImageIcon(this.getClass().getResource("/Space1.png")).getImage();
		JLabel lblSpace1 = new JLabel(" ");
		lblSpace1.setBounds(84, 62, 375, 475);
		lblSpace1.setIcon(new ImageIcon(space1));
		this.add(lblSpace1);
	
		Image space2 = new ImageIcon(this.getClass().getResource("/Space2.png")).getImage();
		JLabel lblSpace2 = new JLabel(" ");
		lblSpace2.setBounds(915, 47, 375, 475);
		lblSpace2.setIcon(new ImageIcon(space2));
		this.add(lblSpace2);
		
		//Enlace web
		JLabel enlaceWeb = new JLabel("");
		enlaceWeb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					if (Desktop.isDesktopSupported()) {
					Desktop desktop = Desktop.getDesktop();
					if (desktop.isSupported(Desktop.Action.BROWSE)) {
					desktop.browse(new URI("http://www.gamequiz.esy.es/web/"));
					}
					}
					} catch (Exception e) {
					e.printStackTrace();
					}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		enlaceWeb.setForeground(SystemColor.textHighlight);
		enlaceWeb.setBorder(null);
		enlaceWeb.setVerifyInputWhenFocusTarget(false);
		enlaceWeb.setOpaque(false);
		enlaceWeb.setFont(new Font("BatangChe", Font.PLAIN, 20));
		enlaceWeb.setBackground(UIManager.getColor("Button.background"));
		enlaceWeb.setText("The Debrolopers");
		enlaceWeb.setBounds(749, 192, 161, 59);
		add(enlaceWeb);
		
		//Copyrigth
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
		StyleConstants.setBold(sas, true);
		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 35);
		CopyRight = new JTextPane();
		CopyRight.setBounds(475, 262, 453, 134);
		add(CopyRight);
		CopyRight.setEditable(false);
		CopyRight.setEnabled(false);
		CopyRight.setFont(new Font("BatangChe", Font.PLAIN, 21));
		CopyRight.setForeground(Color.WHITE);
		CopyRight.setOpaque(false);
		CopyRight.setText("Copyright \r\nTodas las imagenes pertenecen a sus autores originales, todos los derechos reservados. ");
		CopyRight.getStyledDocument().setCharacterAttributes(0, 9, sas, false);
	
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBorder(null);
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		//JScrollPane
		JScrollPane jscroll = new JScrollPane();
		jscroll.setBounds(475, 310, 453, 86);
		jscroll.setEnabled(false);
		jscroll.setBorder(null);
		this.add(jscroll);
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
	}

	public JLabel getLblEligeIdioma() {
		return lblEligeIdioma;
	}

	public JTextPane getCopyRight() {
		return CopyRight;
	}

	public JLabel getTextoEnlace() {
		return textoEnlace;
	}
	
}