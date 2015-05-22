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

public class Decada00 extends JPanel {
	private JTextPane txtpnDec00;
	
	public Decada00() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		Image letrasMilenio = new ImageIcon(this.getClass().getResource("/NuevoMilenio.png")).getImage();
		JLabel lblLetrasMilenio = new JLabel();
		lblLetrasMilenio.setBounds(120, 0, 350, 450);
		lblLetrasMilenio.setIcon(new ImageIcon(letrasMilenio));
		this.add(lblLetrasMilenio);
		
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
		jscroll.setEnabled(false);
		jscroll.setBounds(475, 30, 775, 550);
		jscroll.setBorder(null);
		this.add(jscroll);
				
		txtpnDec00 = new JTextPane();
		txtpnDec00.setEnabled(false);
		txtpnDec00.setFont(new Font("BatangChe", Font.PLAIN, 16));
		txtpnDec00.setForeground(Color.WHITE);
		txtpnDec00.setOpaque(false);
		txtpnDec00.setText("Sony lanza su segunda consola\r\n\r\nSu desarrollo hab\u00EDa sido anunciado en marzo de 1999 y finalmente se puso a la venta en el a\u00F1o 2000 en todo el mundo, con muchos problemas para distribuirla, lo que caus\u00F3 que muy poca gente la pudiera obtener al principio.\r\nPose\u00EDa una CPU a 294,9 Mhz (299 Mhz en las \u00FAltimas versiones) y tra\u00EDa un lector de DVD para juegos y pel\u00EDculas (lo que anim\u00F3 a mucha gente a comprarla), y era la primera consola que llevaba puertos USB. Al cabo de unos meses ya se estaba vendiendo bien (hay que tener en cuenta que ven\u00EDa del \u00E9xito que hab\u00EDa supuesto PlayStation 1 y que esta consola era retro compatible con ella (mejorando la velocidad de carga y suavizando las texturas de los juegos para llegar a conseguir un efecto de mejores gr\u00E1ficos). Pero a pesar de todo, los primeros juegos de esta consola no fueron demasiado buenos. Sony no tardar\u00EDa mucho en usar sus licencias y sacar juegos como Gran Turismo, Grand Theft Auto, Metal Gear Solid , Pro Evolution Soccer, Ico, etc., lo que la llevar\u00EDa a vender much\u00EDsimo m\u00E1s. Terminar\u00EDa marcando un antes y un despu\u00E9s en el mundo de los videojuegos. Barri\u00F3 a todos sus rivales Dreamcast, Game Cube y XBOX y se convirti\u00F3 en una de las consolas m\u00E1s vendidas de la historia.\r\n\r\nSony redise\u00F1a la PlayStation 1\r\n\r\nHemos empezado el a\u00F1o contando c\u00F3mo sali\u00F3 la PlayStation 2 al mercado, pero no hay que olvidar que pocos meses antes, Sony nos presentaba el redise\u00F1o de su primera consola. Sali\u00F3 con el nombre de Psone, con un dise\u00F1o m\u00E1s estilizado y peque\u00F1o y con algunos perif\u00E9ricos extras como un peque\u00F1o monitor que se pod\u00EDa conectar detr\u00E1s de la consola. Era compatible con todos los juegos de PlayStation y tra\u00EDa protecci\u00F3n contra todos los mod-chips que hab\u00EDan salido hasta entonces.\r\n\r\nShenmue llega a la Dreamcast\r\n\r\nSale a la venta en el a\u00F1o 2000, convirti\u00E9ndose en el juego m\u00E1s caro desarrollado hasta el momento, con m\u00E1s de 20 millones de d\u00F3lares de presupuesto. En este juego podemos experimentar una nueva manera de jugar, incluyendo conceptos como el Full Reactive Eyes Entertainment (Free), d\u00E1ndonos una gran libertad e interacci\u00F3n. La idea inicial del creador (Yu Suzuki) fue la de hacer 17 cap\u00EDtulos de esta saga. Sin duda estamos delante de un gran juego, de los m\u00E1s recordados de la \u00FAltima consola de Sega.\r\n\r\nLa nueva consola de sobremesa de Nintendo: Game Cube\r\n\r\nEn el a\u00F1o 1999, Nintendo anunciaba el Project Dolphin. Por aquel entonces Nintendo 64 ya alcanzaba su madurez con el Ocarina of Time y se manten\u00EDa con buenas ventas, a pesar de estar lejos de PlayStation. En el a\u00F1o 2000 se presenta la consola en un evento llamado Space World, mientras que PS2 ya estaba en Jap\u00F3n, y no con muy buenas ventas precisamente. La presentaci\u00F3n fue muy espectacular y su dise\u00F1o impresion\u00F3 a todo el mundo. Se detallaron algunos aspectos como los mini-DVD de Matsushita y la facilidad que los desarrolladores tendr\u00EDan para programar en ella. Lo v\u00EDdeos que se presentaron dejaron con muy buen sabor de boca a los asistentes (videos de Zelda, Perfect Dark Zero, Too Human y Metroid). Tambi\u00E9n se anunci\u00F3 la compatibilidad GBA-GC con muchas opciones entre ellas. Lo \u00FAnico negativo fue el anuncio de que la consola se retrasaba hasta el 2001. En el E3 del a\u00F1o siguiente se presentaron juegos como Eternal Darkness y Starfox Adventures. Finalmente sale a la venta el 2001 en Jap\u00F3n y Estados Unidos y en el 2002 en Europa. Pero a la hora de salir la ventaja que llevaba PS2 ya era demasiado grande y qued\u00F3 relegada a un segundo lugar de ventas junto con la XBOX. Aparecieron grandes juegos en esta consola, como los Resident Evil, Zelda: The Wind Waker, Metroid, Zelda: Twilight Princess, etc.\r\n\r\nMicrosoft se une: Lanzamiento de Xbox\r\n\r\nLa primera vez que se anuncia esta consola es en el a\u00F1o 2000. Fue la primera consola de la historia que ven\u00EDa equipada con un disco duro. Se acaba lanzando el 15 de noviembre en Estados Unidos y al a\u00F1o siguiente en Jap\u00F3n y Europa. Pose\u00EDa una CPU a 733 Mhz. Tendr\u00EDa bastante \u00E9xito en Estados Unidos, y en bastantes mercados se situar\u00EDa en el segundo lugar de las m\u00E1s vendidas. Sin embargo nunca pudo superar a la PlayStation 2 y sus n\u00FAmeros espectaculares en ventas.\r\n\r\nNintendo saca la Game Boy Advance\r\n\r\nEra la sucesora de la Game Boy y la Game Boy Color, siendo capaz de ejecutar casi todos los juegos de estas dos. Fue lanzada este a\u00F1o en Jap\u00F3n, Estados Unidos y Europa y contaba con un procesador de 32 bits a 16,7 Mhz. Tambi\u00E9n contaba con otro procesador a 2 Mhz para poder ejecutar software de las anteriores Game Boy. Como todas las port\u00E1tiles de Nintendo acab\u00F3 triunfando, incluyendo un gran cat\u00E1logo de juegos entre los que podemos destacar: Mario Kart: Super Circuit, Castlevania:Circle of Moon, Golden Sun, Castlevania: Harmony of Dissonance, Super Mario Advance, Metroid Fusion, Golden Sun II, The Legend of Zelda: A Link to the Past, Final Fantasy: Tactics Advance, Wario Ware, Castlevania Aria of Sorrow, Metroid Zero Mission, Sword of Mana, The Legend of Zelda: The Minish Cap, Kingdom Hearts Chain of Memories, Final Fantasy IV Advance, Tales of Phantasia,Final Fantasy V y Final Fantasy VI entre otros.\r\n\r\n11 de Septiembre\r\n\r\nM\u00E1s conocido como 11S, el fat\u00EDdico atentado del 11 de Septiembre de 2001 contra las torres gemelas del World Trade Center de Nueva York afect\u00F3 a todo el mundo y los videojuegos no fueron una excepci\u00F3n. Las acciones de muchas compa\u00F1\u00EDas de videojuegos cayeron (al igual que pasaba en los dem\u00E1s entornos econ\u00F3micos del mundo), muchos t\u00EDtulos fueron retrasados varios meses, otros tantos sufrieron la mano de la censura, en muchos casos de forma totalmente voluntaria para evitar reacciones negativas hacia ellos, e incluso algunos juegos fueron retirados temporalmente de las tiendas por tener contenidos o portadas inadecuadas. Por citar varios ejemplos, Metal Gear Solid 2 elimin\u00F3 las escenas del juego que mostraban las torres, muchos juegos de Spiderman fueron retrasados ya que este surca los rascacielos con su telara\u00F1a, y Red Alert 2 fue retirado de las tiendas por su portada.\r\n\r\nLlega Halo a Xbox\r\n\r\nA finales de este a\u00F1o (Noviembre) lleg\u00F3 el FPS m\u00E1s famoso de la consola de Microsoft. Tuvo muy buenas ventas, sobre 5 millones de unidades vendidas.\r\n\r\nKonami saca a la venta el primer Pro Evolution Soccer\r\n\r\nEl 23 de Noviembre de este a\u00F1o sale a la venta Pro Evolution Soccer, primera entrega con este nombre, pero sucesora de los anteriores ISS Pro Evolution para PlayStation. En Jap\u00F3n se llam\u00F3 Winning Eleven 5 y fue la primera entrega para PlayStation 2, adem\u00E1s de salir para PlayStation. Al principio no convenci\u00F3 mucho a los usuarios, sobretodo porque carec\u00EDa de licencias que ocasionaban que los nombres reales de los jugadores, camisetas, banderas de equipos y nombres de estadios estuvieran modificados. A parte de todo esto, en las tiendas tambi\u00E9n estaba FIFA, un duro competidor, bastante m\u00E1s conocido que el Pro Evolution Soccer. Pero sin embargo este juego acab\u00F3 convirti\u00E9ndose en el mejor simulador del a\u00F1o. En los a\u00F1os siguientes se convertir\u00EDa en una buen\u00EDsima alternativa del juego de EA.\r\n\r\n\u00BFEl resurgimiento de Atari?\r\n\r\nInfogrames crea ese a\u00F1o una subdivisi\u00F3n bajo el nombre de Atari y se dedica a lanzar dispositivos PnP para televisores con los grandes cl\u00E1sicos de los videojuegos. Por otro lado, volvi\u00F3 al desarrollo de videojuegos como Dragon Ball Z, Tycoon City:New York, Enter the Matrix, Path of Neo, Driver,etc.\r\n\r\nPEGI: Demasiado violento para t\u00ED\r\n\r\nA\u00F1os antes ya exist\u00EDa distintos sistemas para clasificar los videojuegos seg\u00FAn la edad y su contenido, sin embargo no fue hasta el a\u00F1o 2003 en que se cre\u00F3 el sistema actual que conocemos como sistema PEGI (Pan European Game Information o Informaci\u00F3n paneuropea sobre juegos) y que se usa para la clasificaci\u00F3n de los videojuegos y otro software de entretenimiento, dentro de Europa.\r\n\r\nNintendo presenta la GBA SP\r\n\r\nA principios de este a\u00F1o, se presenta una nueva revisi\u00F3n de GBA, pas\u00E1ndose a llamar Game Boy Advance SP. Esta consola es la primera port\u00E1til de Nintendo que sustituye las pilas por una bater\u00EDa de Ion Litio y presenta un dise\u00F1o en formato plegado. Tambi\u00E9n tiene iluminaci\u00F3n frontal en la pantalla y es aproximadamente la mitad de grande que la Advance. A parte de todo esto, los cambios con su antecesora son m\u00EDnimos.\r\n\r\nNintendo DS: Una consola superventas\r\n\r\nDurante estos \u00FAltimos a\u00F1os Nintendo quer\u00EDa innovar en las consolas, quer\u00EDa ofrecer una nueva manera de jugar, donde todo no se basar\u00EDa en los gr\u00E1ficos, sino en otros aspectos. As\u00ED que le a\u00F1adieron a esta consola dos pantallas (una de ellas t\u00E1ctil), un micr\u00F3fono con reconocimiento de voz, una conexi\u00F3n wifi para poder jugar partidas online, etc. Su nombre significa Dual Screen y sale a la venta (despu\u00E9s de ser presentada en el show previo al E3 2004 de los \u00C1ngeles) en Noviembre de este a\u00F1o en Estados Unidos, un mes m\u00E1s tarde en Jap\u00F3n y al a\u00F1o siguiente en Europa. Cuando sali\u00F3 al mercado, Nintendo dej\u00F3 claro de que se trataba de una nueva l\u00EDnea de port\u00E1tiles y que no la consideraban sucesora de la Game Boy Advance, aunque ser\u00EDa compatible con los juegos de esta port\u00E1til. Junto con la Nintendo DS Lite (redise\u00F1o de \u00E9sta) se convertir\u00E1 en los a\u00F1os siguientes en la consola m\u00E1s vendida de todos los mercados hasta hoy en d\u00EDa.\r\n\r\nLa primera port\u00E1til de SONY: La PSP\r\n\r\nSony, desde una posici\u00F3n magn\u00EDfica en el mercado de las consolas de sobremesa, ve\u00EDa como Nintendo se llenaba de dinero con sus port\u00E1tiles. Al final se acaba decidiendo por probar a robarle un trozo del pastel. Crea una consola con unas caracter\u00EDsticas impresionantes, incorporando un formato llamado UMD (Universal Media Disk), que nos permitir\u00EDa ver pel\u00EDculas en la misma consola. Es parecido a un CD o DVD pero de tama\u00F1o muy reducido, que viene dentro de una carcasa, con una capacidad de 1,8 GB. Con todo esto, Sony pretende convertir la PSP (PlayStation Portable) en un centro multimedia (se podr\u00EDa tambi\u00E9n ver fotos y escuchar m\u00FAsica). La consola contar\u00EDa con una pantalla enorme con una gran calidad de visionado. E incorporar\u00E1 un stick anal\u00F3gico, lo que la convierte en la primera port\u00E1til de la historia en incluirlo. Finalmente sale a la venta en Diciembre de 2004 en Jap\u00F3n y al a\u00F1o siguiente en Estados Unidos y Europa. Posee una CPU de 128 bits a 333 Mhz. Hoy en d\u00EDa hay un gran movimiento de la scene entorno a esta consola, con emuladores de una gran cantidad de sistemas, aparte de muchas otras aplicaciones.\r\n\r\nSony presenta el redise\u00F1o de la PS2\r\n\r\nEn septiembre de este a\u00F1o Sony presenta un redise\u00F1o de su segunda consola de sobremesa. Como ya sucedi\u00F3 con Psone, es bastante m\u00E1s peque\u00F1o, delgado y silencioso que la PlayStation 2 original. El \u00FAnico contra que tiene es que, debido a su delgadez, no hay sitio para poner un disco duro de 3,5 pulgadas y por lo tanto, los juegos que utilizaban dicho disco duro se ven afectados.\r\n\r\nLlega la 360\r\n\r\nA principios de este a\u00F1o ya se o\u00EDan rumores acerca de su fecha de lanzamiento y sus especificaciones, aunque la consola empez\u00F3 a idearse a principios del a\u00F1o 2003. El proyecto tuvo varios nombres: XBox 2, Xbox Next, NextBox, etc. En Abril, se conocer\u00EDa el nombre definitivo: Xbox 360 y pocos d\u00EDas m\u00E1s tarde su dise\u00F1o y el logo. Microsoft anunci\u00F3 el precio (saldr\u00EDan a la venta dos versiones: la Core por 300$ y la Premium por 400$). Finalmente, el 12 de Mayo, la Xbox 360 fue presentada por todo lo alto con una fiesta emitida en la MTV. All\u00ED se desvelaron muchos rumores que rodeaban a esta consola. Finalmente sale a la venta casi simult\u00E1neamente (ser\u00EDa la primera que lo hiciera) en Jap\u00F3n, Estados Unidos y Europa. Posee un procesador Xenon con 3 n\u00FAcleos de procesamiento paralelos los cuales corren a 3,2 GHz cada uno.\r\n\r\nAterriza la PlayStation 3\r\n\r\nDurante este a\u00F1o llega la tercera consola de sobremesa de Sony, en dos versiones, una con un disco duro de 20 GB (499$) y otra con uno de 60 GB (599$), adem\u00E1s de ciertas diferencias entre ellas, pero no importantes. M\u00E1s adelante en Korea se lanzar\u00EDa una versi\u00F3n con 80 GB de disco duro. Fue presentada al p\u00FAblico durante el E3 del 2005. En ese momento se dijo que se incluir\u00EDan dos puertos HDMI y 3 Ethernet, m\u00E1s tarde se reducir\u00EDan a uno de cada, presumiblemente para reducir costes. Tambi\u00E9n presentaron un mando con forma de boomerang, que recibi\u00F3 much\u00EDsimas cr\u00EDticas, siendo m\u00E1s tarde redise\u00F1ado. Se anuncia su salida para primavera del siguiente a\u00F1o. Durante marzo de este a\u00F1o se anuncia un retraso de la consola hasta Noviembre. En el E3 del 2006 es cuando se presentaron algunos juegos y se anunciaba que incluir\u00EDa HDMI en las dos versiones. Finalmente se lanza en Jap\u00F3n el 11 de Noviembre y el 17 en Estados Unidos. Pero ya se hab\u00EDa anunciado un retraso en tierras europeas que la llevar\u00EDa a salir el 23 de Marzo del a\u00F1o siguiente (seg\u00FAn ellos debido a la producci\u00F3n de los diodos laser para el lector Blu-ray. Debido a este retraso, muchos usuarios europeos se quejaron. Finalmente saldr\u00EDa en Europa el 23 de marzo del 2007.\r\n\r\nLlega la revoluci\u00F3n con Wii\r\n\r\nEl proyecto, en un principio se hab\u00EDa llamado \"Revolution\" (desvelado en una conferencia del E3 2005), muy acorde con lo que Nintendo nos presentar\u00EDa m\u00E1s tarde: Una revoluci\u00F3n en la forma de jugar. Aunque en esta feria no se mostr\u00F3 el mando. En el TGS de ese mismo a\u00F1o si que presentar\u00EDa el controlador de nueva consola de Nintendo, levantando gran expectaci\u00F3n entre los asistentes y los foros de Internet. M\u00E1s tarde, antes del E3 del 2006, se anuncia el nombre definitivo del proyecto: Wii (primera consola de Nintendo, que no lleva este nombre como parte de \u00E9l). Luego, en el Teatro Kodak nos mostrar\u00EDan su funcionamiento, anunciaron el mando complementario del Wiimote (el Nunchuk) y nos ense\u00F1aron algunos juegos. Cuando lleg\u00F3 el E3 2006 la gente pudo probar por primera vez la consola con varios juegos. Nintendo, en esta consola, apostar\u00EDa m\u00E1s en la manera de jugar con su mando revolucionario que en la potencia de la misma consola. La principal caracter\u00EDstica es, pues, el control inal\u00E1mbrico que lleva incorporado (llamado Wiimote), capaz de detectar el movimiento y rotaci\u00F3n en un espacio de tres dimensiones (aparte incluye vibraci\u00F3n y un altavoz). Acaba saliendo al mercado en Noviembre de este a\u00F1o en Estados Unidos y al mes siguiente en Jap\u00F3n y Europa.\r\n\r\nDS Lite: El redise\u00F1o de DS\r\n\r\nSe pone en venta durante este a\u00F1o en todo el mundo. Presenta una forma m\u00E1s delgada y ligera que su antecesora, siendo m\u00E1s vistosa de cara al p\u00FAblico. El t\u00E9rmino \"Lite\" de su nombre viene de la palabra en ingl\u00E9s \"light\". Compar\u00E1ndola con el modelo anterior, Nintendo DS Lite tiene unos altavoces menos potentes que la anterior y pesa un 21% menos. El puntero de la consola es un poco m\u00E1s grande y las pantallas han sido mejoras.\r\n\r\nMicrosoft da a conocer la Elite\r\n\r\nDurante este a\u00F1o Microsoft ha presentado el nuevo modelo de su consola. Se trata de la Xbox 360 Elite. Las diferencias con la Xbox 360 Premium es que \u00E9sta incluye un disco duro de 120 GB y un conector HDMI. Est\u00E1 claro que, con esta nueva versi\u00F3n, Microsoft intentar\u00E1 plantarle a\u00FAn m\u00E1s cara a la PlayStation 3 de Sony. Sali\u00F3 en Abril en Estados Unidos a un precio de 479,99 d\u00F3lares y el disco duro tambi\u00E9n se pod\u00EDa adquirir por separado por 179,99 $.\r\n\r\nSony anuncia un redise\u00F1o de la PSP\r\n\r\nDurante el E3 de Julio de este a\u00F1o, Sony anuncia un redise\u00F1o de su consola port\u00E1til. Como novedades nos encontramos con que la consola ser\u00E1 un 33% m\u00E1s ligera que la anterior y con una bater\u00EDa de m\u00E1s capacidad. Adem\u00E1s incorporar\u00E1 nuevas funciones, como poder conectarla a la TV a trav\u00E9s de una salida de v\u00EDdeo y la reducci\u00F3n de tiempo de carga de los juegos.\r\n\r\nSonic y Mario - Antiguos rivales\r\n\r\nMario y Sonic, las mascotas de Nintendo y Sega, respectivamente, aparecer\u00E1n juntos en un mismo videojuego de la mano de Sega para las consolas de Nintendo.\r\n\r\n");
		
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
		StyleConstants.setBold(sas, true);
		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		
		txtpnDec00.getStyledDocument().setCharacterAttributes(0, 29, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(1237, 30, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(1744, 28, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(2276, 52, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(3643, 37, sas, false);
		
		txtpnDec00.getStyledDocument().setCharacterAttributes(4149, 33, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(5100, 16, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(6001, 17, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(6170, 53, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(7023, 27, sas, false);
		
		txtpnDec00.getStyledDocument().setCharacterAttributes(7353, 32, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(7771, 27, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(8218, 36, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(9188, 35, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(10349, 35, sas, false);
		
		txtpnDec00.getStyledDocument().setCharacterAttributes(10766, 12, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(11604, 25, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(12865, 27, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(14161, 26, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(14618, 31, sas, false);
	
		txtpnDec00.getStyledDocument().setCharacterAttributes(15102, 34, sas, false);
		txtpnDec00.getStyledDocument().setCharacterAttributes(15497, 32, sas, false);
		
		jscroll.setViewportView(txtpnDec00);
				
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
		
		
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

	}

	public JTextPane getTxtpnDec00() {
		return txtpnDec00;
	}
	
	
}
