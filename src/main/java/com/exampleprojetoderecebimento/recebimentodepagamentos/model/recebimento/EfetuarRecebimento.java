package com.exampleprojetoderecebimento.recebimentodepagamentos.model.recebimento;

public class EfetuarRecebimento {
    public  CalcularRecebimento calcularRecebimento(String opcaoPagamento) {
        if (opcaoPagamento.equalsIgnoreCase("Cheque_Din_Pix")) {
            return new ChequeDinPix();
        } else
        if(opcaoPagamento.equalsIgnoreCase("Cartao_De_Debito")) {
            return new CardDebito();
        } else
        if(opcaoPagamento.equalsIgnoreCase("Cartao_De_Credito")) {
            return new CardCredito();
        } else
        if (opcaoPagamento.equalsIgnoreCase("Vale_De_Refeicao")) {
            return new ValeRefeicao();
        }
        return null;}
}
