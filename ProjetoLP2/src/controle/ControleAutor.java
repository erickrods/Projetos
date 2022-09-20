package controle;

import java.awt.event.*;
import modelo.*;
import javax.swing.JOptionPane;
import visao.*;
import principal.*;
import modelo.*;

public class ControleAutor {
	private AutorGUI autorGUI;
	
	public ControleAutor(AutorGUI autorGUI) {
		this.autorGUI = autorGUI;
		HandlerAutor listBtns = new HandlerAutor();
		autorGUI.adicionarOuvinte(listBtns);
	}
	
	public class HandlerAutor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		//Autor Graphic user interface
			//Botão Limpar
			if(e.getSource() == autorGUI.getBtnLimpar()) {
				autorGUI.getTextCodigo().setText("");
				autorGUI.getTextNome().setText("");
				autorGUI.getTextEmail().setText("");
				autorGUI.getComboBox().setSelectedIndex(0);
			}
			
			//Botão Enviar
			if(e.getSource() == autorGUI.getBtnEnviar()) {
				if(autorGUI.getTextCodigo().getText().equals("")) {
					JOptionPane.showMessageDialog(autorGUI.getContentPane(), "Existem campos em branco!", "ERROR", 2);
				}else {
					if(autorGUI.getTextNome().getText().equals("")) {
						JOptionPane.showMessageDialog(autorGUI.getContentPane(), "Existem campos em branco!", "ERROR", 2);
					}else {
						if(autorGUI.getTextEmail().getText().equals("")) {
							JOptionPane.showMessageDialog(autorGUI.getContentPane(), "Existem campos em branco!", "ERROR", 2);
						}else {
								Autor autor = new Autor(autorGUI.getTextCodigo().getText(), autorGUI.getTextNome().getText(),autorGUI.getTextEmail().getText(), ""+autorGUI.getComboBox().getSelectedItem());
								JOptionPane.showMessageDialog(autorGUI.getContentPane(), "DADOS INSERIDOS COM SUCESSO!", "Cadastro finalizado!", 1);
						}
					}
				}
			}
		}
	}
}
		