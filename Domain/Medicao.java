/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.time.LocalDateTime;

/**
 *
 * @author Leandro
 */
public class Medicao {
    private double valor;
    private LocalDateTime dataHora;
    
    public Medicao(double valor){
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
        
    }
    
    public double getValor(){
        return valor;
    }
    
    public LocalDateTime getDataHora(){
        return dataHora;
    }
}
