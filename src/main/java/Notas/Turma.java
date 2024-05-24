/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

public class Turma {
    private String nome;
    private int ano;
    private int sem;
    private Professor p;
    private Aluno[] alunos;
    private Avaliacao[] avs;
    
    public Turma(String nome, int ano, int sem, Professor p, Aluno[] alunos, Avaliacao[] avs){
        this.nome = nome;
        this.ano = ano;
        this.sem = sem;
        this.p = p;
        this.alunos = alunos;
        this.avs = avs;
    }
    
    public void medias(){
        
        double mediaTurma = 0.0;
        
        System.out.println("Medias da Turma" + nome + "(" + ano + "/" + sem + "):");
        
        for(int j = 0; j < alunos.length; j++){
            double notaTotal = 0.0;
            System.out.print(alunos[j].toString() + ": ");
                
            for(int i = 0; i < avs.length; i++) {
                notaTotal += avs[i].nota(j);
                System.out.print(avs[i].nota(j) + " ");
            }
            double mediaAluno = notaTotal / avs.length;
            
            if (notaTotal > 100){
                notaTotal = 100;
            }
                System.out.println(" = " + notaTotal);

            mediaTurma += notaTotal;
        }
        
        mediaTurma = mediaTurma / alunos.length;
        System.out.println("Média da turma: " + mediaTurma);
    }
    
}
    


