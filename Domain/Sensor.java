
package Domain;

import Domain.Enum.TipoEstado;
import Domain.Enum.TipoSeveridade;

/**
 *
 * @author Leandro
 */
public class Sensor {
    private Equipamento equipamento;
    private Alarme[] alarme;
    private String tipo; //temperatura, pressao
    private double desvio;
    private TipoSeveridade severidade;
    private double limiteMaximo;
    private double limiteMinimo;
    private TipoEstado estado;
    
    public Sensor(Equipamento equipamento, Alarme[] alarme, String tipo, double desvio, double limiteMaximo, double limiteMinimo, TipoEstado estado) {
        this.equipamento = equipamento;
        this.alarme = alarme;
        this.tipo = tipo;
        this.desvio = desvio;
        this.limiteMaximo = limiteMaximo;
        this.limiteMinimo = limiteMinimo;
        this.estado = estado;

    }
    
    public TipoSeveridade CalculaSensor(double valor, double desvio, double limiteMaximo, double limiteMinimo, TipoEstado estado){
        if (estado == TipoEstado.ATIVO ){
            if (valor > limiteMaximo){
                if ((valor * 0.05) > limiteMaximo){
                    if ((valor * 0.15) > limiteMaximo){
                        return TipoSeveridade.CRITICA;
                    }else{
                        return TipoSeveridade.MEDIA;
                    }
                }else{
                    return TipoSeveridade.BAIXA;
                }
        }else{
            return null; 
                }
            }
        else{
            return null;
        }
        }

    public Alarme[] getAlarme() {
        return alarme;
    }

    public void setAlarme(Alarme[] alarme) {
        this.alarme = alarme;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDesvio() {
        return desvio;
    }

    public void setDesvio(double desvio) {
        this.desvio = desvio;
    }

    public TipoSeveridade getSeveridade() {
        return severidade;
    }


    public double getLimiteMaximo() {
        return limiteMaximo;
    }

    public void setLimiteMaximo(double limiteMaximo) {
        this.limiteMaximo = limiteMaximo;
    }

    public double getLimiteMinimo() {
        return limiteMinimo;
    }

    public void setLimiteMinimo(double limiteMinimo) {
        this.limiteMinimo = limiteMinimo;
    }
}
