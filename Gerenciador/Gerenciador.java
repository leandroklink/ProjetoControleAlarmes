
package Gerenciador;

import Domain.Alarme;
import Domain.Enum.TipoEstado;
import Domain.Enum.TipoSeveridade;
import Domain.Equipamento;
import java.util.ArrayList;

import Domain.Sensor;

public class Gerenciador {
    ArrayList<Alarme> alarmes = new ArrayList<>();

    public void VerificaSensor(Sensor sensor, double valor){
        double verifica = sensor.MedeSensor(valor);
        if(verifica == 0.0){
            System.out.printf("Sem alarmes para o sensor: %s", sensor.getTipo());
        }else if (verifica <= 5){
            Alarme alarme = new Alarme(sensor.getEquipamento(), sensor.getTipo(), TipoSeveridade.BAIXA, TipoEstado.ATIVO, verifica);
            alarmes.add(alarme);
                                 //Equipamento equipamento, Sensor sensor, TipoSeveridade severidadade, TipoEstado estado, double valorMedido
        }else if (verifica <= 10){
            Alarme alarme = new Alarme(sensor.getEquipamento(), sensor.getTipo(), TipoSeveridade.MEDIA, TipoEstado.ATIVO, verifica); 
            alarmes.add(alarme);
        }else if (verifica <= 20){
            Alarme alarme = new Alarme(sensor.getEquipamento(), sensor.getTipo(), TipoSeveridade.CRITICA, TipoEstado.ATIVO, verifica);  
            alarmes.add(alarme);
        }
        
    }

}
