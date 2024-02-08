public class main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(10000000, 123456, "Insano", 619933218L);
                
        minhaConta.exibirSaldo();
        
        System.out.println("\nDepósito de 1 Realizado:");
        minhaConta.depositar(1);
        minhaConta.exibirSaldo(); 

        System.out.println("\nSaque de 2000000 Realizado:");
        minhaConta.sacar(2000000);
        minhaConta.exibirSaldo();
        
    }
}
