package vista;

import java.awt.Component;
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

public class Decada90 extends JPanel {
	private JTextPane txtpnDec90;
	private JScrollPane jscroll;

	
	public Decada90() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		

		Image letras90 = new ImageIcon(this.getClass().getResource("/Letras90.png")).getImage();
		JLabel lblLetras90 = new JLabel();
		lblLetras90.setBounds(120, 0, 350, 450);
		lblLetras90.setIcon(new ImageIcon(letras90));
		this.add(lblLetras90);
	
		
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
		 jscroll = new JScrollPane();
		jscroll.setEnabled(false);
		jscroll.setBounds(475, 30, 775, 550);
		jscroll.setBorder(null);
		this.add(jscroll);
				
		txtpnDec90 = new JTextPane();
		txtpnDec90.setEnabled(false);
		txtpnDec90.setFont(new Font("BatangChe", Font.PLAIN, 16));
		txtpnDec90.setForeground(Color.WHITE);
		txtpnDec90.setOpaque(false);
		txtpnDec90.setText("La llegada de la Super Famicom\r\n\r\nSale a la venta una de las consolas que m\u00E1s ha triunfado en la historia de Nintendo: La Super Famicom o Super NES.Acaba saliendo el 21 de Noviembre de 1990 en Jap\u00F3n, al a\u00F1o siguiente en Estados Unidos y en 1992 en Europa. Pero, sin duda, lo que la hizo triunfar m\u00E1s fueron sus juegos que llegar\u00EDan durante sus a\u00F1os de vida. Dentro del cat\u00E1logo de Super Famicom nos podemos encontrar con juegos como Super Mario World, Super Mario Kart, The Legend of Zelda: A Link to the Past, Pilotwings, Mario Paint, Super Metroid, Starfox, Donkey Kong Country, Yoshi's Island o Killer Instinct entre otros.\r\n\r\nSega lanza Master System II en los Estados Unidos\r\n\r\nEn 1990, Sega hab\u00EDa alcanzado el \u00E9xito con la Mega Drive/Genesis. Dise\u00F1a entonces la Sega Master System II, una nueva consola mucho m\u00E1s ligera y peque\u00F1a, pero para abaratar costes de producci\u00F3n, carece del bot\u00F3n reset, de toma Audio/Video, del bus de expansi\u00F3n y del slot de tarjeta de la original. En un esfuerzo de luchar contra el Super Mario Bros de Nintendo, el nuevo sistema incluye en ROM el juego Alex Kidd in Miracle World, y posteriormente Sonic The Hedgehog, que se ejecutaban si no se insertaba un cartucho. Sega se volc\u00F3 en promocionar el nuevo sistema, pero el cambio de generaci\u00F3n ya se hab\u00EDa producido y no logr\u00F3 nada. Al cabo de dos a\u00F1os Master System acabar\u00EDa abandonando el mercado japon\u00E9s y Norte Americano, aunque en Europa aguant\u00F3 hasta el 1996 y en Nueva Zelanda hasta el 1997.\r\n\r\nLlega Super Mario World\r\n\r\nNintendo nos present\u00F3 su nuevo juego de Mario. Presentaba una gran mejor\u00EDa en gr\u00E1ficos, sonido y jugabilidad respecto a sus antecesores. Adem\u00E1s apareci\u00F3 un nuevo personaje (Yoshi) y nuevas habilidades para Mario, incluyendo la famosa capa. Tambi\u00E9n hay que decir que fue de los primeros juegos que compensaba al jugador al completarlo al 100% (descubrir todos los secretos). Se lanza en Jap\u00F3n en 1990, en Estados Unidos en el 1991 y al a\u00F1o siguiente en Europa. Fue un completo \u00E9xito en todo el mundo y es considerado uno de los mejores juegos de la historia.\r\n\r\nSe publica The Secret of Monkey Island\r\n\r\nFue creado por Ron Gilbert junto a Steve Purcell, Tim Schafer y Dave Grossman. Monkey Island fue el quinto juego de la compa\u00F1\u00EDa en utilizar el motor SCUMM (motor para aventuras gr\u00E1ficas creado por Aric Willmunder y Gilbert). El juego narraba las aventuras de Guybrush Threepwood, un joven que llegaba a la isla Mele\u00E9 con la intenci\u00F3n de convertirse en un fiero pirata. Al final tendr\u00E1 que viajar a la m\u00EDtica Monkey Island para salvar a su amada de las garras de LeChuk. Este juego supone una revoluci\u00F3n en las aventuras gr\u00E1ficas, ya que introduc\u00EDa novedades como las famosas batallas de insultos, o que era imposible que te mataran.\r\n\r\nSonic llega para hacer frente a Mario\r\n\r\nDurante esa \u00E9poca, Sega no consegu\u00EDa hacer frente a Nintendo con su Mario. En abril de ese mismo a\u00F1o Sega se puso el objetivo de que necesitaba la creaci\u00F3n de un videojuego que sustituyera a Alex Kidd como mascota de la compa\u00F1\u00EDa. Se busc\u00F3 un personaje como por ejemplo un armadillo, un se\u00F1or obeso, un perro o un conejo. Pero finalmente apareci\u00F3 Naoto Oshima con un erizo azul (del mismo color que el logotipo de Sega). La diferencia con Super Mario Bros fue la velocidad y el dinamismo. La aparici\u00F3n de Sonic fue un gran \u00E9xito mundial y el juego llegar\u00EDa a los 4 millones de copias vendidas. En Estados Unidos fue elegido como el personaje m\u00E1s querido por delante de Micky Mouse y Michael Jordan. Se sacaron versiones para consolas de 8 y 16 bits.\r\n\r\nThe Legend of Zelda: A Link to the past\r\n\r\nNos encontramos ante el \u00FAnico juego de la saga que sali\u00F3 para la Super Nintendo. Originalmente se ten\u00EDa pensado lanzarlo en la NES, pero m\u00E1s tarde decidir\u00EDan atrasar su salida hasta que llegara la nueva consola. Llega durante este a\u00F1o a Jap\u00F3n y al a\u00F1o siguiente a Europa y Estados Unidos. Fue el primer juego de Zelda en tener dos mundos paralelos a los que Link pod\u00EDa viajar. Ser\u00EDa el primer juego de Super Nintendo en usar un 1MB de memoria. Se convirti\u00F3 en uno de los juegos m\u00E1s vendidos para la Super Nintendo con m\u00E1s de cuatro millones y medio de unidades repartidas por todo el mundo. Hoy en d\u00EDa es considerado por muchos como uno de los mejores juegos de la saga.\r\n\r\nLlega la segunda parte de Street Fighter\r\n\r\nCon la aparici\u00F3n de esta segunda entrega de Street Fighter empez\u00F3 la revoluci\u00F3n en la saga. Hab\u00EDa bastantes diferencias con su antecesor. Por ejemplo, ahora ten\u00EDamos a 8 personajes entre los cuales elegir, 4 jefes finales y un final diferente para cada personaje. Cada luchador ten\u00EDa distintas caracter\u00EDsticas de fuerza, velocidad, t\u00E9cnicas y movimientos especiales. Por todo el mundo, las m\u00E1quinas recreativas con este juego empezaron a aparecer. En las versiones de Estados Unidos se intercambiaron los nombres de unos cuantos personajes. Tras el \u00E9xito en las recreativas se convirti\u00F3 a casi todos los sistemas dom\u00E9sticos de videojuegos.\r\n\r\nCrisis en el videojuego espa\u00F1ol\r\n\r\nTras la llegada de los 16 bits al mercado europeo durante los primeros a\u00F1os de la d\u00E9cada de los 90, muchas desarrolladoras espa\u00F1olas fueron desapareciendo poco a poco, estancadas en los 8 bits e incapaces de adaptarse a los nuevos sistemas. Solo unas pocas como Dinamic o Bit Managers lograron sobrevivir. De esta forma se pone punto final a la conocida como \"Edad de Oro del Software Espa\u00F1ol\".\r\n\r\nSale a la venta Mortal Kombat\r\n\r\nTras el \u00E9xito de Street Fighter II el mercado se llen\u00F3 de videojuegos de lucha. Entre toda esta gran cantidad de juegos apareci\u00F3 Midway con su Mortal Kombat, un t\u00EDtulo que era una buena alternativa. El juego constaba de siete luchadores y nuestra misi\u00F3n era conseguir ser el campe\u00F3n del torneo Mortal Kombat. Hab\u00EDa una gran variedad de golpes y el juego era tremendamente violento, pudiendo realizar un \"fatality\" (para matar al rival), que resultaba violento y gore. Para el dise\u00F1o de los personajes se utilizaron actores reales. Este juego fue muy criticado por su violencia y en algunos sitios se lleg\u00F3 a prohibir. Pero esto en lugar de afectarlo negativamente, lo que hizo es que aumentaran sus ventas y popularidad. Acab\u00F3 saliendo para Mega Drive, Commodore Amiga, Game Boy, PC, Master System, Game Gear, Super Nintendo y Mega CD.\r\n\r\nSe crea Wolfenstein 3D\r\n\r\nNo se puede decir que fuera el primer juego que probaba con la perspectiva tridimensional, pero s\u00ED que fue el primero que supo aprovecharla para obtener \u00E9xito. En el juego representamos a William J. Blazkowicz, un esp\u00EDa que es capturado por los nazis y encerrado en un castillo. Nuestra misi\u00F3n ser\u00E1 escapar. Por lo que respecta al motor gr\u00E1fico: No hab\u00EDa ni techo ni suelo, ni escaleras y los objetos eran sprites perpendiculares al jugador. Incluso con todo esto fue totalmente revolucionario como concepto de juego y supuso un salto de calidad de los ordenadores sobre las consolas.\r\n\r\nSega lanza la Mega Drive II\r\n\r\nB\u00E1sicamente se trataba de una revisi\u00F3n mayor de la placa base de su antecesora, reduciendo el tama\u00F1o, actualizando componentes y eliminando chips, todo esto para abaratar costes. Tambi\u00E9n cambi\u00F3 el aspecto exterior, y esto forz\u00F3 a que accesorios como el Mega CD o el adaptador de Master System tuvieran que sufrir tambi\u00E9n una revisi\u00F3n para ser adaptados a la nueva consola.\r\n\r\nLlega Doom\r\n\r\nTras el \u00E9xito de Wolfenstein 3D, Id Software empez\u00F3 a desarrollar Doom. Fue un juego que tuvo mucho m\u00E1s \u00E9xito que el anterior mencionado y que sirvi\u00F3 de base para todos los FPS (First Person Shooter) que salieron m\u00E1s adelante a la venta. El juego sali\u00F3 a la venta para PC y durante mucho tiempo fue l\u00EDder de ventas de esa plataforma. T\u00E9cnicamente era muy bruto para la \u00E9poca con muy buenos modelados y con un mapa enorme. El motor gr\u00E1fico del juego fue dise\u00F1ado por John Carmack. El \u00E9xito de este juego fue tan grande que tuvo conversiones para muchas consolas de la \u00E9poca y del futuro como la 3DO, Atari Jaguar, Sega 32X, PlayStation, Super Nintendo, Sega Saturn, Nintendo 64, Game Boy Advance y XBOX 360 (en modo de descarga online).\r\n\r\nEl primer FIFA de todos\r\n\r\nPor entonces EA se dedicaba casi exclusivamente a videojuegos deportivos. Este primer FIFA fue lanzado en navidades de 1993 bajo el nombre de FIFA International Soccer (aunque m\u00E1s adelante se conocer\u00EDa como FIFA 94). Tuvo una gran campa\u00F1a de m\u00E1rqueting, centr\u00E1ndose en la novedosa vista isom\u00E9trica que estrenaba este juego. Pod\u00EDamos controlar distintas selecciones nacionales (los jugadores no ten\u00EDan los nombres reales) y pod\u00EDamos disputar todo tipo de torneos y ligas. Adem\u00E1s tambi\u00E9n ten\u00EDa modos de entrenamiento o partido de exhibici\u00F3n. Ten\u00EDa gr\u00E1ficos normales pero con una gran cantidad de animaciones. Y pose\u00EDa un novedoso sistema de repeticiones y una buena inteligencia artificial. Se lanz\u00F3 en todo tipo de soportes como Mega Drive, Pc, Amiga, 3DO, Game Gear, Super Nintendo, Game Boy y Master System. Las ventas fueron alt\u00EDsimas.\r\n\r\nBlizzard presenta Warcraft\r\n\r\nLa salida de Warcraft al mercado supuso un punto de inflexi\u00F3n en los juegos de estrategia en tiempo real, pasando a ser un superventas. Fue desarrollado por Blizzard y publicado en Enero de 1994 en Estados Unidos y un a\u00F1o m\u00E1s tarde en Europa. Estaba inspirado en Warhammer. El videojuego nos permite ponernos en mandos de orcos o humanos. T\u00E9cnicamente no destacaba por sus gr\u00E1ficos (eran bidimensionales). El sonido tampoco es que destacara mucho. Pero su punto fuerte estaba en la inteligencia artificial que pose\u00EDa. El juego se convirti\u00F3 en un superventas de inmediato.\r\n\r\nLlega el E3\r\n\r\nLa Asociaci\u00F3n del Software Digital Interactivo inaugura la primera Exposici\u00F3n de Entretenimiento Electr\u00F3nico (Electronic Entertainment Expo), m\u00E1s conocida como E3, que desde entonces se celebra cada tercera semana de Mayo en Los Angeles (EEUU). Esta exposici\u00F3n re\u00FAne a muchas de las principales compa\u00F1\u00EDas de los videojuegos de todo el mundo para que muestren sus futuros lanzamientos, ya sean consolas, accesorios para estas o videojuegos.\r\n\r\nNintendo 64 llega al mercado\r\n\r\nNintendo llevaba a\u00F1os haciendo acuerdos con empresas como Silicon Graphics o Rambus Inc. para fabricar hardware y con Rare y Williams para el software. Todos juntos iniciaron el proyecto (que en un principio se llam\u00F3 Project Reality). M\u00E1s adelante se cambiar\u00EDa este nombre por el de Ultra 64. Despu\u00E9s de varios retrasos (con la consecuente cancelaci\u00F3n de juegos que tendr\u00EDan que haber salido antes) en Junio de 1996 llega a tierras niponas y meses m\u00E1s tarde llegar\u00EDa a Estados Unidos. Durante la primera semana vendi\u00F3 500.000 unidades. Dentro de su cat\u00E1logo podemos destacar: Super Mario 64, The Legend of Zelda: Ocarina of Time, GoldenEye 007, Perfect Dark, Mario Kart 64, The Legend of Zelda: Majora's Mask, Banjo-Kazooie, Wave Race 64, Super Smash Bros, Conker's Bad Fur Day, F-Zero X o Lylat Wars. De entre todos los juegos que se cancelaron cabe destacar el Final Fantasy VII, que de haber acabado saliendo en la consola de Nintendo, podr\u00EDa haber cambiado mucho el rumbo de los acontecimientos.\r\n\r\nSe presenta la Game Boy Pocket\r\n\r\nEra una versi\u00F3n m\u00E1s peque\u00F1a que la Game Boy original.mejoraba bastante el visionado de los juegos y la pantalla era m\u00E1s grande que la de su antecesora. Tambi\u00E9n redujo el consumo usando s\u00F3lo un par de pilas AAA. \r\n\r\nMario se pasa a los 3D\r\n\r\nNintendo nos presenta durante este a\u00F1o, junto a la llegada de Nintendo 64 el primer plataformas en 3D: Super Mario 64. A mucha gente no le convenci\u00F3 la diferencia radical entre los gr\u00E1ficos 2D y los 3D. Todo esto supon\u00EDa un cambio de planteamiento en la manera de jugar (no es lo mismo jugar en un mundo 2D que en un vasto mundo 3D) pero el juego contaba con una gran calidad visual para la \u00E9poca y un buen control. Lleg\u00F3 a vender m\u00E1s de 12 millones de copias y se ha llegado a considerar uno de los mejores juegos de la historia de los videojuegos. Recientemente ha salido una versi\u00F3n con extras de este juego para la Nintendo DS.\r\n\r\nEl primer Resident Evil\r\n\r\nLleg\u00F3 de las manos de Capcom a la consola PlayStation en 1996, aunque m\u00E1s tard\u00E9 fue portado a varias plataformas. Es una saga de las m\u00E1s conocidas y que m\u00E1s \u00E9xito ha tenido en el mundo (con m\u00E1s de 30 millones de unidades vendidas), llegando a sacar numerosas secuelas (m\u00E1s de diez t\u00EDtulos para diversas plataformas) e incluso dos pel\u00EDculas de cine y novelas.\r\n\r\nFinal Fantasy VII sale para PlayStation\r\n\r\nSquaresoft pretend\u00EDa hacer un juego de una gran magnitud. Al principio estaba previsto lanzarlo en Nintendo 64, pero esta consola usaba cartuchos para sus juegos, y la obra de Square no iba a caber en ese soporte. Al final optaron por lanzarlo en PlayStation, que usaba CD\u2019s, y acab\u00F3 ocupando tres de ellos. Ser\u00EDa la primera vez que se viera un juego de esta saga en una consola de Sony. Se lanza en Jap\u00F3n a principios de este a\u00F1o y meses m\u00E1s tarde en Europa y Estados Unidos. Los japoneses ya estaban acostumbrados a los RPG's y en Europa y Estados Unidos tambi\u00E9n hab\u00EDan salido unos cuantos que ten\u00EDan bastante calidad. Pero Final Fantasy VII supuso un gran \u00E9xito en comparaci\u00F3n a los anteriores juegos del mismo g\u00E9nero. Di\u00F3 a conocer much\u00EDsimo m\u00E1s a los RPG's y cosech\u00F3 muy buenas ventas, superando los 10 millones de unidades. Tambi\u00E9n fue el primer t\u00EDtulo de la saga con los personajes modelados en 3D y le acompa\u00F1aban muchas secuencias de video. Muchos lo consideran como una pel\u00EDcula hecha videojuego. Han pasado muchos a\u00F1os desde el lanzamiento de este juego y hoy en d\u00EDa es considerado como uno de los mejores de la historia. Square ha seguido lanzando numerosos \"spin-off\" (incluso una pel\u00EDcula de animaci\u00F3n) sobre el mundo de Final Fantasy VII y el juego original se paga a muy alto precio en subastas de internet o tiendas de segunda mano. Mucha gente espera que Square lance un remake del juego para alguna consola de nueva generaci\u00F3n. Pero de momento la empresa ha dicho que no lo habr\u00E1.\r\n\r\nGrand Theft Auto hace su aparici\u00F3n\r\n\r\nDurante este a\u00F1o se presenta el primer GTA de manos de ASC Games. A pesar de que este juego no contaba con grandes gr\u00E1ficos tuvo un excelente \u00E9xito gracias a su total libertad de movimientos y acciones a lo largo de grandes ciudades, conduciendo distintos veh\u00EDculos y estando siempre al margen de la ley.\r\n\r\nLlega Age of Empires\r\n\r\nEste juego basado en la estrategia en tiempo real lleg\u00F3 durante 1997 a las tiendas, desarrollado por Ensemble Studios y publicado por Microsoft. Utilizaba una vista isom\u00E9trica para representar los escenarios (fue de los primeros juegos que us\u00F3 este sistema). Pod\u00EDamos jugar desde la edad de piedad hasta la de Hierro con la posibilidad de elegir numerosas civilizaciones de las respectivas \u00E9pocas.\r\n\r\nSega presenta su \u00FAltima consola: Dreamcast\r\n\r\nSali\u00F3 a la venta el 27 de Noviembre del 1998 en Jap\u00F3n y un a\u00F1o m\u00E1s tarde en Europa y Estados Unidos. Ven\u00EDa marcada por el fracaso de Saturn y la competencia ser\u00EDa muy dura con PlayStation 2 (que aprovech\u00F3 el gran \u00E9xito de su antecesora). Hubo muchos factores e hip\u00F3tesis que podr\u00EDan explicar qu\u00E9 pas\u00F3 para que la Dreamcast fracasara de la manera en que lo hizo. Lo cierto es que muchos a\u00F1os m\u00E1s tarde, se la considera como una de las mejores consolas que han existido.\r\n\r\nNintendo lanza la Game Boy Color\r\n\r\nFue lanzada al mercado el 23 de Octubre de este a\u00F1o en Jap\u00F3n y, poco tiempo despu\u00E9s, en todo el mundo. Ten\u00EDa mejor hardware, gr\u00E1ficos y velocidad que su antecesora. Pose\u00EDa una CPU a 8 o 4 Mhz (seg\u00FAn el cartucho insertado).El \u00E9xito que tuvo esta consola tiene su punto clave en que era compatible con todos los juegos de la Game Boy original (Fue la primera consola port\u00E1til en ser compatible con su antecesora). Nintendo tambi\u00E9n actualiz\u00F3 los juegos de la primera Game Boy, mejor\u00E1ndolos al ser insertados en Game Boy Color, para que tuvieran un mejor aspecto en esta consola. En 4 a\u00F1os fueron lanzados 230 juegos para este sistema.\r\n\r\nLlega el Legend of Zelda: Ocarina of Time\r\n\r\nPocos juegos en la historia han significado o significaran lo que signific\u00F3 este juego en su \u00E9poca. Era el primer t\u00EDtulo en 3D de la saga de Zelda y fue dise\u00F1ado por Shigeru Miyamoto. Para muchos es el mejor juego de la historia, aunque para muchos otros no lo es ni de lejos. Aqu\u00ED podemos aplicar bien el dicho de: \"Sobre gustos no hay nada escrito\", pero sin duda hay que reconocer que nos encontramos delante de un gran juego. Revistas conocidas como Famitsu o Edge le concedieron la primera puntuaci\u00F3n perfecta de la historia.\r\n\r\nMetal Gear Solid aparece en PlayStation\r\n\r\nSe mostr\u00F3 por primera vez en el E3 de 1997 y caus\u00F3 una gran sensaci\u00F3n. Fue desarrollado por Konami. Su creador, Hideo Kojima fue fiel a su versi\u00F3n original de Metal Gear pero aprovech\u00F3 todas las posibilidades t\u00E9cnicas de la consola de Sony para crear el juego de espionaje y acci\u00F3n que siempre hab\u00EDa so\u00F1ado. Sale en Jap\u00F3n en 1998 y hoy en d\u00EDa es una de las sagas m\u00E1s importantes en el mundo de los videojuegos. Muchos de los nuevos juegos basados en el espionaje han seguido los primeros pasos que dio Metal Gear cuando apareci\u00F3.\r\n\r\nSale el primer Gran Turismo\r\n\r\nLleg\u00F3 de manos de Polyphony Digital y fue producido por Kazuroni Yamauchi.Es un juego basado en la simulaci\u00F3n de la conducci\u00F3n. Era de los primeros juegos que nos introduc\u00EDa en el cuerpo de un conductor novel que ten\u00EDa que ir sacando licencias para conseguir coches cada vez mejores y potentes. A todo esto se lo sumaban unos grandes gr\u00E1ficos para la \u00E9poca. Este juego fue el m\u00E1s vendido para la PlayStation de Sony y ha tenido diversas secuelas.");
		
