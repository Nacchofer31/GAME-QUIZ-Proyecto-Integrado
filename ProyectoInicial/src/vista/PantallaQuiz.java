package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class PantallaQuiz extends JPanel {

	public PantallaQuiz() {
		setBounds(0, 105, 1355, 591);
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		setLayout(null);
		
		JTextPane textPregunta = new JTextPane();
		textPregunta.setForeground(Color.WHITE);
		textPregunta.setFont(new Font("Tahoma", Font.PLAIN, 21));
		textPregunta.setText("ds\u00F1jfkl sdjfkasldkjf sdfjlasddkfs sdjflasldkjf sdfljsdflkksjf slfjkasdklfjadskf sdljfkewffjwef iejfpjef sdiiwejfwelkfw ljfjewfrwee rjiejfpew\u00F1jf");
		textPregunta.setOpaque(false);
		textPregunta.setBounds(164, 69, 977, 91);
		add(textPregunta);
		
		JRadioButton radioButon1 = new JRadioButton("");
		radioButon1.setOpaque(false);
		radioButon1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButon1.setBounds(164, 193, 877, 35);
		add(radioButon1);
		
		JRadioButton radioButton2 = new JRadioButton("");
		radioButton2.setOpaque(false);
		radioButton2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton2.setBounds(164, 253, 877, 35);
		add(radioButton2);
		
		JRadioButton radioButton3 = new JRadioButton("");
		radioButton3.setOpaque(false);
		radioButton3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton3.setBounds(164, 315, 877, 35);
		add(radioButton3);
		
		JRadioButton radioButton4 = new JRadioButton("");
		radioButton4.setOpaque(false);
		radioButton4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton4.setBounds(164, 377, 877, 35);
		add(radioButton4);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConfirmar.setBounds(164, 480, 122, 35);
		add(btnConfirmar);
		
		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(837, 488, 122, 35);
		add(btnNewButton);
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);

	}
}
