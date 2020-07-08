package ImpostoDeRenda;

public class PessoaJuridica extends Contribuente {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		
		return this.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		return "PessoaJuridica: cnpj=" + cnpj + super.toString();
	}

	
    
}
