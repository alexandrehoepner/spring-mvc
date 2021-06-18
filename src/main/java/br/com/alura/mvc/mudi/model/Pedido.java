package br.com.alura.mvc.mudi.model;

import br.com.alura.mvc.mudi.dto.NovoPedidoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pedido {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataDaEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;

    public Pedido(NovoPedidoDto novoPedidoDto) {
        this.nomeProduto = novoPedidoDto.getNomeProduto();
        this.urlProduto = novoPedidoDto.getUrlProduto();
        this.urlImagem = novoPedidoDto.getUrlImagem();
        this.descricao = novoPedidoDto.getDescricao();
        this.statusPedido = StatusPedido.AGUARDANDO;
    }

}
