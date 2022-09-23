public class Main {
    public static void main(String[] args) throws Exception {

        ContaBanco contaCorrente = new ContaBanco("10",1,"igor");
        ContaBanco contaPoupanca = new ContaBanco("11",2,"Louis");

        System.out.println("Abrindo conta");
        contaCorrente.abrirConta();
        contaPoupanca.abrirConta();
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Depositando valores");
        contaCorrente.depositar(100.0);
        contaPoupanca.depositar(100.0);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Sacando valores");
        contaCorrente.sacar(50.0);
        contaPoupanca.sacar(50.0);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Pagando mensalidade");
        contaCorrente.pagarMensalidade();
        contaPoupanca.pagarMensalidade();
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Sacar tudo e fechar conta.");
        contaCorrente.sacar(88.0);
        contaPoupanca.sacar(180.0);
        contaCorrente.fecharConta();
        contaPoupanca.fecharConta();
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
        System.out.println("-----------------------------------------------------------------");
    }
}