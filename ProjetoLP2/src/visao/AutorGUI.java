/**
 * Classe onde estão as caracteristicas da janela de cadastro de autor
 * @author Erick Rodrigues e Eucarli Sampaio
 */

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

/**
 * Classe responsável por representar graficamente a janela e os campos onde
 * o usuario irá inserir os dados do(s) autor(es), assim como um botao Limpar,
 * que excluirá as informações já digitadas nos campos e um botão Enviar, que
 * fará o envio das informações digitadas
 */
public class AutorGUI extends JFrame {
	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textEmail;
	private JButton btnLimpar;
	private JButton btnEntrar;
	private JComboBox<Object> comboBox;


	/**
	 * Classe para a criação da janela de autor e instanciamento de suas caracteristicas
	 */
	public AutorGUI() {
		setTitle("Cadastro de autores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"", "Literatura Infantil", "Literatura Juvenil", "Literatura Adulta"}));		
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
	 *  Método para obter o código do autor
	 * @return textCodigo
	 */
	public JTextField getTextCodigo() {
		return textCodigo;
	}

	/**
	 * Método para configurar o código do autor
	 * @param textCodigo codigo que identifica o autor
	 */
	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}
	
	/**
	 * Método para obter o nome do autor
	 * @return textNome
	 */
	public JTextField getTextNome() {
		return textNome;
	}

	/**
	 * Método para configurar o nome do autor
	 * @param textNome nome do autor
	 */
	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

	/**
	 * Método para obter o email do autor
	 * @return textEmail
	 */
	public JTextField getTextEmail() {
		return textEmail;
	}

	/**
	 * Método para configurar o email do autor
	 * @param textEmail email do autor
	 */
	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}

	/**
	 * Método para obter o tipo de literatura escrita pelo autor
	 * @return comboBox
	 */
	public JComboBox<Object> getComboBox() {
		return comboBox;
	}

	/**
	 * Metodo que era limpar todos os campos da janela
	 * @return btnLimpar
	 */
	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	/**
	 * Metodo que enviará as informações digitadas nos campos
	 * @return btnEntrar
	 */
	public JButton getBtnEnviar() {
		return btnEntrar;
	}
	
	/**
	 * Recebe como parametro a variavel listener
	 * @param listener
	 */
	public void listenerAdd(ActionListener listener) {
		btnEntrar.addActionListener(listener);
		btnLimpar.addActionListener(listener);
	}

}
