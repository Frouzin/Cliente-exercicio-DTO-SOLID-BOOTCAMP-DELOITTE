package com.example.restaurante.controller;

import com.example.restaurante.dto.PedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.restaurante.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public String hello(){
        return "hwllo";
    }

    @PostMapping
    public ResponseEntity<PedidoDTO> criarPedido(@RequestBody PedidoDTO pedidoDTO){
        try{
            PedidoDTO pedidoCriado = pedidoService.criarPedido(pedidoDTO);
            return ResponseEntity.ok(pedidoCriado);
        }catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(null);
        }
    }
}
