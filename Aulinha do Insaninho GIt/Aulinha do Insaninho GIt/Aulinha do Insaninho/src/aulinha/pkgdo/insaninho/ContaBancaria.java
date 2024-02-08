public class ContaBancaria {
    private double saldo;
    private int numeroConta;
    private String nome;
    private long cpf;
   
    public ContaBancaria (double saldo,int numeroConta, String nome, long cpf) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.cpf = cpf;
    }
    public void sacar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque De "+ valor + " Realizado com Sucesso.");
        } else {
            System.out.println("Saldo INSUFICIENTE para o saque.");
        }
    }
    
    public void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " Realizado com sucesso.");
        } else {
            System.out.println("Valor de Depósito invalido.");        
    }
}

  public void exibirSaldo() {
     System.out.println("Informações da Conta:");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nome);
        System.out.println("CPF do Titular: " + cpf);
        System.out.printf("Saldo Atual: %.2f\n", saldo);
} 
}
    
   