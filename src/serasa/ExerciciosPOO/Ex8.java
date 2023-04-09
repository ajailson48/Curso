package serasa.ExerciciosPOO;

public class Ex8 {

    public class Operario extends Empregado {
        private double valorProducao;
        private double comissao;

        public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
            double valorProducao, double comissao) {
          super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
          this.valorProducao = valorProducao;
          this.comissao = comissao;
        }

        public double getValorProducao() {
          return valorProducao;
        }

        public void setValorProducao(double valorProducao) {
          this.valorProducao = valorProducao;
        }

        public double getComissao() {
          return comissao;
        }

        public void setComissao(double comissao) {
          this.comissao = comissao;
        }

        @Override
        public double calcularSalario() {
          return super.calcularSalario() + (valorProducao * (comissao / 100));
        }
      }

    }

    class TesteOperario {
      public static void main(String[] args) {
        Operario operario = new Operario("Carlos", "Rua das Palmeiras, 789", "(11) 93456-7890", 200, 3000, 8, 20000, 5);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário: " + operario.calcularSalario());
      }

    
}
