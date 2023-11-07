package org.example;

public class TipoDocumentoFolhaAdmissao implements TipoDocumento {

    private static TipoDocumentoFolhaAdmissao tipoDocumentoAdmissao = new TipoDocumentoFolhaAdmissao();

    private TipoDocumentoFolhaAdmissao() {};

    public static TipoDocumentoFolhaAdmissao getTipoDocumentoAdmissao() {
        return tipoDocumentoAdmissao;
    }
}
