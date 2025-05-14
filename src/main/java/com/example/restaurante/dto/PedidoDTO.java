package com.example.restaurante.dto;

import java.time.LocalDate;
import java.util.List;

public class PedidoDTO {

    private LocalDate data;
    private List<ItemPedidoDTO> itens;

    public PedidoDTO(){
        this.data = LocalDate.now();
    }

    public PedidoDTO(LocalDate data, List<ItemPedidoDTO> itens){
        this.data = data;
        this.itens = itens;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<ItemPedidoDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoDTO> itens) {
        this.itens = itens;
    }
}
