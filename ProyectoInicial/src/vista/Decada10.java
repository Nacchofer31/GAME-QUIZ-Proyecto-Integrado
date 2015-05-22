package vista;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Decada10 extends JPanel {
	
	private JTextPane txtpnDecActual;
	
	public Decada10() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
	
		Image letrasActual = new ImageIcon(this.getClass().getResource("/Actual.png")).getImage();
		JLabel lblLetrasActual = new JLabel();
		lblLetrasActual.setBounds(120, 0, 350, 450);
		lblLetrasActual.setIcon(new ImageIcon(letrasActual));
		this.add(lblLetrasActual);
		
		Image miniMarco70 = new ImageIcon(this.getClass().getResource("/MiniMarco70.png")).getImage();
		JLabel lblMiniMarco70 = new JLabel();
		lblMiniMarco70.setBounds(90, 400, 85, 125);
		lblMiniMarco70.setIcon(new ImageIcon(miniMarco70));
		this.add(lblMiniMarco70);
			
		Image miniMarco80 = new ImageIcon(this.getClass().getResource("/MiniMarco80.png")).getImage();
		JLabel lblMiniMarco80 = new JLabel();
		lblMiniMarco80.setBounds(180, 400, 85, 125);
		lblMiniMarco80.setIcon(new ImageIcon(miniMarco80));
		this.add(lblMiniMarco80);
				
		Image miniMarco90 = new ImageIcon(this.getClass().getResource("/MiniMarco90.png")).getImage();
		JLabel lblMiniMarco90 = new JLabel();
		lblMiniMarco90.setBounds(270, 400, 85, 125);
		lblMiniMarco90.setIcon(new ImageIcon(miniMarco90));
		this.add(lblMiniMarco90);
				
		Image miniMarco00 = new ImageIcon(this.getClass().getResource("/MiniMarco00.png")).getImage();
		JLabel lblMiniMarco00 = new JLabel();
		lblMiniMarco00.setBounds(360, 400, 85, 125);
		lblMiniMarco00.setIcon(new ImageIcon(miniMarco00));
		this.add(lblMiniMarco00);
	
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
						
			
		JButton button80 = new JButton();
		button80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PantallaPrincipal.ponerDecada80();
}
});
		button80.setBounds(180, 400, 85, 125);
		button80.setContentAreaFilled(false);
		button80.setBorderPainted(false);
		add(button80);
						
			
		JButton button90 = new JButton();
		button90.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				    PantallaPrincipal.ponerDecada90();
}
});
		button90.setBounds(270, 400, 85, 125);
		button90.setContentAreaFilled(false);
		button90.setBorderPainted(false);
		add(button90);
						
			
		JButton button00 = new JButton();
		button00.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					PantallaPrincipal.ponerDecada00();
}
});
		button00.setBounds(360, 400, 85, 125);
		button00.setContentAreaFilled(false);
		button00.setBorderPainted(false);
		add(button00);
		
		
		//JScrollPane
		JScrollPane jscroll = new JScrollPane();
		jscroll.setEnabled(false);
		jscroll.setBounds(475, 30, 775, 550);
		jscroll.setBorder(null);
		this.add(jscroll);
				
		txtpnDecActual = new JTextPane();
		txtpnDecActual.setEnabled(false);
		txtpnDecActual.setFont(new Font("BatangChe", Font.PLAIN, 16));
		txtpnDecActual.setForeground(Color.WHITE);
		txtpnDecActual.setOpaque(false);
		txtpnDecActual.setText("En la historia de los videojuegos, la octava generaci\u00F3n de videoconsolas es un termino que describe la generaci\u00F3n de consolas de videojuegos que sucede a la s\u00E9ptima generaci\u00F3n (PlayStation 3 de Sony, Xbox 360 de Microsoft y Wii de Nintendo).\r\n\r\nLas port\u00E1tiles inician la nueva era\r\n\r\nLa octava generaci\u00F3n comienza con el lanzamiento de Nintendo 3DS, el 25 de febrero de 2011, seguido despu\u00E9s por el de PlayStation Vita de Sony, que fue lanzada el 17 de diciembre del mismo a\u00F1o. \r\n\r\nPsVita: El gran fracaso de SONY\r\n\r\nPSVita sali\u00F3 a la venta el pasado mes de diciembre de 2011 en Jap\u00F3n, llegando a occidente en el primer cuarto de 2012 debido a la incapacidad de Sony de realizar un lanzamiento simult\u00E1neo en todas las regiones, como ya pas\u00F3 con PS3, dejando abandonados una vez m\u00E1s a sus usuarios europeos y americanos para recibir su consola mucho m\u00E1s tarde que los privilegiados usuarios japoneses. A\u00FAn as\u00ED, PSvita no ha conseguido llegar al mill\u00F3n unidades vendidas en Jap\u00F3n , ni en ning\u00FAn otro territorio. Las ventas estimadas de la port\u00E1til llegan a los 2,5 millones de unidades vendidas. Todo un desprop\u00F3sito si la comparamos con las m\u00E1s de 20 millones de 3DS vendidas , su competidora m\u00E1s directa, que pese a llevar unos meses m\u00E1s en el mercado ha ido acumulando unas ventas constantes convirti\u00E9ndose en la consola m\u00E1s vendida de Jap\u00F3n durante m\u00E1s de un a\u00F1o consecutivo y durante este verano fue la consola (incluyendo las de sobremesa) m\u00E1s vendida a nivel mundial (fuente vgchartz). No solo en hardware PSvita acumula malas ventas , sino que en su limitado software ning\u00FAn solo juego ha logrado acercarse al mill\u00F3n de unidades vendidas.\r\n\r\nTodo es fruto del escaso apoyo que ha recibido la consola por parte de Sony y el escaso inter\u00E9s que produce entre las desarrolladoras third parties. En el pasado E3 en la conferencia de Sony, la consola recibi\u00F3 una atenci\u00F3n discreta anunci\u00E1ndose tan solo un par de spin off capados de juegos multiplataformas. Sony prometi\u00F3 un evento dedicado en exclusiva para PSVita en verano que jam\u00E1s lleg\u00F3... Es tan escaso el apoyo que est\u00E1 recibiendo la port\u00E1til que en el pasado Tokyo Game Show su predecesora PSP recibi\u00F3 un mayor anuncio de juegos. Eso lo dice todo. Estamos ante una cr\u00F3nica de una muerte anunciada.\r\n\r\nLanzamiento y evoluci\u00F3n de la N3DS\r\n\r\nA comienzos del a\u00F1o 2011 se produjo el lanzamiento de Nintendo 3DS, que permite a sus usuarios disfrutar de gr\u00E1ficos 3D estereosc\u00F3picos sin necesidad de gafas especiales. La consola sali\u00F3 a la venta con un cat\u00E1logo variado, donde figuraban juegos desarrollados por Nintendo, como Pilotwings Resort o nintendogs + cats.\r\n\r\nNintendo no cej\u00F3 en su empe\u00F1o de mejorar el cat\u00E1logo de Nintendo 3DS a lo largo del a\u00F1o, brindando a sus usuarios la oportunidad de disfrutar con t\u00EDtulos innovadores y exclusivos para Nintendo 3DS, adem\u00E1s de cl\u00E1sicos para la consola virtual y m\u00E1s de 1000 juegos para DSiWare con el lanzamiento de Nintendo eShop en junio.\r\n\r\nEn ese mismo mes los poseedores de una Nintendo 3DS estaban de enhorabuena: se presentaba la ocasi\u00F3n de pasarlo en grande con una vuelta de tuerca a uno de los cl\u00E1sicos por antonomasia: The Legend of Zelda: Ocarina of Time 3D. Entre las novedades destacaban los gr\u00E1ficos remasterizados y nuevas funciones como el modo desaf\u00EDo y el control por movimientos.\r\n\r\nHoy en d\u00EDa la consola N3DS presenta un extenso c\u00E1talogo de juegos y es una de las consolas m\u00E1s vendidas actualmente.\r\n\r\nLanzamiento de la Nintendo Wii U\r\n\r\nLa consola surgi\u00F3 por primera vez en 2008, despu\u00E9s de que Nintendo reconociera m\u00FAltiples limitaciones con Wii, como que el p\u00FAblico en general pensara que la consola estaba dirigida a un jugador \"casual\". Con Wii U, Nintendo quiso volver a atraer a los grupos de jugadores que se sintieron desplazados con Wii. El dise\u00F1ador de juegos Shigeru Miyamoto admiti\u00F3 que la falta de alta definici\u00F3n y la pobre infraestructura en l\u00EDnea tambi\u00E9n contribuyeron a dejar a Wii en una categor\u00EDa aparte respecto a sus competidoras, la Xbox 360 y la PlayStation 3. Se decidi\u00F3 que la nueva consola deb\u00EDa cambiar estos detalles completamente.\r\n\r\nDentro de la empresa, hubo un gran debate sobre c\u00F3mo deb\u00EDa ser la nueva consola, y el proyecto fue desechado y reiniciado varias veces. El concepto de una pantalla t\u00E1ctil en el mando fue inspirado por la luz azul de la Wii que informa de nuevos mensajes. Miyamoto y su equipo quisieron incorporar la pantalla para dar m\u00E1s informaci\u00F3n a los jugadores (de forma similar a la VMU de la Sega Dreamcast). Cuando el desarrollo se encontraba muy avanzado, \u00E9ste fue ampliado a una pantalla completa que pudiera mostrar el juego en su totalidad, un concepto que se sugiri\u00F3, pero no fue financieramente viable anteriormente.\r\n\r\nUn duro comienzo para XBOX ONE\r\n\r\nLa consola Xbox One se empez\u00F3 a gestar tras la salida al mercado de su antecesora, la Xbox 360. Aunque los medios especializados la bautizaron como Xbox 720, el primer kit de desarrollo oficial creado por Microsoft recibi\u00F3 el nombre en clave de Durango y se puso a disposici\u00F3n de algunos desarrolladores a mediados del a\u00F1o 2012. Sin embargo no fue hasta el 21 de mayo de 2013 que la compa\u00F1\u00EDa hizo oficial su existencia bajo el nombre de Xbox One. Tras esta primera presentaci\u00F3n, tuvo lugar una segunda en el E3 2013 donde se revelaron muchas de las caracter\u00EDsticas de la m\u00E1quina que ya era totalmente jugable.\r\n\r\nJunto a la presentaci\u00F3n del nuevo hardware, Microsoft hizo oficial otras novedades que supon\u00EDan un cambio notable en las pol\u00EDticas que ven\u00EDa aplicando. De esa forma, la Xbox One requer\u00EDa de conexi\u00F3n a internet para poder funcionar, exigiendo una verificaci\u00F3n en l\u00EDnea al menos cada 24 horas ya que de lo contrario la m\u00E1quina dejaba de leer los juegos. Otra novedad, afectaba al mercado de segunda mano y se limitaba tambi\u00E9n la posibilidad de compartir juegos previamente adquiridos por el consumidor.\r\n\r\nAunque inicialmente firme a la hora de implantar todos estos cambios, la compa\u00F1\u00EDa acab\u00F3 dando marcha atr\u00E1s regresando a las pol\u00EDticas que ten\u00EDa vigentes con Xbox 360. Las fuertes cr\u00EDticas recibidas unido al hecho de que sus competidores no aplicaban ninguna de estas restricciones se consideraron como las causas principales del cambio de postura.\r\n\r\nPS4 hace su aparici\u00F3n\r\n\r\nFue anunciada oficialmente el 20 de febrero de 2013 en el evento PlayStation Meeting 2013, aunque el dise\u00F1o de la consola no fue presentado hasta el 10 de junio en el E3 2013.9 Es la sucesora de la PlayStation 3 y actualmente compite con la Xbox One de Microsoft y la Wii U de Nintendo. Su lanzamiento fue el 15 de noviembre de 2013 en Estados Unidos y en Europa y Latinoam\u00E9rica fue el 29 de noviembre de 2013, mientras que en Jap\u00F3n fue el 22 de febrero de 2014.2\r\n\r\nAlej\u00E1ndose de la compleja arquitectura utilizada en el procesador Cell de la videoconsola PlayStation 3, la PlayStation 4 cuenta con un procesador AMD de 8 n\u00FAcleos bajo la arquitectura x86-64. Estas instrucciones x86-64 est\u00E1n dise\u00F1ados para hacer m\u00E1s f\u00E1cil el desarrollo de videojuegos en la consola de nueva generaci\u00F3n, que atrae a un mayor n\u00FAmero de desarrolladores. Estos cambios ponen de manifiesto el esfuerzo de Sony para mejorar las lecciones aprendidas durante el desarrollo, la producci\u00F3n y el lanzamiento de la PS3. Otras caracter\u00EDsticas de hardware notables de la PS4 es que incluyen 8 GB de memoria unificada GDDR5, una unidad de disco Blu-ray Disc m\u00E1s r\u00E1pido, y los chips personalizados dedicados a tareas de procesamiento de audio, v\u00EDdeo y de fondo.\r\n\r\nEntre las nuevas aplicaciones y servicios, Sony lanz\u00F3 la aplicaci\u00F3n PlayStation App, permitiendo a los que tengan un PS4 convertir los tel\u00E9fonos inteligentes y las tabletas en una segunda pantalla para mejorar la jugabilidad o en teclados externos para m\u00E1s comodidad en el momento de escribir. La compa\u00F1\u00EDa tambi\u00E9n planeaba debutar con Gaikai, un servicio de juego basado en la nube que aloja contenidos y juegos descargables. Mediante la incorporaci\u00F3n del bot\u00F3n \"Share\" en el nuevo controlador hace que sea posible compartir en cualquier momento capturas de pantalla, trofeos, compras o videos en p\u00E1ginas como Facebook, Twitter y hacer stream de lo que se juegue y ver el de otros amigos en directo desde Ustream o Twitch, Sony plane\u00F3 colocar m\u00E1s \u00E9nfasis en el juego social.\r\n\r\nLa consola PS4 el primer d\u00EDa de su lanzamiento vendi\u00F3 m\u00E1s de 1 mill\u00F3n de consolas s\u00F3lo en territorio de los Estados Unidos.11 Al inicio de su conferencia de prensa en la Gamescom 2014, Sony anunci\u00F3 que ya hab\u00EDa vendido m\u00E1s de 10 millones de unidades de la PlayStation 4 en el mundo a usuarios finales. Esta dise\u00F1ada para la amplia integraci\u00F3n con Playstation Vita.");
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
  		StyleConstants.setBold(sas, true);
 		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		txtpnDecActual.getStyledDocument().setCharacterAttributes(6169, 21, sas, false);
		txtpnDecActual.getStyledDocument().setCharacterAttributes(3401, 32, sas, false);
		txtpnDecActual.getStyledDocument().setCharacterAttributes(2247, 34, sas, false);
		txtpnDecActual.getStyledDocument().setCharacterAttributes(476, 31, sas, false);
		txtpnDecActual.getStyledDocument().setCharacterAttributes(4675, 30, sas, false);
		txtpnDecActual.getStyledDocument().setCharacterAttributes(243, 35, sas, false);
		jscroll.setViewportView(txtpnDecActual);
				
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
				
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

	}

	public JTextPane getTxtpnDecActual() {
		return txtpnDecActual;
	}
	
	
}
