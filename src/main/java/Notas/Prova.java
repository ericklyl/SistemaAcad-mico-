/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

public class Prova extends Avaliacao{
    
    private int nQuestoes;
    private AlunoProva[] notas;
    
    public Prova(String nome, Data dtAplic, double valor, int nQuestoes, AlunoProva[] notas){
        super(nome,dtAplic,valor);
        this.nQuestoes = nQuestoes;
        this.notas = notas;
    }
    
    @Override
    public double nota(int index) {

        return notas[index].notaTotal();       

        }

}

