package visao;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import principal.*;
import modelo.*;
import controle.*;

public class AutorGUI extends JFrame {
	/**
	 * Declaração de campos usados no frame.
	 */
	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textEmail;
	private JButton btnLimpar;
	private JButton btnEntrar;
	private JComboBox comboBox;


	/**
	 * Criação do Frame.
	 */
	public AutorGUI() {
		setTitle("Cadastro de autores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * Posicionando os abjetos window/builder 
		 */
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setBounds(80, 26, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(80, 82, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(80, 138, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(80, 51, 154, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(80, 107, 154, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Literatura Infantil", "Literatura Juvenil", "Literatura Adulta"}));		
		comboBox.setBounds(80, 228, 154, 22);
		contentPane.add(comboBox);
		
		textEmail = new JTextField();
		textEmail.setBounds(80, 163, 154, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblTipoDeEscrita = new JLabel("Tipo de Escrita");
		lblTipoDeEscrita.setBounds(80, 203, 86, 14);
		contentPane.add(lblTipoDeEscrita);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(37, 291, 89, 23);
		contentPane.add(btnLimpar);
		
		btnEntrar = new JButton("Enviar");
		btnEntrar.setBounds(166, 291, 89, 23);
		contentPane.add(btnEntrar);
	
	}
	
	/**
	 * Métodos get/set.
	 * @return
	 */
	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}

	public JTextField getTextNome() {
		return textNome;
	}

	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

	public JTextField getTextEmail() {
		return textEmail;
	}

	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public JButton getBtnEnviar() {
		return btnEntrar;
	}
	
	/**
	 * Método para alocarmos o Listner
	 * @param ouvinte
	 */
	
	public void listnerAdd(ActionListener listner) {
		btnEntrar.addActionListener(listner);
		btnLimpar.addActionListener(listner);
	}

}
