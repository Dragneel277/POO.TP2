package app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PasseSasonal extends Epass {
    private String ChaveValidade;

    public String getChaveValidade() {
        return ChaveValidade;
    }

    public void setChaveValidade(String chaveValidade) {
        this.ChaveValidade = chaveValidade;
    }

    public PasseSasonal(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida) {
        super(saldo, precoViagem, dataCarrega, dataValida, dataEmissaoDateTime);
        LocalDateTime dataemi=Epass.dataEmissaoDateTime;
        Long codigo=this.getCodigo();

        String chaveValidacao=(dataemi+""+codigo).toUpperCase();

        this.setChaveValidade(chaveValidacao);
    } 
}
