/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thiago.calculadorapix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiag
 */
public class TransacaoPix {
    List<IMetodoPagamentoPix> metodo = new ArrayList();
    
    public TransacaoPix(IMetodoPagamentoPix metodo){
        this.metodo.push(metodo);
    }
    
    public void processar(double valor){
        
    }
    
}
