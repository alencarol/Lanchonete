package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Lanchonete;

import javax.swing.JLabel;
import java.awt.Color;

public class TelaCarnes extends MenuInicial {
	/*
	 * Todas as telas são filhas de MenuInicial
	 * Essa exibe e permite escolher as opções de Carnes*/

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaCarnes(Lanchonete lan) { //receberá a instância lanche
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPC\u00D5ES DE PORQUINHO");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(68, 90, 144, 75);
		contentPane.add(lblNewLabel);
	}

}
