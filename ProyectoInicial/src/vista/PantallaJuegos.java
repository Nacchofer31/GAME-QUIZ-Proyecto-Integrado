package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class PantallaJuegos extends JPanel {
	private JTextField nombreField;
	public PantallaJuegos() {
		setBounds(0, 0, 1355, 591);
		setLayout(null);
		

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(96, 52, 1196, 80);
		layeredPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(layeredPane);
		layeredPane.setLayout(null);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setOpaque(false);
		btnBuscar.setFont(new Font("Bell MT", Font.BOLD, 20));
		btnBuscar.setBounds(15, 15, 102, 23);
		layeredPane.add(btnBuscar);
		
		JRadioButton rdbtnMultijugador = new JRadioButton("Multijugador");
		rdbtnMultijugador.setFont(new Font("BatangChe", Font.PLAIN, 19));
		rdbtnMultijugador.setForeground(Color.WHITE);
		rdbtnMultijugador.setContentAreaFilled(false);
		rdbtnMultijugador.setOpaque(false);
		rdbtnMultijugador.setBounds(1020, 25, 145, 30);
		layeredPane.add(rdbtnMultijugador);
		
		nombreField = new JTextField();
		nombreField.setBounds(270, 30, 175, 20);
		layeredPane.add(nombreField);
		nombreField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("BatangChe", Font.PLAIN, 19));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(190, 20, 75, 35);
		layeredPane.add(lblNombre);
		
		JLabel lblGnero = new JLabel("G\u00E9nero:");
		lblGnero.setForeground(Color.WHITE);
		lblGnero.setFont(new Font("BatangChe", Font.PLAIN, 19));
		lblGnero.setBounds(460, 20, 90, 35);
		layeredPane.add(lblGnero);
		
		JComboBox comboBoxGen = new JComboBox();
		comboBoxGen.setBounds(545, 30, 150, 20);
		layeredPane.add(comboBoxGen);
		
		JLabel lblPlataformas = new JLabel("Plataformas:");
		lblPlataformas.setForeground(Color.WHITE);
		lblPlataformas.setFont(new Font("BatangChe", Font.PLAIN, 19));
		lblPlataformas.setBounds(715, 20, 135, 35);
		layeredPane.add(lblPlataformas);
		
		JComboBox comboBoxPlat = new JComboBox();
		comboBoxPlat.setBounds(850, 30, 145, 20);
		layeredPane.add(comboBoxPlat);
		

		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		
		JPanel panelJuegos = new JPanel();
		panelJuegos.setBounds(462, 152, 830, 411);
		panelJuegos.setForeground(Color.WHITE);
		panelJuegos.setBorder(null);
		panelJuegos.setOpaque(false);
		add(panelJuegos);
		panelJuegos.setLayout(null);
		
		JLabel lblNom = new JLabel("Nombre:");
		lblNom.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblNom.setForeground(Color.WHITE);
		lblNom.setBounds(345, 10, 65, 25);
		panelJuegos.add(lblNom);
		
		JLabel lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setForeground(Color.WHITE);
		lblSinopsis.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblSinopsis.setBounds(250, 265, 90, 25);
		panelJuegos.add(lblSinopsis);
		
		JLabel lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setForeground(Color.WHITE);
		lblPlataforma.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblPlataforma.setBounds(345, 70, 100, 25);
		panelJuegos.add(lblPlataforma);
		
		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblGenero.setBounds(345, 40, 65, 25);
		panelJuegos.add(lblGenero);
		
		JLabel lblFechaSalida = new JLabel("Fecha Salida:");
		lblFechaSalida.setForeground(Color.WHITE);
		lblFechaSalida.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblFechaSalida.setBounds(345, 130, 125, 25);
		panelJuegos.add(lblFechaSalida);
		
		JLabel lblEmp = new JLabel("Empresa:");
		lblEmp.setForeground(Color.WHITE);
		lblEmp.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblEmp.setBounds(345, 100, 80, 25);
		panelJuegos.add(lblEmp);
		
		JLabel labelCaratula = new JLabel("");
		labelCaratula.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		labelCaratula.setBounds(20, 10, 245, 240);
		panelJuegos.add(labelCaratula);
		
		JLabel lblJuegoNom = new JLabel("");
		lblJuegoNom.setForeground(Color.WHITE);
		lblJuegoNom.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoNom.setBounds(445, 26, 302, 25);
		panelJuegos.add(lblJuegoNom);
		
		JLabel lblJuegoGen = new JLabel("");
		lblJuegoGen.setForeground(Color.WHITE);
		lblJuegoGen.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoGen.setBounds(445, 62, 302, 25);
		panelJuegos.add(lblJuegoGen);
		
		JLabel lblJuegoPlat = new JLabel("");
		lblJuegoPlat.setForeground(Color.WHITE);
		lblJuegoPlat.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoPlat.setBounds(455, 98, 279, 25);
		panelJuegos.add(lblJuegoPlat);
		
		JLabel lblJuegoEmp = new JLabel("");
		lblJuegoEmp.setForeground(Color.WHITE);
		lblJuegoEmp.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoEmp.setBounds(495, 134, 230, 25);
		panelJuegos.add(lblJuegoEmp);
		
		JLabel lblJuegoFecha = new JLabel("");
		lblJuegoFecha.setForeground(Color.WHITE);
		lblJuegoFecha.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoFecha.setBounds(481, 166, 230, 25);
		panelJuegos.add(lblJuegoFecha);
		
		JLabel lblJuegoMulti = new JLabel("");
		lblJuegoMulti.setForeground(Color.WHITE);
		lblJuegoMulti.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoMulti.setBounds(268, 345, 89, 25);
		panelJuegos.add(lblJuegoMulti);
		
		JLabel lblMulti = new JLabel("Multijugador:");
		lblMulti.setForeground(Color.WHITE);
		lblMulti.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblMulti.setBounds(345, 160, 125, 25);
		panelJuegos.add(lblMulti);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane_1.setBorder(null);
		scrollPane_1.setEnabled(false);
		scrollPane_1.getViewport().setOpaque(false);
		scrollPane_1.setOpaque(false);
		scrollPane_1.setBounds(346, 202, 474, 198);
		panelJuegos.add(scrollPane_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.setOpaque(false);
		textPane.setEditable(false);
		textPane.setBorder(null);
		scrollPane_1.setViewportView(textPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 0, -17, 47);
		add(separator);
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBounds(96, 152, 330, 411);
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		add(scrollPane);
		
		JList list = new JList();
		list.setOpaque(false);
		scrollPane.setViewportView(list);
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setFont(new Font("BatangChe", Font.PLAIN, 20));
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);

	}
}
