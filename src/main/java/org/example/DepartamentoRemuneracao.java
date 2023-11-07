package org.example;

public class DepartamentoRemuneracao extends Departamento {

    public DepartamentoRemuneracao() {
        listaDocumentos.add(TipoDocumentoFolhaPagamento.getTipoDocumentoPagamento());
    }

    public String getDescricao() {
        return "Departamento Remuneração";
    }

}
