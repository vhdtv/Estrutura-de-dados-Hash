package entidades;
public class Pessoa {
	private String cpf;
	private String telefone;

	public Pessoa(String cpf, String telefone) {
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", telefone=" + telefone + "]";
	}

}
