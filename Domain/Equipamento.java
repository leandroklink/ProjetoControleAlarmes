
package Domain;
import java.util.ArrayList;

public class Equipamento {
    
    private int id;
    private String tipo;
    private String setor;
    private Sensor[] sensor;
    private Alarme[] alarme;



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

    public int getId(){
        return this.id;
    }
    public String getTIpo(){
        return this.tipo;
    }


}

