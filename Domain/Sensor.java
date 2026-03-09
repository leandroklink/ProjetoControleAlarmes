
package Domain;

import Domain.Enum.TipoEstado;
import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private String tipo; //temperatura, pressao
    private double limiteMaximo;
    private double limiteMinimo;
    private TipoEstado estado;
    private Equipamento equipamento;
    private List<Medicao> historico = new ArrayList<>();
    private static final int LIMITE_HISTORICO = 1000;
    

    
    
    public Sensor(String tipo, double limiteMaximo, double limiteMinimo, TipoEstado estado, Equipamento equipamento) {
        this.tipo = tipo;
        this.limiteMaximo = limiteMaximo;
        this.limiteMinimo = limiteMinimo;
        this.estado = estado;
        this.equipamento = equipamento;
    }

    public double MedirSensor(double valor){
        if (this.estado.equals(TipoEstado.ATIVO)){
            if (valor < this.limiteMinimo || valor > this.limiteMaximo){
                if (valor > this.limiteMaximo){
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
    
    public void registrarMedicao(double valor){ //função para registrar histórico
        historico.add(new Medicao(valor));
        if (historico.size()> LIMITE_HISTORICO){
            historico.remove(0);
        }
    }
    
    
    public Medicao getUltimaMedicao(){ //coletar ultima medicao
        if (historico.isEmpty()) return null;
        return historico.get(historico.size() - 1);
    }
    
    public double media(){
        return historico.stream().mapToDouble(Medicao::getValor).average().orElse(0);
    }
    
    public double maximo(){
        return historico.stream().mapToDouble(Medicao::getValor).max().orElse(0);
    }
    
    public boolean tendenciaSubindo() {
        if (historico.size() < 3) return false;

        int n = historico.size();
        return historico.get(n-3).getValor()
             < historico.get(n-2).getValor()
             && historico.get(n-2).getValor()
             < historico.get(n-1).getValor();
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

    public List<Medicao> getHistorico() {
        return List.copyOf(historico);
    }
    
    
    


}
