
package Domain;


import java.util.ArrayList;

public class Equipamento {
    
    private int id;
    private String tipo; //motor, bomba, painel
    private String setor;
    ArrayList<Sensor> sensores = new ArrayList<>();




    public Equipamento(int id, String tipo, String setor){
        this.id = id;
        this.tipo = tipo;
        this.setor = setor;
        
    }
    


}

