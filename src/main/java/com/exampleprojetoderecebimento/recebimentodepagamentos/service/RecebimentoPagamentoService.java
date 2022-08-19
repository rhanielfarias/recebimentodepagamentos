package com.exampleprojetoderecebimento.recebimentodepagamentos.service;

import com.exampleprojetoderecebimento.recebimentodepagamentos.model.RecebimentoPagamentoModel;
import com.exampleprojetoderecebimento.recebimentodepagamentos.model.recebimento.EfetuarRecebimento;
import com.exampleprojetoderecebimento.recebimentodepagamentos.repository.RecebimentoPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoPagamentoService {
    @Autowired
    private RecebimentoPagamentoRepository recebimentoPagamentoRepository;

    public List<RecebimentoPagamentoModel> buscarPagamento(){
        return recebimentoPagamentoRepository.findAll();
    }

    public Optional<RecebimentoPagamentoModel> buscarId(Long codigo){
        return recebimentoPagamentoRepository.findById(codigo);
    }

    public RecebimentoPagamentoModel cadastrar(RecebimentoPagamentoModel recebimentoPagamentoModel){
        EfetuarRecebimento efetuarRecebimento = new EfetuarRecebimento();
        BigDecimal valor = efetuarRecebimento.calcularRecebimento(recebimentoPagamentoModel.getRecebimento()).calcularPagamento(recebimentoPagamentoModel);
        BigDecimal aplicarDesconto =recebimentoPagamentoModel.getValorRecebido().subtract(valor);
        recebimentoPagamentoModel.getCodigo();
        recebimentoPagamentoModel.getValorRecebido();
        recebimentoPagamentoModel.setDescontarDoRecebido(aplicarDesconto);
recebimentoPagamentoModel.setValorFinal(valor);
        return recebimentoPagamentoRepository.save(recebimentoPagamentoModel);
    }
    public RecebimentoPagamentoModel alterar(RecebimentoPagamentoModel recebimentoPagamentoModel) {
        EfetuarRecebimento efetuarRecebimento = new EfetuarRecebimento();
        BigDecimal valor = efetuarRecebimento.calcularRecebimento(recebimentoPagamentoModel.getRecebimento()).calcularPagamento(recebimentoPagamentoModel);
        BigDecimal aplicarDesconto = recebimentoPagamentoModel.getValorRecebido().subtract(valor);
        recebimentoPagamentoModel.getCodigo();
        recebimentoPagamentoModel.getValorRecebido();
        recebimentoPagamentoModel.setDescontarDoRecebido(aplicarDesconto);
        recebimentoPagamentoModel.setValorFinal(valor);
        return recebimentoPagamentoRepository.save(recebimentoPagamentoModel);
    }
    public void deletar(Long codigo){
        recebimentoPagamentoRepository.deleteById(codigo);
    }
    }
