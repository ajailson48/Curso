package serasa.ExerciciosPOO;

public class Ex4 {

    public class ContaCorrente {
        protected double saldo;

        public ContaCorrente(int numero, double saldoInicial) {
          this.saldo = saldoInicial;
        }

        public void depositar(double valor) {
          saldo += valor;
        }

        public boolean sacar(double valor) {
          if (saldo >= valor) {
            saldo -= valor;
            return true;
          } else {
            return false;
          }
        }

        public double getSaldo() {
          return saldo;
        }
      }

      public class ContaEspecial extends ContaCorrente {
        private double limite;

        public ContaEspecial(int numero, double saldoInicial, double limite) {
          super(numero, saldoInicial);
          this.limite = limite;
        }

        public boolean sacar(double valor) {
          if (saldo + limite >= valor) {
            saldo -= valor;
            return true;
          } else {
            return false;
          }
        }
      }

    }

    class TesteIngressosContas {
      public static void main(String[] args) {
          
        Ingresso ingresso = new Ingresso(50);
        IngressoVIP ingressoVIP = new IngressoVIP(50, 20);

        System.out.println("Valor do ingresso normal: " + ingresso.getValor());
        System.out.println("Valor do ingresso VIP: " + ingressoVIP.getValor());

        ContaCorrente conta = new ContaCorrente(123, 1000);
        ContaEspecial contaEspecial = new ContaEspecial(456, 1000, 500);

        boolean saqueConta = conta.sacar(1100);
        boolean saqueContaEspecial = contaEspecial.sacar(1100);

        System.out.println("Saque na conta corrente: " + (saqueConta ? "Sucesso" : "Saldo insuficiente"));
        System.out.println("Saque na conta especial: " + (saqueContaEspecial ? "Sucesso" : "Saldo insuficiente"));

        System.out.println("Saldo da conta corrente: " + conta.getSaldo());
        System.out.println("Saldo da conta especial: " + contaEspecial.getSaldo());
      }
    
}
