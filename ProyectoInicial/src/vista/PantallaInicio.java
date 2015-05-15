package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;

public class PantallaInicio extends JPanel {

	private String mensajes[]={"En el arcade original de Donkey Kong  Mario se llama JumpMan y es un carpintero, no un fontanero.",
					   "El que los enemigos acelerasen en el “Space Invaders” original de 1971, fue un bug, pero se mantuvo.",
					   "A partir del nivel 18, los fantasmas del “Pacman” dejan de volverse azules y ya no se pueden comer.",
					   "Halo 2 es el juego de Xbox mas vendido, vendió 8 millones de copias,le sigue de cerca Halo I,con 5 millones.",
					   "La protagonista de Tomb Raider, Lara Croft, originalmente se iba a llamar Laura Cruz.",
					   "El Polybius es el juego arcade más misterioso de todos los tiempos y no se conserva ni una sola copia del mismo.",
					   "En el nivel de la feria agrícola del Bioshock I puedes encontrar una clara referencia a Pacman.",
					   "La potencia de la PS3 permite utilizarla para investigar enfermedades.",
					   "La Xbox originalmente se iba a llamar DirextX-box.",
					   "Mega Man es azul gracias a que la primera aparición fue en NES, que tennia una limitada seleccion de colores."};
	
	public PantallaInicio() {
		setLayout(null);
		setBounds(0, 0, 1355, 600);
				
		//IMAGEN DE FONDO	
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		Image iHello = new ImageIcon(this.getClass().getResource("/hola.png")).getImage();
		JLabel lblHello = new JLabel("");
		lblHello.setBounds(162, 38, 160, 89);
		lblHello.setIcon(new ImageIcon(iHello));
		add(lblHello);
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 605);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		JLabel lblBienvenido = new JLabel("\u00A1Bienvenidos a GAME QUIZ!");
		lblBienvenido.setFont(new Font("BatangChe", Font.BOLD, 32));
		lblBienvenido.setForeground(Color.WHITE);
		lblBienvenido.setBounds(448, 38, 475, 76);
		add(lblBienvenido);
		
		JLabel lblHistoria = new JLabel(">Historia...........Estudia las principales d\u00E9cadas de la Historia de  los Videojuegos.");
		lblHistoria.setFont(new Font("BatangChe", Font.ITALIC, 18));
		lblHistoria.setForeground(Color.WHITE);
		lblHistoria.setBounds(228, 158, 814, 32);
		add(lblHistoria);
		
		JLabel lblConsola = new JLabel(">Consolas...........Conoce y descubre las consolas m\u00E1s reconocidas en el mundo del Gaming.");
		lblConsola.setForeground(Color.WHITE);
		lblConsola.setFont(new Font("BatangChe", Font.ITALIC, 18));
		lblConsola.setBounds(228, 191, 832, 32);
		add(lblConsola);
		
		JLabel lblJuegos = new JLabel(">Juegos  ...........Busca tus juegos favoritos, juegos que marcaron tu infancia, tus pr\u00F3ximas adquisiciones....");
		lblJuegos.setForeground(Color.WHITE);
		lblJuegos.setFont(new Font("BatangChe", Font.ITALIC, 18));
		lblJuegos.setBounds(228, 221, 1017, 32);
		add(lblJuegos);
		
		JLabel lblQuiz = new JLabel(">Quiz!   ...........Desarrolla y pon a prueba tus conocimientos como gamer y haz frente lo aprendido.");
		lblQuiz.setForeground(Color.WHITE);
		lblQuiz.setFont(new Font("BatangChe", Font.ITALIC, 18));
		lblQuiz.setBounds(228, 257, 979, 32);
		add(lblQuiz);
		
		JLabel lblopcionesdesarrollaYPon = new JLabel(">Opciones...........Accede al men\u00FA de opciones para cambiar el tama\u00F1o de la letra, cambiar idioma...");
		lblopcionesdesarrollaYPon.setForeground(Color.WHITE);
		lblopcionesdesarrollaYPon.setFont(new Font("BatangChe", Font.ITALIC, 18));
		lblopcionesdesarrollaYPon.setBounds(228, 291, 936, 32);
		add(lblopcionesdesarrollaYPon);
		
		JLabel lblTipsTricks = new JLabel("Tips & Tricks");
		lblTipsTricks.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipsTricks.setForeground(Color.WHITE);
		lblTipsTricks.setFont(new Font("BatangChe", Font.BOLD, 26));
		lblTipsTricks.setBounds(566, 404, 206, 49);
		add(lblTipsTricks);
		
		JLabel lblMensaje = new JLabel(mensajes[0]);
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setFont(new Font("BatangChe",  Font.ITALIC, 17));
		lblMensaje.setBounds(92, 454, 1079, 77);
		add(lblMensaje);

		JButton Arrow = new JButton("");
		Image imgArrow = new ImageIcon(this.getClass().getResource("/arrow.png")).getImage();
		Arrow.setIcon(new ImageIcon(imgArrow));
		Arrow.setOpaque(false);
		Arrow.setContentAreaFilled(false);
		Arrow.setBorderPainted(false);
		Arrow.setBounds(1153, 454, 91, 87);
		add(Arrow);
		Arrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numAleat=(int) (Math.random()*mensajes.length);
				lblMensaje.setText(mensajes[numAleat]);
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(188, 351, 1019, 11);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(188, 136, 1019, 11);
		add(separator_1);
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
	}
}
 