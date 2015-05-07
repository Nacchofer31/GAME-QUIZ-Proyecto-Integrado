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

public class PantallaOpciones extends JPanel {
	private JTextField enlaceWeb;

	public PantallaOpciones() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);

		
		//Boton espa�ol
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
		
		//Imagen espa�ol
		Image imgEspa�ol = new ImageIcon(this.getClass().getResource("/espa�ol.png")).getImage();
		JLabel labelEsp = new JLabel("New label");
		labelEsp.setBounds(492, 62, 100, 80);
		labelEsp.setIcon(new ImageIcon(imgEspa�ol));
		this.add(labelEsp);
		
		//Label ingles
		Image imgIngles = new ImageIcon(this.getClass().getResource("/ingles.png")).getImage();
		JLabel labelIng = new JLabel("New label");
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
		Image spaceInvaders1 = new ImageIcon(this.getClass().getResource("/")).getImage();;
		JLabel space1 = new JLabel("New label");
		space1.setBounds(84, 62, 343, 483);
		space1.setIcon(new ImageIcon(spaceInvaders1));
		this.add(space1);
	
		//Enlace web
		enlaceWeb = new JTextField();
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
		JTextPane CopyRigth = new JTextPane();
		CopyRigth.setBounds(475, 262, 453, 134);
		add(CopyRigth);
		CopyRigth.setEditable(false);
		CopyRigth.setEnabled(false);
		CopyRigth.setFont(new Font("BatangChe", Font.PLAIN, 21));
		CopyRigth.setForeground(Color.WHITE);
		CopyRigth.setOpaque(false);
		CopyRigth.setText("Copyrigth \r\nTodas las imagenes usadas en nuestra aplicaci\u00F3n son propias y elaboradas por nuestro dise\u00F1ador gr\u00E1fico Jorge Ombuena");
		CopyRigth.getStyledDocument().setCharacterAttributes(0, 9, sas, false);
	
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
	
private void makeLink() {
	addMouseListener(new MouseListener() {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				Desktop.getDesktop().browse(new URI("gamequiz.esy.es/web/descripcionNosotros.html"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	
}
}
