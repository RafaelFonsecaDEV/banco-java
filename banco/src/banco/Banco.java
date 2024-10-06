package banco;

public class Banco {

	private int conta;
	private String nome;
	private double deposito;

	public Banco() {

	}

	public Banco(int conta, String nome) {

		this.conta = conta;
		this.nome = nome;

	}

	public Banco(int conta, String nome, double depositoinicial) {

		this.conta = conta;
		this.nome = nome;
		deposito = (depositoinicial);
	}

	public double getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDeposito() {
		return deposito;
	}

	public void deposito(double dinheiro) {
		deposito += dinheiro;

	}

	public void sacar(double dinheiro) {
		deposito -= dinheiro + 5.0;
	}

	public String toString() {
		return "  Banco " + conta + "  nome" +  nome + "  deposito:  $" + String.format("%.2f", deposito);
	}

}
