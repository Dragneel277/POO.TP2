package app;

import java.time.LocalDate;
public class Titular {
    private  DocumentoID DocId;
    private  String Nome;
    private  LocalDate Ddn;
    private  String Morada;
    private  String Email;
    private  int Telemovel;

    public Titular(String codigoDoc,DocumentoID docId, String nome, LocalDate ddn, String email) {
        DocId = docId;
        Nome = nome;
        Ddn = ddn;
        Email = email;
    }//corrigir algo aqui
    
    
    public Titular(DocumentoID docId, String nome, LocalDate ddn, String morada, String email, int telemovel) {
        DocId = docId;
        Nome = nome;
        Ddn = ddn;
        Morada = morada;
        Email = email;
        Telemovel = telemovel;
    }


    public Titular(DocumentoID docId, String nome, LocalDate ddn, String email) {
        DocId = docId;
        Nome = nome;
        Ddn = ddn;
        Email = email;
    }


    public DocumentoID getDocId() {
        return DocId;
    }

    public String getNome() {
        return Nome;
    }

    public LocalDate getDdn() {
        return Ddn;
    }

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String morada) {
        Morada = morada;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getTelemovel() {
        return Telemovel;
    }

    public void setTelemovel(int telemovel) {
        Telemovel = telemovel;
    }


}

