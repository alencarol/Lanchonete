package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Lanchonete;

import javax.swing.JLabel;
import java.awt.Color;

public class TelaMolhos extends MenuInicial{
	/*
	 * Todas as telas são filhas de MenuInicial
	 * Essa exibe e permite escolher as opções de molhos*/

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public TelaMolhos(Lanchonete lan) { //receberá a instância lanche
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPC\u00D5ES DE MOLHOS DEL\u00CDCIA");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(54, 83, 167, 93);
		contentPane.add(lblNewLabel);
	}

}
