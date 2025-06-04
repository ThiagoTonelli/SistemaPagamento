/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thiago.calculadorapix;

/**
 *
 * @author thiag
 */
public class PrincipalSolucao {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();
        TransacaoPix transacaoPix = new TransacaoPix(new ChaveCPF());
        PagamentoPix pagamento = new PagamentoPix(transacaoPix);
        
        sistema.realizarPagamento(pagamento, 100.00);
    }
}

