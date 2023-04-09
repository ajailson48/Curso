package serasa.ExerciciosPOO;

public class Ex7 {

    public class Empregado extends Pessoa {
        private int codigoSetor;
        private double salarioBase;
        private double imposto;

        public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
            double imposto) {
          super(nome, endereco, telefone);
          this.codigoSetor = codigoSetor;
          this.salarioBase = salarioBase;
          this.imposto = imposto;
        }

        public int getCodigoSetor() {
          return codigoSetor;
        }

        public void setCodigoSetor(int codigoSetor) {
          this.codigoSetor = codigoSetor;
        }

        public double getSalarioBase() {
          return salarioBase;
        }

        public void setSalarioBase(double salarioBase) {
          this.salarioBase = salarioBase;
        }

        public double getImposto() {
          return imposto;
        }

        public void setImposto(double imposto) {
          this.imposto = imposto;
        }

        public double calcularSalario() {
          return salarioBase - (salarioBase * (imposto / 100));
        }
      }

      public class Administrador extends Empregado {
        private double ajudaDeCusto;

        public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
            double imposto, double ajudaDeCusto) {
          super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
          this.ajudaDeCusto = ajudaDeCusto;
        }

        public double getAjudaDeCusto() {
          return ajudaDeCusto;
        }

        public void setAjudaDeCusto(double ajudaDeCusto) {
          this.ajudaDeCusto = ajudaDeCusto;
        }

        @Override
        public double calcularSalario() {
          return super.calcularSalario() + ajudaDeCusto;
        }
      }

    }

    class TesteAdministrador {
      public static void main(String[] args) {
        Administrador administrador = new Administrador("Maria", "Rua das Laranjeiras, 456", "(11) 91234-5678", 100, 5000,
            10, 1000);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário: " + administrador.calcularSalario());
      }


    
}
