package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nome = new JLabel("Nome :");
		nome.setForeground(Color.BLACK);
		nome.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		nome.setBounds(20, 170, 76, 43);
		contentPane.add(nome);
		
		JComboBox combocategorias = new JComboBox();
		combocategorias.setBounds(124, 215, 125, 20);
		combocategorias.addItem("Escolha");
		combocategorias.addItem("Matemática");
		combocategorias.addItem("Historia");
		combocategorias.addItem("Pop");
		contentPane.add(combocategorias);
		
		JLabel categorias = new JLabel("Categorias :");
		categorias.setForeground(Color.BLACK);
		categorias.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		categorias.setBounds(20, 211, 117, 24);
		contentPane.add(categorias);
		
		textField = new JTextField();
		textField.setBounds(85, 183, 136, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton botao = new JButton("Jogar");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botao.setBounds(85, 246, 125, 35);
		botao.setEnabled(true);
		contentPane.add(botao);
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		sair.setBounds(321, 246, 101, 29);
		contentPane.add(sair);
		
		JLabel image = new JLabel("");
		image.setBounds(-268, -117, 830, 528);
		image.setIcon(new ImageIcon("C:\\Users\\104881\\Desktop\\Java - Fundamentos\\06 - OO\\25 - Desafio da semana\\src\\imagens\\quiz2.jpg"));
		contentPane.add(image);
		


	}
}
