package app.test;

import java.time.LocalDate;

import app.EpassStudent;

public class EpassStudent_tester {
    public static void main(String[] args){
        LocalDate date = LocalDate.now().plusDays(30);
        LocalDate date1 = LocalDate.now();
        LocalDate ddn = LocalDate.of(1999, 3, 22); 
        EpassStudent aluno1= new EpassStudent(1000, 20, date1, date, null, "Ruben Ferreiro", ddn, "Madeiralzinho", "Rubenkiler@gmail.com", 5946121, 14, "Jorge Barbosa", 0);
        EpassStudent aluno2= new EpassStudent(12, 20, date1, date, null, "Miguel luz", ddn, "Cruz", "mkiler@gmail.com", 5946563, 12, "ETecnica", 0);
       
        //testar chave validade
        System.out.println(aluno1.getChaveValida()+"-->chave valida do aluno");//testar se get chave valida esta a funcionar

        System.out.println("--------------------------------------------------------");

        //testar passar saldo
        System.out.println(aluno1.getSaldo()+" saldo do aluno 1 antes da tranferencia    "+aluno2.getSaldo()+" saldo do aluno 2 antes da tranferencia");
        aluno1.PassarSaldo(aluno2, 500);
        System.out.println(aluno1.getSaldo()+" saldo do aluno 1 apos da tranferencia     "+aluno2.getSaldo()+" saldo do aluno 2 apos da tranferencia");

        System.out.println("--------------------------------------------------------");

        //testar validade
        System.out.println(date1+" data de carregamento");
        System.out.println(date1+" data de vencimento");
        System.out.println(LocalDate.now() +" data atual");
        if(aluno1.CheckValidade()==true){
            System.out.println("Passe Valido");
        }
        else System.out.println("Passe Invalido");
            System.out.println("--------------------------------------------------------");


        //testar pagar viagem
        System.out.println(aluno1.getSaldo()+" saldo do aluno1 antes de ter pagado a viagem");
        System.out.println(aluno1.getPontos()+" pontos do aluno1 antes de ter pagado a viagem");
        System.out.println(aluno1.getViagensFree()+" viagens gratis do aluno1 antes de ter pagado a viagem");
        aluno1.PagarViagem();
        System.out.println(aluno1.getSaldo()+" saldo do aluno1 apos de ter pagado a viagem");
        System.out.println("--------------------------------------------------------");

        //carregar passe
        System.out.println(aluno1.getSaldo()+" saldo do aluno1 antes de ter carregado o pass");
        aluno1.Carregar(200);
        System.out.println(aluno1.getSaldo()+" saldo do aluno1 apos de ter carregado o pass");
        System.out.println("--------------------------------------------------------");


    }
    
}
