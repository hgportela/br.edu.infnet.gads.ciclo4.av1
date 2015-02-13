package br.edu.infnet.java3.ciclo4.av1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class MainInterface {

	private JFrame frmControleDeEstoque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface window = new MainInterface();
					window.frmControleDeEstoque.setVisible(true);
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
		frmControleDeEstoque = new JFrame();
		frmControleDeEstoque.setIconImage(Toolkit.getDefaultToolkit().getImage(MainInterface.class.getResource("/br/edu/infnet/java3/ciclo4/av1/imagens/logoicon.png")));
		frmControleDeEstoque.setTitle("Controle de Estoque");
		frmControleDeEstoque.setBounds(100, 100, 450, 300);
		frmControleDeEstoque.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmControleDeEstoque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu cadastrar,pesquisar,listar;
		
		menuBar.setToolTipText("");
		frmControleDeEstoque.setJMenuBar(menuBar);
		cadastrar = new JMenu("Cadastrar");
		pesquisar = new JMenu("Pesquisar");
		listar = new JMenu("Listar");
		
		menuBar.add(cadastrar);
		menuBar.add(pesquisar);
		menuBar.add(listar);
		
		JMenuItem cadLoja = new JMenuItem("Loja");
		cadLoja.setIcon(new ImageIcon(MainInterface.class.getResource("/br/edu/infnet/java3/ciclo4/av1/imagens/lojaicon.png")));
		cadLoja.setPreferredSize(new Dimension(150, 22));
		cadastrar.add(cadLoja);
		JMenuItem cadCarro = new JMenuItem("Carro");
		cadCarro.setIcon(new ImageIcon(MainInterface.class.getResource("/br/edu/infnet/java3/ciclo4/av1/imagens/carroicon.png")));
		cadCarro.setPreferredSize(new Dimension(150, 22));
		cadastrar.add(cadCarro);
		JMenuItem cadMoto = new JMenuItem("Moto");
		cadMoto.setIcon(new ImageIcon(MainInterface.class.getResource("/br/edu/infnet/java3/ciclo4/av1/imagens/motoicon.png")));
		cadMoto.setPreferredSize(new Dimension(150, 22));
		cadastrar.add(cadMoto);
		
		JMenuItem pesqCarro = new JMenuItem("Carro");
		pesqCarro.setIcon(new ImageIcon(MainInterface.class.getResource("/br/edu/infnet/java3/ciclo4/av1/imagens/carroicon.png")));
		pesqCarro.setPreferredSize(new Dimension(150, 22));
		pesquisar.add(pesqCarro);		
		JMenuItem pesqMoto = new JMenuItem("Moto");
		pesqMoto.setIcon(new ImageIcon(MainInterface.class.getResource("/br/edu/infnet/java3/ciclo4/av1/imagens/motoicon.png")));
		pesqMoto.setPreferredSize(new Dimension(150, 22));
		pesquisar.add(pesqMoto);
		
		JMenuItem listCarro = new JMenuItem("Estoque Carro");
		listCarro.setIcon(new ImageIcon(MainInterface.class.getResource("/br/edu/infnet/java3/ciclo4/av1/imagens/carroicon.png")));
		listCarro.setPreferredSize(new Dimension(150, 22));
		listar.add(listCarro);		
		JMenuItem listMoto = new JMenuItem("Estoque Moto");
		listMoto.setIcon(new ImageIcon(MainInterface.class.getResource("/br/edu/infnet/java3/ciclo4/av1/imagens/motoicon.png")));
		listMoto.setPreferredSize(new Dimension(150, 22));
		listar.add(listMoto);
	}

}
