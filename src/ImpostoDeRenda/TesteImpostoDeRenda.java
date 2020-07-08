package ImpostoDeRenda;

public class TesteImpostoDeRenda {

	public static void main(String[] args) {
			
	    	PessoaFisica p1  = new PessoaFisica();
	    	p1.setNome("contribuente");
	    	p1.setRendaBruta(1000);
	    	p1.setCpf("845.504.689-7");
	    	
	    	PessoaJuridica p2 = new PessoaJuridica();
	    	p2.setNome("contribuente01");
	    	p2.setRendaBruta(3000);
	    	p2.setCnpj("28855.5518/5588.6");
	    	
	    	PessoaFisica p3 = new PessoaFisica();
	    	p3.setNome("contribuente02");
	    	p3.setRendaBruta(3700);
	    	p1.setCpf("865.509.689-1");
	    	
	    	PessoaJuridica p4 = new PessoaJuridica();
	    	p4.setNome("contribuente03");
	    	p4.setRendaBruta(4000);
	    	p4.setCnpj("286524.5518/5588.6");
	    	
	    	Contribuente[] contribuentes = new Contribuente [4];
	    	contribuentes[0] = p1;
	    	contribuentes[1] = p2;
	    	contribuentes[2] = p3;
	    	contribuentes[3] = p4;
	    	
	    	for(Contribuente c: contribuentes) {
	    		System.out.println(c.toString());
	    	}
		}
}
