package principal;

import visao.*;
import controle.*;
import modelo.*;

public class Main {

	public static void main(String[] args) {
		LoginGUI telaLogin = new LoginGUI();
		ControleLogin controleLog = new ControleLogin(telaLogin);
		telaLogin.setVisible(true);

	}

}
