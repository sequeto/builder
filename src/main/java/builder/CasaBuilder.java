package builder;

public class CasaBuilder {
	private Casa casa;

    public CasaBuilder() {
    	casa = new Casa();
    }

    public Casa build() {
        if (casa.getParedes() < 4) {
            throw new IllegalArgumentException("Quantidade de Paredes Inválida");
        }
        if (casa.getTeto() < 1) {
            throw new IllegalArgumentException("Casa não possui teto");
        }
        
        return casa;
    }

    public CasaBuilder setParedes(int paredes) {
        casa.setParedes(paredes);
        return this;
    }

    public CasaBuilder setTeto(int teto) {
    	casa.setTeto(teto);
        return this;
    }

    public CasaBuilder setComodos(int comodos) {
        casa.setComodos(comodos);
        return this;
    }

    public CasaBuilder setRua(String rua) {
        casa.setRua(rua);
        return this;
    }

    public CasaBuilder setPais(String pais) {
        casa.setPais(pais);
        return this;
    }

    public CasaBuilder setCidade(String cidade) {
        casa.setCidade(cidade);
        return this;
    }

    public CasaBuilder setBairro(String bairro) {
        casa.setBairro(bairro);
        return this;
    }
}
