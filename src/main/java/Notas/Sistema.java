/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

public class Sistema {
    private int nProfs;
    private int nAlunos;
    private Professor[] profs = new Professor[100];
    private Aluno[] alunos = new Aluno[1000];
            
    public void novoProf(Professor p){
        
        if(this.nProfs < 100){
            this.profs[nProfs] = p;
            this.nProfs++;
        }
        else{
            System.out.println("Limite de professores atingidos! ");
            System.out.println("Número cadastrado de profs: " + this.nProfs);
        }
    }
    
    public void novoAluno(Aluno a){
        
        if (this.nAlunos < 1000){
            this.alunos[this.nAlunos] = a;
            this.nAlunos++;
        }
        else{
            System.out.println("Limite de professores atingidos! ");
            System.out.println("Número cadastrado de alunos: " + this.nAlunos);
        } 
    }
    
    public Professor encontrarProfessor(String c){
        
        Professor prof = null;
        
        if(nProfs > 0){
            for(int p = 0; p < nProfs; p++){
                if(profs[p].cpf.equals(c)){
                    prof = profs[p];
                    break;
                }
            }
        }
        
        return prof;
    }
    
    public Aluno encontrarAluno(String mat){
        
        Aluno aluno = null;
        
        if(nAlunos > 0){
            for(int a = 0; a < nAlunos; a++){
                if(alunos[a].getMat().equals(mat)){
                    aluno = alunos[a];
                    break;
                }
            }
        }
        return aluno;   
    }
    
    public void listarProfs(){
        
        if(this.nProfs > 0){
            for(int p = 0; p < nProfs; p++){
                System.out.println(profs[p].toString());
            }
        }
        else{
            System.out.println("Não há professores no Sistema!");
        } 
        
    }
    
    public void listarAlunos(){

        if(this.nAlunos > 0){
            for(int a = 0; a < nAlunos; a++){
                System.out.println(alunos[a].toString());
            }
        }
        else{
            System.out.println("Não há alunos cadastrados no Sistema!");
        } 
    }
    
}
