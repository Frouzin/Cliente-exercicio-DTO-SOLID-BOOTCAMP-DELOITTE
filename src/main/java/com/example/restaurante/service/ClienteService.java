package com.example.restaurante.service;

import com.example.restaurante.dto.ClienteDTO;
import com.example.restaurante.entity.Cliente;
import com.example.restaurante.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.restaurante.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteDTO salvar(ClienteDTO dto){
        Cliente cliente = ClienteMapper.toEntity(dto);
        cliente = clienteRepository.save(cliente);
        return ClienteMapper.toDTO(cliente);
    }
}
