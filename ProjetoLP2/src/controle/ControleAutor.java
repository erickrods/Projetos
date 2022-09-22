package controle;

import java.awt.event.*;
import javax.swing.JOptionPane;
import visao.LoginGUI;
import visao.AutorGUI;
import principal.*;
import modelo.*;

/**
 * Classe responsável por receber e tratar os campos
 * da classe AutorGUI
 */
public class ControleAutor {
	private AutorGUI autorGUI;
	
	/**
	 * Metodo para receber as informações da classe AutorGUI
	 * @param autorGUI informações da classe AutorGUI
	 */
	public ControleAutor(AutorGUI autorGUI) {
		this.autorGUI = autorGUI;
		HandlerAutor listener = new HandlerAutor();
		autorGUI.listenerAdd(listener);
	}
	
	/**
	 * Metodo responsavel por indicar o que deve ser feito quando o
	 * botão Limpar ou Enviar é pressionado
	 */
	public class HandlerAutor implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == autorGUI.getBtnLimpar()) {
				autorGUI.getTextCodigo().setText("");
				autorGUI.getTextNome().setText("");
				autorGUI.getTextEmail().setText("");
				autorGUI.getComboBox().setSelectedIndex(-1);
			}
			
			if(e.getSource() == autorGUI.getBtnEnviar()) {
				if(autorGUI.getTextCodigo().getText().equals("") || autorGUI.getTextNome().getText().equals("") || autorGUI.getTextEmail().getText().equals("") || autorGUI.getComboBox().getSelectedItem().equals("")){
					JOptionPane.showMessageDialog(autorGUI.getContentPane(), "OPS!! Existem campos não preeenchidos!", "ERROR", 2);
				}else {
					Autor autor = new Autor(autorGUI.getTextCodigo().getText(), autorGUI.getTextNome().getText(),autorGUI.getTextEmail().getText(), autorGUI.getComboBox().getSelectedItem()+"");
					JOptionPane.showMessageDialog(autorGUI.getContentPane(), "DADOS INSERIDOS COM SUCESSO!", "Cadastro finalizado!", 1);
					autorGUI.getTextCodigo().setText("");
					autorGUI.getTextNome().setText("");
					autorGUI.getTextEmail().setText("");
					autorGUI.getComboBox().setSelectedIndex(-1);
				}
			}
		}
	}
}
		