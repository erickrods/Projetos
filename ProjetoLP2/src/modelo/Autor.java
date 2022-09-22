/**
 * Classe criada para representar um autor.
 * @author Erick Rodrigues e Eucarli Sampaio
 */

package modelo;

/**
 * 
 * Classe onde é definida e instanciada cada uma das variaveis
 * que formarão os dados de um autor e seus respectivos metodos
 * de entrada e saida
 *
 */
public class Autor {
	private String codigo;
	private String nome;
	private String email;
	private String tipoEscrita;
	
	/**
	 * Construtor completo
	 * @param codigo codigo que identifica o autor
	 * @param nome nome do autor
	 * @param email email do autor
	 * @param tipoEscrita tipo de literatura escrita pelo autor
	 */
	public Autor(String codigo, String nome, String email, String tipoEscrita) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.tipoEscrita = tipoEscrita;
	}
	
	/**
	 * Construtor vazio
	 */
	public Autor() {
		
	}
	
	/**
	 * Método para obter o código do autor
	 * @return codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * Método para configurar o código do autor
	 * @param codigo codigo que identifica o autor
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	/**
	 * Método para obter o nome do autor
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Método para configurar o nome do autor
	 * @param nome nome do autor
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Método para obter o email do autor
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Método para configurar o email do autor
	 * @param email email do autor
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Método para obter o tipo de literatura escrita pelo autor
	 * @return tipoEscrita
	 */
	public String getTipoEscrita() {
		return tipoEscrita;
	}
	
	/**
	 * Método para configurar o tipo de literatura escrita pelo autor
	 * @param tipoEscrita tipo de literatura escrita pelo autor
	 */
	public void setTipoEscrita(String tipoEscrita) {
		this.tipoEscrita = tipoEscrita;
	}
	
}
