/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

public class Trabalho extends Avaliacao {
    private int tempoEsp;
    private AlunoTrab[] notas;
    
    public Trabalho(String nome, Data dtAplic, double valor, int tempoEsp,  AlunoTrab[] notas){
        super(nome,dtAplic,valor);
        this.tempoEsp = tempoEsp;
        this.notas = notas;        
    }
    
    @Override
    public double nota(int index){
        
        return notas[index].notaTotal(super.dtAplic, tempoEsp, super.valor);
    }
}
    

