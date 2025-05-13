package service;

import dto.ClienteDTO;
import entity.Cliente;
import mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;

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
