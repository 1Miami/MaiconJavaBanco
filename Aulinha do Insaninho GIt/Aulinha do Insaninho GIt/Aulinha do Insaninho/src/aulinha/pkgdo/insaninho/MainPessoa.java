/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulinha.pkgdo.insaninho;

/**
 *
 * @author Aluno TDS
 */
public class MainPessoa {
    public static void MainPessoa(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25, "São Paulo");

        System.out.println("Informações Iniciais:");
        pessoa.exibirInformacoes();

        System.out.println("\nAtualizando Idade:");
        pessoa.atualizarIdade(26);
        pessoa.exibirInformacoes();
    }
}
