package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import controlador.ManejoApis;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class PantallaConsolas extends JPanel {
	private JTextField nombreField;
	private ManejoApis control;
	private JComboBox comboBoxEmp;
	private JList list;
	public PantallaConsolas(ManejoApis c) {
		control = c;
		
		setBounds(0, 0, 1355, 591);
		setLayout(null);
		

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(96, 52, 1196, 80);
		layeredPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		add(layeredPane);
		layeredPane.setLayout(null);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean nombre=false;
				boolean empresa=false;
				if(nombreField.getText().length()>0){
					nombre=true;
				}
				if(comboBoxEmp.getSelectedItem().toString().equals("")==false){
					empresa=true;
				}
				
				String datosDevueltos[]=control.filtroGeneralConsola(nombre, nombreField.getText(), empresa, String.valueOf(comboBoxEmp.getSelectedIndex()));
				list.setListData(datosDevueltos);
			}
		});
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setOpaque(false);
		btnBuscar.setFont(new Font("Bell MT", Font.BOLD, 20));
		btnBuscar.setBounds(15, 15, 102, 23);
		layeredPane.add(btnBuscar);
		
		nombreField = new JTextField();
		nombreField.setBounds(270, 30, 175, 20);
		layeredPane.add(nombreField);
		nombreField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("BatangChe", Font.PLAIN, 19));
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(190, 20, 75, 35);
		layeredPane.add(lblNombre);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setForeground(Color.WHITE);
		lblEmpresa.setFont(new Font("BatangChe", Font.PLAIN, 19));
		lblEmpresa.setBounds(460, 20, 90, 35);
		layeredPane.add(lblEmpresa);
		
		comboBoxEmp = new JComboBox();
		comboBoxEmp.setBounds(545, 30, 150, 20);
		for(int x=0;x<control.getApiEmpresa().getNombreDatos().length+1;x++){
			if(x==0){
				comboBoxEmp.addItem("");
			}else{
				comboBoxEmp.addItem(control.getApiEmpresa().getNombreDatos()[x-1]);
			}
		}
		layeredPane.add(comboBoxEmp);
		

		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		
		JPanel panelJuegos = new JPanel();
		panelJuegos.setBounds(435, 145, 860, 420);
		panelJuegos.setForeground(Color.WHITE);
		panelJuegos.setBorder(null);
		panelJuegos.setOpaque(false);
		add(panelJuegos);
		panelJuegos.setLayout(null);
		
		JLabel lblNom = new JLabel("Nombre:");
		lblNom.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblNom.setForeground(Color.WHITE);
		lblNom.setBounds(345, 5, 65, 25);
		panelJuegos.add(lblNom);
		
		JLabel lblSinopsis = new JLabel("Especificaciones:");
		lblSinopsis.setForeground(Color.WHITE);
		lblSinopsis.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblSinopsis.setBounds(345, 170, 163, 25);
		panelJuegos.add(lblSinopsis);
		
		JLabel lblPlataforma = new JLabel("Fecha Salida:");
		lblPlataforma.setForeground(Color.WHITE);
		lblPlataforma.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblPlataforma.setBounds(345, 55, 125, 25);
		panelJuegos.add(lblPlataforma);
		
		JLabel lblEmp = new JLabel("Empresa:");
		lblEmp.setForeground(Color.WHITE);
		lblEmp.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblEmp.setBounds(345, 30, 80, 25);
		panelJuegos.add(lblEmp);
		
		JLabel labelCaratula = new JLabel();
		labelCaratula.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		labelCaratula.setBounds(10, 0, 300, 315);
		panelJuegos.add(labelCaratula);
		
		JLabel lblJuegoNom = new JLabel();
		lblJuegoNom.setForeground(Color.WHITE);
		lblJuegoNom.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoNom.setBounds(410, 5, 405, 25);
		panelJuegos.add(lblJuegoNom);
		
		JLabel lblJuegoPlat = new JLabel();
		lblJuegoPlat.setForeground(Color.WHITE);
		lblJuegoPlat.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoPlat.setBounds(463, 55, 352, 25);
		panelJuegos.add(lblJuegoPlat);
		
		JLabel lblJuegoEmp = new JLabel();
		lblJuegoEmp.setForeground(Color.WHITE);
		lblJuegoEmp.setFont(new Font("BatangChe", Font.PLAIN, 18));
		lblJuegoEmp.setBounds(420, 30, 395, 25);
		panelJuegos.add(lblJuegoEmp);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane_1.setBorder(null);
		scrollPane_1.setEnabled(false);
		scrollPane_1.getViewport().setOpaque(false);
		scrollPane_1.setOpaque(false);
		scrollPane_1.setBounds(345, 210, 470, 200);
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
		scrollPane.setOpaque(false);
		scrollPane.setBounds(106, 143, 330, 410);
		scrollPane.setViewportBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.getViewport().setOpaque(false);
		add(scrollPane);
		
		list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if(list.getSelectedValue()!=null){
					String datos[] = control.buscarConsola(list.getSelectedValue().toString());
					lblJuegoNom.setText(datos[2]);
					lblJuegoEmp.setText(datos[1]);
					textPane.setText(datos[3]);
					lblJuegoPlat.setText(datos[4]);
					Image imgCaratula = new ImageIcon(this.getClass().getResource(datos[5])).getImage();
					labelCaratula.setIcon(new ImageIcon(imgCaratula));				
				}

				
			}
		});
		list.setOpaque(false);
		list.setListData(control.getApiConsola().getNombreDatos());
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setFont(new Font("BatangChe", Font.PLAIN, 20));
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				list.setListData(control.getApiConsola().getNombreDatos());
				comboBoxEmp.setSelectedIndex(0);
				nombreField.setText("");
			}
		});
		btnReset.setBounds(25, 49, 89, 23);
		layeredPane.add(btnReset);
	}
}
