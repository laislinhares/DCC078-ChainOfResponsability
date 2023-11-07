package org.example;

public class TipoDocumentoFolhaAvaliacaoDesempenho implements TipoDocumento {

    private static TipoDocumentoFolhaAvaliacaoDesempenho tipoDocumentoAvaliacao = new TipoDocumentoFolhaAvaliacaoDesempenho();

    private TipoDocumentoFolhaAvaliacaoDesempenho() {};

    public static TipoDocumentoFolhaAvaliacaoDesempenho getTipoDocumentoAvaliacao() {
        return tipoDocumentoAvaliacao;
    }
}
