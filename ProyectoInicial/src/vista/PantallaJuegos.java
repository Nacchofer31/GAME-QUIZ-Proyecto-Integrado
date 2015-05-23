package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controlador.ManejoApis;

public class PantallaJuegos extends JPanel {
	private JTextField nombreField;
	private ManejoApis control;
	private String multijugador="0";
	private JList list;
	private boolean multi=false;
	
	private JRadioButton rdbtnMultijugador;
	private JLabel lblNombre;
	private JLabel lblGnero;
	private JLabel lblPlataformas;
	private JButton btnBuscar;
	
	private JLabel lblNom;
	private JLabel lblSinopsis;
	private JLabel lblPlataforma;
	private JLabel lblGenero;
	private JLabel lblFechaSalida;
	private JLabel lblEmp;
	private JLabel lblMulti;
	
	public PantallaJuegos(ManejoApis m) {
		setBounds(0, 0, 1355, 591);
		setLayout(null);
		control=m;
		
		Image bordeJuegos = new ImageIcon(this.getClass().getResource("/BordeJuegos.png")).getImage();

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(95, 50, 1185, 80);
		layeredPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(layeredPane);
		layeredPane.setLayout(null);
		
		
		
		rdbtnMultijugador = new JRadioButton("Multijugador");
		rdbtnMultijugador.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				multi=true;
				if(rdbtnMultijugador.isSelected()){
					multijugador="1";
				}else{
					multijugador="0";
				}
			}
		});
		
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
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("BatangChe", Font.PLAIN, 19));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(193, 23, 97, 35);
		layeredPane.add(lblNombre);
		
		lblGnero = new JLabel("G\u00E9nero:");
		lblGnero.setForeground(Color.WHITE);
		lblGnero.setFont(new Font("BatangChe", Font.PLAIN, 19));
		lblGnero.setBounds(460, 20, 90, 35);
		layeredPane.add(lblGnero);
		
		JComboBox comboBoxGen = new JComboBox();
		comboBoxGen.setBounds(545, 30, 150, 20);		
		for(int x = 0;x<control.getApiGenero().getNombreDatos().length+1;x++){
			if(x==0){
				comboBoxGen.addItem("");
			}else{
				comboBoxGen.addItem(control.getApiGenero().getNombreDatos()[x-1]);
			}
		}
		layeredPane.add(comboBoxGen);
		
		
		lblPlataformas = new JLabel("Plataformas:");
		lblPlataformas.setForeground(Color.WHITE);
		lblPlataformas.setFont(new Font("BatangChe", Font.PLAIN, 19));
		lblPlataformas.setBounds(715, 20, 135, 35);
		layeredPane.add(lblPlataformas);
		
		JComboBox comboBoxPlat = new JComboBox();
		comboBoxPlat.setBounds(850, 30, 145, 20);
		for(int x = 0;x<control.getApiConsola().getNombreDatos().length+1;x++){
			if(x==0){
				comboBoxPlat.addItem("");
			}else{
				comboBoxPlat.addItem(control.getApiConsola().getNombreDatos()[x-1]);
			}
		}
		layeredPane.add(comboBoxPlat);
		
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
			  	boolean nombre=false;
			  	boolean genero=false;
			  	boolean consola=false;
			  	if(nombreField.getText().length()>0){
			  		nombre=true;
			  	}
			  	if(comboBoxGen.getSelectedItem().toString().equals("")==false){
			  		genero=true;
			  	}
			  	if(comboBoxPlat.getSelectedItem().toString().equals("")==false){
			  		consola=true;
			  	}
		
			String datosDevueltos[]=control.filtroGeneral(nombre, nombreField.getText(), genero, String.valueOf(comboBoxGen.getSelectedIndex()), consola, String.valueOf(comboBoxPlat.getSelectedIndex()), multi, multijugador);
			if(datosDevueltos.length!=0){
				list.setListData(datosDevueltos);
			}else{
				String d[]=new String[0];
				list.setListData(d);
				
			}
		}
		});
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setOpaque(false);
		btnBuscar.setFont(new Font("Bell MT", Font.BOLD, 20));
		btnBuscar.setBounds(10, 15, 125, 25);
		layeredPane.add(btnBuscar);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Dialog", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				list.setListData(control.getApiJuegos().getNombreDatos());
				multi=false;
				rdbtnMultijugador.setSelected(false);
				comboBoxPlat.setSelectedIndex(0);
				comboBoxGen.setSelectedIndex(0);
				nombreField.setText("");
			}
		});
		btnReset.setBounds(10, 45, 125, 25);
		btnReset.setContentAreaFilled(false);
		btnReset.setBorderPainted(false);
		layeredPane.add(btnReset);

		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		
		JPanel panelJuegos = new JPanel();
		panelJuegos.setBounds(435, 130, 855, 425);
		panelJuegos.setForeground(Color.WHITE);
		panelJuegos.setBorder(null);
		panelJuegos.setOpaque(false);
		add(panelJuegos);
		panelJuegos.setLayout(null);
		
		lblNom = new JLabel("Nombre:");
		lblNom.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblNom.setForeground(Color.WHITE);
		lblNom.setBounds(345, 5, 65, 25);
		panelJuegos.add(lblNom);
		
		lblSinopsis = new JLabel("Sinopsis:");
		lblSinopsis.setForeground(Color.WHITE);
		lblSinopsis.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblSinopsis.setBounds(345, 170, 90, 25);
		panelJuegos.add(lblSinopsis);
		
		lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setForeground(Color.WHITE);
		lblPlataforma.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblPlataforma.setBounds(345, 55, 110, 25);
		panelJuegos.add(lblPlataforma);
		
		lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setForeground(Color.WHITE);
		lblGenero.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblGenero.setBounds(345, 30, 65, 25);
		panelJuegos.add(lblGenero);
		
		lblFechaSalida = new JLabel("Fecha Salida:");
		lblFechaSalida.setForeground(Color.WHITE);
		lblFechaSalida.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblFechaSalida.setBounds(345, 105, 125, 25);
		panelJuegos.add(lblFechaSalida);
		
		lblEmp = new JLabel("Empresa:");
		lblEmp.setForeground(Color.WHITE);
		lblEmp.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblEmp.setBounds(345, 80, 80, 25);
		panelJuegos.add(lblEmp);
		
		JLabel labelCaratula = new JLabel();
		labelCaratula.setBounds(10, 13, 300, 315);
		panelJuegos.add(labelCaratula);
		
		JLabel lblJuegoNom = new JLabel();
		lblJuegoNom.setForeground(Color.WHITE);
		lblJuegoNom.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoNom.setBounds(410, 5, 300, 25);
		panelJuegos.add(lblJuegoNom);
		
		JLabel lblJuegoGen = new JLabel();
		lblJuegoGen.setForeground(Color.WHITE);
		lblJuegoGen.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoGen.setBounds(410, 30, 300, 25);
		panelJuegos.add(lblJuegoGen);
		
		JLabel lblJuegoPlat = new JLabel();
		lblJuegoPlat.setForeground(Color.WHITE);
		lblJuegoPlat.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoPlat.setBounds(445, 55, 280, 25);
		panelJuegos.add(lblJuegoPlat);
		
		JLabel lblJuegoEmp = new JLabel();
		lblJuegoEmp.setForeground(Color.WHITE);
		lblJuegoEmp.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoEmp.setBounds(420, 80, 230, 25);
		panelJuegos.add(lblJuegoEmp);
		
		JLabel lblJuegoFecha = new JLabel();
		lblJuegoFecha.setForeground(Color.WHITE);
		lblJuegoFecha.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoFecha.setBounds(460, 105, 230, 25);
		panelJuegos.add(lblJuegoFecha);
		
		JLabel lblJuegoMulti = new JLabel();
		lblJuegoMulti.setForeground(Color.WHITE);
		lblJuegoMulti.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoMulti.setBounds(465, 130, 65, 25);
		panelJuegos.add(lblJuegoMulti);
		
		lblMulti = new JLabel("Multijugador:");
		lblMulti.setForeground(Color.WHITE);
		lblMulti.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblMulti.setBounds(345, 130, 125, 25);
		panelJuegos.add(lblMulti);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(null);
		scrollPane_1.setEnabled(false);
		scrollPane_1.getViewport().setOpaque(false);
		scrollPane_1.setOpaque(false);
		scrollPane_1.setBounds(345, 225, 475, 200);
		panelJuegos.add(scrollPane_1);
		
		JTextPane textPane = new JTextPane();
		scrollPane_1.setViewportView(textPane);
		textPane.setEnabled(false);
		textPane.setOpaque(false);
		textPane.setEditable(false);
		textPane.setBorder(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 0, -17, 47);
		add(separator);
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(95, 145, 330, 410);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		add(scrollPane);
		
		list = new JList();
		list.setBorder(null);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
			    if(list.getSelectedValue()!=null){
			    	String datos[]=control.buscarJuego(list.getSelectedValue().toString());
				lblJuegoNom.setText(datos[3]);
				lblJuegoGen.setText(datos[4]);
				lblJuegoEmp.setText(datos[2]);
				lblJuegoFecha.setText(datos[6]);
				lblJuegoPlat.setText(datos[1]);
				textPane.setText(datos[5]);
				Image imgCaratula = new ImageIcon(this.getClass().getResource(datos[8])).getImage();
				labelCaratula.setIcon(new ImageIcon(imgCaratula));
				if(datos[7].equals("0")){
					lblJuegoMulti.setText("NO");
				}else{
					lblJuegoMulti.setText("SÍ");
				}
			    }
			}
		});
		list.setToolTipText("");
		list.setOpaque(false);
		scrollPane.setViewportView(list);
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setFont(new Font("BatangChe", Font.PLAIN, 20));
		imgFondo.setIcon(new ImageIcon(iFondo));
		list.setListData(control.getApiJuegos().getNombreDatos());
		this.add(imgFondo);
		JLabel lblBordeJuegos = new JLabel();
		lblBordeJuegos.setBounds(90, 50, 1230, 540);
		lblBordeJuegos.setIcon(new ImageIcon(bordeJuegos));
		this.add(lblBordeJuegos);

	}

	public JRadioButton getRdbtnMultijugador() {
		return rdbtnMultijugador;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public JLabel getLblGnero() {
		return lblGnero;
	}

	public JLabel getLblPlataformas() {
		return lblPlataformas;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JLabel getLblNom() {
		return lblNom;
	}

	public JLabel getLblSinopsis() {
		return lblSinopsis;
	}

	public JLabel getLblPlataforma() {
		return lblPlataforma;
	}

	public JLabel getLblGenero() {
		return lblGenero;
	}

	public JLabel getLblFechaSalida() {
		return lblFechaSalida;
	}

	public JLabel getLblEmp() {
		return lblEmp;
	}

	public JLabel getLblMulti() {
		return lblMulti;
	}
	
	
}
