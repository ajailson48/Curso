package serasa.ExerciciosPOO;

public class Ex9 {

    public class Vendedor extends Empregado {
	    private double valorVendas;
	    private double comissao;

	    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
	        double valorVendas, double comissao) {
	      super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
	      this.valorVendas = valorVendas;
	      this.comissao = comissao;
	    }

	    public double getValorVendas() {
	      return valorVendas;
	    }

	    public void setValorVendas(double valorVendas) {
	      this.valorVendas = valorVendas;
	    }

	    public double getComissao() {
	      return comissao;
	    }

	    public void setComissao(double comissao) {
	      this.comissao = comissao;
	    }

	    @Override
	    public double calcularSalario() {
	      return super.calcularSalario() + (valorVendas * (comissao / 100));
	    }
	  }

	}

	class TesteVendedor {
	  public static void main(String[] args) {
	    Vendedor vendedor = new Vendedor("Ana", "Rua das Cerejeiras, 321", "(11) 95678-1234", 300, 3500, 7, 15000, 4);

	    System.out.println("Nome: " + vendedor.getNome());
	    System.out.println("Endereço: " + vendedor.getEndereco());
	    System.out.println("Telefone: " + vendedor.getTelefone());
	    System.out.println("Código Setor: " + vendedor.getCodigoSetor());
	    System.out.println("Salário Base: " + vendedor.getSalarioBase());
	    System.out.println("Imposto: " + vendedor.getImposto() + "%");
	    System.out.println("Valor Vendas: " + vendedor.getValorVendas());
	    System.out.println("Comissão: " + vendedor.getComissao() + "%");
	    System.out.println("Salário: " + vendedor.calcularSalario());
	  }

    
}
