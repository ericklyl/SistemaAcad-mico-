/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

public class Aluno extends Pessoa {
    
    private String mat;
    
    public Aluno(String nome, String cpf, String mat){
        super(nome,cpf);
        this.mat = mat;
    }
    
    public String toString(){
        return nome + " (Matricula: " + mat + ")";
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }  
}
