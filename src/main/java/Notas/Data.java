/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

/**
 *
 * @author User
 */
public class Data {
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    protected boolean posterior(Data d2){
        if(this.ano > d2.ano){
            return true;
        }
        else if(this.ano < d2.ano){
            return false;
        }
        
        else{
            if(this.mes > d2.mes){
                return true;
            }
            else if(this.mes < d2.mes){
                return false;
            }
            else{
                return this.dia > d2.dia;
            }
        }
    }
}
