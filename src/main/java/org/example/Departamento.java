package org.example;

import java.util.ArrayList;

public abstract class Departamento {

    protected ArrayList listaDocumentos = new ArrayList();

    public abstract String getDescricao();

    public String assinarDocumento(Documento documento) {
        if (listaDocumentos.contains(documento.getTipoDocumento())) {
            return getDescricao();
        }
        else {
            return "Sem assinatura";
        }
    }
}
