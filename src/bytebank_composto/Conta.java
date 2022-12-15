package bytebank_composto;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	//Cliente titular; //associação: toda conta tem um cliente; sem valor default
	Cliente titular = new Cliente();//com valor default
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public String saca(double valor) {
		if(this.saldo > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return "Saque concluído";
		}else {
			return "Valor indisponível para saque!";
		}
	}
	
	public String transfere(double valor, Conta contaDestino) {
		if(this.saldo >= valor) {
			contaDestino.deposita(valor);
			
			return "Transferência de R$" 
					+ valor 
					+ " Reais realizada para "
					+ contaDestino.titular;
		}else {
			return "Valor indisponível para transferência!";
		}
	}

}
