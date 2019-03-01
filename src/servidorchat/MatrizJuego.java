
package servidorchat;

import java.util.Observable;

public class MatrizJuego extends Observable{

    private String matriz;
    
    public MatrizJuego(){
    }
    
    public String getMatriz(){
        return matriz;
    }
    
    public void setMatriz(String matriz){
        this.matriz = matriz;

        this.setChanged();
        this.notifyObservers(this.getMatriz());
    }
}