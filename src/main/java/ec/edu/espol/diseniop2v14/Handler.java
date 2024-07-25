/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.diseniop2v14;

/**
 *
 * @author alexo
 */
public interface Handler {
    public void handle();
    public void setNext(Handler h);
}
