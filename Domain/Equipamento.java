
package Domain;

import Gerenciador.Gerenciador;

public class Equipamento {
    
    private int id;
    private String tipo;
    private String setor;
    private Sensor[] sensor;
    private Gerenciador gerenciador;



    public Equipamento(int id, String tipo, String setor, Sensor[] sensor){
        this.id = id;
        this.tipo = tipo;
        this.setor = setor;
        this.sensor = sensor;
        
    }
    
    public Equipamento(int id, String tipo, String setor){
        this.id = id;
        this.tipo = tipo;
        this.setor = setor;
    }
    
    public void imprimeRelatorio(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Sensor[] getSensor() {
        return sensor;
    }

    public void setSensor(Sensor[] sensor) {
        this.sensor = sensor;
    }

 

}

