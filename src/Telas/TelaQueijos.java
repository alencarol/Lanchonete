package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Lanchonete;

import javax.swing.JLabel;
import java.awt.Color;

public class TelaQueijos extends MenuInicial {
	/*
	 * Todas as telas são filhas de MenuInicial
	 * Essa exibe e permite escolher as opções de queijos*/

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaQueijos(Lanchonete lan) { //cereberá a instância lanche
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OP\u00C7\u00D5ES DE QUUEIJOS HMMM");
		lblNewLabel.setBackground(new Color(255, 255, 0));
		lblNewLabel.setBounds(50, 87, 179, 67);
		contentPane.add(lblNewLabel);
	}

}
