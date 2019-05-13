package CadastroDePessoas;

public class App {
	
	public static void main(String[] args) {
		
		Fisica pessoa1 = new Fisica("alberto", "09372937292", "837367282");
		
		System.out.println("id: " + pessoa1.getId() + ", nome: " + pessoa1.getNome() + ", rg: " +
		pessoa1.getRg() + ", cpf: " + pessoa1.getCpf());
		
		Juridica pessoaJur1 = new Juridica("Renato guadalahara", "0754512226544", 500);
		Juridica pessoaJur2 = new Juridica("Brenda serenda", "666555544444", 250);
		
		Fisica pessoa2 = new Fisica("Gonzalo ferri", "4588844222", "5566444222");
		Fisica pessoa3 = new Fisica("Clemendes antunes", "3216541222", "4455899999");

		pessoaJur1.adicionarSocio(pessoa1, 20);
		
		pessoaJur1.adicionarSocio(pessoa2, 10);
		
		pessoaJur1.adicionarSocio(pessoaJur2, 12);

		pessoaJur1.adicionarSocio(pessoaJur1, 100);
		
		pessoaJur1.removerSocio(pessoa3);
		
		
		
		
		
		
		
		
		
	}

}
