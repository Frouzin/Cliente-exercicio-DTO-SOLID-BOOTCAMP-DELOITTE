package mapper;

import dto.ItemPedidoDTO;
import dto.PedidoDTO;
import entity.ItemPedido;
import entity.Pedido;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoMapper {

    public static Pedido toEntity(PedidoDTO dto){
        Pedido pedido = new Pedido();
        pedido.setData(dto.getData());

        List<ItemPedido> itens = dto.getItens().stream().map(itemDTO ->{
            ItemPedido item = new ItemPedido();
            item.setProduto(itemDTO.getProduto());
            item.setQuantidade(itemDTO.getQuantidade());
            item.setPrecoUnitario(itemDTO.getPrecoUnitario());
            item.setPedido(pedido);

            return item;
        }).collect(Collectors.toList());

        pedido.setItens(itens);
        return pedido;
    }

    public static PedidoDTO toDTO(Pedido pedido){
        List<ItemPedidoDTO> itensDTO = pedido.getItens().stream().map(item ->{
            return new ItemPedidoDTO(
                    item.getProduto(),
                    item.getQuantidade(),
                    item.getPrecoUnitario()
            );
        }).collect(Collectors.toList());

        return new PedidoDTO(pedido.getData(), itensDTO);
    }
}
