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
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Decada80 extends JPanel {
	
	public Decada80() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		
		Image letras80 = new ImageIcon(this.getClass().getResource("/Letras80.png")).getImage();
		JLabel lblLetras80 = new JLabel("");
		lblLetras80.setBounds(120, 0, 350, 450);
		lblLetras80.setIcon(new ImageIcon(letras80));
		this.add(lblLetras80);
	
		//IMAGENES CHIBI
		Image miniMarco70 = new ImageIcon(this.getClass().getResource("/MiniMarco70.png")).getImage();
		JLabel lblMiniMarco70 = new JLabel();
		lblMiniMarco70.setBounds(90, 400, 85, 125);
		lblMiniMarco70.setIcon(new ImageIcon(miniMarco70));
		this.add(lblMiniMarco70);
			
		Image miniMarco90 = new ImageIcon(this.getClass().getResource("/MiniMarco90.png")).getImage();
		JLabel lblMiniMarco90 = new JLabel();
		lblMiniMarco90.setBounds(180, 400, 85, 125);
		lblMiniMarco90.setIcon(new ImageIcon(miniMarco90));
		this.add(lblMiniMarco90);
				
		Image miniMarco00 = new ImageIcon(this.getClass().getResource("/MiniMarco00.png")).getImage();
		JLabel lblMiniMarco00 = new JLabel();
		lblMiniMarco00.setBounds(270, 400, 85, 125);
		lblMiniMarco00.setIcon(new ImageIcon(miniMarco00));
		this.add(lblMiniMarco00);
				
		Image miniMarco10 = new ImageIcon(this.getClass().getResource("/MiniMarco10.png")).getImage();
		JLabel lblMiniMarco10 = new JLabel();
		lblMiniMarco10.setBounds(360, 400, 85, 125);
		lblMiniMarco10.setIcon(new ImageIcon(miniMarco10));
		this.add(lblMiniMarco10);
		
		JButton button70 = new JButton();
		button70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada70();
		}
		});
		button70.setBounds(90, 400, 85, 125);
		button70.setContentAreaFilled(false);
		button70.setBorderPainted(false);
		add(button70);
						
		//Boton Decada 90
		JButton button90 = new JButton();
		button90.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada90();
		}
		});
		button90.setBounds(180, 400, 85, 125);
		button90.setContentAreaFilled(false);
		button90.setBorderPainted(false);
		add(button90);
						
		//Boton Decada 00's
		JButton button00 = new JButton();
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada00();
		}
		});
		button00.setBounds(270, 400, 85, 125);
		button00.setContentAreaFilled(false);
		button00.setBorderPainted(false);
		add(button00);
						
		//Boton Decada 10's
		JButton button10 = new JButton();
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada10();
		}
		});
		button10.setBounds(360, 400, 85, 125);
		button10.setContentAreaFilled(false);
		button10.setBorderPainted(false);
		add(button10);
		
		//JScrollPane
		JScrollPane jscroll = new JScrollPane();
		jscroll.setBounds(475, 30, 775, 550);
		jscroll.setEnabled(false);
		jscroll.setBorder(null);
		this.add(jscroll);
		
		JTextPane txtpnDec80 = new JTextPane();
		txtpnDec80.setEditable(false);
		txtpnDec80.setEnabled(false);
		txtpnDec80.setFont(new Font("BatangChe", Font.PLAIN, 17));
		txtpnDec80.setForeground(Color.WHITE);
		txtpnDec80.setOpaque(false);
		txtpnDec80.setText("Atari licencia el Space Invaders\r\n\r\nEra la primera vez que licenciaba una máquina recreativa. Hicieron una gran conversión que permitía jugar a 2 players e incluía 112 modos de juego.Rápidamente se convirtió en un vende consolas, haciendo ganar a Atari unos 100 millones de dólares y barriendo del mercado a sus competidores.\r\n\r\nNace Donkey Kong\r\n\r\nEn el juego podíamos encontrar un fontanero que se llamaba Jumpman (más adelante lo conoceremos como Mario). Será la primera vez donde podamos ver a este carismático personaje. El objetivo del juego es rescatar a su novia de las garras de un gorila llamado Donkey Kong, manejando a Jumpman.Nintendo tuvo algunos problemas con Universal Studios, ya que afirmaba que Donkey Kong tenía un gran parecido con su King Kong, por lo que demandaron a la compañía. Finalmente Nintendo acabó ganando el juicio.El juego fue un éxito total, aunque las épocas buenas para Nintendo aún estaban por llegar, como veremos más adelante en este mismo artículo.\r\n\r\nE.T.: El peor videojuego de la historia\r\n\r\nLa película se acababa de estrenar en los Estados Unidos con un exitazo en taquilla y Atari no quiso dejar pasar esta gran oportunidad de sacar beneficios, sacando un juego para la VCS 2600.Tardaron tres meses en desarrollarlo, justo antes de las Navidades de ese mismo año. Estaban tan seguros del éxito del juego que crearon muchísimas más unidades del juego que consolas VCS 2600 había en el mercado en ese momento, ya que se suponían que la gente correría a comprarla para jugar al juego.El juego salió a la venta y resultó ser pésimo en todos los sentidos. Con gráficos tremendamente simples, una jugabilidad imposible de entender y con un fallo que provocaba que en determinada parte del juego, E.T. caía en un hoyo de tierra y no podía salir.El resultado fueron más de 5 millones de cartuchos en los almacenes de Atari que nadie quería comprar. Los costes de almacenaje de tal cantidad de juegos eran enormes, así que decidieron deshacerse de ellos enterrándolos secretamente en un desierto de Nuevo México.\r\n\r\nAño de crisis\r\n\r\n");
		
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
		StyleConstants.setBold(sas, true);
		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		txtpnDec80.getStyledDocument().setCharacterAttributes(0, 32, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(324,17, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(985,40, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(1632,25, sas, false);
		jscroll.setViewportView(txtpnDec80);
		
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);

		

		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

	}
}
