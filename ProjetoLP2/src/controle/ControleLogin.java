package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import visao.LoginGUI;
import visao.AutorGUI;

public class ControleLogin {
	private LoginGUI loginGUI;

	public ControleLogin(LoginGUI loginGUI) {
		this.loginGUI = loginGUI;
		Handler listener = new Handler();
		loginGUI.listenerAdd(listener);
	}
	
	public class Handler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == loginGUI.getBtnLimpar()) {
				loginGUI.getTextLogin().setText("");
				loginGUI.getTextSenha().setText("");
			}
			
			if(e.getSource() == loginGUI.getBtnEntrar()) {
				if(loginGUI.getTextLogin().getText().equals("") || loginGUI.getTextSenha().equals("")) {
					JOptionPane.showMessageDialog(loginGUI.getContentPane(), "OPS!! Existem campo(s) não preeenchidos!", "ERRO", 2);
				}else {
						if (loginGUI.getTextLogin().getText().equals("user") && loginGUI.getTextSenha().getText().equals("12345")) {
								loginGUI.dispose();
								AutorGUI autorGUI = new AutorGUI();
								ControleAutor controle = new ControleAutor(autorGUI);
								autorGUI.setVisible(true);
							}else{
								JOptionPane.showMessageDialog(loginGUI.getContentPane(), "Credenciais  incorretas!", "ERRO", 2);
								loginGUI.getTextLogin().setText("");
								loginGUI.getTextSenha().setText("");
							}
						}
					}
				}
			}
		}
