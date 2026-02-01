
package Domain;

import Domain.Enum.TipoEstado;



/**
 *
 * @author Leandro
 */
public class Sensor {
    private String tipo; //temperatura, pressao
    private double limiteMaximo;
    private double limiteMinimo;
    private TipoEstado estado;
    private Equipamento equipamento;

    public Sensor(String tipo, double limiteMaximo, double limiteMinimo, TipoEstado estado, Equipamento equipamento) {
        this.tipo = tipo;
        this.limiteMaximo = limiteMaximo;
        this.limiteMinimo = limiteMinimo;
        this.estado = estado;
        this.equipamento = equipamento;
    }

    public double MedeSensor(double valor){
        if (this.estado.equals(TipoEstado.ATIVO)){
            if (valor < this.limiteMinimo || valor > this.limiteMaximo){
                if (valor < this.limiteMaximo){
                    return valor - this.limiteMaximo;
                }else{
                    return this.limiteMinimo - valor;
                }
            }else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public TipoEstado getEstado() {
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    


}
