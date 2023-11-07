import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentoTest {

    DepartamentoRemuneracao depRem;
    DepartamentoPessoal deoPes;
    Chefia chefe;

    @BeforeEach
    void setUp() {
        depRem = new DepartamentoRemuneracao();
        deoPes = new DepartamentoPessoal();
        chefe = new Chefia();
    }

    @Test
    void deveRetornarDepartamentoRemuneracaoParaAssinaturaFolhaPagamento() {
        assertEquals("Departamento Remuneração", depRem.assinarDocumento(new Documento(TipoDocumentoFolhaPagamento.getTipoDocumentoPagamento())));
    }
    @Test
    void deveRetornarDepartamentoPessoalParaAssinaturaFolhaAdmissao() {
        assertEquals("Departamento Pessoal", deoPes.assinarDocumento(new Documento(TipoDocumentoFolhaAdmissao.getTipoDocumentoAdmissao())));
    }
    @Test
    void deveRetornarChefiaParaAssinaturaAvaliacao() {
        assertEquals("Chefia", chefe.assinarDocumento(new Documento(TipoDocumentoFolhaAvaliacaoDesempenho.getTipoDocumentoAvaliacao())));
    }
}
