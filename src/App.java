public class App {
	public static void main(String[] args) throws Exception {
		// cria cliente edson
		Cliente edson = new Cliente();
		edson.setNome("Edson");

		Conta cc_edson = new ContaCorrente(edson);
		Conta poupanca_edson = new ContaPoupanca(edson);

		// cria cliente rosalia
		Cliente rosalia = new Cliente();
		rosalia.setNome("Rosalia");

		Conta cc_rosalia = new ContaCorrente(rosalia);
		Conta poupanca_rosalia = new ContaPoupanca(rosalia);

		// cria transações
		cc_edson.depositar(1000.99);
		cc_edson.transferir(350.55, poupanca_rosalia);

		// exibe extratos
		cc_edson.imprimirExtrato();
		poupanca_edson.imprimirExtrato();
		cc_rosalia.imprimirExtrato();
		poupanca_rosalia.imprimirExtrato();

	}
}
