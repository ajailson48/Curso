package serasa.ExerciciosPOO;

public class Ex5 {

    public class Pessoa {
	    private String nome;
	    private String endereco;
	    private String telefone;

	    // Construtor padrão
	    public Pessoa() {
	    }

	    // Construtor com nome
	    public Pessoa(String nome) {
	      this.nome = nome;
	    }

	    // Construtor com nome, endereço e telefone
	    public Pessoa(String nome, String endereco, String telefone) {
	      this.nome = nome;
	      this.endereco = endereco;
	      this.telefone = telefone;
	    }

	    // Getter e Setter para nome
	    public String getNome() {
	      return nome;
	    }

	    public void setNome(String nome) {
	      this.nome = nome;
	    }

	    // Getter e Setter para endereço
	    public String getEndereco() {
	      return endereco;
	    }

	    public void setEndereco(String endereco) {
	      this.endereco = endereco;
	    }

	    // Getter e Setter para telefone
	    public String getTelefone() {
	      return telefone;
	    }

	    public void setTelefone(String telefone) {
	      this.telefone = telefone;
	    }
	  }
    
}
