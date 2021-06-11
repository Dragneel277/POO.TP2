package app.test;

import java.time.LocalDate;

import app.EpassFestival;

public class  EpassFestival_Tester {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        EpassFestival cavala= new EpassFestival(16, 2, date, date.plusDays(30),"cavala");
        System.out.println(cavala.toString());
        System.out.println(cavala.getChaveValidade());

    }
    
}
