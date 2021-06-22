package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Logica.*;
import javax.swing.JTextField;

public class TelaPao extends MenuInicial {
	/*
	 * Todas as telas são filhas de MenuInicial
	 * Essa exibe e permite escolher as opções de pães*/

	private JPanel contentPane;
	private JTextField txtEscolhe;

	/**
	 * Create the frame.
	 */
	public TelaPao(Lanchonete lan) { //ceceberá a instância lanche
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPaoFrances = new JLabel("1 - P\u00E3o Franc\u00EAs");
		lblPaoFrances.setBounds(10, 35, 112, 25);
		contentPane.add(lblPaoFrances);
		
		JLabel lblCarteira = new JLabel("2 - P\u00E3o Carteira");
		lblCarteira.setBounds(10, 81, 112, 25);
		contentPane.add(lblCarteira);
		
		txtEscolhe = new JTextField();
		txtEscolhe.setBounds(75, 175, 112, 20);
		contentPane.add(txtEscolhe);
		txtEscolhe.setColumns(10);
		
		JButton btnEscolher = new JButton("Escolher");
		btnEscolher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer op = new Integer(txtEscolhe.getText()); //qual o tipo de pão
				
				if(op == 1) {
					lan.salvandoIngrediente("Pão Francês", 0.25);
				}
				else if(op == 2) {
					lan.salvandoIngrediente("Pão Carteira", 0.30);
				}
				else if(op == 3) {
					lan.salvandoIngrediente("Pão de Hambúrguer", 0.70);
				}
				else if(op == 4) {
					lan.salvandoIngrediente("Pão Árabe", 1.30);
				}
				else {
					//TODO chama uma telinha com mensagem de código inválido
				}
				
			}
		});
		btnEscolher.setBounds(20, 206, 89, 23);
		contentPane.add(btnEscolher);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//chama a tela de verificação e fecha essa de pão
				TelaVerificaPao obj = new TelaVerificaPao(lan);
				obj.setVisible(true);
				
				dispose(); //fecha tela
				
			}
		});
		btnFinalizar.setBounds(119, 206, 89, 23);
		contentPane.add(btnFinalizar);
	}

}
