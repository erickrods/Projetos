/**
* Classe principal, será a partir daqui que o programa será executado
* @author Erick Rodrigues e Eucarli Sampaio
*/

package principal;

import visao.*;
import controle.*;
import modelo.*;

public class Main {
	/**
	 * Classe onde se iniciará a criação das janelas
	 * @param args
	 */
	public static void main(String[] args) {
		LoginGUI telaLogin = new LoginGUI();
		ControleLogin controle = new ControleLogin(telaLogin);
		telaLogin.setVisible(true);
	}

}
