/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocliente;

/**
 *
 * @author udesc
 */
public interface ObservadorDeMensagem {
    public void onMessageArrive(String message);
    
}