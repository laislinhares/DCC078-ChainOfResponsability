package org.example;

public class TipoDocumentoFolhaPagamento implements TipoDocumento {

    private static TipoDocumentoFolhaPagamento tipoDocumentoPagamento = new TipoDocumentoFolhaPagamento();

    private TipoDocumentoFolhaPagamento() {};

    public static TipoDocumentoFolhaPagamento getTipoDocumentoPagamento() {
        return tipoDocumentoPagamento;
    }
}
