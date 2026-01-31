
package Gerenciador;

import Domain.Equipamento;
import java.util.ArrayList;


public class Gerenciador {
    ArrayList<Equipamento> BancoDeDados = new ArrayList<>();

    
    public void Armazenar(Equipamento equipamento){
        BancoDeDados.add(equipamento);
    }
    
    public void BuscarEquipamento(double id){
        for (Equipamento e : BancoDeDados){
            if(e.equals(id)){
            System.out.printf("""
                               ID: %f\n
                               Tipo: %s\n
                               """, e.getId(), e.getTIpo());
            }else{
                System.out.printf("Não disponível Equipamento com o ID: %s",id);
            }
        }
    }
}
