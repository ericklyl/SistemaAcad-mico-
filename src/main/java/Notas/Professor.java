/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

public class Professor extends Pessoa {
    
    private double salario;
            
    public Professor(String nome, String cpf, double salario){
        super(nome,cpf);
        this.salario = salario;
    }
    
    public String toString(){
        return nome + " (CPF: " + cpf + ")";
    }
    
}
