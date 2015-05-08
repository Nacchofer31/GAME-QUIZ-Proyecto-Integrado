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
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Decada70 extends JPanel {
	
	public Decada70() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		//IMAGEN DECADA
		
		Image letras70 = new ImageIcon(this.getClass().getResource("/Letras70.png")).getImage();
		JLabel lblLetras70 = new JLabel("");
		lblLetras70.setBounds(120, 0, 350, 450);
		lblLetras70.setIcon(new ImageIcon(letras70));
		this.add(lblLetras70);
		
		//IMAGENES CHIBI
		Image miniMarco80 = new ImageIcon(this.getClass().getResource("/MiniMarco80.png")).getImage();
		JLabel lblMiniMarco80 = new JLabel("");
		lblMiniMarco80.setBounds(90, 400, 85, 125);
		lblMiniMarco80.setIcon(new ImageIcon(miniMarco80));
		this.add(lblMiniMarco80);
		
		Image miniMarco90 = new ImageIcon(this.getClass().getResource("/MiniMarco90.png")).getImage();
		JLabel lblMiniMarco90 = new JLabel("");
		lblMiniMarco90.setBounds(180, 400, 85, 125);
		lblMiniMarco90.setIcon(new ImageIcon(miniMarco90));
		this.add(lblMiniMarco90);
		
		Image miniMarco00 = new ImageIcon(this.getClass().getResource("/MiniMarco00.png")).getImage();
		JLabel lblMiniMarco00 = new JLabel("");
		lblMiniMarco00.setBounds(270, 400, 85, 125);
		lblMiniMarco00.setIcon(new ImageIcon(miniMarco00));
		this.add(lblMiniMarco00);
		
		Image miniMarco10 = new ImageIcon(this.getClass().getResource("/MiniMarco10.png")).getImage();
		JLabel lblMiniMarco10 = new JLabel("");
		lblMiniMarco10.setBounds(360, 400, 85, 125);
		lblMiniMarco10.setIcon(new ImageIcon(miniMarco10));
		this.add(lblMiniMarco10);
				
		
		//Boton Decada 80
		JButton button80 = new JButton("");
		button80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada80();
			}
		});
		button80.setBounds(90, 400, 85, 125);
		button80.setContentAreaFilled(false);
		button80.setBorderPainted(false);
		add(button80);
				
		//Boton Decada 90
		JButton button90 = new JButton("");
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
		JButton button00 = new JButton("");
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
		JButton button10 = new JButton("");
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
    				
  		JTextPane txtpnDec70 = new JTextPane();
 		txtpnDec70.setEditable(false);
 		txtpnDec70.setEnabled(false);
    		txtpnDec70.setFont(new Font("BatangChe", Font.PLAIN, 17));
    		txtpnDec70.setForeground(Color.WHITE);
    		txtpnDec70.setOpaque(false);
   		txtpnDec70.setText("Ralph Baer y el Magnavox Odyssey\r\n\r\nRalph Baer es considerado por muchos como el inventor de los videojuegos tal y como los conocemos. Es el inventor de las videoconsolas.\r\nEn el a\u00F1o 1966, por su cuenta, construy\u00F3 la primera consola dom\u00E9stica de videojuegos. \u00C9l sab\u00EDa lo que quer\u00EDa hacer pero luch\u00F3 durante a\u00F1os para encontrar empresas o inversores que confiaran en \u00E9l para poner en el mercado su primera consola (Odyssey), cosa que conseguir\u00EDa en el a\u00F1o 1972.\r\n\r\nCon todas las ventas de la consola, se consiguieron vender cerca de 130.000 unidades en la campa\u00F1a de navidad, todo un \u00E9xito, que atrajo la atenci\u00F3n de numerosos emprendedores, entre ellos Nolan Bushnell.\r\n\r\nLa creaci\u00F3n de Atari\r\n\r\nNolan Bushnell junto a Ted Dabney eligieron el nombre de \"Syzygy\" para la futura compa\u00F1\u00EDa, sin embargo, el nombre ya estaba registrado por otra compa\u00F1\u00EDa, por lo que finalmente se decantaron por el nombre de Atari  y se fundo el 1 de Junio de 1972.\r\n\r\nEl nombre de Atari proviene del juego de mesa Go, es la palabra utilizada cuando se consiguen rodear las piedras del oponente y se va a ganar la partida.\r\n\r\nNace el Pong\r\n\r\nCuando Bushnell trabajaba con Nutting, se enteraron de que en la Magnavox Profit Caravan de 1972 se estaba mostrando un sistema dom\u00E9stico de videojuegos, y enviaron a Bushnell para verlo. Fue all\u00ED donde Bushnell vio el juego de ping pong de Baer y probablemente donde se le ocurri\u00F3 la idea de crear un juego similar cuando comenzaba su etapa en Atari.\r\n\r\nBushnell lo llam\u00F3 Pong, fue el mayor \u00E9xito jam\u00E1s visto en la industria de los videojuegos hasta ese momento, cambiando para siempre una industria que dura hasta hoy en d\u00EDa.\r\n\r\nEl rival directo de Atari\r\n\r\nCon el \u00E9xito de Home Pong, cientos de compa\u00F1\u00EDas se lanzaron a crear consolas y dispositivos electr\u00F3nicos para jugar en casa de la misma forma. Magnavox volvi\u00F3 a intentarlo, despu\u00E9s del fracaso de la Odyssey, con la Odyssey 100, otro error. Pero Atari ahora tendr\u00EDa un rival m\u00E1s fuerte: Coleco.\r\n\r\nColeco dise\u00F1\u00F3 una consola durante todo el a\u00F1o 1975: Telstar. Fue lanzada en junio de 1976. No dejaba de ser un Home Pong m\u00E1s, pero tuvo un \u00E9xito brutal ya que Coleco era el principal cliente de General Instrument, la empresa que suministraba los chips para los juegos de consola, y el resto de empresas que lo ped\u00EDan, no dispon\u00EDan de existencias.");
    				
  		SimpleAttributeSet sas = new SimpleAttributeSet(); 
  		StyleConstants.setBold(sas, true);
 		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		txtpnDec70.getStyledDocument().setCharacterAttributes(0, 32, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(665,20, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(1091,12, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(1632,25, sas, false);
		jscroll.setViewportView(txtpnDec70);
    				
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
  				
				
		
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setForeground(Color.RED);
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		
		
		
		
		
		
		
		
		
		

	}
}
