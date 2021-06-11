package app;

import java.time.LocalDate;

public class EpassTurista extends PasseSasonal implements TituloTransporte{
    private Duracao duracao;

    public Duracao getDuracao() {
        return duracao;
    }

    public EpassTurista(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            Duracao duracao) {
        super(saldo, precoViagem, dataCarrega, dataValida);
        this.duracao = duracao;
    }

    public EpassTurista(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida) {
        super(saldo, precoViagem, dataCarrega, dataValida);
    }


    @Override
    public void PagarViagem() {
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
    public void Carregar(double saldo) {
        // TODO Auto-generated method stub
        
    }
}
