package app;

import java.time.LocalDate;

public class EpassFestival extends PasseSasonal implements TituloTransporte,CartaoPagamento {
    private double saldoCartaoPgmt;
    private String nomeEvento;

    public EpassFestival(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,EpassFestival Outro) {
        super(saldo, precoViagem, dataCarrega, dataValida);
    }
    public EpassFestival(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            String nomeEvento) {
        super(saldo, precoViagem, dataCarrega, dataValida);
        this.nomeEvento = nomeEvento;
    }
    public EpassFestival(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            double saldoCartaoPgmt, String nomeEvento) {
        super(saldo, precoViagem, dataCarrega, dataValida);
        this.saldoCartaoPgmt = saldoCartaoPgmt;
        this.nomeEvento = nomeEvento;
    }
    public double getSaldoCartaoPgmt() {
        return saldoCartaoPgmt;
    }
    public void setSaldoCartaoPgmt(double saldoCartaoPgmt) {
        this.saldoCartaoPgmt = saldoCartaoPgmt;
    }
    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    @Override
    public void Carregar(double saldo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean CheckValidade() {
        LocalDate atual=LocalDate.now();
        if(this.getDataValida().isAfter(atual)) 
        return false;
        else
        return true; 
    }

    @Override
    public boolean PassarSaldo(PasseStandard epass, double saldo) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean pagar(double valor) {
        // TODO Auto-generated method 
        return false;
    } 
    @Override
    public void creditar(double valor) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void PagarViagem() {
        // TODO Auto-generated method stub
        
    }

    
    
}
