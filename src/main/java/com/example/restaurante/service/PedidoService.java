package com.example.restaurante.service;

import com.example.restaurante.dto.PedidoDTO;
import com.example.restaurante.entity.Pedido;
import com.example.restaurante.mapper.PedidoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.restaurante.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoDTO criarPedido(PedidoDTO pedidoDTO) {
        // Converter DTO em entidade
        Pedido pedido = PedidoMapper.toEntity(pedidoDTO);

        // Regra de negócio: valor mínimo do pedido
        if (pedido.getValorTotal() < 10.0) {
            throw new IllegalArgumentException("O valor total do pedido deve ser no mínimo R$ 10,00");
        }

        // Salvar no banco
        Pedido pedidoSalvo = pedidoRepository.save(pedido);

        // Retornar DTO
        return PedidoMapper.toDTO(pedidoSalvo);
    }
}
