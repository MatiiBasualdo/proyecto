package Practicas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class practica1 extends JFrame {

	private JPanel contentPane;
	private int xR;
	private int xY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practica1 v1 = new practica1();
					v1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public practica1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIzquierda = new JButton("IZQUIERDA");
		btnIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xR = xR - 10;
				repaint();
			}
		});
		btnIzquierda.setBounds(10, 272, 126, 65);
		contentPane.add(btnIzquierda);
		
		JButton btnDerecha = new JButton("DERECHA");
		btnDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				xR = xR + 10;
				repaint();
			}
		});
		btnDerecha.setBounds(648, 272, 126, 65);
		contentPane.add(btnDerecha);
		
		JButton btnAbajo = new JButton("ABAJO");
		btnAbajo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xY = xY + 10;
				repaint();
			}
		});
		btnAbajo.setBounds(347, 485, 126, 65);
		contentPane.add(btnAbajo);
		
		JButton btnArriva = new JButton("ARRIVA");
		btnArriva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xY = xY - 10;
				repaint();
			}
		});
		btnArriva.setBounds(347, 11, 126, 65);
		contentPane.add(btnArriva);
		setBounds(0, 0, 800, 600);
		
		xR = 400;
		xY = 300;
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.blue);
		g.fillRect(xR,xY, 100, 100);
	
		
		
	}
}
