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
import java.awt.Label;

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
	private JTextField idJuego;
	private JTextField multijugador;
	private JTextField foto;

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
		lblNombre.setBounds(24, 116, 46, 14);
		contentPane.add(lblNombre);
		
		nombre = new JTextField();
		nombre.setBounds(80, 113, 136, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblConsola = new JLabel("consola:");
		lblConsola.setBounds(24, 41, 46, 14);
		contentPane.add(lblConsola);
		
		consola = new JTextField();
		consola.setBounds(72, 38, 143, 20);
		contentPane.add(consola);
		consola.setColumns(10);
		
		JLabel lblGenero = new JLabel("genero");
		lblGenero.setBounds(24, 155, 46, 14);
		contentPane.add(lblGenero);
		
		genero = new JTextField();
		genero.setBounds(80, 152, 149, 20);
		contentPane.add(genero);
		genero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("empresa");
		lblNewLabel.setBounds(24, 79, 46, 14);
		contentPane.add(lblNewLabel);
		
		empresa = new JTextField();
		empresa.setBounds(82, 76, 143, 20);
		contentPane.add(empresa);
		empresa.setColumns(10);
		
		JLabel lblFecha = new JLabel("fecha");
		lblFecha.setBounds(24, 239, 46, 14);
		contentPane.add(lblFecha);
		
		fecha = new JTextField();
		fecha.setBounds(80, 236, 149, 20);
		contentPane.add(fecha);
		fecha.setColumns(10);
		
		JLabel lblSinopsis = new JLabel("sinopsis");
		lblSinopsis.setBounds(24, 200, 46, 14);
		contentPane.add(lblSinopsis);
		
		sinopsis = new JTextField();
		sinopsis.setBounds(80, 197, 370, 20);
		contentPane.add(sinopsis);
		sinopsis.setColumns(10);
		
		JButton btnPonerJuego = new JButton("poner juego");
		btnPonerJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String f[]=t.buscarConsola(juegoBuscado.getText());
				idJuego.setText(f[0]);
				nombre.setText(f[3]);
				consola.setText(f[1]);
				genero.setText(f[4]);
				empresa.setText(f[2]);
				sinopsis.setText(f[5]);
			}
		});
		btnPonerJuego.setBounds(387, 95, 149, 23);
		contentPane.add(btnPonerJuego);
		
		juegoBuscado = new JTextField();
		juegoBuscado.setBounds(393, 38, 86, 20);
		contentPane.add(juegoBuscado);
		juegoBuscado.setColumns(10);
		
		Label label = new Label("id juego");
		label.setBounds(24, 10, 62, 22);
		contentPane.add(label);
		
		idJuego = new JTextField();
		idJuego.setBounds(72, 10, 118, 20);
		contentPane.add(idJuego);
		idJuego.setColumns(10);
		
		multijugador = new JTextField();
		multijugador.setBounds(80, 284, 86, 20);
		contentPane.add(multijugador);
		multijugador.setColumns(10);
		
		JLabel lblMulti = new JLabel("multi");
		lblMulti.setBounds(24, 287, 46, 14);
		contentPane.add(lblMulti);
		
		JLabel lblFoto = new JLabel("foto");
		lblFoto.setBounds(24, 320, 46, 14);
		contentPane.add(lblFoto);
		
		foto = new JTextField();
		foto.setBounds(80, 317, 86, 20);
		contentPane.add(foto);
		foto.setColumns(10);
		
	}
}
