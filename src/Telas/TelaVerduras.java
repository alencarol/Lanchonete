package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Lanchonete;

public class TelaVerduras extends MenuInicial {
	/*
	 * Todas as telas s�o filhas de MenuInicial
	 * Essa exibe e permite escolher as op��es de Verduras*/

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaVerduras(Lanchonete lan) {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
