package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;

public class PantallaOpciones extends JPanel {

	public PantallaOpciones() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);

		
		//Boton español
		JButton esp = new JButton("");
		esp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		esp.setBounds(492, 62, 100, 80);
		esp.setContentAreaFilled(false);
		esp.setBorderPainted(false);
		this.add(esp);
		
		//Boton ingles
		JButton ing = new JButton("");
		ing.setBounds(766, 62, 100, 80);
		ing.setContentAreaFilled(false);
		ing.setBorderPainted(false);
		this.add(ing);
		
		//Label elegir idioma
		JLabel lblEligeIdioma = new JLabel("Elige idioma");
		lblEligeIdioma.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblEligeIdioma.setForeground(Color.WHITE);
		lblEligeIdioma.setBounds(623, 70, 125, 59);
		this.add(lblEligeIdioma);
		
		//Imagen español
		Image imgEspañol = new ImageIcon(this.getClass().getResource("/español.png")).getImage();
		JLabel labelEsp = new JLabel(" ");
		labelEsp.setBounds(492, 62, 100, 80);
		labelEsp.setIcon(new ImageIcon(imgEspañol));
		this.add(labelEsp);
		
		//Label ingles
		Image imgIngles = new ImageIcon(this.getClass().getResource("/ingles.png")).getImage();
		JLabel labelIng = new JLabel(" ");
		labelIng.setBounds(766, 62, 100, 80);
		labelIng.setIcon(new ImageIcon(imgIngles));
		this.add(labelIng);
		
		//Texto del enlace
		JLabel textoEnlace = new JLabel("Aplicaci\u00F3n desarrollada por");
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
		JTextPane CopyRight = new JTextPane();
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
	
}