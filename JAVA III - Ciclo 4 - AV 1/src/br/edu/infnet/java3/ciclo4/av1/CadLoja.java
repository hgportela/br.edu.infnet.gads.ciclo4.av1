package br.edu.infnet.java3.ciclo4.av1;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class CadLoja extends JPanel {
	private JTextField textNome;
	private JTextField textEndereco;

	/**
	 * Create the panel.
	 */
	public CadLoja() {
		
		JLabel lblCadastroDeLoja = new JLabel("Cadastro de Loja");
		lblCadastroDeLoja.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNome = new JLabel("Nome");
		
		textNome = new JTextField();
		textNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCadastroDeLoja)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNome)
								.addComponent(lblEndereo))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textEndereco)
								.addComponent(textNome, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
								.addComponent(btnCadastrar, Alignment.TRAILING))))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCadastroDeLoja)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEndereo)
						.addComponent(textEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCadastrar)
					.addContainerGap(151, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
