package serasa.ExerciciosPOO;

public class Ex6 {

    public static final int valorCredito = 0;
	  public static final int valorDivida = 0;

	  public class Fornecedor extends Pessoa {
	    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
	      super(nome, endereco, telefone);
	    }

	    public static double getValorCredito() {
	      return getValorCredito();
	    }

	    public void setValorCredito(double valorCredito) {
	    }

	    public static double getValorDivida() {
	      return getValorDivida();
	    }

	    public void setValorDivida(double valorDivida) {
	    }

	    public static double obterSaldo() {
	      return valorCredito - valorDivida;
	    }

	    public static String getNome() {
	      return null;
	    }

	    public static String getEndereco() {
	      return null;
	    }

	    public static String getTelefone() {
	      return null;
	    }
	  }

	}

	class TesteFornecedor {
	  public static void main(String[] args) {

	    System.out.println("Nome: " + Fornecedor.getNome());
	    System.out.println("Endereço: " + Fornecedor.getEndereco());
	    System.out.println("Telefone: " + Fornecedor.getTelefone());
	    System.out.println("Valor Crédito: " + Fornecedor.getValorCredito());
	    System.out.println("Valor Dívida: " + Fornecedor.getValorDivida());
	    System.out.println("Saldo: " + Fornecedor.obterSaldo());
	  }
    
}
