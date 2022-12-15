package bytebank_composto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente();
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

	}

}
