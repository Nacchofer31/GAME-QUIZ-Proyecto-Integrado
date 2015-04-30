package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;

public class PantallaInicio extends JPanel {

	public PantallaInicio() {
		setLayout(null);
		setBounds(0, 0, 1355, 600);
				
		
		//IMAGEN DE FONDO	
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
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
 