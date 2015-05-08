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

public class Decada00 extends JPanel {
	
	public Decada00() {
		
		setLayout(null);
		setBounds(0, 105, 1355, 591);
		
		
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
				
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.setFont(new Font("BatangChe", Font.PLAIN, 16));
		textPane.setForeground(Color.WHITE);
		textPane.setOpaque(false);
		textPane.setText("Aqui se incorporara \n"
				+ "el texto de la decada de los 00");
		jscroll.setViewportView(textPane);
				
		jscroll.setOpaque(false);
		jscroll.getViewport().setOpaque(false);
		
		
		
		//IMAGEN DE FONDO
		Image iFondo = new ImageIcon(this.getClass().getResource("/Fondo.png")).getImage();
		JLabel imgFondo = new JLabel("/Fondo.png");
		imgFondo.setBounds(0, 0, 1355, 600);
		imgFondo.setIcon(new ImageIcon(iFondo));
		this.add(imgFondo);
		
		

	}
}
