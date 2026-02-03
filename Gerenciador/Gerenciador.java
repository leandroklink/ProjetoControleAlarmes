
package Gerenciador;

import Domain.Alarme;
import Domain.Enum.TipoEstado;
import Domain.Enum.TipoSeveridade;
import Domain.Equipamento;
import java.util.ArrayList;

import Domain.Sensor;
import java.util.Collections;
import java.util.Comparator;

public class Gerenciador {
    ArrayList<Alarme> alarmes = new ArrayList<>();

    public void VerificaSensor(Sensor sensor, double valor){
        
        
        double verifica = sensor.MedeSensor(valor);
        
        if(verifica == 0.0){
            return;
        }
        
        double desvio = Math.abs(verifica);//deixa o valor positivo se estiver negativo, e continua positivo se for positivo
        TipoSeveridade severidade = TipoSeveridade.BAIXA;
        

        if (desvio <= 5){
            severidade = TipoSeveridade.BAIXA;
        }else if (desvio <= 10){
            severidade = TipoSeveridade.MEDIA;
        }else{
            severidade = TipoSeveridade.CRITICA;
        }
        if (existeAlarmeAtivo(sensor)){
            return;
        }
        
        Alarme alarme = new Alarme(
   sensor.getEquipamento(),
            sensor,
  severidade,
      TipoEstado.ATIVO,
   desvio);    

        alarmes.add(alarme);
    
    }
    
    public void ListarAlarmes(){
        if (alarmes.isEmpty()){
            System.out.println("SEM ALARMES.");
            return;
        }
        Collections.sort(alarmes,Comparator.comparing(Alarme::getSeveridadade,Comparator.nullsLast(Comparator.naturalOrder())));

        
        for(Alarme a : alarmes){
            System.out.println(a.toString());
        }
    }


    private boolean existeAlarmeAtivo(Sensor sensor){
        for (Alarme a : alarmes){
            if (a.getSensor().equals(sensor) && a.getEstado() == TipoEstado.ATIVO){
                return true;
            }
        }
        return false;
    }

}