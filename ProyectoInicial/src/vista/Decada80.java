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
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Decada80 extends JPanel {
	private JTextPane txtpnDec80;
	private JScrollPane jscroll;

	
	public Decada80() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		//MENSAJE DE MIERDA
		
		Image letras80 = new ImageIcon(this.getClass().getResource("/Letras80.png")).getImage();
		JLabel lblLetras80 = new JLabel();
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
		jscroll = new JScrollPane();
		jscroll.setBounds(475, 30, 775, 550);
		jscroll.setEnabled(false);
		jscroll.setBorder(null);
		this.add(jscroll);
		
		txtpnDec80 = new JTextPane();
		txtpnDec80.setEditable(false);
		txtpnDec80.setEnabled(false);
		txtpnDec80.setFont(new Font("BatangChe", Font.PLAIN, 17));
		txtpnDec80.setForeground(Color.WHITE);
		txtpnDec80.setOpaque(false);
		txtpnDec80.setText("Atari licencia el Space Invaders\r\n\r\nEra la primera vez que licenciaba una m\u00E1quina recreativa. Hicieron una gran conversi\u00F3n que permit\u00EDa jugar a 2 players e inclu\u00EDa 112 modos de juego.R\u00E1pidamente se convirti\u00F3 en un vende consolas, haciendo ganar a Atari unos 100 millones de d\u00F3lares y barriendo del mercado a sus competidores.\r\n\r\nNace Donkey Kong\r\n\r\nEn el juego pod\u00EDamos encontrar un fontanero que se llamaba Jumpman (m\u00E1s adelante lo conoceremos como Mario). Ser\u00E1 la primera vez donde podamos ver a este carism\u00E1tico personaje. El objetivo del juego es rescatar a su novia de las garras de un gorila llamado Donkey Kong, manejando a Jumpman.Nintendo tuvo algunos problemas con Universal Studios, ya que afirmaba que Donkey Kong ten\u00EDa un gran parecido con su King Kong, por lo que demandaron a la compa\u00F1\u00EDa. Finalmente Nintendo acab\u00F3 ganando el juicio.El juego fue un \u00E9xito total, aunque las \u00E9pocas buenas para Nintendo a\u00FAn estaban por llegar, como veremos m\u00E1s adelante en este mismo art\u00EDculo.\r\n\r\nE.T.: El peor videojuego de la historia\r\n\r\nLa pel\u00EDcula se acababa de estrenar en los Estados Unidos con un exitazo en taquilla y Atari no quiso dejar pasar esta gran oportunidad de sacar beneficios, sacando un juego para la VCS 2600.Tardaron tres meses en desarrollarlo, justo antes de las Navidades de ese mismo a\u00F1o. Estaban tan seguros del \u00E9xito del juego que crearon much\u00EDsimas m\u00E1s unidades del juego que consolas VCS 2600 hab\u00EDa en el mercado en ese momento, ya que se supon\u00EDan que la gente correr\u00EDa a comprarla para jugar al juego.El juego sali\u00F3 a la venta y result\u00F3 ser p\u00E9simo en todos los sentidos. Con gr\u00E1ficos tremendamente simples, una jugabilidad imposible de entender y con un fallo que provocaba que en determinada parte del juego, E.T. ca\u00EDa en un hoyo de tierra y no pod\u00EDa salir.El resultado fueron m\u00E1s de 5 millones de cartuchos en los almacenes de Atari que nadie quer\u00EDa comprar. Los costes de almacenaje de tal cantidad de juegos eran enormes, as\u00ED que decidieron deshacerse de ellos enterr\u00E1ndolos secretamente en un desierto de Nuevo M\u00E9xico.\r\n\r\nA\u00F1o de Crisis\r\n\r\nAtari, pese a liderar el mercado, se ve sumida en una crisis institucional. El mercado de los videojuegos, por el contrario, viv\u00EDa su mejor momento. Las ventas de videojuegos se triplican respecto al a\u00F1o anterior y ya suponen un negocio de 3 billones de d\u00F3lares y el 25 % de hogares estadounidenses ya poseen un sistema de juegos. Pero en las mismas navidades de este a\u00F1o se desencadenar\u00EDa la \"Crisis del 1983\", con serios problemas para las ventas de videojuegos.  Este a\u00F1o fue el a\u00F1o del cine en los videojuegos: Por primera vez se inclu\u00EDa el argumento de una pel\u00EDcula en un videojuego (Tron). A partir de aqu\u00ED empezaron a salir m\u00E1s juegos basados en pel\u00EDculas como Star Wars de Atari o la segunda parte de Tron. Otro juego conocido que aparece este a\u00F1o es el Dragon's Lair, que utilizaba por primera vez la tecnolog\u00EDa Laser Disc. Por otro lado, Nintendo lanza el Donkey Kong 3, que cambia el estilo de sus antecesores, y por esta causa no lleg\u00F3 a triunfar. En octubre de este a\u00F1o hace su aparici\u00F3n en Espa\u00F1a la revista ZX, la primera revista espa\u00F1ola dedicada en exclusiva a un ordenador en concreto, en este caso los Sinclair. Esta revista fue una de las primeras en publicar informaci\u00F3n sobre videojuegos en nuestro pa\u00EDs.\r\n\r\nNintendo lanza Famicom en Jap\u00F3n\r\n\r\nFinalmente Nintendo acaba lanzando la Famicom al mercado. En el resto del mundo se llam\u00F3 NES (Nintendo Entertaiment System). Sali\u00F3 a la venta por 100$ y al principio su lanzamiento no fue todo lo bien que se esperaba. La consola ten\u00EDa infinidad de errores que hac\u00EDan que se colgara y su cat\u00E1logo de juegos se limitaba a conversiones de los grandes \u00E9xitos de Nintendo como Donkey Kong o Popeye. Tras unas reformas en la placa base se lanzaron nuevas unidades que fueron un tremendo \u00E9xito y la convirtieron en la consola m\u00E1s vendida un a\u00F1o m\u00E1s tarde en Jap\u00F3n.\r\n\r\nNace Mario Bros\r\n\r\nEste personaje ya lo hab\u00EDamos visto en el Donkey Kong, pero ahora ten\u00EDa su juego propio para recreativas. Esta vez ya no se llamaba Jumpman, sino Mario. Se dice que le llamaron as\u00ED por el gran parecido con el casero de Miyamoto en el edificio donde se hospedaba en Nueva York cuando ten\u00EDa que ir all\u00ED. Tambi\u00E9n aparece por primera vez su hermano Luigi. El objetivo del juego era limpiar las tuber\u00EDas de las diferentes plagas que hab\u00EDa golpeando el juego de debajo de ellas.\r\n\r\nNace el videojuego espa\u00F1ol\r\n\r\nLa primera fue Indescomp, que comenzar\u00EDa su andanza distribuyendo los primeros ZX Spectrum y Amstrad CPC en nuestro pa\u00EDs. Pero que tambi\u00E9n ser\u00EDa la primera en distribuir videojuegos de creaci\u00F3n espa\u00F1ola, como fueron La pulga que curiosamente obtendr\u00EDan m\u00E1s \u00E9xito en Inglaterra.\r\n\r\nLa crisis de 1983\r\n\r\nAtari, como de costumbre, no hab\u00EDa patentado el dise\u00F1o de sus juegos, y por lo tanto cualquier compa\u00F1\u00EDa pod\u00EDa dise\u00F1ar libremente juegos para su consola. Cientos de compa\u00F1\u00EDas se lanzaron a la producci\u00F3n de videojuegos sin medios, ni experiencia ni conocimientos. Para las navidades de este a\u00F1o hay una gran cantidad de t\u00EDtulos cl\u00F3nicos y desconocidos. Hoy en d\u00EDa con la explosi\u00F3n de Internet los compradores podr\u00EDan haberse informado antes de comprar el producto, pero para entonces ese no era el caso. Era muy dif\u00EDcil distinguir entre un juego realmente bueno o divertido con otro que fuera malo y aburrido. A parte de todo esto, Atari en esos momentos ya ten\u00EDa much\u00EDsima competencia en el mercado. Hab\u00EDa much\u00EDsimas consolas: Atari 2600, Atari 5200, Bally Astrocade, Colecovision, Coleco Gemini, Emerson Arcadia 2001, Fairchild Channel F System II, Magnavox Odyssey 2 y Mattel Intellivision. Esta sobresaturaci\u00F3n afecta directamente a los comercios ya que se encuentran con una gran cantidad de juegos que no pueden vender y con unas compa\u00F1\u00EDas que no tienen suficientes recursos como para devolverles el dinero ni para ofrecerles nuevos productos. Entonces los comercios comienzan a rebajar los precios de venta para deshacerse del stock sobrante. Como consecuencia de todo esto, en tan solo un a\u00F1o los videojuegos pasan de ser la industria con mayor crecimiento a tener la crisis m\u00E1s absoluta. Mattel tuvo 195 millones de p\u00E9rdidas, Coleco 258 millones. Esta \u00FAltima junto a Magnavox abandonan el negocio. Por otro lado Atari se encuentra cerca de la banca rota con unas p\u00E9rdidas de 356 millones.\r\n\r\nSe crea Squaresoft\r\n\r\nA pesar de la grave crisis que afronta el mundo de los videojuegos, durante este a\u00F1o se funda la que ser\u00EDa una de las compa\u00F1\u00EDas m\u00E1s importantes en la historia de los videojuegos: Squaresoft. Tal y como se explica m\u00E1s adelante en este mismo art\u00EDculo, la compa\u00F1\u00EDa entr\u00F3 en una situaci\u00F3n de bancarrota al cabo de 4 a\u00F1os y estuvo a punto de desaparecer si no fuera porque Hironobu Sakaguchi cre\u00F3 el primer Final Fantasy, con un gran \u00E9xito, relanzando a la empresa a lo m\u00E1s alto. M\u00E1s adelante, en 2003, Squaresoft se fusionar\u00EDa con Enix, pasando a llamarse Square Enix.\r\n\r\nLa edad de oro del videojuego Espa\u00F1ol\r\n\r\nMientras en el resto del mundo los videojuegos sufr\u00EDan una crisis, el a\u00F1o 1984 fue un hito dentro de la historia del videojuego en Espa\u00F1a, ya que fue el a\u00F1o en que aparecieron las primeras empresas espa\u00F1olas dedicadas al software de entretenimiento, convirtiendo este a\u00F1o en el primero de lo que se ha llegado a conocer como la \"Edad de Oro del Videojuego Espa\u00F1ol\". Indescomp publica su segundo juego, \"Fred\". Este a\u00F1o aparece Dinamic Software (Dinamic Multimedia a partir de 1993) con juegos como Yenght y Artist, y tambi\u00E9n Erbe, que se dedicar\u00E1 principalmente a la distribuci\u00F3n de videojuegos durante esta d\u00E9cada. En noviembre de 1984 tambi\u00E9n nace MicroHobby, una de las primeras revistas espa\u00F1olas dedicada a los videojuegos, aunque solamente a la plataforma Spectrum.\r\n\r\nLa industria del videojuego se recupera\r\n\r\nEn este a\u00F1o comenzaron a recuperarse los videojuegos. Nintendo lanz\u00F3 la Famicom en Am\u00E9rica tras el gran \u00E9xito en Jap\u00F3n. En Am\u00E9rica se le cambi\u00F3 el nombre llam\u00E1ndose NES, y permanecer\u00EDa as\u00ED en el resto del globo. Los juegos m\u00E1s importantes de este a\u00F1o fueron: Pitfall 2 de Sega, Indiana Jones and the Temple of Doom y Empire Strikes Back de Atari, Commando y Ghosts'N Goblins de Capcom y Dig Dug 2 de Namco. Merece especial atenci\u00F3n el Tehkan World Cup (uno de los primeros juegos de futbol). De mientras Ocean se hace con las licencias de las pel\u00EDculas de Rambo, Cobra, Cortocircuito y Miami Vice. En mayo de este a\u00F1o se comienza la publicaci\u00F3n de la revista de videojuegos m\u00E1s antigua dentro del territorio espa\u00F1ol, MicroMania.\r\n\r\nNintendo lanza el Super Mario Bros\r\n\r\nFue creado para la Famicom y dise\u00F1ado por Shigeru Miyamoto. Como habr\u00E9is podido leer, ya hab\u00EDa aparecido en los juegos de Donkey Kong y Mario Bros., pero este juego fue el que lo llev\u00F3 al estrellato hasta convertirlo en la mascota principal de la compa\u00F1\u00EDa. Yamauchi le hab\u00EDa pedido a Miyamoto que hiciera un juego revolucionario utilizando a Mario. Shigeru empez\u00F3 creando el sprite de Mario y las primeras pantallas, pero m\u00E1s adelante se le ocurri\u00F3 la idea de reducir el tama\u00F1o de Mario (para que se pareciera m\u00E1s al que sal\u00EDa en Donkey Kong. Luego pens\u00F3 en que pod\u00EDa hacer que, en el juego, si se com\u00EDa una seta, crecer de tama\u00F1o y si se com\u00EDa una flor lanzar bolas de fuego. En este juego vemos por primera vez a la Princesa Peach, a Toad y a Bowser. Cre\u00F3 un antes y un despu\u00E9s en el mundo de los videojuegos y vendi\u00F3 millones de copias dando un gran \u00E9xito a la Famicom. Es considerado el juego m\u00E1s vendido de todos los tiempos, pero lo cierto es que este dato tiene un poco de \"trampa\", ya que el juego ven\u00EDa incluido al comprar la consola.\r\n\r\nSe crea Tetris\r\n\r\nEste juego, que ser\u00E1 de los m\u00E1s importantes de la historia fue inventado por Alexey Pazhintov (con la ayuda de Dmitry Pavlovsky y Vadim Gerasimov) durante 1985, inspirado en un juego de pentamin\u00F3s, cuando estaba trabajando en la Academia de Ciencias de Mosc\u00FA.\r\n\r\nNace el Legend of Zelda\r\n\r\nFue creado por Shigeru Miyamoto y lanzado el 21 de Febrero de este a\u00F1o para la Famicom en el formato \"Famicom Disk System\". M\u00E1s tarde se distribuir\u00EDa fuera de Jap\u00F3n en formato de cartucho. La historia se ambienta en la tierra de Hyrule donde un joven llamado Link tiene que rescatar a la princesa Zelda de las garras de Ganon (rey del mal). El videojuego ten\u00EDa varias innovaciones t\u00E9cnicas. La m\u00E1s destacada era la posibilidad de guardar los progresos aunque apagaras la m\u00E1quina. Tuvo much\u00EDsima aceptaci\u00F3n y lleg\u00F3 a vender 6 millones y medio de copias. Se convirti\u00F3 en una de las grandes franquicias de Nintendo.\r\n\r\nAparece Metroid en NES\r\n\r\nFue producido por Gunpei Yokoi y el director del proyecto fue Yoshio Sakamoto. Una de las novedades que tra\u00EDa el juego era la inclusi\u00F3n de una protagonista femenina (Samus Aran). Fue uno de los primeros videojuegos de acci\u00F3n en no tener un desarrollo lineal. Metroid acabar\u00EDa convirti\u00E9ndose en uno de los videojuegos insignia de Nintendo.\r\n\r\nSe lanza Castlevania\r\n\r\nFue desarrollado por Konami y sali\u00F3 por primera vez en Jap\u00F3n bajo el nombre de Demon Castle Dracula para Famicom Disk System. M\u00E1s tarde durante 1986 saldr\u00EDa en MSX 2 (en este caso se llamar\u00EDa Vampire Killer) y se pondr\u00EDa a la venta fuera de Jap\u00F3n. Sin embargo en Estados Unidos no se conocer\u00EDa hasta el a\u00F1o siguiente, cuando fue reprogramado para correr en la NES, ya bajo el nombre de Castlevania. Sin duda fue una gran saga que perdura hasta hoy en d\u00EDa.\r\n\r\nAparece el primer Final Fantasy\r\n\r\nAntes de que apareciera el primer juego de la saga, Squaresoft estaba pasando por momentos muy dif\u00EDciles en su econom\u00EDa. Hironobu Sakaguchi empez\u00F3 el proyecto de un RPG muy ambicioso al cual le llamar\u00EDa Final Fantasy. Se dice que le llam\u00F3 as\u00ED porque iba a ser su \u00FAltimo juego (Fantasia Final), pero tambi\u00E9n hay opiniones de que el nombre era debido a que ser\u00EDa el \u00FAltimo juego de Squaresoft. El juego sali\u00F3 a finales de 1987 y supuso tal \u00E9xito que Sakaguchi tuvo que abandonar la idea de dejar este mundillo. Desde ese momento se puso a desarrollar nuevos Final Fantasy. Mucha gente piensa que cada juego tiene una historia diferente porque el primero estaba pensado para no tener m\u00E1s secuelas. Esta saga alcanz\u00F3 su apogeo con la salida de Final Fantasy VII, que dio a conocer los RPG a mucha gente que no sab\u00EDa ni de que se trataba el g\u00E9nero.\r\n\r\nEl nacimiento de MegaMan\r\n\r\nLa idea b\u00E1sica de su creador (Keiji Inafune) era la de hacer un juego sencillo con los elementos del juego Piedra-Papel-Tijeras. Por otro lado quer\u00EDa que los jefes de nivel fueran vulnerables a ciertos tipos de armas especiales. En un principio fue creado para salones recreativos, pero finalmente acab\u00F3 saliendo para la Famicom. El juego se ambienta en el a\u00F1o 20XX. El ni\u00F1o robot es creado por el Dr.Light. En el juego podemos ver como el Dr. Wily roba 6 de los robots creados por el doctor Light (los Robot Masters), que ser\u00EDan los jefes finales de cada fase. Arras\u00F3 nada m\u00E1s salir en Estados Unidos (se agot\u00F3 el tercer d\u00EDa de salir a la venta) y ha quedado para la posteridad como uno de los plataformas m\u00E1s famosos de la \u00E9poca.\r\n\r\nSe publica el primer Metal Gear\r\n\r\nDise\u00F1ado por Hideo Kojima, apareci\u00F3 en principio para MSX, pero poco despu\u00E9s Konami public\u00F3 una versi\u00F3n para la NES, con algunos cambios (los fondos de pantalla hab\u00EDan cambiado, tambi\u00E9n cambi\u00F3 un poco el argumento). En el juego encargamos a Solid Snake con la misi\u00F3n de infiltrarse en la fortaleza Outer Heaven para recuperar a Grey Fox (que se hab\u00EDa infiltrado anteriormente en la fortaleza, pero hab\u00EDan perdido la comunicaci\u00F3n con \u00E9l). Snake acaba descubriendo, dentro de la fortaleza, una nueva arma llamada Metal Gear. Este juego present\u00F3 la idea del suspense al p\u00FAblico, que estaba acostumbrado a arrasar con todo lo que viera en la pantalla. Este Metal Gear se jug\u00F3 de una forma muy similar a las versiones m\u00E1s recientes. Snake empieza la operaci\u00F3n sin ning\u00FAn equipamiento e incluye el c\u00F3dec (ingrediente b\u00E1sico de la serie). La acci\u00F3n se muestra desde una perspectiva a\u00E9rea.\r\n\r\nSega lanza la Mega Drive en Jap\u00F3n\r\n\r\nSega estaba viendo como su Master System no triunfaba demasiado en America y Estados Unidos, la NES dominaba el mercado y ten\u00EDan que hacer algo para solucionarlo. Entonces es cuando se decidieron a sacar una consola de 16 bits que ser\u00EDa tan potente como los mejores ordenadores del momento (el Atari ST y el Commodore Amiga). El primer nombre que iban a utilizar para esta consola fue MK-1601. M\u00E1s tarde ser\u00EDa llamada Sega Mega Drive. Entre su cat\u00E1logo destacan juegos como Sonic, Golden Axe, Soleil, Light Crusader, Shining Force, Streets of Rage, Story of Thor, Outrun, Street Fighter 2, FlashBack, Altered Beast, etc.\r\n\r\nLlega el Super Mario Bros 3\r\n\r\nLlega el que fue el \u00FAltimo juego de Mario para la Famicom de Nintendo.  Fue un completo \u00E9xito en ventas (el juego m\u00E1s vendido por separado, ya que si contamos con que el primer Super Mario Bros. ven\u00EDa con la consola, ser\u00EDa el ganador en ventas) y ha quedado grabado en la memoria de todos los aficionados a Mario como uno de sus mejores juegos.\r\n\r\nLa Abad\u00EDa del Crimen\r\n\r\nConsiderado por muchos como el mejor videojuego de creaci\u00F3n espa\u00F1ola durante a\u00F1os, La Abad\u00EDa del Crimen era un videojuego basado, extraoficialmente, en la famosa novela de Umberto Eco, El nombre de la rosa. Creado por Paco Men\u00E9ndez (programaci\u00F3n) y Juan Delc\u00E1n (gr\u00E1ficos), el juego fue distribuido inicialmente para Amstrad CPC y m\u00E1s tarde aparecer\u00EDa tambi\u00E9n en ZX Spectrum (128 k), MSX y PC, bajo la marca de Opera Soft.Con una alta dificultad, el juego nos trasladaba a un monasterio en donde deb\u00EDamos resolver un crimen manejando al monje franciscano, Guillermo de Occam, que durante 7 d\u00EDas deber\u00E1 investigar a la vez que cumple con las tareas t\u00EDpicas de la abad\u00EDa.\r\n\r\nNintendo lanza la Game Boy\r\n\r\nLa Game Boy fue presentada el 21 de abril de 1989 en Jap\u00F3n y en agosto del mismo a\u00F1o en los Estados Unidos y Europa, siendo un gran \u00E9xito comercial. Tuvo como nombre de prototipo Dot Matrix Game (DMG). Fue dise\u00F1ada y fabricada por una divisi\u00F3n de Intelligent System dirigida por Gunpei Yokoi. Su objetivo era conseguir una videoconsola que fuera peque\u00F1a, ligera, barata y con muchos videojuegos. Se trataba de la evoluci\u00F3n de las Game & Watch, pero a diferencia de \u00E9stas, la Game Boy permit\u00EDa insertar cartuchos con juegos intercambiables. El m\u00E1s famoso fue el Tetris. Sin duda, este a\u00F1o fue el nacimiento de la consola port\u00E1til m\u00E1s exitosa de todos los tiempos hasta d\u00EDa de hoy, apareciendo numerosos redise\u00F1os de la consola original. En numerosos sitios suman las ventas de esta consola junto las de la Game Boy Color, con el resultado de m\u00E1s de 100 millones de unidades vendidas. Aqu\u00ED las hemos separado para que quede todo de manera m\u00E1s clara.\r\n\r\n");
		
		jscroll.setViewportView(ponerTitulosEsp80());
		
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);

		

		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

	}
	
	public Component ponerTitulosEsp80(){
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
		StyleConstants.setBold(sas, true);
		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		txtpnDec80.getStyledDocument().setCharacterAttributes(0, 32, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(324,17, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(985,40, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(2042,13, sas, false);
	
		txtpnDec80.getStyledDocument().setCharacterAttributes(3284,32, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(3877,15, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(4368,28, sas, false);
		
		txtpnDec80.getStyledDocument().setCharacterAttributes(4675, 17, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(6291,20, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(6877,38, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(7689,39, sas, false);
		
		txtpnDec80.getStyledDocument().setCharacterAttributes(8460, 35, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(9541,14, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(9818,24, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(10457,23, sas, false);
		
		txtpnDec80.getStyledDocument().setCharacterAttributes(10821,21, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(11300,31, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(12178,25, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(12937,31, sas, false);
		
		txtpnDec80.getStyledDocument().setCharacterAttributes(13853,33, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(14510,28, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(14885,21, sas, false);
		txtpnDec80.getStyledDocument().setCharacterAttributes(15577,27, sas, false);

		return txtpnDec80;
	}
	
	public Component ponerTitulosEng80(){
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
		StyleConstants.setBold(sas, true);
		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		txtpnDec80.getStyledDocument().setCharacterAttributes(0, 32, sas, false);

		return txtpnDec80;
	}

	public JTextPane getTxtpnDec80() {
		return txtpnDec80;
	}
	
	public JScrollPane getJscroll() {
		return jscroll;
	}
	
	
}
