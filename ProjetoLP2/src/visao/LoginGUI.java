/**
 * Classe onde estão as caracteristicas da janela de login
 * @author Erick Rodrigues e Eucarli Sampaio
 */
package visao;

import controle.*;
import principal.*;
import modelo.*;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * Classe responsável por representar graficamente a janela e os campos onde
 * o usuario irá inserir os dados de login para poder acessar outras janelas, assim como um botao Limpar,
 * que excluirá as informações já digitadas nos campos e um botão Enviar, que
 * fará o envio das informações digitadas
 * 
 */
public class LoginGUI extends JFrame {
	/**
	 * 
	 */
	private JPanel contentPane;
	
	/**
	 * kfdkljsd
	 */
	private JTextField textLogin;
	private JPasswordField textSenha;
	private JButton btnLimpar;
	private JButton btnEntrar;
	
	/**
	 * Classe para a criação da janela de login e instanciamento de suas caracteristicas
	 */
	public LoginGUI() {
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/**
		 * Label e campo de login
		 */
		JLabel Login = new JLabel("Login");
		Login.setBounds(53, 11, 106, 22);
		getContentPane().add(Login);
		
		textLogin = new JTextField();
		textLogin.setBounds(53, 44, 161, 20);
		getContentPane().add(textLogin);
		textLogin.setColumns(10);
		
		/**
		 * Label e passwordField 
		 */
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(53, 75, 106, 22);
		getContentPane().add(lblSenha);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(53, 108, 161, 20);
		getContentPane().add(textSenha);
		textSenha.setColumns(10);
		
		/**
		 * Botões entrar e Limpar.
		 */
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(133, 149, 106, 23);
		getContentPane().add(btnEntrar);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(34, 149, 89, 23);
		contentPane.add(btnLimpar);
	}
	//fazer
	public void listenerAdd(ActionListener listener) {
		btnEntrar.addActionListener(listener);
		btnLimpar.addActionListener(listener);
	}
	
	/**
	 * Método para obter as informações de login inseridas pelo usuario
	 * @return textLogin
	 */
	public JTextField getTextLogin() {
		return textLogin;
	}

	/**
	 * Metodo para configurar o login inserido pelo usuario
	 * @param textLogin Login inserido pelo usuario
	 */
	public void setTextLogin(JTextField textLogin) {
		this.textLogin = textLogin;
	}

	/**
	 *  Método para obter a senha inseridas pelo usuario
	 * @return textSenha
	 */
	public JPasswordField getTextSenha() {
		return textSenha;
	}

	/**
	 * Metodo para configurar a senha inserida pelo usuario
	 * @param textSenha Senha inserida pelo usuario
	 */
	public void setTextSenha(JPasswordField textSenha) {
		this.textSenha = textSenha;
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
	public JButton getBtnEntrar() {
		return btnEntrar;
	}
	
}
