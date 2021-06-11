package app;

import java.time.LocalDate;

public class EpassFuncionario extends PasseStandard implements TituloTransporte {

    public EpassFuncionario(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            DocumentoID docId, String nome, LocalDate ddn, String morada, String email, int telemovel) {
        super(saldo, precoViagem, dataCarrega, dataValida, docId, nome, ddn, morada, email, telemovel);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Carregar(double saldo) {
        if(saldo>0){//confirma se a pessoa esta a meter pelo menos 1 de saldo no cartao
            this.setSaldo(this.getSaldo()+saldo);

            if(this.getSaldo()>2600){//parti do inicio que para a pessoa carregar o pass por um mes tem que ter um valor de 2600
                this.setSaldo(getSaldo()-2600);//subtrai 2600 no valor de saldo
                this.setDataCarrega(LocalDate.now());//faz update da data de carregamento
                setDataValida(LocalDate.now().plusDays(30));//faz update da data de validade do cartao
            }

        }
        
    }
   
    @Override
    public void PagarViagem() {
        if(CheckValidade()==true){}//basta que a validade esteja ativa é possivel viajar
    }

    @Override
    public boolean CheckValidade() {
            LocalDate atual=LocalDate.now();
            if(this.getDataCarrega().plusDays(30).isAfter(atual)) 
            return false;
            else
            return true;
    }

    @Override
    public boolean PassarSaldo(PasseStandard epass, double saldo) {
        if(this.getSaldo()>=saldo){
            epass.setSaldo(epass.getSaldo()+saldo);
            this.setSaldo(this.getSaldo()-saldo);
            return true;
        }
        return false;
    }
    
}
