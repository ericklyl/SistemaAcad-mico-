/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

public class AlunoTrab {
    private Aluno aluno;
    private double nota;
    private Data dtEntrega;
    private int tempoExec;
    
    public AlunoTrab(Aluno aluno, double nota, Data dtEntrega, int tempoExec){
        this.aluno = aluno;
        this.nota = nota;
        this.dtEntrega = dtEntrega;
        this.tempoExec = tempoExec;
    }
    
    protected double notaTotal(Data prazo, int tempoEsp, double valor){
        double notaFinal = nota;
        
        if(dtEntrega.posterior(prazo)){
            notaFinal *= 0.8; //Aluno receberá só 80% da nota total
        }
        else {
            if (nota == valor && tempoExec < tempoEsp){
                notaFinal += 2;
            }  
        }
        
        return notaFinal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public double getNota() {
        return nota;
    }

    public Data getDtEntrega() {
        return dtEntrega;
    }

    public int getTempoExec() {
        return tempoExec;
    }

}
