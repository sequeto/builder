package builder;

public class Casa {
	private int paredes;
	private int teto;
	private int comodos;
	
	private String rua;
	private String bairro;
	private String cidade;
	private String pais;
	
	public Casa (){
		this.paredes = 4;
        this.teto = 1;
	}
	
	public int getParedes() {
		return paredes;
	}
	public void setParedes(int paredes) {
		this.paredes = paredes;
	}
	public int getTeto() {
		return teto;
	}
	public void setTeto(int teto) {
		this.teto = teto;
	}
	public int getComodos() {
		return comodos;
	}
	public void setComodos(int comodos) {
		this.comodos = comodos;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