		jscroll.setViewportView(ponerTitulosEsp90());
				
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
		

		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

	}
	
	public Component ponerTitulosEsp90(){
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
		StyleConstants.setBold(sas, true);
		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		
		txtpnDec90.getStyledDocument().setCharacterAttributes(0, 30, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(626, 49, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(1479, 23, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(2063, 38, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(2737, 37, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(3526, 39, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(4239, 40, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(4922, 31, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(5351, 29, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(6219, 22, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(6829, 27, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(7232, 10, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(7981, 23, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(8845, 26, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(9446, 11, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(9900, 28, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(10931, 30, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(11176, 22, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(11833, 23, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(12218, 39, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(13760, 34, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(14102, 20, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(14523, 42, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(15037, 32, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(15704, 41, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(16279, 39, sas, false);
		txtpnDec90.getStyledDocument().setCharacterAttributes(16851, 27, sas, false);

		return txtpnDec90;
	}
	
	public Component ponerTitulosEng90(){
		SimpleAttributeSet sas = new SimpleAttributeSet(); 
		StyleConstants.setBold(sas, true);
		StyleConstants.setItalic(sas, true);
		StyleConstants.setFontSize(sas, 23);
		
		txtpnDec90.getStyledDocument().setCharacterAttributes(0, 30, sas, false);
	
		return txtpnDec90;
	}

	public JTextPane getTxtpnDec90() {
		return txtpnDec90;
	}
	
	public JScrollPane getJscroll() {
		return jscroll;
	}
	
	
}
