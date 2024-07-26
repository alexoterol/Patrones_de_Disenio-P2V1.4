/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.diseniop2v14.Parrafo2;

/**
 *
 * @author alexo
 */
public class ContextoTransporte {
    private Strategy strategy;
    
    public void setStrategy(Strategy str){
        this.strategy = str;
    }
    public void doSomething(){
        strategy.doSomething();
    }
    
}
