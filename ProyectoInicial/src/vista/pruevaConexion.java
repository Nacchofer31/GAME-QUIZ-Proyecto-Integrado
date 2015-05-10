package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.ManejoApis;

public class pruevaConexion extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField consola;
	private JTextField genero;
	private JTextField empresa;
	private JTextField fecha;
	private JTextField sinopsis;
	private JTextField juegoBuscado;
	private ManejoApis t;

	/**
	 * Create the frame.
	 */
	public pruevaConexion(ManejoApis c) {
		t = c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("nombre:");
		lblNombre.setBounds(24, 41, 46, 14);
		contentPane.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setBounds(72, 38, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblConsola = new JLabel("consola:");
		lblConsola.setBounds(24, 79, 46, 14);
		contentPane.add(lblConsola);
		
		consola = new JTextField();
		consola.setBounds(72, 76, 86, 20);
		contentPane.add(consola);
		consola.setColumns(10);
		
		JLabel lblGenero = new JLabel("genero");
		lblGenero.setBounds(24, 118, 46, 14);
		contentPane.add(lblGenero);
		
		genero = new JTextField();
		genero.setBounds(80, 118, 86, 20);
		contentPane.add(genero);
		genero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("empresa");
		lblNewLabel.setBounds(24, 155, 46, 14);
		contentPane.add(lblNewLabel);
		
		empresa = new JTextField();
		empresa.setBounds(90, 152, 86, 20);
		contentPane.add(empresa);
		empresa.setColumns(10);
		
		JLabel lblFecha = new JLabel("fecha");
		lblFecha.setBounds(24, 201, 46, 14);
		contentPane.add(lblFecha);
		
		fecha = new JTextField();
		fecha.setBounds(80, 198, 86, 20);
		contentPane.add(fecha);
		fecha.setColumns(10);
		
		JLabel lblSinopsis = new JLabel("sinopsis");
		lblSinopsis.setBounds(24, 243, 46, 14);
		contentPane.add(lblSinopsis);
		
		sinopsis = new JTextField();
		sinopsis.setBounds(90, 240, 403, 135);
		contentPane.add(sinopsis);
		sinopsis.setColumns(10);
		
		JButton btnPonerJuego = new JButton("poner juego");
		btnPonerJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String f[]=t.buscarJuego(juegoBuscado.getText());
				nombre.setText(f[0]);
				consola.setText(f[1]);
				genero.setText(f[2]);
				empresa.setText(f[3]);
				fecha.setText(f[4]);
				sinopsis.setText(f[5]);
			}
		});
		btnPonerJuego.setBounds(387, 95, 149, 23);
		contentPane.add(btnPonerJuego);
		
		juegoBuscado = new JTextField();
		juegoBuscado.setBounds(393, 38, 86, 20);
		contentPane.add(juegoBuscado);
		juegoBuscado.setColumns(10);
		
	}
}
