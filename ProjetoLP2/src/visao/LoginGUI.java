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


public class LoginGUI extends JFrame {
	private JPanel contentPane;
	private static LoginGUI frame;
	private JTextField textLogin;
	private JPasswordField textSenha;
	private JButton btnLimpar;
	private JButton btnEntrar;
	
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
	/**
	 * Implementando o listner aos botoes.
	 */
	public void listnerAdd(ActionListener listner) {
		btnEntrar.addActionListener(listner);
		btnLimpar.addActionListener(listner);
	}
	
	public JTextField getTextLogin() {
		return textLogin;
	}

	public void setTextLogin(JTextField textLogin) {
		this.textLogin = textLogin;
	}

	public JPasswordField getTextSenha() {
		return textSenha;
	}

	public void setTextSenha(JPasswordField textSenha) {
		this.textSenha = textSenha;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}

	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public void setBtnEntrar(JButton btnEntrar) {
		this.btnEntrar = btnEntrar;
	}
	
}
