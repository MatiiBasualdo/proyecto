package Ventanas;
import Ventanas.Auto;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Ventana1 extends JFrame implements ActionListener{

	Auto fordK;
	JPanel contentPane;
	JTextField textField;
	JButton btnPonerNafta, btnManejar;
	JLabel lblValorNafta;
	JTextField TextField;
	JTextField catidadKmManeja;

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("FordK");
		
		btnPonerNafta = new JButton("PonerNafta");
		btnPonerNafta.setBounds(0, 0, 111, 54);
		contentPane.add(btnPonerNafta);
		this.btnPonerNafta.addActionListener(this);
		
		JLabel lblNafta = new JLabel("Nafta:");
		lblNafta.setBounds(0, 54, 39, 39);
		contentPane.add(lblNafta);
		
		lblValorNafta = new JLabel("0");
		lblValorNafta.setBounds(49, 54, 62, 39);
		contentPane.add(lblValorNafta);
		
		textField = new JTextField();
		textField.setBounds(121, 24, 111, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnManejar = new JButton("Manejar");
		btnManejar.setBounds(335, 0, 89, 54);
		contentPane.add(btnManejar);
		
		catidadKmManeja = new JTextField();
		catidadKmManeja.setBounds(335, 63, 89, 20);
		contentPane.add(catidadKmManeja);
		catidadKmManeja.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnPonerNafta){
			this.lblValorNafta.setText(this.textField.getText());
		}
		if(e.getSource()==btnManejar){
			//manejar()
		}	
	}
	
	
	
	public static void main(String[] args) {
		Ventana1 v1 = new Ventana1();
		v1.setVisible(true);
		
	}

}
