public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
		cliente.setNome("Edson");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(1000.99);
		cc.transferir(350.55, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
