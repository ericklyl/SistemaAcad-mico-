/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

public class AlunoProva {
    
    private Aluno aluno;
    private double[] notas;
    
    public AlunoProva(Aluno aluno, double[] notas){
        this.aluno = aluno;
        this.notas = notas;
    }
    
    protected double notaTotal(){
        double total = 0.0;
        for(int i = 0; i < this.notas.length; i++){
            total += this.notas[i];
        }
        return total;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public double[] getNotas() {
        return notas;
    }
}
