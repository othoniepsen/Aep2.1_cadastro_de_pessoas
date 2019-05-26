package CadastroDePessoas;


public class App {
	
	public static void main(String[] args) {
		

//		Cpf cpf1 = new Cpf("07017615980");
//		Cpf cpf2 = new Cpf("070.176.159-80");
		
//		System.out.println("cpf: " + cpf1.imprimeCpf());
//		System.out.println("cpf: " + cpf2.imprimeCpf());
		
//		Cnpj cnpj1 = new Cnpj("58.639.663/0001-30");
//		Cnpj cnpj2 = new Cnpj("74884654000161");
//		Cnpj cnpj3 = new Cnpj("74884654700161");
		
//		System.out.println(cnpj1.imprimeCnpj());
//		System.out.println(cnpj2.imprimeCnpj());
		
		Juridica empresaSA = new Juridica(new Nome("Empresa S/A"), new Cnpj("58.639.663/0001-30"), 
										 new CapitalSocial(500000));
//		System.out.println("ID: " + empresaSA.getId() + "\nNome: " + empresaSA.getNome() + "\nCNPJ: " + 
//							empresaSA.getCnpj() + "\nCapital Social: R$" + empresaSA.getCapitalSocial());
		
		
		
		Fisica marianete = new Fisica(new Nome("Marianeta Severina"), new Cpf("07017615980"), new Rg("78893947292"));
		
//		System.out.println("ID: " + marianete.getId() + "\nNome: " + marianete.getNome() + "\nCPF: " + 
//				marianete.getCpf() + "\nRG: " + marianete.getRg());
		
		Fisica reginalda = new Fisica(new Nome("Reginalda Ferri"), new Cpf("07017615980"), new Rg("845522233644"));
		Fisica severino = new Fisica(new Nome("Severino CostaCurta"), new Cpf("070.176.159-80"), new Rg("54888966655"));
		
		empresaSA.adicionarSocio(reginalda, new PercentualDeParticipacao(30));
		
//		empresaSA.adicionarSocio(severino, new PercentualDeParticipacao(80));
		
		empresaSA.adicionarSocio(severino, new PercentualDeParticipacao(25));
		
		empresaSA.removerSocio(reginalda);
		
		empresaSA.adicionarSocio(marianete, new PercentualDeParticipacao(60));
		
		
		
		

		
		
		
		

		
		
		
		
	}

}
