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
		esp.setBounds(76, 92, 100, 80);
		esp.setContentAreaFilled(false);
		esp.setBorderPainted(false);
		add(esp);
		
		//Boton ingles
		JButton ing = new JButton("");
		ing.setBounds(350, 92, 100, 80);
		ing.setContentAreaFilled(false);
		ing.setBorderPainted(false);
		add(ing);
		
		//Texto del enlace
		JLabel textoEnlace = new JLabel("Aplicaci\u00F3n desarrollada por");
		textoEnlace.setFont(new Font("BatangChe", Font.PLAIN, 20));
		textoEnlace.setForeground(Color.WHITE);
		textoEnlace.setBounds(76, 503, 275, 59);
		add(textoEnlace);
		
		//Enlace web
		JLabel enlaceWeb = new JLabel("The Debrolopers");
		enlaceWeb.setForeground(Color.WHITE);
		enlaceWeb.setFont(new Font("BatangChe", Font.PLAIN, 20));
		enlaceWeb.setBounds(350, 503, 161, 59);
		add(enlaceWeb);
		makeLink();
		
		//Label elegir idioma
		JLabel lblEligeIdioma = new JLabel("Elige idioma");
		lblEligeIdioma.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblEligeIdioma.setForeground(Color.WHITE);
		lblEligeIdioma.setBounds(207, 100, 125, 59);
		add(lblEligeIdioma);
		
		//Imagen español
		Image imgEspañol = new ImageIcon(this.getClass().getResource("/español.png")).getImage();
		JLabel labelEsp = new JLabel("New label");
		labelEsp.setBounds(76, 92, 100, 80);
		labelEsp.setIcon(new ImageIcon(imgEspañol));
		this.add(labelEsp);
		
		//Label ingles
		Image imgIngles = new ImageIcon(this.getClass().getResource("/ingles.png")).getImage();
		JLabel labelIng = new JLabel("New label");
		labelIng.setBounds(350, 92, 100, 80);
		labelIng.setIcon(new ImageIcon(imgIngles));
		this.add(labelIng);

		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
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
