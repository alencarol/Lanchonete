package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Lanchonete;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVerificaPao extends MenuInicial{
	/*
	 * Todas as telas são filhas de MenuInicial*/

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public TelaVerificaPao(Lanchonete lan) { //receberá a instância lanche
		setBounds(100, 100, 200, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnContinuarEscolhencoPes = new JTextPane();
		txtpnContinuarEscolhencoPes.setText("Continuar escolhendo p\u00E3es?");
		txtpnContinuarEscolhencoPes.setBounds(22, 25, 137, 52);
		contentPane.add(txtpnContinuarEscolhencoPes);
		
		JButton btnSim = new JButton("SIM");
		btnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Fecha essa telinha e abre outra de pão
				dispose();
				TelaPao obj = new TelaPao(lan);
				obj.setVisible(true);
			}
		});
		btnSim.setBounds(25, 113, 63, 23);
		contentPane.add(btnSim);
		
		JButton btnNao = new JButton("N\u00C3O");
		btnNao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Fecha essa tela (a TelaPão anterior já foi encerrada)
				dispose();
			}
		});
		btnNao.setBounds(96, 113, 63, 23);
		contentPane.add(btnNao);
	}

}
