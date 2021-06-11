package app;

import java.time.LocalDate;


public class Test{

    public static void main(String[] args){
        StringBuilder nome=new StringBuilder("Norberto Silva");
        LocalDate ddn = LocalDate.of(1997, 5, 10); 
        int codigo=606;

        StringBuilder primeiroNome=new StringBuilder(nome.substring(0, 5));
        primeiroNome=primeiroNome.reverse();

        StringBuilder lastName=new StringBuilder(nome.reverse().substring(0, 5));
        
        String chaveValidacao=(primeiroNome+""+lastName+ddn+codigo).toUpperCase();


        System.out.println(chaveValidacao);


    }
    
    
}
