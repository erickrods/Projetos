package principal;

import visao.*;
import controle.*;
import modelo.*;

public class Main {

	public static void main(String[] args) {
		LoginGUI telaLogin = new LoginGUI();
		ControleLogin controle = new ControleLogin(telaLogin);
		//System.out.println("passou");
		telaLogin.setVisible(true);

	}

}
