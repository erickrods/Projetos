package controle;

import java.awt.event.*;
import javax.swing.JOptionPane;
import visao.LoginGUI;
import visao.AutorGUI;
import principal.*;
import modelo.*;

public class ControleAutor {
	private AutorGUI autorGUI;
	
	public ControleAutor(AutorGUI autorGUI) {
		this.autorGUI = autorGUI;
		HandlerAutor listner = new HandlerAutor();
		autorGUI.listnerAdd(listner);
	}
	public class HandlerAutor implements ActionListener {

		//@Override
		public void actionPerformed(ActionEvent e) {
			/**
			 * Efetuar "reset" nos campos ao pressionao o botão limpar.
			 */
			if(e.getSource() == autorGUI.getBtnLimpar()) {
				autorGUI.getTextCodigo().setText("");
				autorGUI.getTextNome().setText("");
				autorGUI.getTextEmail().setText("");
				autorGUI.getComboBox().setSelectedIndex(0);
			}
			
			/**
			 * Checa se os campos estao ou não em branco e executam ou nao o cadastro.
			 */
			if(e.getSource() == autorGUI.getBtnEnviar()) {
				if(((autorGUI.getTextCodigo().getText().equals("")) || (autorGUI.getTextNome().getText().equals("") || (autorGUI.getTextEmail().getText().equals(""))))){
					JOptionPane.showMessageDialog(autorGUI.getContentPane(), "OPS!! Existem campos não preeenchidos!", "ERROR", 2);
				}else {
					Autor autor = new Autor(autorGUI.getTextCodigo().getText(), autorGUI.getTextNome().getText(),autorGUI.getTextEmail().getText(), ""+autorGUI.getComboBox().getSelectedItem());
					JOptionPane.showMessageDialog(autorGUI.getContentPane(), "DADOS INSERIDOS COM SUCESSO!", "Cadastro finalizado!", 1);
					}
			}
		}
	}
}
		