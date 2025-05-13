package mapper;

import dto.ClienteDTO;
import entity.Cliente;

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
