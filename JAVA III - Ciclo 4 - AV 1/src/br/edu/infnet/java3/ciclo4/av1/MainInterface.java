package br.edu.infnet.java3.ciclo4.av1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainInterface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface window = new MainInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu cadastrar,pesquisar,listar;
		JMenuItem loja, carro, moto;
		
		menuBar.setToolTipText("");
		frame.setJMenuBar(menuBar);
		cadastrar = new JMenu("Cadastrar");			
		pesquisar = new JMenu("Pesquisar");
		listar = new JMenu("Listar");
		loja = new JMenuItem("Loja");
		carro = new JMenuItem("Carro");
		moto = new JMenuItem("Moto");
		
		menuBar.add(cadastrar);
		menuBar.add(pesquisar);
		
		JMenuItem mntmCarro = new JMenuItem("Carro");
		pesquisar.add(mntmCarro);
		
		JMenuItem mntmMoto = new JMenuItem("Moto");
		pesquisar.add(mntmMoto);
		menuBar.add(listar);
		
		JMenuItem mntmCarro_1 = new JMenuItem("Carro");
		listar.add(mntmCarro_1);
		
		JMenuItem mntmMoto_1 = new JMenuItem("Moto");
		listar.add(mntmMoto_1);
		cadastrar.add(loja);
		cadastrar.add(carro);
		cadastrar.add(moto);
	}

}
