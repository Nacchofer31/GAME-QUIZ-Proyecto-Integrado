package vista;

import java.awt.Color;
import java.awt.Component;
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
	private JTextPane txtpnDec70;
	private JScrollPane jscroll;
	
	public Decada70() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		//MENSAJE DE MIERA
		
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
		JButton button80 = new JButton();
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
    		jscroll = new JScrollPane();
    		jscroll.setBounds(475, 30, 775, 550);
  		jscroll.setEnabled(false);
  		jscroll.setBorder(null);
  		this.add(jscroll);
    				
  		txtpnDec70 = new JTextPane();
 		txtpnDec70.setEditable(false);
 		txtpnDec70.setEnabled(false);
    		txtpnDec70.setFont(new Font("BatangChe", Font.PLAIN, 17));
    		txtpnDec70.setForeground(Color.WHITE);
    		txtpnDec70.setOpaque(false);
   		txtpnDec70.setText("Ralph Baer y el Magnavox Odyssey\r\n\r\nRalph Baer es considerado por muchos como el inventor de los videojuegos tal y como los conocemos. Es el inventor de las videoconsolas.\r\nEn el a\u00F1o 1966, por su cuenta, construy\u00F3 la primera consola dom\u00E9stica de videojuegos. \u00C9l sab\u00EDa lo que quer\u00EDa hacer pero luch\u00F3 durante a\u00F1os para encontrar empresas o inversores que confiaran en \u00E9l para poner en el mercado su primera consola (Odyssey), cosa que conseguir\u00EDa en el a\u00F1o 1972.\r\n\r\nCon todas las ventas de la consola, se consiguieron vender cerca de 130.000 unidades en la campa\u00F1a de navidad, todo un \u00E9xito, que atrajo la atenci\u00F3n de numerosos emprendedores, entre ellos Nolan Bushnell.\r\n\r\nLa creaci\u00F3n de Atari\r\n\r\nNolan Bushnell junto a Ted Dabney eligieron el nombre de \"Syzygy\" para la futura compa\u00F1\u00EDa, sin embargo, el nombre ya estaba registrado por otra compa\u00F1\u00EDa, por lo que finalmente se decantaron por el nombre de Atari  y se fundo el 1 de Junio de 1972.\r\n\r\nEl nombre de Atari proviene del juego de mesa Go, es la palabra utilizada cuando se consiguen rodear las piedras del oponente y se va a ganar la partida.\r\n\r\nNace el Pong\r\n\r\nCuando Bushnell trabajaba con Nutting, se enteraron de que en la Magnavox Profit Caravan de 1972 se estaba mostrando un sistema dom\u00E9stico de videojuegos, y enviaron a Bushnell para verlo. Fue all\u00ED donde Bushnell vio el juego de ping pong de Baer y probablemente donde se le ocurri\u00F3 la idea de crear un juego similar cuando comenzaba su etapa en Atari.\r\n\r\nBushnell lo llam\u00F3 Pong, fue el mayor \u00E9xito jam\u00E1s visto en la industria de los videojuegos hasta ese momento, cambiando para siempre una industria que dura hasta hoy en d\u00EDa.\r\n\r\nEl rival directo de Atari\r\n\r\nCon el \u00E9xito de Home Pong, cientos de compa\u00F1\u00EDas se lanzaron a crear consolas y dispositivos electr\u00F3nicos para jugar en casa de la misma forma. Magnavox volvi\u00F3 a intentarlo, despu\u00E9s del fracaso de la Odyssey, con la Odyssey 100, otro error. Pero Atari ahora tendr\u00EDa un rival m\u00E1s fuerte: Coleco.\r\n\r\nColeco dise\u00F1\u00F3 una consola durante todo el a\u00F1o 1975: Telstar. Fue lanzada en junio de 1976. No dejaba de ser un Home Pong m\u00E1s, pero tuvo un \u00E9xito brutal ya que Coleco era el principal cliente de General Instrument, la empresa que suministraba los chips para los juegos de consola, y el resto de empresas que lo ped\u00EDan, no dispon\u00EDan de existencias.\r\n\r\nAtari contrata a Steve Jobs\r\n\r\nAl Alcorn contrat\u00F3 a Steve Jobs (uno de los nombres m\u00E1s conocidos a d\u00EDa de hoy en la industria de los videojuegos). Despu\u00E9s de hacer varios viajes por el mundo, Steve comenz\u00F3 a dise\u00F1ar un videojuego: Breakout. Nolan Bushnell fue quien lo ide\u00F3, volviendo a crear un nuevo concepto jugable a partir de pong, ya que en esta ocasi\u00F3n s\u00F3lo hab\u00EDa una pala y en el otro extremo una serie de bloques que hab\u00EDa que ir destruyendo con una pelota que iba rebotando en ellos.\r\n\r\nEn esos momentos en Atari estaban muy preocupados por los chips y las reparaciones que hab\u00EDa que llevar a cabo en las m\u00E1quinas una vez instaladas, por lo que se trataba de rentabilizar al m\u00E1ximo el n\u00FAmero de chips a instalar en un arcade ya que por cada uno de ellos Atari se ahorraba cerca de 100.000 d\u00F3lares.\r\nBreakout no se libraba de todo eso y Bushnell pidi\u00F3 voluntarios para crear el juego con el menor n\u00FAmero de chips. Steve Jobs contaba con su amigo Steve Wozniak que trabajaba en Hewlett Packard. En esos momentos los dos estaban trabajando en el Apple II, pero Jobs confiaba en que su amigo le ayudara a reducir el n\u00FAmero de chips a utilizar.\r\n\r\nBreakout acab\u00F3 siendo el mejor juego del a\u00F1o y tambi\u00E9n el primer \"clon\" de Pong que consegu\u00EDa ser m\u00E1s adictivo que el original.\r\n\r\nAdem\u00E1s de Breakout, Atari tuvo otro \u00E9xito con Night Driver, que apareci\u00F3 en octubre. En el juego, la carretera estaba representada con unos cuadrados blancos y aportaba una gran sensaci\u00F3n de velocidad.\r\n\r\nPrimera vez que se habla de violencia en los videojuegos\r\n\r\nEste a\u00F1o fue el primero en el que la pol\u00E9mica de la violencia en los videojuegos sacudi\u00F3 a la industria con la comercializaci\u00F3n de Death Race por parte de Exidy. Este juego fue creado por Pete Kauffman, pero no con ese nombre, sino con el de Destruction Derby, en el que los jugadores deb\u00EDan de tratar de chocarse contra el resto de los coches del circuito para destruirlos.\r\n\r\nLe vendi\u00F3 el juego a Chicago Coin, que se neg\u00F3 a pagar los royalties, por lo que Kauffman revis\u00F3 el juego y le hizo unas cuantas modificaciones. Despu\u00E9s de esto, en Death Race deb\u00EDamos de chocar contra formas humanas esquel\u00E9ticas que se escapaban de un cementerio. Cada vez que atropellabas a uno aparec\u00EDa una peque\u00F1a cruz en pantalla. Todo este nuevo contenido hizo que en algunos salones recreativos se negasen a exponer el juego, lo que hizo que Exidy vendiera \u00FAnicamente 1000 m\u00E1quinas y que estuviera en boca de todos.\r\n\r\nAparecen nuevas empresas\r\n\r\nEn 1976, aparecieron tambi\u00E9n otras compa\u00F1\u00EDas con consolas como la Channel F de Fairchild. En esta m\u00E1quina se pod\u00EDan jugar a diferentes juegos guardados cada uno de ellos en unos cartuchos que se pod\u00EDan intercambiar.\r\n\r\nAl igual que otras m\u00E1quinas, la Channel F llevaba en memoria diferentes juegos parecidos al Pong, pero se pod\u00EDan adquirir por separado juegos que ven\u00EDan en unos cartuchos de pl\u00E1stico, cada uno con un microchip que permit\u00EDa que al meterlo en la m\u00E1quina se pudiera jugar al juego que ven\u00EDa grabado dentro.\r\n\r\nEsta consola no tuvo demasiado \u00E9xito, llegando a comercializar 21 cartuchos antes de vender los derechos a Circ\u00F3n, que desarroll\u00F3 5 cartuchos m\u00E1s y abandon\u00F3 el proyecto. Sin duda cambi\u00F3 la industria para siempre. Instant\u00E1neamente todas las compa\u00F1\u00EDas anunciaron nuevas m\u00E1quinas que seguir\u00EDan este esquema, y como siempre Atari fue quien mejor se adapt\u00F3 a los cambios.\r\n\r\nNintendo hace su aparici\u00F3n\r\n\r\nJunto con Mitsubishi Electrics sac\u00F3 a la venta el Nintendo Tv Game 6. Permit\u00EDa jugar a 6 versiones diferentes del juego Light Tennis, que era una versi\u00F3n mejorada y a cuatro colores del Pong (los derechos de este juego se negociaron con Magnavox). No llevaba cartuchos, los juegos estaban incluidos dentro de la memoria de la consola. Pod\u00EDan jugar dos jugadores.\r\n\r\nLos jugadores controlaban las barras del juego con discos atados directamente a la m\u00E1quina. Vendi\u00F3 millones de copias a 8.300 yenes cada una.\r\n\r\nEste a\u00F1o entr\u00F3 a trabajar Shigeru Miyamoto como dise\u00F1ador del artwork para los arcades. Personaje que acabar\u00EDa siendo important\u00EDsimo para la historia de la compa\u00F1\u00EDa.\r\n\r\nTaito lanza el Space Invaders\r\n\r\nToshihiro Nishikado era uno de los programadores de Taito, y para uno de sus proyectos se le ocurri\u00F3 la idea de un soldado parapetado detr\u00E1s de unas trincheras, que disparaba a filas de enemigos acerc\u00E1ndose hacia \u00E9l. Pero la compa\u00F1\u00EDa pens\u00F3 que era demasiado violento, y que podr\u00EDa acarrear problemas, as\u00ED que decidi\u00F3 cambiar a los humanos por alien\u00EDgenas y naves espaciales.\r\n\r\nDe esta manera naci\u00F3 Space Invaders en 1978, la recreativa que dio a conocer los videojuegos al mundo. En este juego, el jugador (detr\u00E1s de escudos c\u00F3smicos) deb\u00EDa vencer a 4 filas de marcianitos que cada vez se aproximaban a \u00E9l m\u00E1s y m\u00E1s r\u00E1pido. Pero su principal innovaci\u00F3n estuvo en algo que durante a\u00F1os ser\u00EDa muy importante en los videojuegos: El Hi-Score.\r\n\r\nLos humanos tenemos instinto de superaci\u00F3n, y con esto las personas intentaban hacer la partida perfecta, batir el record y colocar su puntuaci\u00F3n en la m\u00E1quina.\r\n\r\nSpace Invaders fue un \u00E9xito absoluto, llegando a provocar que el gobierno nip\u00F3n cuadriplicara la producci\u00F3n de monedas de yen, por su escasez a causa del juego. Pero no solo fue \u00E9xito en Jap\u00F3n, sino que a trav\u00E9s de Midway lleg\u00F3 a Am\u00E9rica con id\u00E9nticos resultados. El videojuego sali\u00F3 de los bares y salones recreativos y dio el salto a varios negocios. Todo el mundo quer\u00EDa tener una m\u00E1quina de Space Invaders.\r\n\r\nEl primer huevo de pascua\r\n\r\nLos huevos de pascua (easter eggs en ingl\u00E9s) son elementos ocultos dentro de un producto. En el mundo del software es muy com\u00FAn encontrarse huevos de pascua, desde videojuegos ocultos dentro de editores de texto hasta fotos de los programadores dentro de un videojuego.\r\n\r\nEl primer huevo de pascua del que se tiene conocimiento dentro del mundo de los videojuegos apareci\u00F3 en 1978 en el juego Adventure de Atari. Este huevo de pascua era una sala oculta que conten\u00EDa el nombre del programador del juego, Warren Robinett. Ya que los juegos de aquel entonces solo mostraban el nombre de la compa\u00F1\u00EDa y nunca el nombre del programador del juego, Warren, molesto con ello decidi\u00F3 incluir su nombre dentro del mismo juego de forma oculta, y cuando finalmente un jugador escribi\u00F3 a Atari acerca de la sala con el nombre de Warren, este ya no se encontraba dentro de la compa\u00F1\u00EDa.\r\n\r\nAtari lanza Asteroids\r\n\r\nFue fruto de una idea de Lyle Rains y programado por Ed Logg. Fue uno de los \u00E9xitos m\u00E1s importantes de la historia de los videojuegos en Estados Unidos y convirti\u00F3 a Atari en la mejor compa\u00F1\u00EDa hasta ese momento.\r\n\r\nEl objetivo del juego consist\u00EDa en disparar y destruir los asteroides sin que ning\u00FAn fragmento se llegase a estrellar contra la nave que control\u00E1bamos. Los jugadores contaban con un bot\u00F3n de disparo y con la posibilidad de girar la nave sobre su propio eje.\r\n\r\nCada pantalla nos enfrentaba a cuatro asteroides gigantes. Si las dispar\u00E1bamos se separaban en dos medianas y \u00E9stas a su vez en dos peque\u00F1as. En total pod\u00EDa llegar a haber en pantalla hasta 16 asteroides viajando a distintas velocidades por el espacio.\r\n\r\nNamco lanza Pac-Man\r\n\r\nFue desarrollado por Namco y dise\u00F1ado por Toru Iwantani. Se cuenta que en una salida con sus amigos a comer pizza, al coger el primer trozo y mirar la forma que quedaba, naci\u00F3 Pac-Man.\r\n\r\nEl juego supuso una revoluci\u00F3n total en los videojuegos que probablemente no vuelva a suceder. Tuvo tanto \u00E9xito que hasta se le dedic\u00F3 una portada en la revista Time Magazine, una serie de dibujos animados y una canci\u00F3n.\r\n\r\nEl nombre del juego fue en un principio Puck-Man, derivado de la palabra japonesa \"paku-paku\", que significa comer, pero al pasar al mercado americano se le cambi\u00F3 el nombre por las similitudes de las palabras Puck y Fuck.");
    				
   		//ponerTitulosEsp();
    				
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
	
	public void ponerTitulosEsp(){
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
  		StyleConstants.setBold(sas, true);
 		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		txtpnDec70.getStyledDocument().removeStyle(txtpnDec70.getText());
		txtpnDec70.getStyledDocument().setCharacterAttributes(0, 32, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(665,20, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(1091,12, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(1632,25, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(2302,27, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(4736,27, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(9348,19, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(8599,21, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(7700,25, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(6356,29, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(5654,26, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(3780,56, sas, false);
		
		jscroll.setViewportView(txtpnDec70);
		
	}
	
	public void ponerTitulosEng(){
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
  		StyleConstants.setBold(sas, true);
 		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		txtpnDec70.getStyledDocument().setCharacterAttributes(0, 32, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(665,20, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(1091,12, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(1632,25, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(2302,27, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(4736,27, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(9348,19, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(8599,21, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(7700,25, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(6356,29, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(5654,26, sas, false);
		txtpnDec70.getStyledDocument().setCharacterAttributes(3780,56, sas, false);
		
		jscroll.setViewportView(txtpnDec70);
	}

	public JTextPane getTxtpnDec70() {
		return txtpnDec70;
	}
	
	
}
