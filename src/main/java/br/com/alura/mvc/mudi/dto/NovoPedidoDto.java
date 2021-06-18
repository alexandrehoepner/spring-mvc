package br.com.alura.mvc.mudi.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class NovoPedidoDto {
    @NotBlank
    private String nomeProduto;
    @NotBlank
    private String urlProduto;
    @NotBlank
    private String urlImagem;
    private String descricao;
}
