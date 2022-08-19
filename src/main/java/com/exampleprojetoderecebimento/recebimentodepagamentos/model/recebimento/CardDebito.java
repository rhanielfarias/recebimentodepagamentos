package com.exampleprojetoderecebimento.recebimentodepagamentos.model.recebimento;

import com.exampleprojetoderecebimento.recebimentodepagamentos.model.RecebimentoPagamentoModel;

import java.math.BigDecimal;

public class CardDebito implements  CalcularRecebimento{
    @Override
    public BigDecimal calcularPagamento(RecebimentoPagamentoModel recebimentoPagamentoModel){
        return  recebimentoPagamentoModel.getValorRecebido().subtract(recebimentoPagamentoModel.getValorRecebido().multiply(new BigDecimal( "0.025")));
    }
}
