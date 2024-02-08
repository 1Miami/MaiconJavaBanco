package aulinha.pkgdo.insaninho;

    public class MainCarro {
    public static void MainCarro(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

        System.out.println("Informações Iniciais:");
        meuCarro.exibirInformacoes();

        System.out.println("\nAtualizando Ano:");
        meuCarro.atualizarAno(2022);
        meuCarro.exibirInformacoes();
    }
}

