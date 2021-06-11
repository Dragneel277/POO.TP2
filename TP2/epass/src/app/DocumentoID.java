package app;


public class DocumentoID{
    private String CodigoId;
    private tipoDocumento Tipo;
    
    public DocumentoID(String codigoId, tipoDocumento tipo) {
        CodigoId = codigoId;
        Tipo = tipo;
    }
    public String getCodigoId() {
        return CodigoId;
    }

    public tipoDocumento getTipo() {
        return Tipo;
    }

}

