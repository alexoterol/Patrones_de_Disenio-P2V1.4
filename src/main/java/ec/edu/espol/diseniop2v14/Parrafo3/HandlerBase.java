/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.diseniop2v14.Parrafo3;

/**
 *
 * @author alexo
 */
public class HandlerBase implements Handler{
    private Handler next;
    
    @Override
    public void handle() {
        if(this.next!=null)
            next.handle();
    }

    @Override
    public void setNext(Handler h) {
        this.next = h;
    }
    
    
}
