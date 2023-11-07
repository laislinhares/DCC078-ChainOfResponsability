package org.example;

public class Chefia extends Departamento {

    public Chefia() {
        listaDocumentos.add(TipoDocumentoFolhaAvaliacaoDesempenho.getTipoDocumentoAvaliacao());
    }

    public String getDescricao() {
        return "Chefia";
    }
}
