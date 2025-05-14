package com.example.restaurante.mapper;

import com.example.restaurante.dto.ClienteDTO;
import com.example.restaurante.entity.Cliente;

public class ClienteMapper {

    public static ClienteDTO toDTO(Cliente cliente){
        ClienteDTO dto = new ClienteDTO();
        dto.setNome(cliente.getNome());

        dto.setEmail(cliente.getEmail());

        return dto;
    }

    public static Cliente toEntity(ClienteDTO dto){
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());

        cliente.setEmail(dto.getEmail());

        return cliente;
    }
}
