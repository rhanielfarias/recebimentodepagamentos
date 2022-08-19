package com.exampleprojetoderecebimento.recebimentodepagamentos.controller;

import com.exampleprojetoderecebimento.recebimentodepagamentos.model.RecebimentoPagamentoModel;
import com.exampleprojetoderecebimento.recebimentodepagamentos.service.RecebimentoPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentoPagamentoController {
    @Autowired
    private RecebimentoPagamentoService recebimentoPagamentoService;

    @GetMapping(path = "/recebimentodepagamento")

    public List<RecebimentoPagamentoModel> buscaPagamentos() {
        return recebimentoPagamentoService.buscarPagamento();
    }

    @GetMapping(path = "/recebimentodepagamento/{codigo}")
    public Optional<RecebimentoPagamentoModel> buscarPorId(@PathVariable Long codigo){
        return recebimentoPagamentoService.buscarId(codigo);
    }
    @PostMapping(path = "/recebimentodepagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentoPagamentoModel cadastrar(@RequestBody RecebimentoPagamentoModel recebimentoPagamentoModel){
        return recebimentoPagamentoService.cadastrar(recebimentoPagamentoModel);
    }
    @PutMapping(path = "/recebimentodepagamento/{codigo}")
    public RecebimentoPagamentoModel alterar(@RequestBody RecebimentoPagamentoModel recebimentoPagamentoModel){
        return recebimentoPagamentoService.alterar(recebimentoPagamentoModel);
    }

    @DeleteMapping(path = "/recebimentodepagamento/{codigo}")
    public void deletar(@PathVariable Long codigo){ recebimentoPagamentoService.deletar(codigo);
    }


}