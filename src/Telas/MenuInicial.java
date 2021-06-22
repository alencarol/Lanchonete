package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import Logica.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class MenuInicial extends JFrame {

	private JPanel contentPane;
	public Lanchonete lanche = new Lanchonete(); //Instancia que irá manipular todos os pedidos
	private JTextField txtOpcao;
	
	/**
	 * Create the frame.
	 */
	public MenuInicial() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPao = new JLabel("1 - P\u00E3es");
		lblPao.setBounds(102, 11, 79, 14);
		contentPane.add(lblPao);
		
		txtOpcao = new JTextField();
		txtOpcao.setBounds(76, 194, 132, 22);
		contentPane.add(txtOpcao);
		txtOpcao.setColumns(10);
		
		JLabel lblQueijos = new JLabel("2 - Queijos");
		lblQueijos.setBounds(102, 45, 79, 14);
		contentPane.add(lblQueijos);
		
		JLabel lblCarnes = new JLabel("3 - Carnes de Porco");
		lblCarnes.setBounds(90, 79, 104, 14);
		contentPane.add(lblCarnes);
		
		JLabel lblMolhos = new JLabel("5 - Molhos");
		lblMolhos.setBounds(102, 129, 79, 14);
		contentPane.add(lblMolhos);
		
		JLabel lblVerduras = new JLabel("4 - Verduras");
		lblVerduras.setBounds(102, 104, 79, 14);
		contentPane.add(lblVerduras);
		
		JLabel lblOutros = new JLabel("6 - Outros");
		lblOutros.setBounds(102, 154, 79, 14);
		contentPane.add(lblOutros);
		
		JButton btnEscoher = new JButton("Escolher");
		btnEscoher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Integer op = new Integer(txtOpcao.getText()); //op armazena o código da opção que o usuário digitou
				
				if (op == 1) {
					//chama a tela de pão passando o obj lanche
					TelaPao obj = new TelaPao(lanche);//passa a instância lanche
					obj.setVisible(true);
					
				}else if (op == 2) {
					//chama a tela de queijos passando o obj lanche
					TelaQueijos obj = new TelaQueijos(lanche);
					obj.setVisible(true);
					
				}else if (op == 3) {
					//TODO chama e implementar a TelaCarnes
				}else if(op == 4) {
					//TODO chama e implementar a TelaVerduras
				}else if (op == 5) {
					//TODO chama e implementar a TelaMolhos
				}else if (op == 6) {
					//TODO chama e implementar TelaOutros
				}else {
					//TODO mensagem de código inválido
				}
			}
		});
		btnEscoher.setBounds(44, 227, 89, 23);
		contentPane.add(btnEscoher);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO fazer uma verificação antes
				//Mostra o pedido e o total a pagar e depois encerra o programa
				lanche.imprimePedido();
				System.exit(0);
			}
		});
		btnFinalizar.setBounds(143, 227, 89, 23);
		contentPane.add(btnFinalizar);
		
	}
}
