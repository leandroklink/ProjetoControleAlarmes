
package Domain;

import Domain.Enum.TipoEstado;
import Domain.Enum.TipoSeveridade;

/**
 *
 * @author Leandro
 */
public class Alarme {
    private Sensor sensor;
    private String descricao;
    

    public Alarme(Sensor sensor, String descricao, TipoEstado estado) {
        this.sensor = sensor;
        this.descricao = descricao;


    }

   
    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    
}
