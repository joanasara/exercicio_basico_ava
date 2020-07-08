package contaBancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "diaRendimento= " + diaRendimento + "" + super.toString();

	}

	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
}
