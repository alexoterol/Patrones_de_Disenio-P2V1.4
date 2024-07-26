/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.diseniop2v14.Parrafo3;

/**
 *
 * @author alexo
 */
public class FalloCubierto extends HandlerBase{
    @Override
    public void handle() {
        System.out.println("Código de fallo cubierto");
        if (false){
            //en caso de que el fallo no esté cubierto
        }else{
            next.handle();
        }
    }
}
