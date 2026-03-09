/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulacao;

import Domain.Enum.TipoEstado;
import Domain.Equipamento;
import Domain.Sensor;
import Gerenciador.Gerenciador;


/**
 *
 * @author Leandro
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        
        //equipamento e sensor 1
        Equipamento equip1 = new Equipamento(29234, "Tanque Pré-Evaporado", "Tratamento de Caldo");
        Sensor sensor1 = new Sensor("Nível",90.0, 20.0, TipoEstado.ATIVO, equip1);
        
        //equipamento e sensor 2
        Equipamento equip2 = new Equipamento(1324, "Gerador de energia 1", "Central Elétrica");
        Sensor sensor2 = new Sensor("Teemperatura de saída de ar",80.0,30.0, TipoEstado.ATIVO, equip2);
        
        //equipamento e sensor 3
        Equipamento equip3 = new Equipamento(929, "Pré Evaporador 5", "Evaporação");
        Sensor sensor3 = new Sensor("Pressão da Calandra",0.5, 0.05, TipoEstado.ATIVO, equip3);
        
        //equipamento e sensor 4
        Equipamento equip4 = new Equipamento(117, "Tanque de Soda", "Destilaria");
        Sensor sensor4 = new Sensor("Nível",60.0,0, TipoEstado.INATIVO, equip4);
        
        //equipamento e sensor 5
        Equipamento equip5 = new Equipamento(473, "Turbina Gerador de energia 2", "Central Elétrica");
        Sensor sensor5 = new Sensor("Temperatura: Eixo Alta - lado não acoplado",85.0,20.0, TipoEstado.ATIVO, equip5);
        Sensor sensor5_2 = new Sensor("Temperatura: Eixo Alta - lado acoplado",85.0,20.0, TipoEstado.ATIVO, equip5);
        

        
        //Criação de gerenciador
        Gerenciador gerenciador = new Gerenciador();
        
        
        for (int i = 0; i < 20; i++) {

            gerenciador.VerificaSensor(sensor1, 80 + Math.random()*20);
            gerenciador.VerificaSensor(sensor2, 60 + Math.random()*40);
            gerenciador.VerificaSensor(sensor3, 0.05 + Math.random()*0.4);
            gerenciador.VerificaSensor(sensor4, 80 + Math.random()*20);
            gerenciador.VerificaSensor(sensor5, 70 + Math.random()*40);
            gerenciador.VerificaSensor(sensor5_2, 85 + Math.random()*40);

            Thread.sleep(1000);
        }

        
        

        
        sensor5.getHistorico().forEach(m -> System.out.println(m.getDataHora() + " - > " + m.getValor()));
        
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        gerenciador.ListarAlarmes();
        
        
        
    }
}
