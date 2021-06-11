package app;

public interface TituloTransporte {
    public void Carregar(double saldo);
    public void PagarViagem();
    public boolean CheckValidade();
    public boolean PassarSaldo(PasseStandard epass,double saldo);
}
