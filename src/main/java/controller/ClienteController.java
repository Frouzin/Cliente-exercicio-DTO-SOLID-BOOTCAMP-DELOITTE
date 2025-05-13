package controller;

import dto.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @Autowired
    private ClienteService clienteService;


    @PostMapping
    public ResponseEntity<ClienteDTO> criar(@RequestBody ClienteDTO dto){
        ClienteDTO salvo = new ClienteService.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }
}
