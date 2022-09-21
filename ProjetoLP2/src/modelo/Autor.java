package modelo;

public class Autor {
	private String codigo;
	private String nome;
	private String email;
	private String tipoEscrita;
	/**
	 * Contrutores de Autor, podendo ser aberto(para inicializacao) ou já preenchido.
	 */
	public Autor() {
		
	}
	
	public Autor(String codigo, String nome, String email, String tipoEscrita) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.tipoEscrita = tipoEscrita;
	}
	/**
	 * Métodos get e set
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoEscrita() {
		return tipoEscrita;
	}

	public void setTipoEscrita(String tipoEscrita) {
		this.tipoEscrita = tipoEscrita;
	}
	
}
