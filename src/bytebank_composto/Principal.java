package bytebank_composto;

public class Principal {

	public static void main(String[] args) {
		// 1ª forma de associação
		/*
		Cliente cliente1 = new Cliente(); //variável temporária
		Endereco enderecoCliente1 = new Endereco();
		Conta contaCliente1 = new Conta();
		
		cliente1.nome = "Paulo Silveira";
		cliente1.cpf = "111.111.111-11";
		cliente1.profissao = "Programador";
		
		enderecoCliente1.logradouro = "Rua a";
		enderecoCliente1.numero = "1";
		enderecoCliente1.complemento = "casa";
		enderecoCliente1.bairro = "Centro";
		enderecoCliente1.cidade = "Vila Velha";
		enderecoCliente1.cep = "29000-000";
		
		contaCliente1.titular = cliente1; //composição de objetos
		contaCliente1.titular.endereco = enderecoCliente1;
		
		System.out.println(contaCliente1.titular.nome);
		System.out.println(contaCliente1.titular.endereco.logradouro);
		*/
		
		//2ª Forma de associação
		/*
		Conta contaCliente1 = new Conta();//instância de conta
		contaCliente1.titular = new Cliente(); //composição; instância de Cliente.titular
		contaCliente1.titular.nome = "Paulo Silveira";
		*/
		
		/*
		3ª forma. Observar que na classe Conta, o atributo titular do tipo Cliente
		é inicializada com new Cliente().
		Ou seja, temos acesso aos atributos de Cliente a partir de Conta
		*/
		Conta contaCliente1 = new Conta();
		contaCliente1.titular.nome = " Paulo Silveira";
		String endereço = contaCliente1.titular.endereco.logradouro = "Rua A";
		
		System.out.println(contaCliente1.titular.nome);
		System.out.println(endereço);
		
	}

}
