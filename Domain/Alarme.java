
package Domain;

import Domain.Enum.TipoEstado;
import Domain.Enum.TipoSeveridade;

/**
 *
 * @author Leandro
 */
public class Alarme {

    private Equipamento equipamento;
    private Sensor sensor;
    private TipoSeveridade severidadade;
    private TipoEstado estado;
    private double valorMedido;
    private double desvio;

    public Alarme(Equipamento equipamento, Sensor sensor, TipoSeveridade severidadade, TipoEstado estado, double valorMedido) {
        this.equipamento = equipamento;
        this.sensor = sensor;
        this.severidadade = severidadade;
        this.estado = estado;
        this.valorMedido = valorMedido;

    }
    

    
}
