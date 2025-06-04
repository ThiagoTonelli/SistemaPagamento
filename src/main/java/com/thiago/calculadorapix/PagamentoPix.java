/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thiago.calculadorapix;

/**
 *
 * @author thiag
 */
public class PagamentoPix implements IMetodoPagamentoPix{
    TransacaoPix transacaoPix;
    
    @Override
    public void processarPagamento(double valor){
        transacaoPix.processar(valor);
    }
    
    public void pagamentoPix(TransacaoPix transacaoPix){
        this.transacaoPix = transacaoPix;
    }
    
}
