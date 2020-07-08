package contaBancaria;

public class TesteContaBancaria {

	public static void main(String[] args) {

		System.out.println("#### TESTE CONTA BANCARIA ####");
		ContaBancaria contasimples = new ContaBancaria();
		contasimples.setNomeCliente("cliente conta simples");
		contasimples.setNumConta("1458965855");

		contasimples.depositar(100);
		realizarSaque(contasimples, 50);
		realizarSaque(contasimples, 70);

		System.out.println(contasimples);
		System.out.println("..................................");

		
		System.out.println("#### TESTE CONTA POUPANÇA ####");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("cliente conta poupança");
		contaPoupanca.setNumConta("2222222222222");

		contaPoupanca.depositar(100);
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
		contaPoupanca.setDiaRendimento(100);
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println(" redimento aplicado, novo saldo é de =  " + contaPoupanca.getSaldo());
		} else {
			System.out.println("hoje não e dia de rendimento");
		}

		System.out.println(contaPoupanca);
		System.out.println(".............................................");

		
		
		System.out.println("#### TESTE CONTA ESPECIAL ####");
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("cliente conta espeical");
		contaEspecial.setNumConta("8888888888888");
		contaEspecial.setLimite(50); 
		
		contaEspecial.depositar(100);
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial,80);
		


	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("saque efetuado com sucesso: " + conta.getSaldo());
		} else {
			System.out.println("saldo insuficiente para saque de " + valor + "saldo e = " + conta.getSaldo());
		}
	}
}
