package org.example;

public class DepartamentoPessoal extends Departamento {

    public DepartamentoPessoal() {
        listaDocumentos.add(TipoDocumentoFolhaAdmissao.getTipoDocumentoAdmissao());
    }

    public String getDescricao() {
        return "Departamento Pessoal";
    }
}
