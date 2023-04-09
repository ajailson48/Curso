package serasa.ExerciciosPOO;

public class Ex3 {

    public class Ingresso {
	    private double valor;

	    public void setValor(double valor) {
	      this.valor = valor;
	    }

	    public double getValor() {
	      return this.valor;
	    }

	    public String toString() {
	      return "Ingresso com valor de R$ " + this.valor;
	    }
	  }

	  public class IngressoVIP extends Ingresso {
	    private double valorAdicional;

	    public void setValorAdicional(double valorAdicional) {
	      this.valorAdicional = valorAdicional;
	    }

	    public double getValorAdicional() {
	      return this.valorAdicional;
	    }

	    public String toString() {
	      return "Ingresso VIP com valor de R$ " + (this.getValor() + this.valorAdicional);
	    }
	  }
    
}
