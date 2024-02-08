package aulinha.pkgdo.insaninho;

public class ManiLivro {
    public static void main(String[] args) {
       
        Livro livro1 = new Livro("Insaninho","Leonardo Lopes" , 2024);
        
        System.out.println("Informações iniciais do livro:");
        livro1.exibirInformacoes();

        livro1.atualizarAno(2022);

        System.out.println("\nInformações atualizadas do livro:");
        livro1.exibirInformacoes();

        System.out.println("Título do livro: " + livro1.getTitulo());
        System.out.println("Autor do livro: " + livro1.getAutor());
        
        livro1.setAutor("Joanne Rowling");


        System.out.println("\nInformações do livro após a modificação:");
        livro1.exibirInformacoes();
    }
}
