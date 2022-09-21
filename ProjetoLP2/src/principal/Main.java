package principal;

import visao.*;
import controle.*;
import modelo.*;

public class Main {
	/**
	 * @author Erick Rodrigues e Eucarli Sampaio
	 */

	public static void main(String[] args) {
		LoginGUI telaLogin = new LoginGUI();
		ControleLogin controle = new ControleLogin(telaLogin);
		telaLogin.setVisible(true);

	}

}
