package app;

import java.time.LocalDate;
import java.util.ArrayList;



public class EpassStudent extends PasseStandard implements TituloTransporte {
    private int ano;
    private String escola;
    private ArrayList<Zona> zonas;
    private int viagensFree;
    
    public int getViagensFree() {
        return viagensFree;
    }
    public void setViagensFree(int viagensFree) {
        this.viagensFree = viagensFree;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getEscola() {
        return escola;
    }
    public void setEscola(String escola) {
        this.escola = escola;
    }
    public ArrayList<Zona> getZonas() {
        return zonas;
    }
    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    
    public EpassStudent(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            DocumentoID docId, String nome, LocalDate ddn, String morada, String email, int telemovel, int ano,
            String escola,int viagensFree) {
        super(saldo, precoViagem, dataCarrega, dataValida, docId, nome, ddn, morada, email, telemovel);
        this.ano = ano;
        this.escola = escola;
        this.setViagensFree(4);
    }

    
    public EpassStudent(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida,
            DocumentoID docId, String nome, LocalDate ddn, String morada, String email, int telemovel, EpassStudent outro,int viagensFree) {
        super(saldo, precoViagem, dataCarrega, dataValida, docId, nome, ddn, morada, email, telemovel);
        this.setViagensFree(4);
    }
    @Override
    public void Carregar(double saldo) {
        this.setSaldo(this.getSaldo()+saldo);
        this.setDataValida(getDataValida().plusDays(30));
        this.setViagensFree(4);
        this.setDataCarrega(LocalDate.now());
        setDataValida(LocalDate.now().plusDays(30));
        
    }
    @Override
    public void PagarViagem() {
        if(this.getSaldo()>20){//testar se o estudante tem pelo menos 20 de saldo
            this.setSaldo(this.getSaldo()-20);//subtrair no saldo atual 20 de saldo

            this.setNumeroViagens(this.getNumeroViagens()+1);//set viagem adicionando +1 em get viagem

            if (this.getNumeroViagens()%10==0){
                this.setPontos(this.getPontos()+1);
                this.setNumeroViagens(0);
            }
                else{//caso pessoa não ter saldo
            if(this.getPontos()>=100){
                this.setPontos(this.getPontos()-40);
            

            }
            else{this.setViagensFree(this.getViagensFree()-1);}

        }
        }

        
    }
    @Override
    public boolean CheckValidade() {
        LocalDate atual=LocalDate.now();
        if(this.getDataCarrega().plusDays(30).isAfter(atual)) 
        return true;
        else
        return false; 
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
